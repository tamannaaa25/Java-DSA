/*
 Write a Java program to create a class called "Dog" with a name and breed attribute. 
 Create two instances of the "Dog" class, set their attributes using the constructor and 
 modify the attributes using the setter methods and print the updated values.
 */
public class Dog {
    String name;
    String breed;
    Dog(String name, String breed){
        this.name=name;
        this.breed=breed;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String breed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed=breed;
    }

    public static void main(String[] args) {
        Dog dog1= new Dog("Max", "Golden Retriever");
        System.out.println(dog1.getName());
        System.out.println(dog1.breed());
        dog1.setName("Buddy");
        dog1.setBreed("Labrador");
        System.out.println(dog1.getName());
        System.out.println(dog1.breed());
    }
}

