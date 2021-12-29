package Lesson_1;

public class Lesson_1  {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
//2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    //          Orange
    //          Banan
//            Apple

    public static void printThreeWords() {
        System.out.println("Задание 1*");
        System.out.println("1.Orange.");
        System.out.println("2.Banan.");
        System.out.println("3.Apple.");
        System.out.println("  ");
    }
//3.  Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями,
    //  которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
    //   то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;

    public static void checkSumSign() {
        System.out.println("Задание 2*");
        int a = -1;
        int b = 0;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная.");
        } else {
            System.out.println("Сумма отрицательная.");
        }
        System.out.println("  ");
        //  4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
        //  Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
        // если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100
        //  (100 исключительно) - “Зеленый”;
    }

    public static void printColor() {
        System.out.println("Задание 3*");
        int value = 88;
        if (value <= 0) {
            System.out.println("Красный.");
        }
        else if (value >= 1 && value <= 100) {
            System.out.println("Желтый.");
        }
        else if (value >= 101) {
            System.out.println("Зеленый.");
        }
        System.out.println("  ");
        // 5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их
        // любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
        //  в противном случае “a < b”;
    }
    public static void compareNumbers() {
        System.out.println("Задание 4*");
        int a = 2;
        int b = 15;
        if (a >= b)
            System.out.println("a >= b");

        else {
            System.out.println("a < b");

        }
    }
}

