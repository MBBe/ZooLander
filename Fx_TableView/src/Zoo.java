public class Zoo extends Keeper {
    protected String PenName;
    protected String PenType;
    protected String Animal1;
    protected String Animal2;
    protected String Animal3;
    protected String Animal4;
    protected String Keeper;

    public Zoo(){
        this.PenName = "";
        this.PenType = "";
        this.Animal1 = "";
        this.Animal2 = "";
        this.Animal3 = "";
        this.Animal4 = "";
        this.Keeper = "";
    }

    public Zoo(String PenName, String PenType, String Animal1, String Animal2, String Animal3, String Animal4, String Keeper){
        this.PenName = PenName;
        this.PenType = PenType;
        this.Animal1 = Animal1;
        this.Animal2 = Animal2;
        this.Animal3 = Animal3;
        this.Animal4 = Animal4;
        this.Keeper = Keeper;

    }

    public String getPenName (){
        return PenName;
    }

    public void setPenName (String PenName) {
        this.PenName = PenName;
    }

    public String getPenType() {
        return PenType;
    }

    public void setPenType(String PenType) {
        this.PenType = PenType;
    }

    public String getAnimal1 (){
        return Animal1;
    }

    public void setAnimal1 (String Animal1){
        this.Animal1 = Animal1;
    }

    public String getAnimal2 (){
        return Animal2;
    }

    public void setAnimal2 (String Animal2){
        this.Animal2 = Animal2;
    }

    public String getAnimal3 (){
        return Animal3;
    }

    public void setAnimal3 (String Animal3){
        this.Animal3 = Animal3;
    }

    public String getAnimal4 (){
        return Animal4;
    }

    public void setAnimal4 (String Animal4){
        this.Animal4 = Animal4;
    }

    public String getKeeper (){
        return Keeper;
    }

    public void setKeeper (String Keeper){
        this.Keeper = Keeper;
    }

}
