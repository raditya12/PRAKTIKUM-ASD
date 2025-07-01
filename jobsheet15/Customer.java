package jobsheet15;

public class Customer {
    public int id;
    public String name;

    public Customer(){
    
    }

    public Customer(int id, String nama){
    this.id = id;
    this.name = nama;
    }

    public String toString(){
        return "ID: " + id + ", Nama: " + name;
    }
}
