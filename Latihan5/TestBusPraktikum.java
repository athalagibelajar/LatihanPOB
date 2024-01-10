package PBO.Enkapsulasi.Latihan.Latihan5;

public class TestBusPraktikum {
    public static void main(String[] args) {
        //TODO code application logic here
        BusPraktikum BusMini =new BusPraktikum(10);
        BusMini.addPenumpang(5);
        BusMini.addPenumpang(6);
        BusMini.addPenumpang(10);
        BusMini.addPenumpang(15);
        BusMini.cetak();

        BusMini.getAverage();
        BusMini.cetak();
    }
}
