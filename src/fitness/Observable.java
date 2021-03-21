package fitness;

public interface Observable {
	void subscribe(Observer topicSubscriber);
	void unsubscribe(Observer topicSubscriber);
	void notifyObservers();
}
