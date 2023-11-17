public class Park {
    Attraction[] attraction;

    public static class Attraction {

        public String name;
        public String workingHours;
        public int price;

        public Attraction(String name, String workingHours, int price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }
    }
}
