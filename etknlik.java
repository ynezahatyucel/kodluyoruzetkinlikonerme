package Giris;
import java.util.Scanner;

public class etknlik {
    public static void main(String[] args) {
        
        int hsicaklik ;
        
        Scanner giris =new Scanner(System.in);
        System.out.println("Hava sıcaklığını Giriniz :");
        hsicaklik=giris.nextInt();
        
        if(hsicaklik<5){
            System.out.println("Bugün Kayak Yapabilirsiniz.");
        } else if (hsicaklik>5&&hsicaklik<10) {
            System.out.println("Bugün Sinemaya Gidebilirsiniz.");
            
        } else if (hsicaklik>10&&hsicaklik<15) {
            System.out.println("Bugün Sinemaya Veya Pikniğe Gidebilirsiniz ");

        } else if (hsicaklik>15&&hsicaklik<25) {
            System.out.println("Bugün Pikniğe Gidebilirsiniz.");

        }else {
            System.out.println("Bugün Yüzmeye Gidebilirsiniz.");
        }

    }
}
