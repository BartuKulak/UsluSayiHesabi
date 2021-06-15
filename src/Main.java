import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sonuc=1;
        System.out.print("Üssü Alınacak Sayıyı Giriniz: ");
        int n = input.nextInt();
        System.out.print("Üs Değerini Giriniz: ");
        int k = input.nextInt();
        for(int i=1;i<=k;i++){
            sonuc=sonuc*n;
        }
        System.out.print("Sonuç: "+sonuc);
    }
}
