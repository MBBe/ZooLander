package sample;

import java.io.Serializable;

public class Pen implements Serializable {

    private String Type;
    private double length;
    private double width;
    private Animal[] Animals;
    private Keeper [] Keepers;
    private double penSize;

    public void Pen(String Type, double length, double width, Animal[] Animals, Keeper[] Keepers){
        this.Type=Type;
        this.length=length;
        this.width=width;
        this.Animals=Animals;
        this.Keepers=Keepers;
    }


    //method to calculate the size of the pen
    public void PenSize (){
        penSize = length * width;
    }

    public String getType(){
        return Type;
    }

    public double getlength(){ return length; }

    public double getwidth() { return width;}

    public Animal[] getAnimals(){return Animals; }

    public Keeper[] getKeepers(){
        return Keepers;
    }

    //method for adding animal to pen
    public void addAnimal (Animal[] animals) {
        //penSize = length * width;
        for (Animal animal : animals)
        {
            if (animal.getRequires() >= penSize) {
                System.out.println(animal.getName() + "can not be added to " + Type + " pen. ");
                animal.getRequires() - penSize;

            }
            
        }
    }
}
