import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(maxNum(5, 4));
        zeroInArr(new int[]{1,2,3});
        System.out.println(partOfStr("12345", 6));
    }

    // задача 1
    private static int maxNum(int a, int b) throws Exception
    {
        if (a > b)
            return a;
        else if (b > a)
            return b;
        throw new Exception("Ошибка. Числа равны.");
    }

    // задача 2
    private static float division(int a, int b) throws ArithmeticException
    {
        if (b != 0)
            return a/b;
        throw new ArithmeticException("Делитель равен 0");
    }

    // задача 3
    private static int strToNum(String s)
    {
        return Integer.parseInt(s);
    }

    // задача 4
    private static void age(int a) throws IllegalArgumentException
    {
        if (a < 0 || a > 150)
            throw new IllegalArgumentException("Введённый возраст выходит за возможные границы!");
    }

    // задача 5
    private static float sqrt(float a) throws IllegalArgumentException
    {
        if (a < 0)
            throw new IllegalArgumentException("Введено отрицательное число");
        return (float)Math.sqrt(a);
    }

    // задача 6
    private static int factorial (int a) throws Exception
    {
        if (a < 0)
            throw new Exception("Введено отрицательное число");
        else if (a == 0 || a == 1)
            return 1;
        return a * factorial(a - 1);
    }

    // задача 7
    private static void zeroInArr (int[] arr) throws Exception
    {
        if (Arrays.stream(arr).sorted().toArray()[0] == 0)
            throw new Exception("Массив сдержит нули");
        System.out.println("В массиве нет нулей");
    }

    //задача 8
    private static int paw(int a, int b) throws Exception
    {
        if (b < 0)
            throw new Exception("Введена отрицательная степень");
        return (int)Math.pow(a, b);
    }

    //задача 9
    private static String partOfStr (String s, int a) throws Exception
    {
        if (a > s.length())
            throw new Exception("В строке нет введённого количества символов");
        return s.substring(0, a);
    }

    //задача 10
    private static int elemInArr (int[] arr, int a) throws Exception {
        for (int i = 0; i <= arr.length; i++)
        {
            if (arr[i] == a) return i;
        }
        
        throw new Exception("Массив не содержит введённого элемента");
    }

    //задача 11
    public static int findElement(int[] arr, int element) throws Exception {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        throw new Exception("Элемент не найден в массиве");
    }

    // задача 12
    public static boolean isDivisible(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Нельзя делить на ноль");
        }
        return a % b == 0;
    }

    // задача 13
    public static <T> T getElementByIndex(List<T> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс " + index + " выходит за пределы списка");
        }
        return list.get(index);
    }

    // задача 14
    public static void validatePassword(String password) throws WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("Пароль должен содержать не менее 8 символов");
        }
    }

    public static class WeakPasswordException extends Exception {
        public WeakPasswordException(String message) {
            super(message);
        }
    }

    // задача 16
    public static String concStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Одна или две строки равны null");
        }
        return str1 + str2;
    }

    // задача 17
    public static int remainderOfDiv(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Нельзя делить на ноль");
        }
        return a % b;
    }

    // задача 18
    public static double sqrt(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Нельзя найти корень отрицательного числа");
        }
        return Math.sqrt(a);
    }

    // задача 19
    public static double celsToFaren(double a) {
        if (a < -273.15) {
            throw new IllegalArgumentException("Температура не может быть меньше абсолютного нуля");
        }
        return (a * 9.0 / 5.0) + 32.0;
    }

    //задача 20
    public static String validString(String s) {
        if (s == null || s.trim().isEmpty()) {
            throw new IllegalArgumentException("Строка не может быть пустой или равной null");
        }
        return s;
    }
}

