import java.util.Random;
import java.util.Scanner;

public class a1 {
    public static void main(String[] args)
    {
        int i = 0;
        int r = 0;
        Scanner q = new Scanner(System.in);
        System.out.println("Введите диапозон числа");
        int n = q.nextInt();
        Random e = new Random();
        int w = e.nextInt(n-1);
        w++;
        System.out.println("Введите число попыток");
        for (int k = q.nextInt();k>0;k--)
        {
            r = q.nextInt();
            if (r == w)
            {
                i = 1;
                System.out.println("Вы угадали");
                break;
            }
            else
            {
                if (r<w)
                {
                    System.out.println("Больше");
                }
                else
                {
                    System.out.println("Меньше");
                }
            }
        }
        if(i == 1)
        {

        }
        else
        {
            System.out.println("Попытки закончились");
        }
    }
}
