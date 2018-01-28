package sample;

import java.io.Serializable;

public class Pen implements Serializable {

    private String Type;
    private double length;
    private double width;
    private sample.Animal[] Animals;
    private sample.Keeper[] Keepers;
    private double penSize;

    public void Pen(String Type, double length, double width, sample.Animal[] Animals, sample.Keeper[] Keepers){
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

    public String getType(){return Type;}

    public double getlength(){ return length; }

    public double getwidth() { return width;}

    public sample.Animal[] getAnimals(){return Animals; }

    public sample.Keeper[] getKeepers(){
        return Keepers;
    }

    //method for adding animal to pen
    public void addAnimal (sample.Animal[] animals) {
        //penSize = length * width;
        for (sample.Animal animal : animals)
        {
            if (animal.getRequires() >= penSize) {
                System.out.println(animal.getName() + "can not be added to " + Type + " pen. ");

            }
            else System.out.println(animal.getName() + "has been added to " + Type +" pen.");
            penSize -= animal.getRequires();

        }
    }
}

