
package fatlab;

import java.util.ArrayList;
import java.util.List;

//bookname, book number, author name, number of copies available, price
class book_shop{
    String book_name;
    int book_number;
    String author_name;
    int no_copies;
    int price;

    public book_shop(String book_name, int book_number, String author_name, int no_copies, int price) {
        this.book_name = book_name;
        this.book_number = book_number;
        this.author_name = author_name;
        this.no_copies = no_copies;
        this.price = price;
    }
}
public class Fat_q1 {
    static List<book_shop> books;
    static void search(String name){
        for (book_shop b:books) {
            if(b.book_name.equals(name)) {
                System.out.println("Book found! ");
                purchase(b);
                return;
            }
        }
        System.out.println("Book not found!");
    }
    static void purchase(book_shop b){
        if(b.no_copies>0){
            b.no_copies--;
            System.out.println("Purchased!");
        }
        else{
            System.out.println("not enough copies!");
        }
    }
    public static  void main(String args[]){
        books = new ArrayList<>();
        books.add(new book_shop("java",1,"ani",10,1000));
        books.add(new book_shop("python",2,"john",15,999));
        books.add(new book_shop("c++",3,"smith",0,900));
        System.out.println("when java book is searched");
        search("java");
        System.out.println();
        System.out.println("When c++ book is searched");
        search("c++");
    }


}
