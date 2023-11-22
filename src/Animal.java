public class Animal {

    private static int numberOfCopiesAnimals = 0;
    private String name;

    public Animal(String name) {
        this.name = name;
        numberOfCopiesAnimals++;
    }

    public static int getNumberOfCopiesAnimals() {
        return numberOfCopiesAnimals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int a) {
        System.out.println(name + " пробежало " + a + " м");
    }

    public void swim(int a) {
        System.out.println(name + " проплыло " + a + " м");
    }
}
