package problem6_animals;

public class Cat extends Animal {
    public Cat(String name, Integer age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return ("MiauMiau");
    }
}
