public class LessonTwelve {

    public static int checkAndSumArray(String[][] array) throws MyArraySizeExeption, MyArrayDataExeption {

        int sum = 0;

        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeExeption("Размер массива не 4x4.");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataExeption("Элемент '" + array[i][j] + "' с индексом [" + i + "][" + j + "]"
                            + " не является числом.");
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        String[][] correctArray = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };

        String[][] incorrectArray = {
                {"1", "1", "1"},
                {"2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4"}
        };

        String[][] incorrectArray2 = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"abc", "4", "4", "4"}
        };

        try {
            int arraySum = checkAndSumArray(correctArray);
            System.out.println("Сумма всех элементов: " + arraySum);
        } catch (MyArraySizeExeption | MyArrayDataExeption e) {
            System.out.println("Ошибка! " + e.getMessage());
        }

        try {
            int arraySum = checkAndSumArray(incorrectArray);
            System.out.println("Сумма всех элементов: " + arraySum);
        } catch (MyArraySizeExeption | MyArrayDataExeption e) {
            System.out.println("Ошибка! " + e.getMessage());
        }

        try {
            int arraySum = checkAndSumArray(incorrectArray2);
            System.out.println("Сумма всех элементов: " + arraySum);
        } catch (MyArraySizeExeption | MyArrayDataExeption e) {
            System.out.println("Ошибка! " + e.getMessage());
        }
    }
}

