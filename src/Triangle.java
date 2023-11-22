public class Triangle implements MathCalculation{

    private String backgroundColor;
    private String borderСolor;

    public Triangle(String backgroundColor, String borderСolor) {
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
        if (a.length < 3){
            return -1;
        }
        return a[0] * a[1] * a[2];
    }

    @Override
    public double areaCalculate(int[] a) {
        if (a.length < 1){
            return -1;
        }
        return 1/2*a[0]*3;
    }
}
