public class Triangle implements MathCalculation {

    private String backgroundColor;
    private String borderColor;

    public Triangle(String backgroundColor, String borderColor) {
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
        if (a.length < 3) {
            return -1;
        }
        return a[0] + a[1] + a[2];
    }

    @Override
    public double areaCalculate(int[] a) {
        if (a.length < 3) {
            return -1;
        }
        double pp = (double) (a[0] + a[1] + a[2]) / 2;
        return Math.sqrt(pp * (pp - a[0]) * (pp - a[1]) * (pp - a[2]));
    }
}
