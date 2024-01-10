package PBO.Enkapsulasi.Latihan.Latihan2;

public class UjiBus2 {
    public static void main(String[] args) {
        // TODO code application logic here
        bus2 busMini= new bus2(10);
        busMini.cetak();
        
        busMini.pluspenumpang(3);
        busMini.cetak();
        
        busMini.pluspenumpang(1);
        busMini.cetak();
        
        busMini.pluspenumpang(1);
        busMini.cetak();
    }
}
