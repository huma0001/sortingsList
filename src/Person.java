import java.util.Comparator;

public class Person implements Comparable<Person>{

    // Gammel Comparator
    /*public static Comparator<Person> AGE_COMPARATOR = Comparator.comparing(Person::getAge)
            .thenComparing(Person::getFirstName);
     */



    private String firstName;
    private String lastName;
    private int age;
    private double height;

    public Person(String firstName, String lastName, int age, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Fornavn: " + getFirstName() + ", Efternavn: " + getLastName() + ", Alder: " + getAge() + ", Højde: " + getHeight();
    }

    @Override
    public int compareTo(Person o) {
        // Primært sortere efter alder ** Bruger Integer.compare for at kunne gøre det
        int result = Integer.compare(this.getAge(), o.getAge());

        return result != 0 ? result : this.getFirstName().compareTo(o.getFirstName());
    }

}

