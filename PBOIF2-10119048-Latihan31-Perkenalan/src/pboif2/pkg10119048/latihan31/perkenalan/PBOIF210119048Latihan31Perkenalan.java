/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan31.perkenalan;

/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Menampilkan Program Perkenalan Mahasiswa.
 */
public class PBOIF210119048Latihan31Perkenalan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.nim = "10119048";
        mhs.nama = "Mochammad Faishal";
        
        mhs.Perkenalan();
        
        mhs.nim = "10119083";
        mhs.nama = "Rafsan Zen Mustaofa";
        
        mhs.Perkenalan();
        
        mhs.nim = "10119045";
        mhs.nama = "Fahma Maulana";
        
        mhs.Perkenalan();
        
        mhs.nim = "10119082";
        mhs.nama = "Zainul Rifqi Muwaffaq";
        
        mhs.Perkenalan();
        
        mhs.nim = "10119084";
        mhs.nama = "Muhammad Idris Merdefi";
        
        mhs.Perkenalan();
        
        mhs.nim = "10119069";
        mhs.nama = "Tri Novarel Ramadhani";
        
        mhs.Perkenalan();
        
        System.out.println("==========================================");
        System.out.println("Developed by : Mochammad Faishal");       
    }
}
