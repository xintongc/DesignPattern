package officeStory.version1;

public class Office {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Bathroom bathroom = new Bathroom();
        boss.setBathroom(bathroom);

        Employee employee = new Employee();
        employee.setName("yy");
        employee.setBoss(boss);
        employee.run();
    }
}
