
class Animal {
    String name;

    public Animal(String name) 
    {
        this.name = name;
    }
    public void makeSound()
    {
        System.out.println("This animal makes a sound");
    }
}
class Dog extends Animal {
    public Dog(String name)
    {
        super(name); 
    }
    public void makeSound()
    {
        System.out.println(name + " says: Woof Woof");
    }
}
class Cat extends Animal {
    public Cat(String name)
    {
        super(name); 
    }
    public void makeSound() 
    {
        System.out.println(name + " says: Meow Meow");
    }
}
public class AnimalExample {
    public static void main(String[] args)
    {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");
        dog.makeSound(); 
        cat.makeSound();  
    }
}
