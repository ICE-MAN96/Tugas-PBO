import java.util.Locale;

class Produk {
    // Constant
    public static final double PAJAK = 0.11;

    // Property
    private String kode;
    private String nama;
    private double harga;
    private int stok;

    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public double getHarga() { return harga; }
    public int getStok() { return stok; }

    public double hitungTotalHarga() {
        return harga + (harga * PAJAK);
    }

    public static String formatRupiah(double angka) {
        return "Rp" + String.format(Locale.GERMANY, "%,.0f", angka);
    }
}

public class Main {
    public static void main(String[] args) {
        Produk produk = new Produk("P001", "Laptop", 10000000, 5);

        System.out.println("Produk: " + produk.getNama());
        System.out.println("Harga: " + Produk.formatRupiah(produk.getHarga()));
        System.out.println("Stok: " + produk.getStok());
        System.out.println("Pajak: " + (int) (Produk.PAJAK * 100) + "%");
        System.out.println("Total harga setelah pajak: " + Produk.formatRupiah(produk.hitungTotalHarga()));
    }
}