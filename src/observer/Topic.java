package observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Observable {

	private List<Observer> observers;
	private String topic;
	
	public Topic() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void subscribe(Observer topicSubscriber) {
		this.observers.add(topicSubscriber);
		topicSubscriber.setTopic(this);
	}

	@Override
	public void unsubscribe(Observer topicSubscriber) {
		this.observers.remove(topicSubscriber);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		// Here we can have some logic
		return this.getTopic();
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		this.notifyObservers();
	}

}
