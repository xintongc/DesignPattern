package pushAndPull.messageQueue;

import java.util.LinkedList;
import java.util.List;

public class Tracer {
    private List<String> messages = new LinkedList<>();

    public void addMessage(String message){
        messages.add(message);
    }

    public void consume() {
        for (String message : messages) {
            System.out.println(message);
        }
        messages.clear();
    }

}
