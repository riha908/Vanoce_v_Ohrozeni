package Hra;

import java.util.ArrayList;

public class Oblast {

    private String id;
    private String jmeno;
    private String popis;
    private ArrayList<String> lokace;



    public String getId() {
        return id;
    }

    public String getJmeno() {
        return jmeno;
    }

    @Override
    public String toString() {
        return "game.Location{" +
                "id='" + id + '\'' +
                ", name='" + jmeno + '\'' +
                ", description='" + popis + '\'' +
                ", neighbors=" + lokace +
                '}';
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setJmeno(String name) {
        this.jmeno = jmeno;
    }

    public void setDescription(String popis) {
        this.popis = this.popis;
    }
}


