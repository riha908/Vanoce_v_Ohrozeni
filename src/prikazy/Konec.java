package prikazy;

public class Konec extends Command{
    @Override
    public String execute() {
        return "Program byl ukoncen";
    }

    @Override
    public boolean exit() {
        return true;
    }
}

