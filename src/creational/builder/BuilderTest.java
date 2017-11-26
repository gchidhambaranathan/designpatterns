package creational.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Person p = new Person.PersonBuilder("Chida", 60).setGender("Male").build();
        System.out.println(p.getName() + " "+ p.getAge() + " "+ p.getGender());
    }
}
