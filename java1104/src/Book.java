import java.util.LinkedList;
import java.util.Scanner;

public class Book {
    private String NameOfBook;
    private int price;
    private String Author;
    private int additionnum;

    public Book(String NameOfBook,int price,String Author,int additionnum)
    {
        this.NameOfBook = NameOfBook;
        this.price = price;
        this.Author = Author;
        this.additionnum = additionnum;
    }
    public String getName()
    {
        return this.NameOfBook;
    }
    public String getAuthor()
    {
        return this.Author;
    }
    public int getadditionnum()
    {
        return  this.additionnum;
    }
    public String  toString()
    {
        return this.NameOfBook;
    }
}
class BookList{
    LinkedList<Book>booklist;
    public BookList()
    {
        this.booklist = new LinkedList<>();
    }
    public void addBook(Book b)
    {
        booklist.add(b);
    }
    public void searchBook(Book b)
    {
        String tempname = b.getName();
        int tempaddno = b.getadditionnum();
        String tempau =b.getAuthor();
        int findflag = 0;
        for (int i = 0;i< booklist.size();i++)
        {
            Book tempbook = booklist.get(i);
            Object tembook = null;
            if (tempbook.getName().equals(tempname)&&tempbook.getadditionnum()==tempaddno && tempbook.getAuthor().equals(tempau))
            {
                System.out.println("found:"+i);
                findflag = 1;
            }
        }
        if(findflag == 0)
        {
            System.out.println("not foundn");
        }
    }

}
class Main{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BookList bl = new BookList();
        int n = s.nextInt();
        for (int i=0;i<n;i++){
            bl.addBook(new Book(s.next(),
                    0,
                    s.next(),s.nextInt()));
        }


        bl.searchBook(new Book(s.next(),
        0,
                s.next(),s.nextInt()));
    }
}

