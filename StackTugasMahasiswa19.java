import java.util.Scanner;
public class StackTugasMahasiswa19 {
    
    Mahasiswa19[] stack;
    int top;
    int size;

    public StackTugasMahasiswa19(int size){
        this.size = size;
        stack = new Mahasiswa19[size];
        top = -1;
    }
    public boolean isFull(){
        if (top == size - 1){
            return true;
        } else{
            return false;
        }
    }
    public boolean isEmpty(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
    public void push(Mahasiswa19 mhs){
        if (!isFull()){
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }
    public Mahasiswa19 pop(){
        if (!isEmpty()){
        Mahasiswa19 m = stack[top];
        top--;
        return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }
    public Mahasiswa19 peek(){
        if (!isEmpty()){
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }
    public Mahasiswa19 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }
    public String konversiDesimalKeBiner(int nilai){
        StackKonversi19 stack = new StackKonversi19();
        while (nilai > 0){
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()){
            biner += stack.pop();
        }
        return biner;
    }
    public int count() {
        return top + 1;
    }
    public void print(){
        for (int i=top; i>=0; i--){
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}
