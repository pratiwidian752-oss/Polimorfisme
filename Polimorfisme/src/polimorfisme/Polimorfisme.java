/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author LENOVO
 */
public class Polimorfisme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai p = new Pegawai();
        p = new Programmer();
        p = new Manajer();
        
        Manajer m = new Manajer();
        m.gajiPokok = 10000;
        m.nama = "sai";
        m.tunjangan = 5000;
        p = m;
        p.tampilData();
        
        m.tampilData();
        
        Pegawai[] arrPeg = new Pegawai[3];
        Programmer pr = new Programmer();
        pr.nama = "uciha";
        pr.gajiPokok = 10000;
        pr.bonus = 12000;
        pr.tampilData();
        arrPeg[0] = p;
        arrPeg[1] = m;
        arrPeg[2] = new Programmer ();
        arrPeg[0].tampilData();
        arrPeg[1].tampilData();
        
        hitungGajiTotal(m);
        hitungGajiTotal(pr);
}
    public static void hitungGajiTotal(Pegawai p){
        if (p instanceof Programmer){
            Programmer prog = (Programmer) p;
            int GajiTot = prog.bonus+prog.gajiPokok;
            System.out.println("Gaji Total Programmer = " +GajiTot);
        }
        else if (p instanceof Manajer){
            Manajer man = (Manajer)p;
            int gajiTot = man.tunjangan+man.gajiPokok;
            System.out.println("Gaji Total Manajer ="+gajiTot);
        }
        }
    }
    
