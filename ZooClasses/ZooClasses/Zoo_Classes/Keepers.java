
/**
 * Extention of Pen class, Information in this class is about Animals in the Pen.
 *
 * @author (Manasseh Boyd)
 * @version (01- 28/12/2017)
 */
public class Keepers extends Pens
{
    private String Keepers_Name;
    private String Keepers_Pen;
    private String Animal;
    private double length;
    private double width;
    private double Animal_size;
    protected double Pen_size;
    

    
    public Keepers(String Keepers_Name, String Keepers_Pen, String Animal, double length, double width){
     this.Keepers_Name=Keepers_Name;
     this.Keepers_Pen=Keepers_Pen;
     this.Animal=Animal;
     this.length=length;
     this.width=width;
    }

    public String getKeepers_Name () {
        return Keepers_Name;
    }
    public void setKeepers_Name (String Keepers_Name){
        this.Keepers_Name = Keepers_Name;
    }    
    public String getAnimal () {
        return Animal;
    }    
    public void setAnimal (String Animal){
        this.Animal = Animal;
    }    
    // Pen_requirements is a method for the Animal class and was just practiced in the Keeper class
    public void Pen_requirements () {
        Animal_size = length * width;
        //length = 50.0;
        //width = 80.8;
    }
    @Override 
    public void displayDetails () 
    {
        System.out.println ("Keepers Name:" + Keepers_Name);
        System.out.println ("Responsible for:" + Keepers_Pen + " Pen");
        
        //This if Statement needs to be put in the Animal class
        //The Zoo_size represents the length and the width (meters squared) of the whole Zoo
        // if a Pen goes over the limit of the whole zoo a message will pop up.
        //However code needs to be made so that each pen created will be added together so that the 
        //total doesn't go over the Zoo_size. 
        if (Animal_size >= Pen_size) {
          System.out.println ("Animal was not added to " + Keepers_Pen + " Pen");
          System.out.println ("This Pen is full and cannot house anymore animals in the " + Keepers_Pen + " Pen");  
        } 
        else 
        System.out.println ("Animal added to " + Keepers_Pen + " Pen");
        System.out.println ("The " + Animal + " has been successfully added to the " + Keepers_Pen + " Pen.");
        if (Keeper_Assigned){ 
            System.out.println("This Keeper is already assigned to a Pen");
        }       
        //else {System.out.println("This Pen has no Keeper! Please assign a Keeper to this Pen");
        //}
    }
}
