public class Cat extends Animals {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(Integer distance) {
        if (distance > 200) System.out.println("Котяра " + getName() + " не может пробежать " + distance + " метров!");
        else System.out.println("Котяра " + getName() + " пробежал " + distance + " метров!");
    }

    @Override
    public void swim(Integer distance) {
        System.out.println("Кошки не плавают!");
    }

    @Override
    public void fly(Integer distance) {
        System.out.println("Кошки не летают!");
    }


}
