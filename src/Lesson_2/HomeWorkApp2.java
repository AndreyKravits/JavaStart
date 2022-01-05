package Lesson_2;

public class HomeWorkApp2 {

    public static void main(String[] args) {
        System.out.println(limit(10, 10));
        PosNeg(7);
        System.out.println(Otricat(-2));
        StringNumber("яблоко", 6);
        System.out.println(CheckLeapYear());
    }
    //1.Задание ..
    // Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.

    static boolean limit(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    //2.Задание
    // Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.

    static void PosNeg(int a) {
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
        //3.Задание.
        // Написать метод, которому в качестве параметра передается целое число.
        //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    }

    static boolean Otricat(int a) {
        return a < 0;
    }
    //4. Написать метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз;

    static void StringNumber(String apple, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(i + " " + apple);
        }

        {
            // 5.Задание
            //   Написать метод, который определяет, является ли год високосным,
            //  и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
            //  кроме каждого 100-го, при этом каждый 400-й – високосный.
        }
    }


    static boolean CheckLeapYear() {
        int a = 32;
        if (a % 4 == 0) {
            if ((a % 100 != 0) || (a % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
