package sample;
import java.io.Serializable;

public class Keeper implements Serializable {
    private String Name;
    private Pen[] Pens;
    private Animal[] Animals;

    public Keeper(String Name, Pen[] Pens, Animal[] Animals){
        this.Name= Name;
        this.Pens=Pens;
        this.Animals=Animals;
    }

    public String getName(){
        return Name;
    }

    public Pen[] getPens(){
        return Pens;
    }

    public Animal[] getAnimals(){
        return Animals;
    }
}
