public class RecursiveMethod {
    public static void main(String[] args) {

        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));

        loop(10);

    }

    static int factorialLoop(int nilai) {
        var hasil = 1;

        for (var counter = 1; counter <= nilai; counter++) {
            hasil *= counter;
        }

        return hasil;
    }

    static int factorialRecursive(int nilai) {
        if (nilai == 1) {
            return 1;
        } else {
            return nilai * factorialRecursive(nilai - 1);
        }
    }

    static void loop(int nilai) {
        if (nilai == 0) {
            System.out.println("Selesai.");
        } else {
            System.out.println("Loop ke = " + nilai);
            loop(nilai - 1);
        }
    }
}
