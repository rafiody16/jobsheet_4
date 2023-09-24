import java.util.Scanner;

public class HargaBayar22 {

    public static void main (String [] args)
    {
        
        Scanner input = new Scanner(System.in);

        String merk_buku;
        int harga, jumlah, jmlHalBuku;
        double dis, total, bayar, jmlDis;

        System.out.println("Masukan Merk Buku: ");
        merk_buku = input.nextLine();
        System.out.println("Masukkan Jumlah Halaman Buku: ");
        jmlHalBuku = input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli: ");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli: ");
        jumlah = input.nextInt();
        System.out.println("Masukkan Diskon: ");
        dis = input.nextDouble();

        total = harga * jumlah;
        jmlDis = total * dis;
        bayar = total - jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah: " + jmlDis);
        System.out.println("Jumlah yang harus dibayarkan adalah: " + bayar);

        input.close();

    }
    
}
