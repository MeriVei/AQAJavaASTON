public class Rectangle implements MathCalculation {

    private String backgroundColor;
    private String borderColor;

    public Rectangle(String backgroundColor, String borderColor) {
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }
}
