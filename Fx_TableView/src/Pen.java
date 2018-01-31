public class Pen {


    private String Name;
    private double Size;
    private String Animal;

    public Pen(){
        this.Name = "";
        this.Size = 0;
        this.Animal = "";

    }

    public Pen(String Name, String Animal, double Size){
        this.Name = Name;
        this.Size = Size;
        this.Animal = Animal;
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

    public void setAnimal() {
        this.Animal = Animal;
    }

}
