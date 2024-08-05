import java.util.HashSet;
import java.util.Set;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person(\"" + name + "\", " + age + ")";
    }

    public static Set<Person> union(Set<Person> set1, Set<Person> set2) {
        Set<Person> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static Set<Person> difference(Set<Person> set1, Set<Person> set2) {
        Set<Person> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        return differenceSet;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
        Person person3 = new Person("Charlie", 35);

        Set<Person> set1 = new HashSet<>();
        set1.add(person1);
        set1.add(person2);

        Set<Person> set2 = new HashSet<>();
        set2.add(person2);
        set2.add(person3);

        Set<Person> unionResult = union(set1, set2);
        Set<Person> differenceResult = difference(set1, set2);

        System.out.println("Union: " + unionResult);
        System.out.println("Difference: " + differenceResult);
    }
}
