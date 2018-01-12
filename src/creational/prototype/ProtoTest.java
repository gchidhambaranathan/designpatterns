package creational.prototype;

public class ProtoTest {
    public static void main(String[] args)  {
        Person person = new Person("Chida", 35, new Address("Chennai"));
        Person person1 = (Person) person.clone();

        person1.setName("Nathan");
        person1.getAddress().setAddress("Trichy");
        System.out.println(person.getName() + " " + person.getAge() + " " + person.getAddress().getAddress()  + " " + person.hashCode());
        System.out.println(person1.getName() + " " + person1.getAge() + " " +person1.getAddress().getAddress()  + " " + person1.hashCode());
    }
}
