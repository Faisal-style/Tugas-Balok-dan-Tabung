public class Balok extends Perhitungan {
    int panjang, lebar, tinggi;

    Balok(int paramPanjang, int paramLebar, int paramTinggi) {
        panjang = paramPanjang;
        lebar = paramLebar;
        tinggi = paramTinggi;
    }

    public void outputBalok() {
        System.out.print("Volume Balok : ");
        System.out.println(volumeBalok(panjang, lebar, tinggi));
        System.out.print("Luas Permukaan Balok : ");
        System.out.println(luasPermukaanBalok(panjang, lebar, tinggi));
    }
}
