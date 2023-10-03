import com.niklas.models.Cat;
import com.niklas.models.Dog;

public class Main {
    public static void main(String[] args) {


        // Instantiate Objects
        Cat kasper = new Cat();
        Dog fido = new Dog();

        kasper.name();
        kasper.move();
        kasper.eat();
        kasper.sleep();
        kasper.makeSound();
        kasper.typeOfAnimal("Cat");

        fido.name();
        fido.move();
        fido.eat();
        fido.sleep();
        fido.makeSound();
        fido.typeOfAnimal("Dog"); // Default method

    }
}