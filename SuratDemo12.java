import java.util.Scanner;
public class SuratDemo12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat12 stack = new StackSurat12(5);

        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin berdasarkan Nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat12 surat = new Surat12(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    System.out.println("Surat dari " + nama + " berhasil ditambahkan!.");
                    break;

                case 2:
                    Surat12 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari " + diproses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat12 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dari " + lihat.namaMahasiswa +
                                ", ID: " + lihat.idSurat + ", Kelas: " + lihat.kelas +
                                ", Jenis: " + lihat.jenisIzin + ", Durasi: " + lihat.durasi + " hari");
                    } else {
                        System.out.println("Belum ada surat yang masuk!.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String cariNama = scan.nextLine();
                    stack.cariSurat(cariNama);
                    break;

                case 5:
                    System.out.println("Keluar dari Program..");
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid.");
            }
        } while (pilih != 5);
    }}

    

