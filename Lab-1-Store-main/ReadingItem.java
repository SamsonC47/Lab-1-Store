public class ReadingItem extends CISItem{
    private int wordCount;
    private String datePublished;
    private String author;

    public ReadingItem(String name, String location, int price, String description, int wordCount, String datePublished, String author){
        super(name, location, price, description);

        this.wordCount = wordCount;
        this.datePublished = datePublished;
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }
    public String getDatePublished(){
        return datePublished;
    }
    public int getWordCount(){
        return wordCount;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public void setDatePublished(String datePublished){
        this.datePublished = datePublished;
    }
    public void setWordCount(int wordCount){
        this.wordCount = wordCount;
    }

    @Override
    public String toString() {
        return super.toString() + ", wordCount=" + wordCount +
                ", datePublished='" + datePublished + "', author='" + author + "'";
    }
}
