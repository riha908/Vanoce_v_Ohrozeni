package Hra;

import java.util.ArrayList;

public class Oblast {

    private String id;
    private String jmeno;
    private String popis;
    private ArrayList<String> propojeni;


    public Oblast(String id, String jmeno, String popis, ArrayList<String> propojeni) {
        this.id = id;
        this.jmeno = jmeno;
        this.popis = popis;
        this.propojeni = propojeni;

    }

    public String getId() {
        return id;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPopis() {
        return popis;
    }
    public ArrayList<String> getPropojeni() {
        return propojeni;
    }


    @Override
    public String toString() {
        return "game.Location{" +
                "id='" + id + '\'' +
                ", name='" + jmeno + '\'' +
                ", description='" + popis + '\'' +
                ", neighbors=" +
                '}';
    }

        public void setId (String id){
            this.id = id;
        }

        public void setJmeno (String name){
            this.jmeno = jmeno;
        }

        public void setDescription (String popis){
            this.popis = this.popis;
        }


}


