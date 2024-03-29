package lesson15;

import java.util.Comparator;

public class CustomPersonComporator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if (!p1.name.equals(p2.name)) {
            return p1.name.compareTo(p2.name);
        } else if (p1.age != p2.age) {
            return Integer.compare(p1.age, p2.age);
        }
        return Double.compare(p2.salary, p1.salary);
    }
}
