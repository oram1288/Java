public class TextBook {
    private String title;
    private String author;
    private String publisher;

    public TextBook(String title, String author, String publisher)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    public TextBook(TextBook tb)
    {
        this.title = tb.title;
        this.author = tb.author;
        this.publisher = tb.publisher;

    }
    public void set(String title, String author, String publisher)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    public String toString()
    {
        return(this.title + "(Written by:" + this.author+", published by:"+this.publisher+")");
    }

    
}
