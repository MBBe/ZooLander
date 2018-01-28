package sample;

import java.io.Serializable;

public class Animal implements Serializable {

    private String Name;
    private double Requires;
    private double volume;

    public Animal(String Name, double Requires, double volume) {
        this.Name = Name;
        this.Requires=Requires;
        this.volume=volume;
    }

    public String getName() {
        return Name;
    }

    public double getRequires() {
        return Requires;
    }

    public double getvolume(){
        return volume;
    }

}
