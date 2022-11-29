public class Tomcat extends Cat {
    public Tomcat(String name, int age) {
        super(name, age, "Male");
    }

    @Override
    public void produceSound(){
        System.out.println("MEOW");
    }
}
