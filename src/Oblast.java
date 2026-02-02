import java.util.ArrayList;

public class Oblast {

    private String id;
    private String jmeno;
    private String popis;
    private ArrayList<String> location;



    public String getId() {
        return id;
    }

    public String getName() {
        return jmeno;
    }

    @Override
    public String toString() {
        return "game.Location{" +
                "id='" + id + '\'' +
                ", name='" + jmeno + '\'' +
                ", description='" + popis + '\'' +
                ", neighbors=" + location +
                '}';
    }
}

