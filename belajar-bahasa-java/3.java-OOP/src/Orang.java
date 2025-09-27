class Orang {
    String nama;
    String alamat;
    final String negara = "Indonesia";

    Orang(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    Orang(String paramNama) {
        this(paramNama, null);
    }

    Orang() {
        this(null);
    }

    void katakanHalo(String nama) {
        System.out.println("Halo " + nama + ", Nama saya adalah " + this.nama);
    }
}
