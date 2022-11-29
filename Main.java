import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(){
        Scanner scanner = new Scanner(System.in);
        String animalType = scanner.nextLine();

        while(!animalType.equals("Beast!")){
            String[] animalInfo = scanner.nextLine().split(" ");
            String name = animalInfo[0];
            int age = Integer.parseInt(animalInfo[1]);
            String gender = animalInfo[2];

            try {
                System.out.println(animalType);
                switch (animalType) {
                    case "Dog":
                        Dog dog = new Dog(name,age,gender);
                        System.out.println(dog);
                        dog.produceSound();
                        break;
                    case "Frog":
                        Frog frog = new Frog(name,age,gender);
                        System.out.println(frog);
                        frog.produceSound();
                        break;
                    case "Cat":
                        Cat cat = new Cat(name,age,gender);
                        System.out.println(cat);
                        cat.produceSound();
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(name,age);
                        System.out.println(kitten);
                        kitten.produceSound();
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name,age);
                        System.out.println(tomcat);
                        tomcat.produceSound();
                        break;

                }
            }catch (IllegalArgumentException ex){
                System.out.print(ex.getMessage());
            }

            animalType = scanner.nextLine();
        }

    }
}
