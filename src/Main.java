import java.util.Scanner;

public class Main {
    private static int lineNumber = 1;

    public static void main(String[] args) {
        printNumber(numberToArray(setValueFromUser()));
    }

    /**
     * Метод позволяет пользователю задать число
     * (Для объяснения возвращаемого значения)
     * @return - Возвращает число полученное из консоли
     * (Упомянуть про исключения)
     */
    public static int setValueFromUser() {
        System.out.println("Задай значение для вывода на экран: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }

    /**
     * Метод преобразует полученое значение в массив цифр
     * (Для объяснения сигнатуры и параметров)
     * @param number - Принимает целочисленное значение для преобразования
     * @return - Возвращает массив цифр позученного числа в прясой последовательности
     */
    private static int[] numberToArray(int number) {
        int[] arr = new int[String.valueOf(number).length()];
        for (int i = 1; i <= arr.length; i++) {
            arr[arr.length - i] = number % 10;
            number /= 10;
        }
        return arr;
    }

    /**
     * Метод для вывода на экран всех цифр
     * (Для объяснения рекурсии)
     * @param arr число пользователя в виде массива
     * (Показать stack overflow)
     */
    private static void printNumber(int[] arr) {
        // рассказать про base case
        if (lineNumber <= 7) {
            for (int i : arr) {
                switch (i) {
                    case 0 -> printZero();
                    case 1 -> printOne();
                    case 2 -> printTwo();
                    case 3 -> printThree();
                    case 4 -> printFour();
                    case 5 -> printFive();
                    case 6 -> printSix();
                    case 7 -> printSeven();
                    case 8 -> printEight();
                    case 9 -> printNine();
                }
            }
            lineNumber++;
            System.out.println();
            printNumber(arr);
        }
    }

    /**
     * Дальше только вывод отдельных цифр
     */

    private static void printZero() {
        switch (lineNumber) {
            case 1 -> System.out.print(" **  ");
            case 2 -> System.out.print("*  * ");
            case 3 -> System.out.print("*  * ");
            case 4 -> System.out.print("*  * ");
            case 5 -> System.out.print("*  * ");
            case 6 -> System.out.print("*  * ");
            case 7 -> System.out.print(" **  ");
        }
    }

    private static void printOne() {
        switch (lineNumber) {
            case 1 -> System.out.print("  *  ");
            case 2 -> System.out.print(" **  ");
            case 3 -> System.out.print("  *  ");
            case 4 -> System.out.print("  *  ");
            case 5 -> System.out.print("  *  ");
            case 6 -> System.out.print("  *  ");
            case 7 -> System.out.print(" *** ");
        }
    }

    private static void printTwo() {
        switch (lineNumber) {
            case 1 -> System.out.print(" **  ");
            case 2 -> System.out.print("*  * ");
            case 3 -> System.out.print("*  * ");
            case 4 -> System.out.print("  *  ");
            case 5 -> System.out.print(" *   ");
            case 6 -> System.out.print("*    ");
            case 7 -> System.out.print("**** ");
        }
    }

    private static void printThree() {
        switch (lineNumber) {
            case 1 -> System.out.print(" **  ");
            case 2 -> System.out.print("*  * ");
            case 3 -> System.out.print("   * ");
            case 4 -> System.out.print("  *  ");
            case 5 -> System.out.print("   * ");
            case 6 -> System.out.print("*  * ");
            case 7 -> System.out.print(" **  ");
        }
    }

    private static void printFour() {
        switch (lineNumber) {
            case 1 -> System.out.print("   * ");
            case 2 -> System.out.print("  ** ");
            case 3 -> System.out.print(" * * ");
            case 4 -> System.out.print("*  * ");
            case 5 -> System.out.print("**** ");
            case 6 -> System.out.print("   * ");
            case 7 -> System.out.print("   * ");
        }
    }

    private static void printFive() {
        switch (lineNumber) {
            case 1 -> System.out.print("**** ");
            case 2 -> System.out.print("*    ");
            case 3 -> System.out.print("***  ");
            case 4 -> System.out.print("   * ");
            case 5 -> System.out.print("   * ");
            case 6 -> System.out.print("*  * ");
            case 7 -> System.out.print(" **  ");
        }
    }

    private static void printSix() {
        switch (lineNumber) {
            case 1 -> System.out.print("  ** ");
            case 2 -> System.out.print(" *   ");
            case 3 -> System.out.print("*    ");
            case 4 -> System.out.print("***  ");
            case 5 -> System.out.print("*  * ");
            case 6 -> System.out.print("*  * ");
            case 7 -> System.out.print(" **  ");
        }
    }

    private static void printSeven() {
        switch (lineNumber) {
            case 1 -> System.out.print("**** ");
            case 2 -> System.out.print("   * ");
            case 3 -> System.out.print("  *  ");
            case 4 -> System.out.print(" *   ");
            case 5 -> System.out.print("*    ");
            case 6 -> System.out.print("*    ");
            case 7 -> System.out.print("*    ");
        }
    }

    private static void printEight() {
        switch (lineNumber) {
            case 1 -> System.out.print(" **  ");
            case 2 -> System.out.print("*  * ");
            case 3 -> System.out.print("*  * ");
            case 4 -> System.out.print(" **  ");
            case 5 -> System.out.print("*  * ");
            case 6 -> System.out.print("*  * ");
            case 7 -> System.out.print(" **  ");
        }
    }

    private static void printNine() {
        switch (lineNumber) {
            case 1 -> System.out.print(" **  ");
            case 2 -> System.out.print("*  * ");
            case 3 -> System.out.print("*  * ");
            case 4 -> System.out.print(" *** ");
            case 5 -> System.out.print("   * ");
            case 6 -> System.out.print("   * ");
            case 7 -> System.out.print("***  ");
        }
    }
}
