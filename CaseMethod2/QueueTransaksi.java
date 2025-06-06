package CaseMethod2;

public class QueueTransaksi {
    public TransaksiLayanan [] queue;
    public int front;
    public int rear;
    public int size;
    public int maxSize;
    

    public QueueTransaksi(int maxSize) {
        this.maxSize = maxSize;
        this.queue = new TransaksiLayanan[maxSize];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public void enqueue(TransaksiLayanan transaksi) {
        if (isFull()) {
            System.out.println("Transaksi Penuh.");
            return;
        }
        
        rear = (rear + 1) % maxSize;
        queue[rear] = transaksi;
        size++;
    }

    public void tampilkanRiwayatTransaksi() {
        if (size == 0) {
            System.out.println("Belum ada riwayat transaksi layanan.");
            return;
        }
        
        System.out.println("\n--- Riwayat Transaksi ---");
        int index = front;
        
        for (int i = 0; i < size; i++) {
            System.out.println(queue[index].pasien.nama + " (" + queue[index].durasiLayanan + " jam): Rp " + queue[index].biaya);
            index = (index + 1) % maxSize;
        }
        System.out.println("Total transaksi: " + size);
    }
}
