package home_work_15_2;

public class Cat extends Animal{
    @Override
    public String getName() {
        return "Я кот. Зовут меня - " + super.getName();
    }

    public Cat(String name) {
        super(name);
    }
}
