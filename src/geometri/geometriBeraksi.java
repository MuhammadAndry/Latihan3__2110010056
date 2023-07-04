/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometri;

/**
 *
 * @author User
 */
public class geometriBeraksi {
    public static void main(String[] args) {
    double radiusLingkaran = 5.0;
    Lingkaran lingkaran = new Lingkaran(radiusLingkaran);
    System.out.println("Luas Lingkaran: " + lingkaran.luas());
    System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

    double alasSegitiga= 4.0;
    double tinggiSegitiga= 6.0;
    double sisimiringSegitiga=5.0;
    segitigaSegitiga = new segitiga(alasSegitiga, tinggiSegitiga, sisimiringSegitiga);
    System.out.println("Luas Segitiga: " + segitiga.luas());
    System.out.println("Keliling segitiga: " + segitiga.keliling());
    }
    
}
