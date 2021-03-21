package observer;

public class TopicSubscriber implements Observer {

	private String name;
	private Observable topic;
	
	public TopicSubscriber(String name) {
		this.setName(name);
	}

	@Override
	public void update() {
		
		if(topic == null) {
			System.out.println(this.getName() + " has no topic");
			return;
		}
		
		String newTopic = topic.getUpdate();
		System.out.println(this.getName() + ": recieved new topic: " + newTopic);
		
	}

	@Override
	public void setTopic(Observable topic) {
		this.topic = topic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
