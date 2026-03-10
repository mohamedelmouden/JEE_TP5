package entities;
// voila le package
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;

    public Product() {}
    // ajoutant les grtters et setters ici
// message personnelle::0637
    public int getId() {
        return id;
    }
    // message personnelle::0637
    public void setId(int id) {
        this.id = id;
    }
    // message personnelle::0637
    public String getName() {
        return name;
    }
    // message personnelle::0637
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    // message personnelle::0637
    public void setPrice(double price) {
        this.price = price;
    }
}