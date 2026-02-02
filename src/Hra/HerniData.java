package Hra;

import com.google.gson.Gson;
import postavy.HerniCharakteri;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class HerniData {

    public ArrayList<Item> items;
    public ArrayList<HerniCharakteri> characters;
    public ArrayList<Oblast> lokace;

    public static HerniData loadGameDataFromResources(String resourcePath) {
        //Vytvoření objektu pro práci s JSON souborem
        Gson gson = new Gson();

        //Načtení souboru
        try (InputStream is = Main.class.getResourceAsStream(resourcePath)) {

            // zdali soubor existuje
            if (is == null) {
                throw new IllegalStateException("Nenalezen resource: " + resourcePath +
                        " (zkontrolujte, že soubor je v src/main/resources).");
            }

            //Přečte celý JSON a vytvoří instanci Hra.HerniData, naplní vlastnosti podle názvů klíčů v JSONU, vrátí se hotová třída Hra.HerniData
            return gson.fromJson(
                    new InputStreamReader(is, StandardCharsets.UTF_8),
                    HerniData.class
            );
        } catch (Exception e) {
            throw new RuntimeException("Chyba při načítání JSON: " + e.getMessage());
        }
    }
    public Oblast findLocation(String id) {
        for (Oblast o : lokace) {
            if (o.getId().equals(id)){
                return o;
            }
        }
        throw new IllegalArgumentException("Neexistuje mistnost s id: " + id);
    }


}
