package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain1 {

    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        WildCardEx.printGeneric1(dogBox);
        WildCardEx.printWildcardV1(dogBox);

        WildCardEx.printGeneral2(dogBox);
        WildCardEx.printWildcardV2(dogBox);

        Dog dog = WildCardEx.printAndReturnGeneric(dogBox);

        catBox.set(new Cat("냐옹이", 50));
        Cat cat = WildCardEx.printAndReturnGeneric(catBox);
        
        Animal animal = WildCardEx.printAndReturnWildCard(dogBox);
    }
}
