//phase 1: kene add sikit to farah punya
package smartlibrary;

class Book {
    int isbn;
    String title;
    String author;
    boolean borrowed;
    Book right; //node next
    Book left;  //node prev
    
    public Book(int isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.borrowed = false;
        this.left = null;
        this.right = null;
    }
    
    public int getIsbn(){
        return isbn;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public boolean isBorrowed(){
        return borrowed;
    }
    
    public void setBorrowed(boolean borrowed){
        this.borrowed = borrowed;
    }
    
    @Override
    public String toString(){
        return "ISBN: "+ isbn +"\nTitle: "+ title +"\nAuthor: "+ author +"\nBorrowed: "+ borrowed ;
    }
}
