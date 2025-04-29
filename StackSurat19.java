import java.util.Scanner;
public class StackSurat19 {
    Surat19[] stack;
    int top;
    int size;

    public StackSurat19(int size) {
        this.size = size;
        stack = new Surat19[size];
        top = -1;
    }
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public void push(Surat19 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat izin lagi.");
        }
    }
    public Surat19 pop() {
        if (!isEmpty()) {
            Surat19 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin untuk diproses.");
            return null;
        }
    }
    public Surat19 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin yang masuk.");
            return null;
        }
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Tidak ada surat izin yang tersimpan.");
            return;
        }
        System.out.println("ID\tNama\t\tKelas\tJenis\tDurasi\tStatus");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].idSurat + "\t" + stack[i].namaMahasiswa + "\t" + stack[i].kelas + "\t" + stack[i].getJenisIzinString() + "\t" + stack[i].durasi + " hari\t" + stack[i].getStatusSurat());
        }
        System.out.println("");
    }
    public Surat19 cariSurat(String nama) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return stack[i];
            }
        }
        return null;
    }
}
