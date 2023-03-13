public class Person {
    private String firstName;
    private int tickets;

    public Person(String firstName, int tickets) {
        this.firstName = firstName;
        this.tickets = tickets;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public String getFirstName() {
        return firstName;
    }
}
