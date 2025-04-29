public class StackSurat12 {
        Surat12[] stack;
        int top;
        int size;
    
        public StackSurat12(int size) {
            this.size = size;
            this.stack = new Surat12[size];
            this.top = -1;
        }
    
        public boolean isEmpty() {
            return top == -1;
        }
    
        public boolean isFull() {
            return top == size - 1;
        }
    
        public void push(Surat12 s) {
            if (!isFull()) {
                top++;
                stack[top] = s;
            } else {
                System.out.println("Stack penuh! Tidak bisa menambahkan surat izin lagi.");
            }
        }
    
        public Surat12 pop() {
            if (!isEmpty()) {
                Surat12 surat = stack[top];
                top--;
                return surat;
            } else {
                System.out.println("Tidak ada surat untuk diproses.");
                return null;
            }
        }
    
        public Surat12 peek() {
            if (!isEmpty()) {
                return stack[top];
            } else {
                return null;
            }
        }
    
        public void cariSurat(String nama) {
            boolean ditemukan = false;
            for (int i = top; i >= 0; i--) {
                if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                    System.out.println("Surat ditemukan:");
                    System.out.println("ID: " + stack[i].idSurat + ", Nama: " + stack[i].namaMahasiswa +
                            ", Kelas: " + stack[i].kelas + ", Jenis: " + stack[i].jenisIzin + ", Durasi: " + stack[i].durasi);
                    ditemukan = true;
                    break;
                }
            }
            if (!ditemukan) {
                System.out.println("Tidak ada surat dari " + nama);
                
            }
        }
    }
    
    

