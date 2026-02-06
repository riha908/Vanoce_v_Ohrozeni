package prikazy;

public class Konec implements Command {
    public String execute() {

    }

    @Override
    public String execute(String command) {
        return " Program byl ukoncen";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
