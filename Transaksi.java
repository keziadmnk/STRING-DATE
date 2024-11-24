// Kelas Transaksi untuk menangani pembelian (inheritance dari Barang)
public class Transaksi extends Barang {
    private int jumlahBeli; // Jumlah barang yang dibeli
    private double total;   // Total harga transaksi

    // Konstruktor untuk inisialisasi transaksi
    public Transaksi(String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang); // Memanggil konstruktor superclass
        this.jumlahBeli = jumlahBeli;
        calculateTotal(); // Hitung total harga
    }

    // Metode untuk menghitung total harga
    private void calculateTotal() {
        total = hargaBarang * jumlahBeli;
    }

    // Getter untuk mendapatkan total harga
    public double getTotal() {
        return total;
    }

    // Menampilkan informasi transaksi
    public void displayTransaksi() {
        displayBarang(); // Menampilkan informasi barang
        System.out.println("Jumlah Beli: " + jumlahBeli + "pcs");
        System.out.println("Total Harga: Rp " + total);
    }
}
