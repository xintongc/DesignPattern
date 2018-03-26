package officeStory.delegate;

public class Office {
    public static void main(String[] args) {
        Distributor distributor = new Distributor();
        Bathroom bathroom = new Bathroom();
        distributor.setBathroom(bathroom);

        Employee employee = new Employee("尹文东");
//        employee.setBoss(boss);
        employee.setDelegate(distributor);
        employee.run();

    }
}
