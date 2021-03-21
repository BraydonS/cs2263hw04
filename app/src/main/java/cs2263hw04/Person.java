package cs2263hw04;


public class Person{
    private String name;
    private Integer age;


    public Person(String n, int a){
        this.name = n;
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
