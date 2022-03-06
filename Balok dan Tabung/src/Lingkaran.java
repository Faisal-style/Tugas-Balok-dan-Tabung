class Lingkaran extends Perhitungan {
    int jari;

    Lingkaran(int consjari) {
        jari = consjari;
    }

    public void OutputLingkaran() {
        System.out.print("Luas Lingkaran : ");
        System.out.println(luasLingkaran(jari));
        System.out.print("Keliling Lingkaran : ");
        System.out.println(kelilingLingkaran(jari));
    }

}
