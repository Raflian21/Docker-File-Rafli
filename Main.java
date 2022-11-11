/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingadbo;

/**
 *
 * @author RAFLI
 */
public class Main {
    public static void main(String[] args) {
        DaftarMahasiswa list = new DaftarMahasiswa();
        Mahasiswa m1 = new Mahasiswa("Rafli", 2019, 19, 3.5);
        Mahasiswa m2 = new Mahasiswa("Alfian", 2018, 20, 3);
        Mahasiswa m3 = new Mahasiswa("Nilofar", 2017, 19, 4);
        Mahasiswa m4 = new Mahasiswa("Rani", 2020, 21, 2);
        Mahasiswa m5 = new Mahasiswa("Mirza", 2016, 20, 2.5);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        System.out.println("--------------SORTING DATA MAHASISWA--------------");
        System.out.println("Data Mahasiswa sebelum sorting = ");
        list.tampil();
        System.out.println("==================================================");
        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubblesort();
        list.tampil();
        System.out.println("==================================================");
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionsort();
        list.tampil();
        System.out.println("==================================================");
    }
}
