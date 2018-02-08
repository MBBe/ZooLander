public class Animal extends Pen {

    private String Animal;
    private String PenType;
    private double AnimalSize;
    private int PenID;
    private double allAnimal;

    public Animal() {
        this.Animal = "";
        this.PenType = "";
        this.AnimalSize = 0;
        this.PenID = 0;
    }

    public Animal(String Animal, String PenType, double AnimalSize, int PenID) {
        this.Animal = Animal;
        this.PenType = PenType;
        this.AnimalSize = AnimalSize;
        this.PenID = PenID;
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

    public int getPenID() {
        return PenID;
    }

    public void setPenID(int PenID) {

        this.PenID = PenID;
    }

    public void addAnimals() {
    }

    //method for adding animal to pen
    /*public void PenFull( Pen penToCheck) {
        allAnimal = AnimalSize * Quantity;
        // Pen.Size;

        if (allAnimal >= penToCheck.getSize()) {
            System.out.println(Animal + "can't be added the " + PenType + " pen. It is now full");

        } else System.out.println(Animal + "has been successfully added to " + PenType + " pen.");
        penToCheck.setSize(penToCheck.getSize() - allAnimal);

        /*
         *  Pen size is 30
         *  Animal is 5
         *  Quanity 2
         *
         *  2*5 = 10
         *  30 - 10;
         * */

        /*for (to) {
            if (animal.getRequires() >= penSize) {
                System.out.println(animal.getName() + "can not be added to " + Type + " pen. ");

            } else System.out.println(animal.getName() + "has been added to " + Type + " pen.");
            penSize -= animal.getRequires();

        }

    }*/
    }



