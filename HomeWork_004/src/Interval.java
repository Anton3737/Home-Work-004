import java.util.Scanner;

public class Interval { //27.05.2022
    public static void main(String[] args) {
        int a1 = 0;
        int a2 = 15;
        int a3 = 36;
        int a4 = 51;
        int b1 = 14;
        int b2 = 35;
        int b3 = 50;
        int b4 = 100;
        Scanner diapazon = new Scanner(System.in);
        System.out.println("Введіть число для вибору діапазону:");
        int invVer = diapazon.nextInt();
        if (a1 <= invVer && invVer <= b1)
        {
            System.out.println("Вказане Вами значення " + invVer + " входить в діапазон [0 - 14]");
        }
        if (a2 <= invVer && invVer <= b2)
        {
            System.out.println("Вказане Вами значення " + invVer + " входить в діапазон [15 - 35]");
        }
        if (a3 <= invVer && invVer <= b3)
        {
            System.out.println("Вказане Вами значення " + invVer + " входить в діапазон [36 - 50]");
        }
        if (a4 <= invVer && invVer <= b4)
        {
            System.out.println("Вказане Вами значення " + invVer + " входить в діапазон [51 - 100]");
        }
        else  if (invVer > b4)
        {
            System.out.println("Вказане Вами значення " + invVer + " НЕ входить в діапазон [0 - 100]");
        }
    }
}

//[0 - 14] [15 - 35] [36 - 50][50 - 100]
//System.out.println("Вказане Вами значення " + A + " входить в діапазон [0 - 14]");
//System.out.println("Вказане Вами значення " + A + " входить в діапазон [15 - 35]");
//System.out.println("Вказане Вами значення " + A + " входить в діапазон [36 - 50]");
//System.out.println("Вказане Вами значення " + A + " входить в діапазон [50 - 100]");
// a1 => A && A <= b1
// a2 => A && A <= b2
// a3 => A && A <= b3
// a4 => A && A <= b4