public class Circle implements MathCalculation{

    private String backgroundColor;
    private String borderСolor;

    public Circle(String backgroundColor, String borderСolor) {
        this.backgroundColor = backgroundColor;
        this.borderСolor = borderСolor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBorderСolor() {
        return borderСolor;
    }

    @Override
    public double perimeterCalculate(int[] a) {
        if (a.length < 1){
            return -1;
        }
        return 2 * Math.PI * a[0];
    }

    @Override
    public double areaCalculate(int[] a) {
        if (a.length < 1){
            return -1;
        }
        return Math.PI * Math.pow(a[0],2);
    }
}
