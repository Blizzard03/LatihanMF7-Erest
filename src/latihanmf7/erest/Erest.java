/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmf7.erest;

/**
 *
 * @author Blizzard
 */
public class Erest {
    private String Nama,Destinasi,MetodePembayaran;
    private int jml;

    public String getMetodePembayaran() {
        return MetodePembayaran;
    }

    public void setMetodePembayaran(String MetodePembayaran) {
        this.MetodePembayaran = MetodePembayaran;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getDestinasi() {
        return Destinasi;
    }

    public void setDestinasi(String Destinasi) {
        this.Destinasi = Destinasi;
    }

    public int getJml() {
        return jml;
    }

    public void setJml(int jml) {
        this.jml = jml;
    }
    
}
