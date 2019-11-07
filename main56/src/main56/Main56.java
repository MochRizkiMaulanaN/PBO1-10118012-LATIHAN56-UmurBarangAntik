/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main56;

/**
 *
 * @author LENOVO
 */
public class Main56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio R =new Radio(234);
        
        R.setName("Radio AM");
        System.out.println("Nama Barang Antik : "+R.getName());
        R.tampilUmur();
    }
    
}
