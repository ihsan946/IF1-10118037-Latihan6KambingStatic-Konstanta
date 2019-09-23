/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110118037latihan6kambingstatic.konstanta;

/**
 * @author LENOVO
 * NAMA      : Muhammad Ihsan
 * KELAS     : IF-1
 * NIM       : 10118037
 * Deskripsi Program   : Program ini berisi program dengan variabel Kambing
 *                       menjadi variabel static dan konstanta.
 */



public class IF110118037Latihan6KambingStaticKonstanta {
    
    //NAMA_KAMBING sebagai Konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                + Mamalia.jumlahKambing);
    }
    
}
