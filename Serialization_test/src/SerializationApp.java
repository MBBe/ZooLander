//package serialization;
//import java.io.Serializable;
import com.sun.xml.internal.ws.developer.Serialization;

import java.util.ArrayList;
import java.util.List;

public class SerializationApp
{
    public static void main(String[] args)
    {
        List<Participant> participants = new ArrayList<Participant>();
        participants.add(new Participant("Alex", "Aquarium & Part Wet, Part Dry", 2));
        participants.add(new Participant("Farhad", "Aviary", 1));
        participants.add(new Participant("Alan", "Petting Pen", 1));
        participants.add(new Participant("Hardip", "Dry Pen", 1));

        System.out.println("Participants: " + participants);

        SerializationDemo demo = new SerializationDemo();
        demo.serialize(participants, "src/Participants-Keepers.ser");

        System.out.println("Serialization done");

        List<Participant> newList = demo.deserialize("src/Participants-Keepers.ser");
        System.out.println("New list: " + newList);
    }
}
