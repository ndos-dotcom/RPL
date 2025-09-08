/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.java;

/**
 *
 * @author nndosssv
 */
public class Buku {
    String judul, penulis, penerbit;
    int tahun_terbit;
    
    //method
    void infoBuku(){
        System.out.println("judul Buku : " +judul);
        System.out.println("Penulis : " + penulis);
        System.out.println("Penerbit : " + penerbit);
        System.out.println("Tahun terbit: " + tahun_terbit);
    }
}
