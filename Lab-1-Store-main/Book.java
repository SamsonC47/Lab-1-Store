public class Book extends ReadingItem{
    private String ISBN;
    private String edition;
    private String title;

    public Book(String name, String location, int price, String description, int wordCount, String datePublished, String author, String ISBN, String edition, String title){
        super(name, location, price, description, wordCount, datePublished, author);

        this.ISBN = ISBN;
        this.edition = edition;
        this.title = title;
    }

    public String getISBN(){
        return ISBN;
    }
    public String getEdition(){
        return edition;
    }
    public String getTitle(){
        return title;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public void setEdition(String edition){
        this.edition = edition;
    }
    public void setTitle(String title){
        this.title = title;
    }
    @Override
    public String toString() {
        return "Book{" + super.toString() + ", ISBN='" + ISBN +
                "', edition='" + edition + "', title='" + title + "'}";
    }
}
