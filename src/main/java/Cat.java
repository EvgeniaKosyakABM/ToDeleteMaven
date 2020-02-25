package main.java;

public class Cat extends Animal{

    Cat(String name, int age) {
        System.out.println("Cat - cool");
        this.name = name;
        this.age = age;
        this.count++;
    }

    public Cat(String name) {
        System.out.println("Cat - cool");
        this.name = name;
        this.age = 1;
        this.count++;
    }

    Cat() {
        System.out.println("Cat - cool");
        name = "";
        age = 1;
    }

    String color = "white";
    String name;
    static int count = 0;

    private int age;
    public void setAge(int age) {
        if (age<=0 || age >20) {
            System.out.println("Error");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    static void resetCount() {
        count = 0;
    }

     String introduce(String userName, int number) {
        return "Hello " + userName + ", my name is "+ name+ " "+ number;
    }

    String introduce(String userName) {
         return String.format("Hello %s, my name is %s",userName, this.name);
        //return "Hello " + userName + ", my name is "+ name;
    }

    String introduce() {
        return "Hello, my name is "+ name+ color;
    }


}
