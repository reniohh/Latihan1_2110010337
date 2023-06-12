
package hitung;

public class Matematikaberaksi {
    public static void main(String[] args) {
    //membuat objek
    Matematika reni = new Matematika (3,7);
    
    System.out.println("Hasil penjumlahan : "+reni.setPenjumlahan());
    System.out.println("Hasil pengurangan : "+reni.setPengurangan());
    System.out.println("Hasil perkalian   : "+reni.setPerkalian());
    System.out.println("Hasil pembagian   : "+reni.setPembagian());
    }
} 