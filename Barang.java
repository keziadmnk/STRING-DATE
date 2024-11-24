// Kelas Barang untuk informasi barang
public class Barang {
    protected String kodeBarang; // Kode unik untuk barang
    protected String namaBarang; // Nama barang
    protected double hargaBarang; // Harga barang

    // Konstruktor untuk objek Barang
    public Barang(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    // Menampilkan informasi barang
    public void displayBarang() {
        System.out.println("Kode Barang: " + kodeBarang.toUpperCase()); // Uppercase untuk kode barang
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBarang);
    }
}
