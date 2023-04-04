import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("asdasf", "srjyhsb-fsdfd-qweq", 123));
        people.add(new Person("bkjns", "vrtuege-qwccsas", 363));
        people.add(new Person("tyophgf", "psdnfk", 972));
        people.add(new Person("cjbxv", "hiwhfdsfdsdwethbi-dasd", 214));
        people.add(new Person("eroidf", "ekfnslk-xvxcv-weeqwfd-sdfs", 927));
        people.add(new Person("lsfdjs", "nfoidffdsfd", 451));

        Collections.sort(people, new PersonsComparator());
        System.out.println(people);
    }
}
