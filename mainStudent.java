import java.util.Scanner;

public class mainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah siswa : ");
        int jumlahSiswa = sc.nextInt();
        sc.nextLine();

        Student[] siswa = new Student[jumlahSiswa];

        for (int i=0; i < jumlahSiswa; i++){
            System.out.println("Masukkan data siswa ke-" + (i+1));

            System.out.print("Nama siswa : ");
            String n = sc.nextLine(); 
            
            System.out.print("Asal kota : ");
            String a = sc.nextLine();
            System.out.print("Umur : ");
            int ag = sc.nextInt();

            double[] nilaiMtk = new double[1];
            double[] nilaiSci = new double[1];
            double[] nilaiEng = new double[1];

            System.out.println("Masukkan nilai Matematika :");
            for (int j = 0; j < nilaiMtk.length; j++) {
                nilaiMtk[j] = sc.nextDouble();
            }

            System.out.println("Masukkan nilai IPA :");
            for (int j = 0; j < nilaiSci.length; j++) {
                nilaiSci[j] = sc.nextDouble();
            }

            System.out.println("Masukkan nilai Bahasa Inggris :");
            for (int j = 0; j < nilaiEng.length; j++) {
                nilaiEng[j] = sc.nextDouble();
            }

            siswa[i] = new Student(n, a, ag);
            siswa[i].setMath(nilaiMtk);
            siswa[i].setEnglish(nilaiEng);
            siswa[i].setScience(nilaiSci);

        }
        
        System.out.println("\n === Data Siswa ===");
        for(Student datasiswa : siswa){
            datasiswa.displayMessage();
        }
        Student.jumlahSiswa();

        //menggunakan constructor lain
        System.out.println("===================");

        sc.close();
    }
}
