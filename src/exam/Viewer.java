package exam;

public class Viewer implements Observer {

	private String name;

	Viewer(String name) {
		this.name = name;
	}

	@Override
	public void update(String newExercise) {
		if(newExercise == null) {
			System.out.println(this.getName() + " is chilling out because they got a null exercise.");
			return;
		}
		System.out.println(this.getName() + " is now doing " + newExercise);
	}

	private String getName() {
		return name;
	}
}
