package sample;

import java.io.Serializable;

public class Animal implements Serializable {

    private String Name;
    private double Requires;

    public Animal(String Name, double Requires) {
        this.Name = Name;
        this.Requires=Requires;
    }

    public String getName() {
        return Name;
    }

    public double getRequires() {
        return Requires;
    }
}
