import java.util.*;

public class Main {
    public static void main(String[] args) {
        //4
        System.out.println("№4");
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());
        Box<Orange> orangeBoxOne = new Box<>();
        orangeBoxOne.add(new Orange());
        orangeBoxOne.add(new Orange());
        orangeBoxOne.add(new Orange());
        System.out.println("Вес коробки с апельсинами: " + orangeBoxOne.getWeight());
        //5
        System.out.println("№5");
        if (appleBox.compare(orangeBoxOne)) {
            System.out.println("Коробки весят одинаково");
        } else {
            System.out.println("Вес коробок разный");
        }
        //6
        System.out.println("№6");
        Box<Orange> orangeBoxTwo = new Box<>();
        orangeBoxTwo.add(new Orange());
        orangeBoxTwo.add(new Orange());
        orangeBoxTwo.add(new Orange());
        orangeBoxTwo.add(new Orange());
        orangeBoxTwo.add(new Orange());
        orangeBoxTwo.add(new Orange());
        orangeBoxTwo.add(new Orange());
        System.out.println("Вес первой коробки с апельсинами: " + orangeBoxOne.getWeight());
        System.out.println("Вес второй коробки с апельсинами: " + orangeBoxTwo.getWeight());
        System.out.println("Пересыпаем апельсины с первой коробки во вторую");
        orangeBoxOne.moveFruits(orangeBoxTwo);
        System.out.println("Вес первой коробки с апельсинами: " + orangeBoxOne.getWeight());
        System.out.println("Вес второй коробки с апельсинами: " + orangeBoxTwo.getWeight());
    }
}

abstract class Fruit {
    public abstract float getWeight();
}

class Apple extends Fruit {
    @Override
    public float getWeight() {
        return 1.0F;
    }
}

class Orange extends Fruit {
    @Override
    public float getWeight() {
        return 1.5F;
    }
}

class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void moveFruits(Box<T> box) {
        box.fruits.addAll(fruits);
        fruits.clear();
    }

    public float getWeight() {
        if (!fruits.isEmpty()) {
            return fruits.size() * fruits.get(0).getWeight();
        }
        return 0;
    }

    public boolean compare(Box<? extends Fruit> box) {
        return getWeight() == box.getWeight();
    }
}