public class Animal {

    private String Animal;
    private String PenType;
    private double AnimalSize;
    private int Quantity;

    public Animal(){
        this.Animal = "";
        this.PenType = "";
        this.AnimalSize = 0;
        this.Quantity = 0;
    }

    public Animal(String Animal, String PenType, double AnimalSize, int Quantity){
        this.Animal = Animal;
        this.PenType = PenType;
        this.AnimalSize = AnimalSize;
        this. Quantity = Quantity;
    }

    public String getAnimal() {

        return Animal;
    }

    public void setAnimal(String Animal) {

        this.Animal = Animal;
    }

    public String getPenType(){

        return PenType;
    }

    public void setPenType(String PenType){

        this.PenType = PenType;
    }

    public double getAnimalSize(){

        return AnimalSize;
    }

    public void setAnimalSize(double AnimalSize){

        this.AnimalSize = AnimalSize;
    }

    public int getQuantity(){
        return Quantity;
    }

    public void setQuantity(int Quantity){

        this.Quantity = Quantity;
    }
}