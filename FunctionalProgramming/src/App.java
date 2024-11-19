import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        List<Person> people= List.of(
            new Person("Andrea", Gender.MALE),
            new Person("Maria", Gender.FEMALE),
            new Person("Paola", Gender.FEMALE),
            new Person("Roberto", Gender.MALE),
            new Person("Marco", Gender.MALE)
        );

        //approccio imperativo
        // List<Person> females = new ArrayList<>();

        // for (Person person : people) {
        //     if(Gender.FEMALE.equals(person.gender)) females.add(person);
        // }

        // for (Person f : females) {
        //     System.out.println(f.name);
        // }

        //Funzionale
        people.stream().filter(person -> Gender.FEMALE.equals(person.gender))
                        .collect(Collectors.toList())
                        .forEach(person -> System.out.println(person.name));

        System.out.println("Lista dopo il filtro:");
        for (Person p : people) {
            System.out.println(p.name);
        }
    }
}
