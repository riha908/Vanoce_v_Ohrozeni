package prikazy;

public class Pomoc implements Command{



    @Override
    public String execute(String command) {
        return "prikazy:jdi sever,jdi jih,jdi vychod,jdi zapad,konec,pomoc,inventar";
    }

    @Override
        public boolean exit() {
            return false;
        }
    }

