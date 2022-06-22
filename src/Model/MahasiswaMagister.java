/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Felicia
 */
public class MahasiswaMagister extends Mahasiswa {
    
    private ArrayList<MatkulAmbil> listMataKuliahMagister = new ArrayList<>();
    private String judulTesis;

    public MahasiswaMagister( String nama, int NIM, String jurusan, String alamat, String TTL, String telepon, String judulTesis, ArrayList<MatkulAmbil> listMataKuliahMagister) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
        this.judulTesis = judulTesis;
        setListMataKuliahMagister(listMataKuliahMagister);
    }

    public ArrayList<MatkulAmbil> getListMataKuliahMagister() {
        return listMataKuliahMagister;
    }

    public void setListMataKuliahMagister(ArrayList<MatkulAmbil> listMataKuliahMagister) {
        this.listMataKuliahMagister = listMataKuliahMagister;
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }

    @Override
    public String toString() {
        return super.toString() + "Mahasiswa Magister\n" + "Judul Tesis=" + judulTesis + "listMataKuliahMagister=" + listMataKuliahMagister;
    }
    
    
}
