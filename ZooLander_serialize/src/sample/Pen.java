package sample;
import java.io.Serializable;

public class Pen implements Serializable {

    private String Type;
    private double Size;
    private Animal[] Animals;
    private Keeper Name;

    public Pen(String Type, int Size, Animal[] Animals, Keeper Name){
        this.Name= Name;
        this.Type=Type;
        this.Size=Size;
        this.Animals=Animals;
        this.Name=Name;
    }




    public String getType(){
        return Type;
    }

    public double getSize(){
        return Size;
    }

    public Animal[] getAnimals(){
        return Animals;
    }

    public Keeper getName(){
        return Name;
    }
}
