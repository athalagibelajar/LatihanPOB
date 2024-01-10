package PBO.Enkapsulasi.Latihan.Latihan5;

public class Bola {
    private double jariJari;

    public Bola(){
        this.jariJari = 0.0;
    }

    public void setJariJari(double jariJari){
        if(jariJari > 0){
            this.jariJari = jariJari;
        }else {
            System.out.println("Jari-jari harus lebih dari 0.");
        }
    }

    public double showDiameter(){
        return 2 * jariJari;
    }
    public double showLuasPermukaan(){
        return 4 * Math.PI * Math.pow(jariJari,2);
    }
    public double showVolume(){
        return (4/3) * Math.PI * Math.pow(jariJari,3);
    }

    public static void main(String[] args) {
        // Langkah 1:  Membuat variable Jarijari
        double jariJariVariable = 5.0;

        // Langkah 2: menciptakan objek Bola
        Bola bolaobjek = new Bola();

        //Langkah 3: memanggil method1 method showDiameter(), showLuasPermukaan(), dan showVolume
        System.out.println("Diameter: "+ bolaobjek.showDiameter());
        System.out.println("Luas Permukaan: "+ bolaobjek.showLuasPermukaan());
        System.out.println("Volume: "+ bolaobjek.showVolume());

        // Langkah 4: memanipulasi objek dengan memanggil method setjariJari()
        bolaobjek.setJariJari(jariJariVariable);

        // langkah 5: menampilkan hasil setekah manipulasi
        System.out.println("\nsetelah manipulasi: ");
        System.out.println("Diameter: "+bolaobjek.showDiameter());
        System.out.println("Luas Permukaan: "+ bolaobjek.showLuasPermukaan());
        System.out.println("Volume: "+ bolaobjek.showVolume());
    }

}
