package Hra.Konzole;

import Hra.HerniData;
import postavy.Elias;
import prikazy.*;

import java.util.HashMap;
import java.util.Scanner;

public class Konzole {


    private HerniData svet;
private Elias elias;
    private boolean exit = false;
    private HashMap<String, Command> mapa = new HashMap<>();
    private Scanner sc = new Scanner(System.in);
    public static String batoh = "batoh.txt";

        //mozne prikazy
    private void inicializace() {
        mapa.put("jdi", new Pohyb(elias));
        svet = HerniData.loadGameDataFromResources("/mapa.json");
        elias = new Elias();
        elias.setOblast(svet.findLocation("UbytovnaSkritku"));
        mapa.put("pomoc",new Pomoc());
        mapa.put("konec", new Konec());
        mapa.put("inventar", new Inventar());
        mapa.put("promluvit",new Dialog());
    }

//kontroluje prikazy
    private void proved() {
        System.out.print("> zadejte prikaz");
        String prikaz = sc.next();
        prikaz = prikaz.trim().toLowerCase();

        if (mapa.containsKey(prikaz)) {
            System.out.println("> " + mapa.get(prikaz).execute(prikaz));
            exit = mapa.get(prikaz).exit();
        }else {
            System.out.println("> Nedefinovany prikaz");
        }
    }

    //herni smycka
    public void start() {
        inicializace();
        try {
            do {
                proved();
            } while (!exit);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    }







