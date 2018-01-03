public class Pens{

    private String Animal;
    private String PenType;
    private double PenSize;
    private int Quantity;

    public Pens(){
        this.Animal = "";
        this.PenType = "";
        this.PenSize = 0;
        this. Quantity = 0;
    }

    public Pens(String Animal, String PenType, double PenSize, int Quantity){
        this.Animal = Animal;
        this.PenType = PenType;
        this.PenSize = PenSize;
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

    public double getPenSize(){
        return PenSize;
    }

    public void setPenSize(double PenSize){
        this.PenSize = PenSize;
    }

    public int getQuantity(){
        return Quantity;
    }

    public void setQuanity(int Quantity){
        this.Quantity = Quantity;
    }
}


















