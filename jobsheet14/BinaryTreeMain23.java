package jobsheet14;

public class BinaryTreeMain23 {
    public static void main(String[] args) {
        BinaryTree23 bst = new BinaryTree23();
        
        bst.add(new Mahasiswa23("244160121", "Ali", "Ali", 3.57));
        bst.add(new Mahasiswa23("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa23("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa23("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal)");
        bst.traversInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa: ");
        System.out.println("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54)?"Ditemukan" : "Tidak Ditemukan";
        System.out.println(hasilCari);

        System.out.println("Cari Mahasiwa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22)? "Ditemukan" : "Tidak Ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa23("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa23("244160205", "Ehsan","D", 3.37));
        bst.add(new Mahasiswa23("244160170", "Fizi","E", 3.65));

        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("\nInOrder Traversal:");
        bst.traversInOrder(bst.root);
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traversInOrder(bst.root);
                
    }

}
