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
public class MahasiswaSarjana extends Mahasiswa {
    
    private ArrayList<MatkulAmbil> listMataKuliahSarjana = new ArrayList<>();

    public MahasiswaSarjana(String nama, int NIM, String jurusan, String alamat, String TTL, String telepon, ArrayList<MatkulAmbil> listMataKuliahSarjana) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
        setListMataKuliahSarjana(listMataKuliahSarjana);
    }

    public ArrayList<MatkulAmbil> getListMataKuliahSarjana() {
        return listMataKuliahSarjana;
    }

    public void setListMataKuliahSarjana(ArrayList<MatkulAmbil> listMataKuliahSarjana) {
        this.listMataKuliahSarjana = listMataKuliahSarjana;
    }

    @Override
    public String toString() {
        String msg = "\nMahasiswa Sarjana\n";
        for (int i = 0; i < listMataKuliahSarjana.size(); i++) {
            MatkulAmbil current = listMataKuliahSarjana.get(i);
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
