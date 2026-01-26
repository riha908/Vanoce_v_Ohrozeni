package prikazy;

public class Pomoc extends Command{


        @Override
        public String execute() {
            return "prikazy:jdi sever,jdi jih,jdi vychod,jdi zapad,konec,pomoc,inventar";
        }

        @Override
        public boolean exit() {
            return false;
        }
    }

