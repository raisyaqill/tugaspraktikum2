public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;
    private double jarak;
    private double waktuDetik;
    private double kecepatanMs;

    public void setNoPlat(String s){
        noPlat = s;
    }

    public void setWarna(String s){
        warna = s;
    }

    public void setManufaktur(String s){
        manufaktur = s;
    }

    public void setWaktu(double jam){
        waktu = jam;
        rubahDetik(jam);
        hitungJarak();
    }

    public void rubahDetik(double jam){
        waktuDetik = jam * 3600;
    }

    public void setKecepatan(int kmh){
        kecepatan = kmh;
        rubahKecepatan();
        hitungJarak();
    }

    public void rubahKecepatan(){
        kecepatanMs = (int) (kecepatan * 1000.0/3600.0);
    }

    public void hitungJarak(){
        jarak = kecepatanMs * waktuDetik;
    }

    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek" + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan" + kecepatan);
        System.out.println("waktu tempuh mobil anda (dalam jam) adalah " + waktu);
        System.out.println("waktu tempuh mobil anda (dalam detik) adalah " + waktuDetik);
        System.out.println("jarak yang dapat ditempuh " + (jarak/1000) + " km");

    }
 }