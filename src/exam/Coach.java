package exam;

public class Coach {

    private final ICommand getUpCommand;
    private final ICommand goDownCommand;

    public Coach(ICommand getUpCommand, ICommand goDownCommand) {
        this.getUpCommand = getUpCommand;
        this.goDownCommand = goDownCommand;
    }

    public void startTeaching() {
        System.out.println("Coach says go down.");
        goDownCommand.execute();

        System.out.println("Coach says get up.");
        getUpCommand.execute();
    }
}
