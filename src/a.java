import java.util.Scanner;

public class a {
    public static void main(String[] args)
    {
        Scanner peremennay = new Scanner(System.in);
        int a = peremennay.nextInt();
        int b = peremennay.nextInt();
        int c = peremennay.nextInt();
        int q = (a+b+c)/3;
        int w = 2*(a+c)-3*b;
        System.out.println(q +" - Среднее арифметическое");
        System.out.println(w +" - Разность удвоенной суммы первого и третьего чисел и утроенного второго числа");
    }
}
