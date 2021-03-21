package fitness;

import java.util.ArrayList;
import java.util.List;

public class Trainer implements Observable {

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

	public void setShowingExercise(String showingExercise) {
		this.showingExercise = showingExercise;
		this.notifyObservers();
	}
}
