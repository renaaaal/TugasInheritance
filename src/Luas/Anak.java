/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Luas;

/**
 *
 * @author fakhri
 */
public class Anak extends Induk{
 
//deklarasi variabel
double sisi;
//deklarasi method konstruktor tanpa parameter
public Anak(){
}
//deklarasi method konstruktor dengan parameter
public Anak(double inputsisi){
this.sisi = inputsisi; // menentukan nilai dari variabel sisi adalah parameter inputsisi
}
//deklarasi method untuk menentukan nilai dari variabel sisi
public void setSisi(double inputsisi){
this.sisi = inputsisi;
}
//deklarasi method untuk menghitung luas dengan mengoverride method hitungLuas
//dari superclass nya (kelas BangunDatar)
@Override
public void hitungLuas(){
double luas ; //deklarasi variabel lokal
luas = this.sisi * this.sisi;
//mencetak luas
System.out.println("luas segi empat dengan sisi "+sisi+" cm adalah "+luas+" cm kuadrat");
}
}
