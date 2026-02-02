package prikazy;

import java.util.HashMap;
import java.util.Scanner;

public class Konzole {

    private boolean exit = false;
    private HashMap<String, Command> mapa = new HashMap<>();
    private Scanner sc = new Scanner(System.in);
    public static String batoh = "batoh.txt";
//mozne prikazy
    private void inicializace() {
        mapa.put("jdi sever", new Pohyb());
        mapa.put("jdi jih", new Pohyb());
        mapa.put("jdi vychod", new Pohyb());
        mapa.put("jdi zapad", new Pohyb());
        mapa.put("pomoc",new Pomoc());
        mapa.put("konec", new Konec());
        mapa.put("inventar", new Inventar());
        mapa.put("promluvit",new Dialog());
    }


    private void proved() {
        System.out.print(">>");
        String prikaz = sc.next();
        prikaz = prikaz.trim().toLowerCase();

        if (mapa.containsKey(prikaz)) {
            System.out.println(">> " + mapa.get(prikaz).execute());
            exit = mapa.get(prikaz).exit();
        }else {
            System.out.println(">> Nedefinovany prikaz");
        }
    } //herni smycka
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







