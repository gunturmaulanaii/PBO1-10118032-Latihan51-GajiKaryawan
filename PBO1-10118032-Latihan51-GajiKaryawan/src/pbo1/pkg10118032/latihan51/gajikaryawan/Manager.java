/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118032.latihan51.gajikaryawan;

/**
 *
 * @author Guntur Maulana Ibrahim
 * NAMA  : Guntur Maulana Ibrahim
 * KELAS : IF 1
 * NIM   : 10118032
 * Deskripsi Program : Variabel perhitungan Gaji Karyawan.
 */
public class Manager extends Karyawan {
    
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    float tunjanganKehadiran (int hadir){
        
        return tunjanganKehadiran = hadir   * 10000;
    }
    
    float tunjanganJabatan (String jabatan){
        if ("Manager".equals(jabatan)){
        tunjanganJabatan = 2000000;
    } else if ("Kabag".equals(jabatan)) {
        tunjanganJabatan = 1000000;
    } else tunjanganJabatan = 0;
        
        return tunjanganJabatan;
    }
    
    float tunjanganGolongan (int golongan) {
        if (golongan == 1){
            tunjanganGolongan = 500000;
        } else if (golongan == 2) {
            tunjanganGolongan = 1000000;
        } else if (golongan == 3) {
            tunjanganGolongan = 1500000;
        } else tunjanganGolongan = 0;
        
        return tunjanganGolongan;
    }
    
    float gajiTotal () {
        
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }
}
