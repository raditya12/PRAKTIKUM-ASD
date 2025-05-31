package jobsheet12;

import org.w3c.dom.Node;

import jobsheet11.NodeMahasiswa23;

public class DoubleLinkedList23 {
    Node23 head;
    Node23 tail;
    
    public DoubleLinkedList23() {
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return (head == null);
    }

    public void addFirst (Mahasiswa23 data){
        Node23 newNode = new Node23(data);
        if (isEmpty()) {
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast (Mahasiswa23 data){
        Node23 newNode = new Node23(data);
        if (isEmpty()) {
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter (String keyNim, Mahasiswa23 data){
        Node23 current = head;
    // Cari node dengan nim = keyNim
    while (current != null && !current.data.nim.equals(keyNim)) {
        current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + "Tidak ditemukan.");
            return;
        }
        Node23 newNode = new Node23(data);

        //Jika current adalah tail, cukup tambahkan di akhir
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        }else{
            // Sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print(){
        Node23 current = head;
        if (isEmpty()) {
            System.out.println("Data Kosong!");
            return;
        }else{
        while (current != null) {
            current.data.tampil();
            current = current.next;
            }
        }
    }

    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }
        if(head == tail){
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah " + head.data.nama);
            head = tail = null;
        }else{
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah " + head.data.nama);
            head = head.next;
            head.prev = null;
        }
    }
    
    public void removeLast(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus");
            return;
        } 
        if (head == tail) {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah " + tail.data.nama);
            head = tail = null;
        } else {
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah " + tail.data.nama);
            tail = tail.prev;
            tail.next = null;
        }
    }

    public Node23 search(String targetNim) {
        Node23 current = head;

        while (current != null) {
            if (current.data.nim.equals(targetNim)) {
                return current;
            }
            current = current.next;
        }
        return null; 
    }

    public void add(Mahasiswa23 data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        } 
        
        Node23 temp = head;
        for (int i = 0; i < index - 1; i++) {
        if (temp == null) {
        System.out.println("Index melebihi panjang list");
        return;
        }
        temp = temp.next;
        }   
        
        if (temp.next == null) {
            addLast(data);
            return;
        }
        
        Node23 newNode = new Node23(data);
        temp.next.prev = newNode;
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void removeAfter(String key) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus");
            return;
        } 
        Node23 temp = head;

        while (temp != null && !temp.data.nama.equalsIgnoreCase(key)) {
        temp = temp.next;
        }

        if (temp == null || temp.next == null) {
        System.out.println("Node setelah \"" + key + "\" tidak ditemukan atau tidak ada");
        return;
        }

        temp.next.prev = temp;
        temp.next = temp.next.next;
    
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus");
            return;
        } 

        if (index < 0) {
        System.out.println("Index tidak valid");
        return;
    }

        if (index == 0) {
            removeFirst();
            return;
        } 

        Node23 temp = head;

        for(int i = 0; i < index; i++) {
        if (temp == null) {
            System.out.println("Index melebihi panjang list");
            return;
        }
            temp = temp.next;
        }

        if (temp.next == null) {
            removeLast();
            return;
        }

        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
    }
    
    Mahasiswa23 getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.data;
    }

    Mahasiswa23 getLast() {
        if (isEmpty()) {
            return null;
        }

        return tail.data;
    }

    Mahasiswa23 getIndex(int index) {
        if (isEmpty()) {
            return null;
        }

        Node23 temp = head;

        for(int i = 0; i < index; i++) {
        if (temp == null) {
            System.out.println("Index melebihi panjang list");
            return null;
        }
            temp = temp.next;
        }
        return temp.data;
    }

    int getSize() {
        int counter = 0;

        Node23 temp = head;
        while (temp != null) {
            temp = temp.next;
            counter++;
        }

        return counter;
    }
    
}

