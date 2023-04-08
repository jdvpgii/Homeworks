import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("asdasf", "srjyhsb-fsdfd-qweq", 123));
        people.add(new Person("bkjns", "vrtuege-qwccsas", 363));
        people.add(new Person("tyophgf", "psdnfk", 972));
        people.add(new Person("cjbxv", "hiwhfdsfdsdwethbi-dasd", 214));
        people.add(new Person("eroidf", "ekfnslk-xvxcv-weeqwfd-sdfs", 927));
        people.add(new Person("lsfdjs", "nfoidffdsfd", 451));
        people.add(new Person("fffff", "gggggg", 16));
        people.add(new Person("xxxxx", "cccccc", 17));

        people.removeIf(person -> person.getAge() < 18);
        System.out.println(people);
    }
}
