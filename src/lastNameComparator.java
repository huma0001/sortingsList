import java.util.*;
class lastNameComparator implements Comparator<Person>{
    public int compare(Person p1,Person p2){
        return p1.getLastName().compareTo(p2.getLastName());
    }
}  