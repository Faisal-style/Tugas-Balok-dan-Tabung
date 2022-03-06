public class Perhitungan implements menghitungBidang, menghitungRuang {
    @Override
    public double luasLingkaran(int jari) {
        return jari * jari * 3.14;
    }

    public double kelilingLingkaran(int jari) {
        return 2 * jari * 3.14;
    }

    public double luasPersegiPanjang(int panjang, int lebar) {
        // TODO Auto-generated method stub
        return panjang * lebar;
    }

    public double kelilingPersegiPanjang(int panjang, int lebar) {
        // TODO Auto-generated method stub
        return 2 * (panjang + lebar);
    }

    public double luasPermukaanTabung(int jari, int tinggi) {
        // TODO Auto-generated method stub
        return 2 * 3.14 * jari * tinggi + 2 * 3.14 * jari * jari;
    }

    public double luasPermukaanBalok(int panjang, int lebar, int tinggi) {
        // TODO Auto-generated method stub
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    public double volumeBalok(int panjang, int lebar, int tinggi) {
        // TODO Auto-generated method stub
        return panjang * lebar * tinggi;
    }

    public double volumeTabung(int jari, int tinggi) {
        // TODO Auto-generated method stub
        return 3.14 * jari * jari * tinggi;
    }

}
