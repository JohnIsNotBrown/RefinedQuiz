package src;

public class Person {
    private String name;
    private int age;
    private int score;
        
    //constructor
    public Person(String name, int age, int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }
        
    //getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getScore(){
        return score;
    }
        
    //toString method that returns the values as a string
    public String toString(){
        return "Name: " + getName() + " Age: " + getAge() + " Score: " + getScore() + "/10"; 
    }
}