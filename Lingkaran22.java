/**
 * Lingkaran22
 */

import java.util.Scanner;

public class Lingkaran22 {

    public static void main (String [] args)
    {

        Scanner input = new Scanner(System.in);

        int r;
        double luas, keliling, phi = 3.14;

        System.out.println("Masukkan jari-jari lingkaran: ");
        r = input.nextInt();

        luas = phi * r * r;
        keliling = 2 * phi * r;

        System.out.println(luas);
        System.out.println(keliling);

        input.close();

    }
}