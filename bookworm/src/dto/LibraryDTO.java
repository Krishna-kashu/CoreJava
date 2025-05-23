package dto;

public class LibraryDTO {

    private String name;
    private String bookID ;
    private String authorName ;
    private String publishedYear;
    private String cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "LibraryDTO{" +
                "name='" + name + '\'' +
                ", bookID='" + bookID + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publishedYear='" + publishedYear + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }
}
