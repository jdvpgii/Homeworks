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

        Collections.sort (people, (p1, p2) -> {
            int surNameWords1 = p1.getSurname().split("-").length;
            int surNameWords2 = p2.getSurname().split("-").length;
            if (surNameWords1 < surNameWords2) {
                return -1;
            } else if (surNameWords2 > surNameWords2) {
                return 1;
            } else {
                return p1.getAge() - p2.getAge();
            }
        });

        System.out.println(people);
    }
}
