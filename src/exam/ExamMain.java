package exam;

public class ExamMain {

	public static void main(String[] args) {

		Actor actor = new Actor();

		// Factory pattern
		ExerciseCommand.Factory exerciseFactory = new ExerciseCommand.Factory(actor);

		// Command pattern
		ExerciseCommand goDownCmd = exerciseFactory.goDownExercise();
		ExerciseCommand goUpCmd = exerciseFactory.goUpExercise();

		Coach coach = new Coach(goUpCmd, goDownCmd);

		// Observer pattern
		Observer obs1 = new Viewer("Viewer 01");
		Observer obs2 = new Viewer("Viewer 02");
		Observer obs3 = new Viewer("Viewer 03");
		
		actor.subscribe(obs1);
		actor.subscribe(obs2);
		actor.subscribe(obs3);

		// After we're all set, start the coaching
		coach.startTeaching();
	}
}
