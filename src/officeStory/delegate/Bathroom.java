package officeStory.delegate;

public class Bathroom {
    public void serve(Employee employee) {
        System.out.println(employee.getName() + " 在上厕所");
        employee.cups = 0;
    }
}
