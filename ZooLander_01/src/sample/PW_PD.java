package sample;

public class PW_PD extends Pen {

    private String Type;
    private double PW_length;
    private double PW_width;
    private double PW_height;

    private double PD_length;
    private double PD_width;

    private Animal[] Animals;
    private Keeper [] Keepers;

    public void PW_PD (String Type, double PW_length, double PW_width, double PW_height, double PD_length, double PD_width, Animal[] Animals, Keeper[] Keepers) {
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

    public double getPW_length(){
        return PW_length;
    }

    public double getPW_width() { return PW_width;}

    public double getPW_height() { return PW_height;}

    public double getPD_length(){
        return PD_length;
    }

    public double getPD_width() { return PD_width;}

    public Animal[] getAnimals(){
        return Animals;
    }

    public Keeper[] getKeepers(){
        return Keepers;
    }
}
