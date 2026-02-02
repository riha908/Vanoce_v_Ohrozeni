import prikazy.Konzole;

public class Main {
    public static void main(String[] args) {
//Tohle bude fajn schovat do nějaké třídy, ve které budeme pracovat se všemi daty a hráčem
        HerniData data = HerniData.loadGameDataFromResources("/mapa.json");

        //Zkouška, zdali načtení proběhlo v pořádku
        //System.out.println("Items: " + data.items.size());
        //System.out.println("Characters: " + data.characters.size());
       // System.out.println("Locations: " + data.lokace.size());

        // Nalezení konkrétní lokace, se kterou je pak možno dále pracovat
        System.out.println("Start lokace: " + data.findLocation("UbytovnaSkritku").getJmeno());

        Konzole k = new Konzole();
        k.start();
    }}

