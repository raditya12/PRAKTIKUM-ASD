package jobsheet9;

public class StackKonversi23 {
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKonversi23(){
        this.size = 32; //asumsi 32 bit
        tumpukanBiner = new int[size];
        top = -1;
    }
    boolean isEmpty(){
        return top == -1;
    }
    boolean isFull(){
        return top == size - 1;
    }
    void push (int data){
        if (isFull()) {
            System.out.println("Stack penuh");
        }else{
            top++;
            tumpukanBiner[top] = data;
        }
    }
    int pop(){
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1;
        }else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
