import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] date = {{100, 200, 123}, {300, 400, 500}};
        AppDate appData = new AppDate(header, date);
        AppDate.save(appData);
        AppDate rezult = AppDate.load();
        System.out.println(Arrays.toString(rezult.getHeader()));
        for (int i = 0; i < rezult.getDate().length; i++) {
            System.out.println(Arrays.toString(rezult.getDate()[i]));
        }
    }
}