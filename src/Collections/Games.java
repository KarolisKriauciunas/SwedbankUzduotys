package Collections;

public class Games {
    private String name;
    private Genre genre;
    private Double price;
    private Integer copiesSold;

    public String getName() {
        return name;
    }

    public Games(String name, Genre genre, Double price, Integer copiesSold) {
        this.name = name;
        this.genre = genre;
        this.price = price;
        this.copiesSold = copiesSold;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "name= " + name + '\'' +
                ", genre= " + genre +
                ", price= " + price + "$" +
                ", copiesSold= " + copiesSold;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(Integer copiesSold) {
        this.copiesSold = copiesSold;
    }
}
