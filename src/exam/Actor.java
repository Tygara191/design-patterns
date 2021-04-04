package exam;

import java.util.ArrayList;
import java.util.List;

public class Actor implements Observable {

	private List<Observer> observers = new ArrayList<>();

	private String showingExercise;

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.update(showingExercise);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update(showingExercise);
		}
	}

	public void startDoing(String exercise) {
		System.out.println("Actor is now doing: "+exercise);
		this.showingExercise = exercise;
		this.notifyObservers();
	}
}
