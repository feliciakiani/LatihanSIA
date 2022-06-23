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
//    public String toString() {
//        return super.toString() + "Mahasiswa Magister\n" + "Judul Tesis=" + judulTesis + "\nlistMataKuliahMagister=" + listMataKuliahMagister;
//    }
//    
    public String toString() {
        String msg = "\nMahasiswa Magister\n";
        msg += "Judul Tesis=" + judulTesis + "\n";
        for (int i = 0; i < listMataKuliahMagister.size(); i++) {
            MatkulAmbil current = listMataKuliahMagister.get(i);
            if(current.mataKuliahWajib.getNama() != null) {
                msg += "\nNama Matkul Wajib = " + current.mataKuliahWajib.getNama();
                msg += "\nKode Matkul = " + current.mataKuliahWajib.getKode();
                msg += "\nSKS Matkul = " + current.mataKuliahWajib.getSKS();
            } else {
                msg += "\nNama Matkul Pililhan = " + current.mataKuliahPilihan.getNama();
                msg += "\nKode Matkul = " + current.mataKuliahPilihan.getKode();
                msg += "\nSKS Matkul = " + current.mataKuliahPilihan.getSKS();
            }
            
            for (int j = 0; j < current.listPresensi.size(); j++) {
                msg += "\nStatus ke-"+(j+1)+" = "+current.listPresensi.get(j).getStatus();
            }
            
            msg += "\nNilai 1 = " + current.getN1();
            msg += "\nNilai 2 = " + current.getN2();
            msg += "\nNilai 3 = " + current.getN3();
            
            msg += "\n";
        }
        return super.toString() + msg;
    }
}
