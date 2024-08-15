package Relationships;
public class Book {
    private String name;
    private Author[] authors;
    private double price;

    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
        }
    public String getAuthorNames(){
        StringBuilder s =new StringBuilder();
        for (int i=0; i < authors.length-1; i++) {
            s.append(authors[i].getName());
            s.append(", ");
        }
        s.append(authors[authors.length-1].getName());
        return s.toString();
    }
    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price=price;
    }

    public double getPrice() {
        return price;
    }
}
