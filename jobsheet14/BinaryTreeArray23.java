package jobsheet14;

import jobsheet10.P2Jobsheet10.Mahasiswa;

public class BinaryTreeArray23 {
    Mahasiswa23[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray23(){
    }
    void populateData (Mahasiswa23[] dataMahasiswa, int idxLast){
        this.dataMahasiswa = dataMahasiswa;
        this.idxLast = idxLast;
    }
    
    void traverseInOrder(int idxStart){
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
                
            }
            
        }
    }
    
    public void add(Mahasiswa23 data) {
        if (idxLast + 1 < dataMahasiswa.length) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println("Tree array penuh!");
        }
    }
    
    public void traversePreOrder() {
        traversePreOrder(0);
    }
    
    private void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            System.out.println("NIM: " + dataMahasiswa[idxStart].nim +
                               ", Nama: " + dataMahasiswa[idxStart].nama +
                               ", IPK: " + dataMahasiswa[idxStart].ipk);
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
    

}
