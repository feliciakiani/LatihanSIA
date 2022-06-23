/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Felicia
 */
public class PresensiStaff {
    private String tanggal;
    private int status;
    private String jam;

    public PresensiStaff(String tanggal, int status, String jam) {
        this.tanggal = tanggal;
        this.status = status;
        this.jam = jam;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return "\nPresensiStaff{" + "tanggal=" + tanggal + ", status=" + status + ", jam=" + jam + '}';
    }
    
    
    
}
