import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,r,nfac=1,rfac=1,nsubtractr=1;
        double combination;
        System.out.print("Kombinasyonu alınacak sayı(n): ");
        n=scan.nextInt();
        System.out.print("İstenen kombinasyon sayısı(r): ");
        r=scan.nextInt();
        for(int i=1;i<=n;i++){
            nfac*=i;
        }
        for(int j=1;j<=n;j++){
            rfac*=j;
        }
        for(int k=1;k<=n;k++){
            nsubtractr*=k;
        }
        combination=nfac/(nsubtractr*rfac);
        System.out.println(n+"'in"+r+"'li kombinasyonu :"+combination);


    }
}