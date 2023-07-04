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
class Segitiga {
private final double alas;
private final double tinggi;
private final double sisimiring;

    public Segitiga(double alas, double tinggi, double sisimiring) {
        this.alas= alas;
        this.tinggi = tinggi;
        this.sisimiring = sisimiring;
    }

    public double luas() {
        return alas * tinggi / 2;
    }

    public double keliling() {
        return 2 * (alas + tinggi + sisimiring);
    }
}
    

