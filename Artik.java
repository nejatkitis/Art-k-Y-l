import java.util.Scanner;

public class Artik {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Yıl Giriniz : ");
        year = input.nextInt();
        if((year%100==0)&&(year%400==0)) {
            System.out.println(year+" Bir artık yıldır");
        } else if ((year%4==0)&&(year%100!=0)) {
            System.out.println(year+" Bir artık yıldır");
        } else {
            System.out.println(year + " Bir artık yıl değildir");
        }
    }
}
