package prikazy;

import Hra.Konzole.Konzole;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Inventar implements Command{



    @Override
public String execute(String command) {
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Konzole.batoh))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            return list.toString();
        }catch(Exception e){
            return "prikazy.Inventar nefunguje";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }

}
