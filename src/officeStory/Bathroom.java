package officeStory;

public class Bathroom {

    public void serve(Employee employee){
        System.out.println(employee.getName() + " is in bathroom");
        employee.cups = 0;
    }
}
