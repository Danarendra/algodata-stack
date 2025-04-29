import java.util.Scanner;
public class DemoSurat19 {
        public static void main(String[] args) {
            StackSurat19 stack = new StackSurat19(10);
            Scanner scan = new Scanner(System.in);
            int pilih;
            do {
                System.out.println("\nMenu Pengelolaan Surat Izin");
                System.out.println("1. Terima Surat Izin");
                System.out.println("2. Proses Surat Izin");
                System.out.println("3. Lihat Surat Izin Terakhir");
                System.out.println("4. Cari Surat");
                System.out.println("5. Lihat Semua Surat");
                System.out.print("Pilih: ");
                pilih = scan.nextInt();
                scan.nextLine();
                switch (pilih) {
                    case 1:
                        System.out.print("ID Surat: ");
                        String idSurat = scan.nextLine();
                        System.out.print("Nama Mahasiswa: ");
                        String nama = scan.nextLine();
                        System.out.print("Kelas: ");
                        String kelas = scan.nextLine();
                        char jenisIzin;
                        do {
                            System.out.print("Jenis Izin (S: Sakit, I: Izin keperluan lain): ");
                            jenisIzin = scan.nextLine().toUpperCase().charAt(0);
                        } while (jenisIzin != 'S' && jenisIzin != 'I');
                        System.out.print("Durasi (hari): ");
                        int durasi = scan.nextInt();
                        scan.nextLine();
                        Surat19 surat = new Surat19(idSurat, nama, kelas, jenisIzin, durasi);
                        stack.push(surat);
                        System.out.printf("Surat izin dari %s berhasil diterima\n", surat.namaMahasiswa);
                        break;

                    case 2:
                        Surat19 diproses = stack.peek();
                        if (diproses != null) {
                            System.out.println("Memproses surat izin dari " + diproses.namaMahasiswa);
                            diproses.prosesSurat();
                            System.out.printf("Surat izin %s berhasil diproses\n", diproses.namaMahasiswa);
                        }
                        break;
    
                    case 3:
                        Surat19 lihat = stack.peek();
                        if (lihat != null) {
                            System.out.println("Surat izin terakhir dari " + lihat.namaMahasiswa);
                            System.out.println("Detail: ");
                            System.out.println("ID: " + lihat.idSurat);
                            System.out.println("Nama: " + lihat.namaMahasiswa);
                            System.out.println("Kelas: " + lihat.kelas);
                            System.out.println("Jenis Izin: " + lihat.getJenisIzinString());
                            System.out.println("Durasi: " + lihat.durasi + " hari");
                            System.out.println("Status: " + lihat.getStatusSurat());
                        }
                        break;
    
                    case 4:
                        System.out.print("Masukkan nama mahasiswa yang dicari: ");
                        String cariNama = scan.nextLine();
                        Surat19 hasilCari = stack.cariSurat(cariNama);
                        
                        if (hasilCari != null) {
                            System.out.println("Surat izin ditemukan:");
                            System.out.println("ID: " + hasilCari.idSurat);
                            System.out.println("Nama: " + hasilCari.namaMahasiswa);
                            System.out.println("Kelas: " + hasilCari.kelas);
                            System.out.println("Jenis Izin: " + hasilCari.getJenisIzinString());
                            System.out.println("Durasi: " + hasilCari.durasi + " hari");
                            System.out.println("Status: " + hasilCari.getStatusSurat());
                        } else {
                            System.out.println("Surat izin dengan nama " + cariNama + " tidak ditemukan.");
                        }
                        break;
    
                    case 5:
                        System.out.println("Daftar semua surat izin:");
                        stack.print();
                        break;

                    default:
                        System.out.println("Pilihan tidak valid");
                }
            } while (pilih != 0);
            
            scan.close();
        }
}
