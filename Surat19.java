import java.util.Scanner;
public class Surat19 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;
    boolean diproses;

    Surat19() {
        diproses = false;
    }
    Surat19(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
        this.diproses = false;
    }

    void prosesSurat() {
        this.diproses = true;
    }
    String getStatusSurat() {
        return diproses ? "Sudah diproses" : "Belum diproses";
    }
    String getJenisIzinString() {
        return jenisIzin == 'S' ? "Sakit" : "Izin ";
    }
}
