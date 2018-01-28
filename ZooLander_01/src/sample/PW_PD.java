package sample;

import sample.Pen;

public class PW_PD extends Pen {

    private String Type;
    private double PW_length;
    private double PW_width;
    private double PW_height;

    private double PD_length;
    private double PD_width;
    private double PW_Size;
    private double PD_Size;
    private double PW_penSize;
    private double PD_penSize;


    private sample.Animal[] Animals;
    private sample.Keeper[] Keepers;

    public void PW_PD (String Type, double PW_length, double PW_width, double PW_height,
                       double PD_length, double PD_width, sample.Animal[] Animals, sample.Keeper[] Keepers) {
        this.Type = Type;
        this.PW_length = PW_length;
        this.PW_width = PW_width;
        this.PW_height = PW_height;
        this.Animals = Animals;
        this.Keepers = Keepers;
    }

    public String getType(){
        return Type;
    }

    public double getPW_length(){return PW_length;}

    public double getPW_width() { return PW_width;}

    public double getPW_height() { return PW_height;}

    public double getPD_length(){return PD_length;}

    public double getPD_width() { return PD_width;}

    public sample.Animal[] getAnimals(){return Animals;}

    public sample.Keeper[] getKeepers(){return Keepers;}

    //method to calculate the overall size of the PW_PD Pen
    @Override
    public void PenSize (){
        PW_Size = PW_length * PW_width * PW_height;
        PD_Size = PD_length * PD_width;
        PW_penSize = PW_Size;
        PD_penSize = PD_Size;
    }
}