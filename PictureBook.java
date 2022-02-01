  // unit 9, frq 1 child class
  import java.util.ArrayList;
  
  // part a  
  class PictureBook extends Book{
    private String illustrator;

    public PictureBook(String t, String a, String illustrator){
      super(t, a);
      this.illustrator = illustrator;
      
    }

    public void printBookInfo(){
      super.printBookInfo();
      System.out.println(" and illustrated by " + illustrator);
      }
  
  // part b
  public static void main(String[] args){
    ArrayList<Book> myLibrary = new ArrayList<Book>();
    Book book1 = new Book("Frankenstein", "Mary Shelley");
    Book book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
    myLibrary.add(book1);
    myLibrary.add(book2);

  }
  
  
  
  }
