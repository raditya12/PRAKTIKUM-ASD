package jobsheet11;
public class QueueKRS {
    private int maxAntrian = 10;
    private Mahasiswa23[] queue = new Mahasiswa23[maxAntrian];
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private int jumlahProses = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxAntrian;
    }

    public void kosongkan() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void tambahMahasiswa(Mahasiswa23 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak bisa menambahkan mahasiswa.");
        } else {
            rear = (rear + 1) % maxAntrian;
            queue[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " ditambahkan ke antrian.");
        }
    }

    public void panggilProsesKRS() {
        if (size >= 2) {
            Mahasiswa23 m1 = dequeue();
            Mahasiswa23 m2 = dequeue();
            jumlahProses += 2;
            System.out.println("Memproses KRS untuk:");
            tampilkanMahasiswa(m1);
            tampilkanMahasiswa(m2);
        } else {
            System.out.println("Antrian tidak cukup untuk memproses 2 mahasiswa.");
        }
    }

    public Mahasiswa23 dequeue() {
        if (isEmpty()) return null;
        Mahasiswa23 mhs = queue[front];
        front = (front + 1) % maxAntrian;
        size--;
        return mhs;
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar antrian:");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % maxAntrian;
                System.out.print((i + 1) + ". ");
                tampilkanMahasiswa(queue[index]);
            }
        }
    }

    public void tampilkanDepan() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            tampilkanMahasiswa(queue[front]);
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tampilkanDuaTerdepan() {
        if (size >= 2) {
            System.out.println("1. ");
            tampilkanMahasiswa(queue[front]);
            System.out.println("2. ");
            tampilkanMahasiswa(queue[(front + 1) % maxAntrian]);
        } else if (size == 1) {
            System.out.println("1. ");
            tampilkanMahasiswa(queue[front]);
            System.out.println("2. Tidak ada");
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tampilkanAkhir() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir:");
            tampilkanMahasiswa(queue[rear]);
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void cetakJumlah() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void cetakJumlahProses() {
        System.out.println("Jumlah mahasiswa yang sudah melakukan KRS: " + jumlahProses);
    }

    public void cetakBelumProses() {
        System.out.println("Jumlah mahasiswa yang belum melakukan KRS: " + size);
    }

    private void tampilkanMahasiswa(Mahasiswa23 m) {
        if (m != null) {
            System.out.println("Nama : " + m.nama);
            System.out.println("NIM  : " + m.nim);
            System.out.println("Prodi: " + m.prodi);
            System.out.println("Kelas: " + m.kelas);
        }
    }
}
