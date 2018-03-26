package pushAndPull.messageQueue;

import java.io.File;
import java.util.Scanner;

public class Source {
    public static void main(String[] args) throws Exception{
        new Source().run();
    }

    public void run() throws Exception {
        Tracer tracer = new Tracer();

        File file = new File("./data.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String[] parts = line.split(",");
            for (String part : parts) {
                tracer.addMessage(part);
            }
            tracer.consume();
        }
    }
}
