import java.util.Scanner;

public class Gaji22 {

    public static void main(String [] args)
    {

        Scanner input = new Scanner(System.in);

        int jmlMasuk, JmlTdkMasuk, TotGaji, gaji, potGaji;

        System.out.println("Masukan Gaji: ");
        gaji = input.nextInt();
        System.out.println("Masukan Potongan Gaji: ");
        potGaji = input.nextInt();
        System.out.println("Masukkan jumlah hari masuk anda: ");
        jmlMasuk = input.nextInt();        
        System.out.println("Masukkan jumlah hari tidak masuk anda: ");
        JmlTdkMasuk = input.nextInt();
        
        TotGaji = (jmlMasuk * gaji) - (JmlTdkMasuk * potGaji);

        System.out.println("Jumlah Total Gaji Anda: " + TotGaji);

        input.close();

    }
    
}
