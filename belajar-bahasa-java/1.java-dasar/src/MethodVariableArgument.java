public class MethodVariableArgument {
    public static void main(String[] args) {

        mengucapkanSelamat("Alfin Budiyanto", 90, 80, 100, 90, 90);

    }

    static void mengucapkanSelamat(String nama, int... semuaIsi) {
        var total = 0;

        for (var isi : semuaIsi) {
            total += isi;
        }

        var finalIsi = total / semuaIsi.length;

        if (finalIsi >= 75) {
            System.out.println("Selamat " + nama + ", Kamu Berhasil.👍");
        } else {
            System.out.println("Maaf " + nama + ", Kamu Gagal.😀");
        }
    }
}
