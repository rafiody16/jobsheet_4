import java.util.Scanner;

public class Tugas22 {

    public static void main (String [] args)
    {

        Scanner input = new Scanner(System.in);
        
        int pokok_Gaji, potongan_Gaji, potonganTetap_Gaji, jmlMasuk, jmlTdkMasuk, total_Gaji, uangTunjangan;

        System.out.println("Masukkan Gaji Pokok: ");
        pokok_Gaji = input.nextInt();
        System.out.println("Masukkan Potongan Gaji: ");
        potongan_Gaji = input.nextInt();
        System.out.println("Masukkan Potongan Gaji Tetap: ");
        potonganTetap_Gaji = input.nextInt();
        System.out.println("Masukkan Jumlah Masuk: ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah Tidak Masuk: ");
        jmlTdkMasuk = input.nextInt();
        System.out.println("Masukkan uangTunjangan: ");
        uangTunjangan = input.nextInt();

        total_Gaji = (jmlMasuk * pokok_Gaji) + uangTunjangan - (jmlTdkMasuk * potongan_Gaji) - potonganTetap_Gaji;

        System.out.println("Total Gaji: " + total_Gaji);

    }
    
}
