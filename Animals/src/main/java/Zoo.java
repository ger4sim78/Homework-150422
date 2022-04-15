import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        int ducks = 0;
        int dogs = 0;
        int cats = 0;
        int tigers = 0;

        Tiger sherkhan = new Tiger("Шерхан");
        Tiger amur = new Tiger("Амур");
        Tiger tigra = new Tiger("Тигра");
        Duck duffy = new Duck("Даффи");
        Duck donald = new Duck("Дональд");
        Duck scrudge = new Duck("Скрудж");
        Dog scooby = new Dog("Скуби");
        Dog goofy = new Dog("Гуфи");
        Dog mukhtar = new Dog("Мухтар");
        Cat tom = new Cat("Том");
        Cat murka = new Cat("Мурка");
        Cat barsik = new Cat("Барсик");

        ArrayList <Animals> zoo = new ArrayList<>();
        zoo.add(sherkhan);
        zoo.add(amur);
        zoo.add(tigra);
        zoo.add(duffy);
        zoo.add(donald);
        zoo.add(scrudge);
        zoo.add(scooby);
        zoo.add(goofy);
        zoo.add(mukhtar);
        zoo.add(tom);
        zoo.add(murka);
        zoo.add(barsik);

        for (Animals x : zoo) {
            x.run(getDistance());
            x.swim(getDistance());
            x.fly(getDistance());
            if (x instanceof Cat) cats++;
            if (x instanceof Duck) ducks++;
            if (x instanceof Dog) dogs++;
            if (x instanceof Tiger) tigers++;
        }

        System.out.println("Всего создано " + cats + " кошек");
        System.out.println("Всего создано " + ducks + " уток");
        System.out.println("Всего создано " + dogs + " собак");
        System.out.println("Всего создано " + tigers + " тигров");


    }


    public static int getDistance () {
        return (int) (Math.random() * 1000 + 1);
    }


}
