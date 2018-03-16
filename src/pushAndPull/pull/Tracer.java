package pushAndPull.pull;

public class Tracer {
    public void run(){
        Source source = new Source();

        while (true){
            String item = source.nextItem();
            if(item == null){
                break;
            }
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        new Tracer().run();
    }

}
