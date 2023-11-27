import java.util.ArrayList;
import java.util.List;

public class Person {

    public enum Sex{
        MALE,FEMALE
    }
    String name;
    int age;
    String emailAddress;
    Sex gender;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", emailAddress='" + emailAddress + '\'' +
                ", gender=" + gender +
                '}';
    }

    public Person(String name, int age, String emailAddress, Sex gender) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public void printPerson()
    {
        System.out.println(this.toString());
    }

    public static List<Person> generateDefaultList()
    {
        List<Person> people=new ArrayList<>();
        people.add(new Person("Ayush",20,"ayushstwt@gmail.com",Sex.MALE));
        people.add(new Person("Abhay",21,"abhaystwt@gmail.com",Sex.MALE));
        people.add(new Person("Aditi",19,"aditistwt@gmail.com",Sex.FEMALE));
        return people;
    }
}
