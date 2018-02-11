

public class Pen extends Keeper {


    protected String Name;
    protected double Size;
    protected String Animal;
    protected String Keeper;

    public Pen(){
        this.Name = "";
        this.Size = 0;
        this.Animal = "";
        this.Keeper = "";


    }

    public Pen(String Name, String Animal, String Keeper, double Size){
        this.Name = Name;
        this.Size = Size;
        this.Animal = Animal;
        this.Keeper = Keeper;
    }

    public String getName() {

        return Name;
    }

    public void setName(String Name) {

        this.Name = Name;
    }

    public double getSize(){

        return Size;
    }

    public void setSize(double Size){

        this.Size = Size;
    }

    public String getAnimal(){
        return Animal;
    }

    public void setAnimal(String Animal) {
        this.Animal = Animal;
    }

    public String getKeeper(){
        return Keeper;
    }

    public void setKeeper(String Keeper){
        this.Keeper = Keeper;
    }



}
