// Nama file : membuat class dosen matakuliah dan kendaraan
// pembuat : ghatfan muhammad atiwiar
// tanggal : 03/03/2026

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private DosenTetap dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa() {
        this.nama = "";
        this.nim = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<>();
        this.dosenWali = null;
        this.kendaraan = null;
    }
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
        this.dosenWali = null;
        this.kendaraan = null;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
    public String getProdi() {
        return prodi;
    }
    public DosenTetap getDosenWali() {
        return dosenWali;
    }
    public Kendaraan getKendaraan() {
        return kendaraan;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    public void setDosenWali(DosenTetap dosenWali) {
        this.dosenWali = dosenWali;
    }
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }
    public void addMatKul(MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
    }
    public int getJumlahSKS() {
        int total = 0;
        for (int i = 0; i < listMatKul.size(); i++) {
            total += listMatKul.get(i).getSks();
        }
        return total;
    }

    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    public void printMhs() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Prodi : " + prodi);
    }

    public void printDetailMhs() {
        printMhs();
        System.out.println("Daftar Mata Kuliah:");
        for (int i = 0; i < listMatKul.size(); i++) {
            System.out.println(
                "- " + listMatKul.get(i).getNama() +
                " (" + listMatKul.get(i).getSks() + " SKS)"
            );
        }

        System.out.println("Total SKS: " + getJumlahSKS());
        if (dosenWali != null) {
            System.out.println("Dosen Wali: " + dosenWali.getNama());
        }
        if (kendaraan != null) {
            System.out.println(
                "Kendaraan: " + kendaraan.getJenis() +
                " [" + kendaraan.getNoPlat() + "]"
            );
        }
    }
}