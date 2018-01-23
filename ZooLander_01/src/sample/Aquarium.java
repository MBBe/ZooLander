package sample;

public class Aquarium extends Pen {

        private String Type;
        private double length;
        private double width;
        private double height;
        private Animal[] Animals;
        private Keeper [] Keepers;

    public void Aquarium(String Type, double length, double width, double height, Animal[] Animals, Keeper[] Keepers) {
        this.Type= Type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.Animals = Animals;
        this.Keepers = Keepers;
    }

    public String getType(){
        return Type;
    }

    public double getlength(){
        return length;
    }

    public double getwidth() { return width;}

    public double getheight() { return height;}

    public Animal[] getAnimals(){return Animals;}

    public Keeper[] getKeepers(){
        return Keepers;
    }

}
