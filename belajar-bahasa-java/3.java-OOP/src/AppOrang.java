public class AppOrang {
    public static void main(String[] args) {
        var orangke1 = new Orang("Alfin", "Magelang");
//        orangke1.nama = "Alfin";
//        orangke1.alamat = "Magelang";
//        person1.country = "Singapura"; //ERROR karna sudah final!!!

        System.out.println(orangke1.nama);
        System.out.println(orangke1.alamat);
        System.out.println(orangke1.negara);

        orangke1.katakanHalo("Alwi");

        Orang orangke2 = new Orang("Semut");

        Orang orangke3;
        orangke3 = new Orang();
        orangke3.nama = "Bearnad";
        orangke3.katakanHalo("Alwi");
    }
}
