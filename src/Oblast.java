import java.util.ArrayList;

public class Oblast {

    private String id;
    private String name;
    private String description;
    private ArrayList<String> location;



    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "game.Location{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", neighbors=" + location +
                '}';
    }
}

