package jobsheet14;

import org.w3c.dom.Node;

public class BinaryTree23 {
    Node23 root;
    
    public BinaryTree23(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void add(Mahasiswa23 mahasiswa){
        Node23 newNode = new Node23(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        }else{
            Node23 current = root;
            Node23 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                }else{
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    
    boolean find (double ipk){
        boolean result = false;
        Node23 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            }else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            }else{
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node23 node){
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversInOrder (Node23 node){
        if (node != null) {
            traversInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traversInOrder(node.right);
        }
    }
    
    void traversePostOrder(Node23 node){
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node23 getSuccessor(Node23 del){
        Node23 successor = del.right;
        Node23 succesorParent = del;
        while (successor.left != null) {
            succesorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            succesorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk){
        if (isEmpty()) {
            System.out.println("Binary tree kosong!");
            return;
        }
        //cari node (current) yang akan di hapus
        Node23 parent = root;
        Node23 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            }else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //penghapusan
            if (current == null){
                System.out.println("Data tidak ditemukan");
                return;
            }else{
            //jika tidak ada anak (leaf), maka node dihapus
                if (current.left == null && current.right == null){
                    if (current == root){
                        root = null;
                    }else{
                        if (isLeftChild){
                            parent.left = null;
                        }else{
                            parent.right = null;
                        }
                    }
                }else if(current.left == null){ //jika hanya punya 1 anak (kanan)
                    if (current == root){
                        root = current.right;
                    }else{
                        if (isLeftChild){
                            parent.left = current.right;
                        }else{
                            parent.right = current.right;
                        }
                    }
                }else if(current.right == null){ //jika hanya punya 1 anak (kiri)
                    if (current == root){
                        root = current.left;
                    }else{
                        if (isLeftChild){
                            parent.left = current.left;
                        }else{
                            parent.right = current.left;
                        }
                    }
                }else{ //jika punya 2 anak
                    Node23 successor = getSuccessor(current);
                    System.out.println("Jika 2 anak, current = ");
                    successor.mahasiswa.tampilInformasi();
                    if (current == root){
                        root = successor;
                    }else{
                        if (isLeftChild){
                            parent.left = successor;
                        }else{
                            parent.right = successor;
                        }
                    }
                    successor.left = current.left;
                }
            }
    }
    public void addRekursif(Mahasiswa23 data) {
        root = addRekursif(root, data);
    }

    private Node23 addRekursif(Node23 current, Mahasiswa23 data) {
        if (current == null) {
            return new Node23(data);
        }

        if (data.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, data);
        } else {
            current.right = addRekursif(current.right, data);
        }
        return current;
    }

    public Mahasiswa23 cariMinIPK() {
        if (root == null) {
            return null;
        }
        Node23 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.mahasiswa;
    }
    
    public Mahasiswa23 cariMaxIPK() {
        if (root == null) {
            return null;
        }
        Node23 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.mahasiswa;
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }
    
    private void tampilMahasiswaIPKdiAtas(Node23 current, double ipkBatas) {
        if (current != null) {
            tampilMahasiswaIPKdiAtas(current.left, ipkBatas);
            if (current.mahasiswa.ipk > ipkBatas) {
                System.out.println("NIM: " + current.mahasiswa.nim +
                                   ", Nama: " + current.mahasiswa.nama +
                                   ", IPK: " + current.mahasiswa.ipk);
            }
            tampilMahasiswaIPKdiAtas(current.right, ipkBatas);
        }
    }
    
}
