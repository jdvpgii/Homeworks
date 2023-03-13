import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> attraction = new LinkedList<>();
        Person person;
        int howManyTickets = 0;

        attraction.addAll(generateClients());

        while (!attraction.isEmpty()) {
            howManyTickets = attraction.peek().getTickets();
            if (howManyTickets >= 1) {
                person = attraction.poll();
                person.setTickets((person.getTickets())-1);
                System.out.println(person.getFirstName() + " прокатился на аттракционе. Осталось билетов: " + person.getTickets());
                attraction.offer(person);
            } else {
                person = attraction.poll();
                person.setTickets((person.getTickets())-1);
                System.out.println(person.getFirstName() + " прокатился на аттракционе. Осталось билетов: " + person.getTickets());
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> clients = new ArrayList<>();
        clients.add(new Person("Aaa", 7));
        clients.add(new Person("Bbb", 9));
        clients.add(new Person("Ccc", 4));
        clients.add(new Person("Ddd", 5));
        clients.add(new Person("Eee", 8));
        clients.add(new Person("F", 1));
        clients.add(new Person("GG", 3));
        return clients;
    }
}
