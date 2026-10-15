/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author LENOVO
 */
public class Manajer extends Pegawai{
    public int tunjangan;
    
    @Override
    public void tampilData(){
        System.out.println("======TAMPIL DATA MANAGER======");
        super.tampilData();
        System.out.println("Tunjangan = "+tunjangan);
        System.out.println();
    }
}
