package prikazy;

public class Pohyb implements Command {

/*
    private final Hrac player;
    private final HerniData world;

    public Movement(Hrac player) {
        this.hrac = hrac;
        world = HerniData.loadGameDataFromResources("/gamedata.json");
    }

    public Movement(Hrac player, GameData world) {
        this.player = player;
        this.world = world;
    }

    @Override
    public String execute(String command) {
        String[] parts = command.trim().split("\\s+");

        if (parts.length < 2) {
            return describeCurrentLocation();
        }

        String targetId = parts[1].trim();
        Location current = player.getLocation();
        if (current == null) {
            return "Hráč nemá nastavenou aktuální lokaci.";
        }

        ArrayList<String> neighbors = current.getNeighbors();
        if (neighbors == null || !neighbors.contains(targetId)) {
            return "Do této lokace se odsud dostat nemůžeš.\n\n" + describeCurrentLocation();
        }

        Location target = world.findLocation(targetId);
        player.setLocation(target);

        return "Přesunul/a ses do lokace: " + target.getName() + "\n\n" + describeCurrentLocation();

    }

    private String describeCurrentLocation() {
        Location loc = player.getLocation();
        if (loc == null) {
            return "Hráč nemá nastavenou aktuální lokaci.";
        }

        String result = "";
        result += "== " + loc.getName() + " ==\n";
        result += loc.getDescription() + "\n\n";

        ArrayList<String> n = loc.getNeighbors();
        if (n == null || n.isEmpty()) {
            result += "Odtud nevede žádná cesta.";
            return result.trim();
        }

        result += "Možné cesty:\n";

        for (String id : n) {
            try {
                Location target = world.findLocation(id);
                result += " - " + id + " (" + target.getName() + ")\n";
            } catch (Exception e) {
                result += " - " + id + "\n";
            }
        }

        return result.trim();

    }
*/




    @Override
    public String execute(String command) {
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}


