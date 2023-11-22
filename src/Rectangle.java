public class Rectangle implements MathCalculation{

    private String backgroundColor;
    private String borderСolor;

    public Rectangle(String backgroundColor, String borderСolor) {
        this.backgroundColor = backgroundColor;
        this.borderСolor = borderСolor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBorderСolor() {
        return borderСolor;
    }
}
