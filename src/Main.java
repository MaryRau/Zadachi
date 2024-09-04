import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целове число:");
        int num = scan.nextInt();
        if (num % 2 == 0) System.out.println("Число чётное");
        else System.out.println("Число нечётное");
        System.out.println();

        // Задача 2
        System.out.println("Введите первое целове число:");
        int num1 = scan.nextInt();
        System.out.println("Введите второе целове число:");
        int num2 = scan.nextInt();
        System.out.println("Введите третье целове число:");
        int num3 = scan.nextInt();
        int[] arrMinNum = {num1, num2, num3};
        // решила использовать массив для удобства и меньшего количества строк, чем с множеством условий
        System.out.println("Минимальное число: " + (int) Arrays.stream(arrMinNum).min().orElse(0));
        System.out.println();

        // Задача 3
        int n = 5;
        System.out.println("Таблица умножения на " + n + ":");
        for (int i = 1; i <= 10; i++) {
            int res = n * i;
            System.out.println(n + " * " + i + " = " + res);
        }
        System.out.println();

        // Задача 4
        System.out.println("Введите целое число:");
        n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сумма: " + sum);
        System.out.println();

        // Задача 5
        System.out.println("Введите целое число:");
        n = scan.nextInt();
        System.out.println("Первые " + n + " чисел Фибоначчи:");
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }
        System.out.println();

        // Задача 6
        System.out.println("Введите целое число:");
        n = scan.nextInt();
        if (isNumPrime(n)) System.out.println("Введённое число является простым");
        else System.out.println("Введённое число не является простым");
        System.out.println();

        // Задача 7
        System.out.println("Введите целое число:");
        n = scan.nextInt();
        System.out.println("Числа от " + n + " до 1:");
        for (int i = n; i >= 1; i--)
        {
            System.out.println(i);
        }
        System.out.println();

        // Задача 8
        System.out.println("Введите два целых числа:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        sum = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++)
        {
            if (i % 2 == 0) sum += i;
        }
        System.out.println("Сумма чётных чисел в диапозоне равна " + sum);
        System.out.println();

        // Задача 9
        System.out.println("Введите строку:");
        String s = scan.nextLine();
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--)
        {
            reversed.append(s.charAt(i));
        }
        System.out.println("Строка в обратном порядке: " + reversed);
        System.out.println();

        // Задача 10
        System.out.println("Введите целое число:");
        n = scan.nextInt();
        System.out.printf("В числе %d цифр", String.valueOf(n).length());
        System.out.println();

        // Задача 11
        System.out.println("Введите целое число:");
        n = scan.nextInt();
        System.out.printf("Факториал числа равен %d", factorial(n));
        System.out.println();

        // Задача 12
        System.out.println("Введите целое число:");
        n = scan.nextInt();
        sum = 0;
        while (n / 10 > 9) {
            sum += n % 10;
            n /= 10;
        }
        System.out.printf("Сумма цифр числа равна %d", sum);
        System.out.println();

        // Задача 13
        System.out.println("Введите строку:");
        s = scan.nextLine();
        reversed = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--)
        {
            reversed.append(s.charAt(i));
        }
        if (s.contentEquals(reversed))
            System.out.println("Строка является полиндромом");
        else System.out.println("Строка не является полиндромом");
        System.out.println();

        // Задача 14
        System.out.println("Введите размер массива:");
        n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        System.out.printf("Максимальное число в массиве: " + Arrays.stream(arr).max());
        System.out.println();

        // Задача 15
        System.out.println("Введите размер массива:");
        n = scan.nextInt();
        arr = new int[n];
        sum = 0;
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        System.out.printf("Сумма элементов массива: " + sum);
        System.out.println();

        // Задача 16
        System.out.println("Введите размер массива:");
        n = scan.nextInt();
        arr = new int[n];
        int sumPos = 0, sumNeg = 0;
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] > 0) sumPos++;
            else if (arr[i] < 0) sumNeg++;
        }
        System.out.printf("Положительных элементов массива: %d\nОтрицательных элементов массива: %d", sumPos, sumNeg);
        System.out.println();

        // Задача 17
        System.out.println("Введите два целых числа:");
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println("Простые числа в диапозоне");
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++)
        {
            if (isNumPrime(i)) System.out.println(i);
        }
        System.out.println();

        // Задача 18
        System.out.println("Введите строку:");
        s = scan.nextLine();
        int vowCount = 0, consCount = 0;
        String vowels = "уеыаоэяиюёУЕЫАОЭЯИЮЁ";
        String consonants = "йцкнгшщзхфвпрлджчсмтьбъЙЦКНГШЩЗХЪФВПРЛДЖЧМСТЬБ";
        for (int i = 0; i < s.length(); i++)
        {
            if (vowels.contains(String.valueOf(s.charAt(i)))) vowCount++;
            else if (consonants.contains(String.valueOf(s.charAt(i)))) consCount++;
        }
        System.out.printf("Количество гласных: {0}\nКоличество согласных: {1}", vowCount, consCount);
        System.out.println();

        // Задача 19
        System.out.println("Введите строку:");
        s = scan.nextLine();
        String newS = "";
        String[] strArr = s.split(" ");
        for (int i = strArr.length - 1; i >= 0; i--)
        {
            newS.concat(strArr[i] + " ");
        }
        System.out.println("Строка в обратном порядке: " + newS);
        System.out.println();

        // Задача 20
        System.out.println("Введите целое число:");
        n = scan.nextInt();
        sum = 0;
        while (n / 10 > 9) {
            sum += n % 10;
            n /= 10;
        }
        if (Math.pow(sum, String.valueOf(n).length()) == n)
            System.out.println("Число является числом Армстронга");
        else System.out.println("Число не является числом Армстронга");
    }

    private static int fibonacci(int n)
    {
        if (n <= 1) return n;
        else return fibonacci(n-1)+fibonacci(n-2);
    }

    private static boolean isNumPrime(int n)
    {
        if (n <= 1) return true;

        else
        {
            for (int i = 2; i <= Math.sqrt(n); i++)
            {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}