package jobsheet11.P2Jobsheet10;

public class AntrianLayanan {
    Mahasiswa [] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan(int max){
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    
    

    public boolean IsEmpty(){
        if (size == 0) {
            return true;
        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if (size == max) {
            return true;
        }else{
            return false;
        }
    }

    public void peek(){
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        }else
        System.out.println("Queue masih kosong");
    }

    public void print(){
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        }else{
            int i = front;
            while (i != rear) {
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }    
    
    public void clear(){
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void tambahAntrian(Mahasiswa mhs){
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " Berhasil masuk ke antrian");
    }
    
    public Mahasiswa layaniMahasiswa(){
        if (IsEmpty()) {
            System.out.println("Antri kosong");
            return null;
        }
        Mahasiswa mhs = data[front];
        front = (front+1) % max;
        size-- ;
        return mhs;
    }

    public void lihatTerdepan(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        }else{
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }
    
    public void tampilkanSemua(){
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
    public int getJumlahAntrian(){
        return size;
    }
    public void LihatAkhir(){
        if (IsEmpty()) {
            System.out.println("Antrian Kosong");
        }else{
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();

        }
    }
}

    

    

