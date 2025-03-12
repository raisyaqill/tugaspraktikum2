public class Student {
    private String name;
    private String address;
    private int age;
    private double[] mathGrade;
    private double[] englishGrade;
    private double[] scienceGrade;
    // private double result;
    private static int count = 0;

    public void student(){
        name = "";
        address = "";
        age = 0;
    }

    public Student(String n, String a, int ag){
        name = n;
        address = a;
        age = ag;
        count++;
    }
    
    public void setName(String n){
        name = n;
    }

    public void setAddress(String a){
        address = a;
    }

    public void setAge(int ag){
        age = ag;
    }

    public void setMath(double[] nilaiMtk){
        mathGrade = nilaiMtk;
    }

    public void setEnglish(double[] nilaiEng){
        englishGrade = nilaiEng;
    }

    public void setScience(double[] nilaiSci){
        scienceGrade = nilaiSci;
    }

    public double getAverage(){
        double result = 0;

        for (double nilai : mathGrade){
            result += nilai;
        }
        for (double nilai : englishGrade){
            result += nilai;
        }
        for (double nilai : scienceGrade){
            result += nilai;
        }

        int sum = mathGrade.length + scienceGrade.length + englishGrade.length;
        return result / sum;
    }

    public boolean statusAkhir(){
        return getAverage() >= 61;
    }

    public void displayMessage(){
    System.out.println("Siswa bernama " + name);
    System.out.println("berasal dari " + address);
    System.out.println("berumur " + age);
    System.out.println("mempunyai nilai rata rata " + getAverage());
    System.out.println("status nilai : " + (statusAkhir() ? "lolos" : "remidi")) ;
    }

    // Menampilkan jumlah objek yang dibuat
    public static void jumlahSiswa() {
        System.out.println("Jumlah siswa yang terdaftar: " + count);
    }
}
