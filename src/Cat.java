public class Cat extends Animal {

    private static int numberOfCopiesCats = 0;
    private boolean satiety = false;
    private int appetite;

    public Cat(String name, int appetite) {
        super(name);
        numberOfCopiesCats++;
        this.appetite = appetite;
    }

    public static int getNumberOfCopiesCats() {
        return numberOfCopiesCats;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    @Override
    public void run(int a) {
        super.run(Math.min(a, 200));
        if (a > 200){
            System.out.println("Кот может только пробежать 200 м!");
        }
    }

    @Override
    public void swim(int a) {
        if (a > 0){
            System.out.println("Кот не умеет плавать!");
        }
    }
}
