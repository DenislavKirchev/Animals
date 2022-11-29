package Animal;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if(age <=0){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public void setGender(String gender) {
        if(!(gender == "Male" || gender == "Female")){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    public String toString(){
        return String.format("%s %d %s%n",name, age, gender);

    }


}
