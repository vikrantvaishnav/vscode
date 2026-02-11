package steamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class GroupPersonsByGender {

    public static void main(String[] args) {

       
        List<Person> persons = new ArrayList<>();

        int x = Integer.parseInt(IO.readln());
        while(x>0){
            String name = IO.readln();
            int age = Integer.parseInt(IO.readln());
            String gender = IO.readln();

            persons.add(new Person(name,age,gender));
            x--;
        }
        
        Map<String, List<Person>> groupedByGender =
                persons.stream()
                       .collect(Collectors.groupingBy(Person::getGender));

        
        groupedByGender.forEach((gender, list) -> {

            System.out.println(gender + ":");

            list.forEach(person -> System.out.println(person));

            System.out.println();
        });
    }
}

class Person {

    private String name;
    private int age;
    private String gender;

    
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

   
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    
    @Override
    public String toString() {
        return "Person{name=" + name +
               ", age=" + age +
               ", gender=" + gender + "}";
    }
}



