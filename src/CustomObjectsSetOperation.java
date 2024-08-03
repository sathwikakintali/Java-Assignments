import java.util.*;

public class CustomObjectsSetOperation {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        Person alice = new Person("Alice", 30);
        Person bob = new Person("Bob", 25);

        set.add(alice);
        set.add(bob);

        System.out.println(set.contains(new Person("Alice", 30))); // true
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }
}
