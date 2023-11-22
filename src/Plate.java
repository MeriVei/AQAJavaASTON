public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addFood(int food) {
        this.food += food;
    }

    public boolean eat(int food) {
        if (food <= this.food) {
            this.food -= food;
            return true;
        } else {
            return false;
        }
    }
}
