package creational.builder;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(PersonBuilder  personBuilder){
        this.name = personBuilder.name;
        this.age = personBuilder.age;
        this.gender = personBuilder.gender;
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

    public static class PersonBuilder {
        private String name;
        private int age;
        private String gender;

        public PersonBuilder(String name, int age){
            this.name = name;
            this.age = age;
        }

        public PersonBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
