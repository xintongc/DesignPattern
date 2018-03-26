package officeStory.delegate;

public class Distributor implements EmployeeDelegate{
    private Bathroom bathroom;

    public Bathroom getBathroom() {
        return bathroom;
    }

    public void setBathroom(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    public Bathroom request(Employee employee) {
        return bathroom;
    }
}
