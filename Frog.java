import Animal.Animal;

public class Frog extends Animal {
    public Frog(String name, int age, String gender) {
        super(name, age, gender);
    }
    public void produceSound(){
        System.out.println("Ribbit");
    }
}
