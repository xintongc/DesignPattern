package officeStory;

import static java.lang.Math.random;

public class Employee {
    private Boss boss;

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    int capacity = 10;
    int cups;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void drink(int cups){
        System.out.println(name + " drinking " + cups + " water");
        this.cups += cups;
        if (this.cups >= capacity){
            Bathroom bathroom = boss.request(this);
            bathroom.serve(this); //让bathroom 去serve employee
        }
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            drink((int) Math.ceil(random()*3));
        }
    }

}
