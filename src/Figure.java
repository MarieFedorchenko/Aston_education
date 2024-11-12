public interface Figure {

    double getArea();
    double getPerimeter();
    String getBorderColor();
    String getFillColor();

    default void printFigureInfo() {
        System.out.println("Периметр — " + getPerimeter());
        System.out.println("Площадь — " + getArea());
        System.out.println("Цвет фона — " + getFillColor());
        System.out.println("Цвет границ — " + getBorderColor());
    }
}

