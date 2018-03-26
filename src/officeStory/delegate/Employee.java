package officeStory.delegate;

public class Employee {
//    private Boss boss;
//
//    public Boss getBoss() {
//        return boss;
//    }
//
//    public void setBoss(Boss boss) {
//        this.boss = boss;
//    }

//    private Distributor distributor;
//
//    public Distributor getDistributor() {
//        return distributor;
//    }
//
//    public void setDistributor(Distributor distributor) {
//        this.distributor = distributor;
//    }

    private EmployeeDelegate delegate;

    public EmployeeDelegate getDelegate() {
        return delegate;
    }

    public void setDelegate(EmployeeDelegate delegate) {
        this.delegate = delegate;
    }

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int capacity = 10;
    int cups;

    public void run() {
        for (int i = 0; i < 10; i++) {
            drink((int)Math.ceil(Math.random() * 3));
        }
    }
    public void drink(int cups) {
        System.out.println(name + " 喝了 " + cups + " 杯水");
        this.cups += cups;
        if (this.cups >= capacity) {
            Bathroom bathroom = delegate.request(this);
            bathroom.serve(this);
        }
    }
}

