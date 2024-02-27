import java.util.Scanner;

public class Main {
    static void f(int n) {

        if (n <= 0) {

            System.out.print(n + " ");
            return;
        }
        //Sayıyı ekrana eksikterek yazdırıyor
        System.out.print(n + " ");
        f(n - 5);
        //Tekrar kısmı
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        //Kullanıcıdan veri istenilen nokta
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Lütfen Bir Sayı Giriniz :  ");
        int number = scanner.nextInt();
        f(number);
        
    }
}