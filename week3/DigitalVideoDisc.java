package lab3;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public DigitalVideoDisc(String title) {
        this.setTitle(title);
    }

    public DigitalVideoDisc(String category, String title) {
        this(title);
        this.setCategory(category);
    }

    public DigitalVideoDisc(String director, String category, String title) {
        this(category, title);
        this.setDirector(director);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this(director, category, title);
        this.setLength(length);
        this.setCost(cost);
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
