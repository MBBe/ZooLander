public class Animal {

    private String Animal;
    private String PenType;
    private double AnimalSize;
    private int Quantity;
    private double totalArea;

    public Animal() {
        this.Animal = "";
        this.PenType = "";
        this.AnimalSize = 0;
        this.Quantity = 0;
    }

    public Animal(String Animal, String PenType, double AnimalSize, int Quantity) {
        this.Animal = Animal;
        this.PenType = PenType;
        this.AnimalSize = AnimalSize;
        this.Quantity = Quantity;
    }

    public String getAnimal() {

        return Animal;
    }

    public void setAnimal(String Animal) {

        this.Animal = Animal;
    }

    public String getPenType() {

        return PenType;
    }

    public void setPenType(String PenType) {

        this.PenType = PenType;
    }

    public double getAnimalSize() {

        return AnimalSize;
    }

    public void setAnimalSize(double AnimalSize) {

        this.AnimalSize = AnimalSize;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {

        this.Quantity = Quantity;
    }

    public void addAnimals() {
    }

    //method for adding animal to pen
    /*public void addAnimal( ) {
        //penSize = length * width;
        totalArea = AnimalSize * Quantity;

        for (to) {
            if (animal.getRequires() >= penSize) {
                System.out.println(animal.getName() + "can not be added to " + Type + " pen. ");

            } else System.out.println(animal.getName() + "has been added to " + Type + " pen.");
            penSize -= animal.getRequires();

        }

    }*/

}

