package jobsheet15;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Book book1 = new Book("1234", "Dasar Pemrograman");
        Book book2 = new Book("7145", "Hafalan Shalat Delisa");
        Book book3 = new Book("3562", "Muhammad Al-Fatih");

        Stack<Book> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book temp = books.peek();

        if (temp != null) {
            System.out.println(temp.toString());
        }

        Book temp2 = books.pop();

        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        Book target = book2;
        int position = books.search(target);
        if (position != -1) {
            System.out.println(position);
        }
        System.out.println(books);
    
    }
    
}
