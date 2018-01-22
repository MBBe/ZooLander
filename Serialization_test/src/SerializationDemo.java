//import java.io.Serializable;

import java.io.*;
import java.util.*;

public class SerializationDemo
{
    public void serialize (List<Participant> pList, String fileName){
       try ( ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream(fileName))) {
           out.writeObject(pList);

       } catch (IOException ex) {
           System.out.print("A problem occurred during serialization");
           System.out.println(ex.getMessage());
       }
    }

    public List<Participant> deserialize(String fileName) {
        List<Participant> pList = null;
        try (ObjectInputStream in =
                new ObjectInputStream(new FileInputStream(fileName))) {
            pList = (List<Participant>)in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.printf("A problem occurred deserialising %s%n", fileName);
            System.out.println(ex.getMessage());

        }
        return pList;
    }
}
