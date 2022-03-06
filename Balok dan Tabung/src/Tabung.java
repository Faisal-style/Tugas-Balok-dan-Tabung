public class Tabung extends Perhitungan {

    int jari;
    int tinggi;

    Tabung(int paramjari, int paramtinggi) {
        jari = paramjari;
        tinggi = paramtinggi;
    }

    public void OutputTabung() {
        System.out.print("Volume Tabung : ");
        System.out.println(volumeTabung(jari, tinggi));
        System.out.print("Luas Permukaan Tabung : ");
        System.out.println(luasPermukaanTabung(jari, tinggi));
    }
}
