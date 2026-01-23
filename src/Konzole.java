import prikazy.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Konzole {
    private boolean exit = false;
    private HashMap<String, Command> mapa = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    private void inicializace() {
mapa.put("jdi sever", new Pohyb());
        mapa.put("jdi jih", new Pohyb());
        mapa.put("jdi vychod", new Pohyb());
        mapa.put("jdi zapad", new Pohyb());
        mapa.put("Pomoc",new Pomoc());
    }

    private void proved() {
        System.out.print(">>");
        String prikaz = scanner.next();
        prikaz = prikaz.trim().toLowerCase();
        if (mapa.containsKey(prikaz)) {
            System.out.println(">> " + mapa.get(prikaz).execute());
            exit = mapa.get(prikaz).exit();
        } else {
            System.out.println(">> Nedefinovany prikaz");
        }
    }}


