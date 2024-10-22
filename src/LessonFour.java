import java.util.Arrays;

public class LessonFour {

    public void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public void checkSumSign() {
        int a = -4;
        int b = 5;
        if ((long) a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public void compareNumbers() {
        int a = -16;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }

    public boolean checkSum(int a, int b) {
        boolean sum;
        if (a + b >= 10 && a + b <= 20) {
            sum = true;
        } else {
            sum = false;
        }
        return sum;
    }

    public void printTypeNumber(int number) {
        if (number >= 0) {
            System.out.println("Число " + "a" + "является положительным");
        } else {
            System.out.println("Число " + "a" + "является отрицательным");
        }
    }

    public void printBooleanValue(int number) {
        boolean check;
        if (number >= 0) {
            check = true;
            System.out.println(check);
        } else {
            check = false;
            System.out.println(check);
        }
    }

    public void printSeveralStrings(String phrase, int i) {
        for (int j = 1; j <= i; j++) {
            System.out.println(phrase);
        }
    }

    public boolean leapYear(int year) {
        boolean check;
        if (year % 4 == 0) {
            if (year % 100 == 0 && !(year % 400 == 0)) {
                check = false;
            } else {
                check = true;
            }
        } else {
            check = false;
        }
        return check;
    }

    public int[] twoDigitArray (){
        int[] nums = {0, 1, 0, 0, 1, 1, 0};
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                nums[j] = 1;
            }
            else {
                nums[j] = 0;
            }
        }
        return nums;

    }

    public int[] fillArray () {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        return nums;

    }

    public int[] multiplyNumbers () {
        int[] nums = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] <= 6) {
                nums[j] *= 2;
            }
        }
        return nums;

    }

    public void fillSquareArray () {
        int[][] table = new int[3][3];
        for (int i = 0; i < table[0].length; i++) {
            for (int j = 0; j < table[1].length; j++) {
                    if (i == j) {
                        table[i][j] = 1;
                    }
                    else {
                        table[i][j] = 0;
                    }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

    }

    public int[] equalValuesArray (int len, int initialValue) {
        int[] nums = new int[len];
        Arrays.fill(nums, initialValue);
        System.out.println(Arrays.toString(nums));

        return nums;
    }

}
