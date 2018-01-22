package sample;
import java.io.Serializable;

public class Animal implements Serializable {

    private String AnimalType;
    private double Requires;
    private Pen Type;

    public Animal(String AnimalType, Pen Type, int Requires) {
        this.AnimalType = AnimalType;
        this.Requires = Requires;
        this.Type = Type;
    }

    public String getAnimalType() {
        return AnimalType;
    }


    public double getRequires() {
        return Requires;
    }

    public Pen getType() {
        return Type;
    }
}