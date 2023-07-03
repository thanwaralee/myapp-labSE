package myapp;

public class Cat {
    String name ;
    int age ;

    public Cat(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void HappyBirthday(){
        this.age += 1.7;
    }

    public int getAge() {
        return age;
    }
}
