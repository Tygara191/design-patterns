package exam;

public class ExerciseCommand implements ICommand {

    private final Actor actor;
    private final String exercise;

    private ExerciseCommand(Actor actor, String exercise) {
        this.actor = actor;
        this.exercise = exercise;
    }

    @Override
    public void execute() {
        actor.startDoing(exercise);
    }

    public static class Factory{

        private final Actor actor;

        Factory(Actor actor) {
            this.actor = actor;
        }

        public ExerciseCommand goUpExercise(){
            return new ExerciseCommand(actor, "STAVANE!!");
        }

        public ExerciseCommand goDownExercise(){
            return new ExerciseCommand(actor, "LQGANE!!");
        }
    }
}
