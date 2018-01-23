package sample;

import java.io.Serializable;

public class Keeper implements Serializable {

    private String Name;
    private String PenType;

    public Keeper(String Name, String PenType) {
        this.Name = Name;
        this.PenType = PenType;
    }

    public String getName() {
        return Name;
    }

    public String getPenType() {
        return PenType;
    }

}