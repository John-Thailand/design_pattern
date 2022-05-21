import java.util.Iterator;
import java.util.ArrayList;

public class BookShelf {
  private ArrayList<Book> books;

  public BookShelf(int maxsize) { this.books =  new ArrayList<>(); }

  public Book getBookAt(int index) { return books.get(index); }

  public void appendBook(Book book) {
    this.books.add(book);
  }

  public int getLength() { return books.size(); }

  public Iterator<Book> iterator() {
    return new BookShelfIterator(this);
  }
}