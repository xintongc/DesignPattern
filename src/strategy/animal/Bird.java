package strategy.animal;

public class Bird extends Animal{

    public Bird(){
        super();
        setSound("Tweet");

        flyingType = new ITFlys();
    }


}
