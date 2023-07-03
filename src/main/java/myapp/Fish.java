package myapp;

public class Fish {
    String name;
    int age;
    int distance;
    float swim;

    public Fish(String name, float swim,int age) {
        this.name = name;
        this.swim = swim;
        this.age = age;
    }

    public void Swim_1min(){
        this.swim += 0.5;
        this.distance += 3;
    }

}
