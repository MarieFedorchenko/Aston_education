import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LessonFour app = new LessonFour();

        System.out.println("№1");
        app.printThreeWords();

        System.out.println("\n№2");
        app.checkSumSign();

        System.out.println("\n№3");
        app.printColor();

        System.out.println("\n№4");
        app.compareNumbers();

        System.out.println("\n№5");
        System.out.println(app.checkSum(4, 5));

        System.out.println("\n№6");
        app.printTypeNumber(4);

        System.out.println("\n№7");
        app.printBooleanValue(-75);

        System.out.println("\n№8");
        app.printSeveralStrings("Hello", 5);

        System.out.println("\n№9");
        System.out.println(app.leapYear(100));

        System.out.println("\n№10");
        int[] a = app.twoDigitArray();
        System.out.println(Arrays.toString(a));

        System.out.println("\n№11");
        int[] b = app.fillArray();
        System.out.println(Arrays.toString(b));

        System.out.println("\n№12");
        int[] c = app.multiplyNumbers();
        System.out.println(Arrays.toString(c));

        System.out.println("\n№13");
        app.fillSquareArray();

        System.out.println("\n№14");
        app.equalValuesArray(4,6);
    }
}