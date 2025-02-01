package Lacture8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Person{
    String name;
    String country;

    public Person(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

public class FifthDemo {

    public static void main(String[] args) {
        Person person1 = new Person("John", "USA");
        Person person2 = new Person("Steve", "JAPAN");
        Person person3 = new Person("Ching", "CHINA");

        ArrayList<Person> persons = new ArrayList<>(Arrays.asList(person1, person2, person3));


        boolean status = persons.stream().anyMatch(p -> p.country.equals("CHINA"));
        System.out.println("Any Indian Available ?  :: " + status); // true


        boolean status2 = persons.stream().allMatch(P -> P.country.equals("INDIA"));
        System.out.println("All Persons from INDIA : " + status2); //false

        boolean status3 = persons.stream().noneMatch(p -> p.country.equals("MEXICO"));
        System.out.println("No person from Mexico ? : " + status3); // true


        // add 2 record
        Person person4 = new Person("Kapil", "INDIA");
        Person person5 = new Person("Akash", "INDIA");
        persons.add(person4); // person should be in arraylist datatype -- otherwise it will thorw error
        persons.add(person5);

        persons.stream().forEach(p -> System.out.print(p.country.toString() + " ")); // USA JAPAN CHINA INDIA INDIA
        System.out.println();

        // check is there any india is persent or not, If persent then return first India
        Optional<Person> optionalPerson = persons.stream()
                .filter(p -> p.country.equals("INDIA"))
                .findFirst();
        if (optionalPerson.isPresent() ) System.out.println(optionalPerson.get().name + " - " + optionalPerson.get().country); // Kapil - INDIA


        // get collection from all persons collection that belongs to India
        List<Person> collections2 = persons.stream().filter(p -> p.country.equals("INDIA")).collect(Collectors.toList());
        collections2.forEach(p -> System.out.println(p.name + " - " + p.country));
                                                                        // Kapil - INDIA
                                                                        // Akash - INDIA



        // collect name of persons who are belongs to india and store into names collection
        List<String> names = persons.stream()
                .filter(p -> p.country.equals("INDIA"))
                .map(p -> p.name)
                .collect(Collectors.toList());
        System.out.println(names); // [Kapil, Akash]




    }
}



