import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.println("Kuiguzuu uchun birdi basynyz:");
            int a = new Scanner(System.in).nextInt();
            if (a==1){
                kanal();
            }else {
                System.out.println("ochuruldu");
            }
        }

    }
    static void kanal(){
        System.out.println("birinchi kanal");
        System.out.println("kanaldar bolumuno otuu uchun 1 basynyz:");
        int b = new Scanner(System.in).nextInt();
        if (b==1){
            chanals();
        }
    }
    static void chanals(){

    }
}