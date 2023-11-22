public class Circle implements MathCalculation {

    private String backgroundColor;
    private String borderColor;

    public Circle(String backgroundColor, String borderColor) {
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public double perimeterCalculate(int[] a) {
        if (a.length < 1) {
            return -1;
        }
        return 2 * Math.PI * a[0];
    }

    @Override
    public double areaCalculate(int[] a) {
        if (a.length < 1) {
            return -1;
        }
        return Math.PI * Math.pow(a[0], 2);
    }
}
