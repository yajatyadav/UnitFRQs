

// book listing class for unit 9, frq 1, part c
class BookListing{
    private Book book;
    private double price;

    public BookListing(Book b, double d){
        book = b;
        price = d;

    }

    public void printDescription(){
        book.printBookInfo();
        System.out.println(", " + price);
    }

    public static void main(String[] args){
        Book book1 = new Book("Frankenstein", "Mary Shelley");
        Book book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
        BookListing listing1 = new BookListing(book1, 10.99);
        listing1.printDescription();
        BookListing listing2 = new BookListing(book2, 12.99);
        listing2.printDescription();
    }
}