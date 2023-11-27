import java.util.List;

public class Main {

    @FunctionalInterface
    interface  CheckPerson{
        boolean test(Person p);
    }

    static class CheckPersonEligibleForSelectiveSearch implements CheckPerson{

        @Override
        public boolean test(Person p) {
            return p.gender==Person.Sex.MALE && p.getAge()>=18 && p.getAge()<=25;
        }
    }

    public static void printPeople(List<Person> people,CheckPerson checkPerson)
    {
        for (Person p : people)
        {
            if (checkPerson.test(p))
            {
                System.out.println(p);
            }
        }
    }
    public static void main(String[] args) {
        List<Person> people=Person.generateDefaultList();
//        printPersonOlderThan(people,20);
//        printPersonWithInAgeRange(people,20,21);
//        printPeople(people,new CheckPersonEligibleForSelectiveSearch());
//        printPeople(people, new CheckPerson() {
//            @Override
//            public boolean test(Person p) {
//                return p.gender==Person.Sex.MALE && p.getAge()>=18 && p.getAge()<=25;
//            }
//        });

        printPeople(people, (p) ->
                        p.gender==Person.Sex.MALE
                        && p.getAge()>=18
                        && p.getAge()<=25
                    );

    }
    public static void printPersonOlderThan(List<Person> people
            ,int age)
    {
        for (Person p:people)
        {
            if (p.getAge()>=age)
            {
                p.printPerson();
            }
        }
    }
    public static void printPersonWithInAgeRange(List<Person> people
            ,int lowerAge,int higherAge)
    {
        for (Person p:people)
        {
            if (lowerAge<=p.getAge() && higherAge<p.getAge())
            {
                p.printPerson();
            }
        }
    }
    

}