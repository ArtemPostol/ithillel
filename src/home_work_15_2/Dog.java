package home_work_15_2;

public class Dog extends Animal{

    public String getName() {
        return "Я собака. Зовут меня - " + super.getName();
    }

    public Dog(String name) {
        super(name);
    }
}
