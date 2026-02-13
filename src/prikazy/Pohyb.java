package prikazy;

import Hra.HerniData;
import Hra.Oblast;
import postavy.Elias;

import java.util.ArrayList;

public class Pohyb implements Command {


    private final Elias Elias;
    private final HerniData svet;

    public Pohyb(Elias Elias) {
        this.Elias = Elias;
        svet = HerniData.loadGameDataFromResources("/mapa.json");
    }

    public Pohyb(Elias player, HerniData world) {
        this.Elias = player;
        this.svet = world;
    }

    @Override
    public String execute(String command) {
        String[] parts = command.trim().split("\\s+");

        if (parts.length < 2) {
            return describeCurrentLocation();
        }

        String targetId = parts[1].trim();
        Oblast current = Elias.getLocation();
        if (current == null) {
            return "Hráč nemá nastavenou aktuální lokaci.";
        }

        ArrayList<String> neighbors = current.getPropojeni();
        if (neighbors == null || !neighbors.contains(targetId)) {
            return "Do této lokace se odsud dostat nemůžeš.\n\n" + describeCurrentLocation();
        }

       Oblast target = svet.findLocation(targetId);
        Elias.setLocation(target);

        return "Přesunul/a ses do lokace: " + target.getJmeno() + "\n\n" + describeCurrentLocation();

    }

    private String describeCurrentLocation() {
       Oblast loc = Elias.getLocation();
        if (loc == null) {
            return "Hráč nemá nastavenou aktuální lokaci.";
        }

        String result = "";
        result += "== " + loc.getJmeno() + " ==\n";
        result += loc.getPopis() + "\n\n";

        ArrayList<String> n = loc.getPropojeni();
        if (n == null || n.isEmpty()) {
            result += "Odtud nevede žádná cesta.";
            return result.trim();
        }

        result += "Možné cesty:\n";

        for (String id : n) {
            try {
                Oblast target = svet.findLocation(id);
                result += " - " + id + " (" + target.getJmeno() + ")\n";
            } catch (Exception e) {
                result += " - " + id + "\n";
            }
        }

        return result.trim();

    }



    @Override
    public boolean exit() {
        return false;
    }
}


