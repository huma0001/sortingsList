import java.util.*;

public class SortPeople {
    public static void main(String[] args) {
        Person[] people = {
                // Tilføj flere personer, som deler nogle af de samme egenskaber f.eks. samme fornavn, men hvor deres andre egenskaber er unikke.
                new Person("Hans", "Filipson", 30, 1.70),
                new Person("Merete", "Poulsen", 12, 1.22),
                new Person("Ibsen", "Poulsen", 55, 1.20),
                new Person("Sixten", "Ottesen", 15, 1.90),
                new Person("Sixten", "Mausen", 20, 1.56),
                new Person("Hussain", "Mahmoud", 23, 1.92),
                new Person("Omar", "Mahmoud", 23, 1.75)
        };

        List<Person> people1 = new ArrayList<>(List.of(people));


        System.out.println("Usorteret liste af personer:");
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println();
        // skriv kode herunder

        Collections.sort(people1);

        System.out.println("Sorteret liste af personer ift. alder:");
        for (Person person : people1) {
            System.out.println(person);
        }

        people1.sort(new lastNameComparator());

        System.out.println();

        System.out.println("Sorteret liste af personer ift. last name:");
        for (Person person : people1) {
            System.out.println(person);
        }
    }


}
