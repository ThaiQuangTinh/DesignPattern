
interface Animal {

    String getQuak();

}

class Cat implements Animal {

    @Override
    public String getQuak() {
        return "Meo meo meo.";
    }

}

class Dog implements Animal {

    @Override
    public String getQuak() {
        return "Gau gau gau.";
    }

}

class Duck implements Animal {

    @Override
    public String getQuak() {
        return "Quac quac quac.";
    }

}

class AnimalFactoryMethod {

    public Animal createAnimal(String typeAnimal) {
        Animal animal;

        if (typeAnimal.equals("Cat")) {
            animal = new Cat();
        } else if (typeAnimal.equals("Dog")) {
            animal = new Dog();
        } else {
            animal = new Duck();
        }

        return animal;
    }

}

public class FactoryMethodPattern {

    public static void main(String[] args) {
        AnimalFactoryMethod animalFactoryMethod = new AnimalFactoryMethod();

        Animal animal = animalFactoryMethod.createAnimal("Cat");

        System.out.println(animal.getQuak());
    }

}
