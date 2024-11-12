class Rectangle implements Figure {
    private double height;
    private double width;
    private String fillColor;
    private String borderColor;

    public Rectangle(double height, double width, String fillColor, String borderColor) {
        this.height = height;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }
}