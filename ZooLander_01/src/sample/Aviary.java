package sample;

public class Aviary extends Pen {

    private String Type;
    private double length;
    private double width;
    private double height;
    private sample.Animal[] Animals;
    private sample.Keeper[] Keepers;
    private double penSize;


    //@Override
    public void Aviary(String Type, double length, double width, double height, sample.Animal[] Animals, sample.Keeper[] Keepers) {
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

    public sample.Animal[] getAnimals(){
        return Animals;
    }

    public sample.Keeper[] getKeepers(){
        return Keepers;
    }

    @Override
    public void PenSize (){
        penSize = length * width * height;

    }


}
