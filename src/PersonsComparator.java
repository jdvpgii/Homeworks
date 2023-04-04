import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (surNameWords(o1) < surNameWords(o2)) {
            return -1;
        } else if (surNameWords(o1) > surNameWords(o2)) {
            return 1;
        } else {
            return o1.getAge() - o2.getAge();
        }
    }

    private int surNameWords(Person person) {
        return person.getSurname().split("-").length;

    }
}