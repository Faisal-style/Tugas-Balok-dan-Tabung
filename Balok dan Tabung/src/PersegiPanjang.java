public class PersegiPanjang extends Perhitungan {
    int panjang, lebar;

    PersegiPanjang(int paramPanjang, int paramLebar) {
        panjang = paramPanjang;
        lebar = paramLebar;
    }

    public void outputPersegiPanjang() {
        System.out.print("Luas Persegi Panjang : ");
        System.out.println(luasPersegiPanjang(panjang, lebar));
        System.out.print("Keliling Persegi Panjang : ");
        System.out.println(kelilingPersegiPanjang(panjang, lebar));
    }
}
