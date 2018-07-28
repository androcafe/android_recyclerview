package androcafe.com.myrecyclerviewapplication;

public class Item {
    String quotes,writers;
    int image;

    public Item(String quotes, String writers, int image) {
        this.quotes = quotes;
        this.writers = writers;
        this.image=image;
    }

    public String getQuotes() {
        return quotes;
    }

    public void setQuotes(String quotes) {
        this.quotes = quotes;
    }

    public String getWriters() {
        return writers;
    }

    public void setWriters(String writers) {
        this.writers = writers;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
