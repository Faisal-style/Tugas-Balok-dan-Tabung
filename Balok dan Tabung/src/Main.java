import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int pilihan;
        try (Scanner input = new Scanner(System.in)) {
            // angka1 sebagai jari-jari dan panjang
            // angka2 sebagai lebar
            // angka3 sebagai tinggi
            int angka1, angka2, angka3;

            do {
                System.out.println("===========");
                System.out.println("Menu Utama");
                System.out.println("===========");
                System.out.println();
                System.out.println("1. Hitung Balok");
                System.out.println("2. Hitung Tabung");
                System.out.println("3. Exit");
                System.out.print("Pilih : ");
                pilihan = input.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.print("Input Panjang : ");
                        angka1 = input.nextInt();
                        System.out.print("Input Lebar : ");
                        angka2 = input.nextInt();
                        System.out.print("Input Tinggi : ");
                        angka3 = input.nextInt();
                        PersegiPanjang persegipanjang = new PersegiPanjang(angka1, angka2);
                        persegipanjang.outputPersegiPanjang();
                        Balok balok = new Balok(angka1, angka2, angka3);
                        balok.outputBalok();
                        break;
                    case 2:
                        System.out.print("Input Tinggi : ");
                        angka3 = input.nextInt();
                        System.out.print("Input jari-jari : ");
                        angka1 = input.nextInt();
                        Lingkaran lingkaran = new Lingkaran(angka1);
                        lingkaran.OutputLingkaran();
                        Tabung tabung = new Tabung(angka1, angka3);
                        tabung.OutputTabung();
                        break;
                    case 3:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Nomor yang Anda Masukkan Salah");
                        System.out.println();
                        break;
                }
                System.out.print("Ulangi? (ya = 1 || tidak = 0)");
                pilihan = input.nextInt();
            } while (pilihan == 1);
        }
    }
}
