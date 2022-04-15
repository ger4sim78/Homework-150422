public class Duck extends Animals {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly(Integer distance) {
        if (distance > 1000) System.out.println("Утка " + getName() + " не может пролететь " + distance + " метров!");
        else System.out.println("Утка " + getName() + " летит " + distance + " метров!");
    }

    @Override
    public void run(Integer distance) {
        if (distance > 50) System.out.println("Утка " + getName() + " не может пробежать " + distance + " метров!");
        else System.out.println("Утка " + getName() + " бежит " + distance + " метров!");
    }

    @Override
    public void swim(Integer distance) {
        if (distance > 200) System.out.println("Утка " + getName() + " не может проплыть " + distance + " метров!");
        else System.out.println("Утка " + getName() + " плывет " + distance + " метров!");
    }


}
