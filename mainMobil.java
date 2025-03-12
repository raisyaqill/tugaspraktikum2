import java.util.Scanner;

public class mainMobil {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //input data mobil pertama
    System.out.println("Data mobil pertama :");
    //instan objek bernama m1
    Mobil m1 = new Mobil();

    System.out.println("Merk mobil anda: ");
    m1.setManufaktur(sc.nextLine());

    System.out.println("Plat mobil anda: ");
    m1.setNoPlat(sc.nextLine());

    System.out.println("Warna mobil anda: ");
    m1.setWarna(sc.nextLine());

    System.out.println("Kecepatan mobil anda (dalam km/h): ");
    m1.setKecepatan(sc.nextInt());

    System.out.println("Waktu perjalanan mobil anda (jam): ");
    m1.setWaktu(sc.nextDouble());
    sc.nextLine();

    m1.displayMessage();

    System.out.println("================");

    //input data mobil kedua
    System.out.println("Data mobil 2 : ");
      //instan objek baru bernama m2
      Mobil m2 = new Mobil();
       
    System.out.println("Merk mobil anda: ");
    m2.setManufaktur(sc.nextLine());

    System.out.println("Plat mobil anda: ");
    m2.setNoPlat(sc.nextLine());

    System.out.println("Warna mobil anda: ");
    m2.setWarna(sc.nextLine());

    System.out.println("Kecepatan mobil anda (dalam km/h): ");
    m2.setKecepatan(sc.nextInt());

    System.out.println("Waktu perjalanan mobil anda (jam): ");
    m2.setWaktu(sc.nextDouble());
    sc.nextLine();

    m2.displayMessage();

    //merubah warna dari objek m1
    System.out.println("Masukkan warna baru untuk mobil 1 : ");
    String warnaBaru = sc.nextLine();
    m1.setWarna(warnaBaru);
  
    //menampilkan hasil perubahan
    System.out.println("Berikut merupakan data mobil 1 setelah perubahan : ");
    m1.displayMessage();
    }
  }
