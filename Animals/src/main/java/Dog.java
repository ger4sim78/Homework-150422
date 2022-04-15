public class Dog extends Animals {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(Integer distance) {
        if (distance > 500) System.out.println("Собака " + getName() + " не может пробежать " + distance + " метров!");
        else System.out.println("Собака " + getName() + " пробежал " + distance + " метров!");
    }

    @Override
    public void swim(Integer distance) {
        if (distance > 10) System.out.println("Собака " + getName() + " не может проплыть " + distance + " метров!");
        else System.out.println("Собака " + getName() + " плывет " + distance + " метров!");
    }

    @Override
    public void fly(Integer distance) {
        System.out.println("Собаки не летают!");
    }


}
