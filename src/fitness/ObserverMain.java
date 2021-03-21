package fitness;

public class ObserverMain {

	public static void main(String[] args) {
			
		Trainer trainer = new Trainer();

		Observer obs1 = new Trainee("Trainee 01");
		Observer obs2 = new Trainee("Trainee 02");
		Observer obs3 = new Trainee("Trainee 03");
		
		trainer.subscribe(obs1);
		trainer.subscribe(obs2);
		trainer.subscribe(obs3);

		trainer.setShowingExercise("Qko uprajnenie za qki bicagi.");
	}
}
