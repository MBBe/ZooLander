//package Serializable;

import com.sun.xml.internal.ws.developer.Serialization;

import java.io.Serializable;

public class Participant implements Serializable
{
    private final String firstName;
    private final String penName;
    private int pens;

    public Participant(String fName, String pName, int p)
    {
        firstName = fName;
        penName = pName;
        pens = p;
    }

    public String getFirstName () {
        return firstName;
    }

    public String getpenName() {
        return penName;
    }

    public int getAge() {
        return pens;
    }

    public void setAge(int pens) {
        this.pens = pens;
    }

    @Override
    public String toString()
    {
        return firstName + " " + penName + " (" + pens + ")";
    }
}
