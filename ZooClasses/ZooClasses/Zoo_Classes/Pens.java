
/**
 * This class is for information about the Pens in the Zoo.
 *
 * @author (Manasseh Boyd)
 * @version (01 27/12/2017)
 */
public class Pens
{
    protected String Pen_Name;
    protected boolean Pen_Full;
    //protected String Requirements;
    protected boolean Keeper_Assigned;
    protected boolean Animals_Assigned;
    protected boolean staff_Assigned;
    //protected double Zoo_size;
    protected double length;
    protected double width;
    protected double Pen_size;
    
    protected void Pens (double Pen_size){
        this.Pen_size=Pen_size;
    }    
    
    public void  setPen_size () {
        Pen_size = 500.00;
    }
    
    /**
     * Constructor for objects of class Pens
     */
    public void displayDetails (){
        System.out.println ("This is the Pens base class");
    }
    
    
    public void Zoo_size () {
        /*Zoo_size = length * width;
        if (Zoo_size >= 230.00) {
          System.out.println ("This Pen is full and cannot house anymore animals ");  
        }*/ //This piece of code is for when a new animal pen is added and can't fit in the zoo.        
    }
    public void set_staff () {
        staff_Assigned = true;
    }     
     public void no_staff () {
        staff_Assigned = false;
    }
    
    
    public void setPen_Assigned () {
        Animals_Assigned = true;
    }    
    public void noPen_Assigned () {
        Animals_Assigned = false;
    }    
    
    public void rightKeeper (){
       Keeper_Assigned = true;
    }     
    public void wrongKeeper (){
        Keeper_Assigned = false;
    }    
    
    public void  setPenFull () {
        Pen_Full = true;
    }
    public void notFull (){
        Pen_Full = false;
    }
}
