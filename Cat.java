import Animal.Animal;

public class Cat extends Animal {
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }


    public void produceSound(){
        System.out.println("Meow meow");
    }
}
