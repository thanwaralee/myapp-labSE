package myapp;

public class Cat {
    String name ;
    int age ;

    public Cat(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void HappyBirthday(){
        this.age += 0.7;
    }
    public void died(){
        this.age = 0;
    }
}
