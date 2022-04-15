public class Tiger extends Animals {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void run(Integer distance) {
        if (distance > 1000) System.out.println("Тигр " + getName() + " не может пробежать " + distance + " метров!");
        else System.out.println("Тигр " + getName() + " пробежал " + distance + " метров!");
    }

    @Override
    public void swim(Integer distance) {
        if (distance > 100) System.out.println("Тигр " + getName() + " не может проплыть " + distance + " метров!");
        else System.out.println("Тигр " + getName() + " плывет " + distance + " метров!");
    }

    @Override
    public void fly(Integer distance) {
        System.out.println("Тигры не плавают!");
    }


}
