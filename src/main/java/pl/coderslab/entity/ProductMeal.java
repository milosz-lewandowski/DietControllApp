package pl.coderslab.entity;

import javax.persistence.*;

@Entity
@Table(name = "product_meal")
public class ProductMeal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    private Product product;
    private int meal_id;
    private int weight;


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductMeal() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMeal_id() {
        return meal_id;
    }

    public void setMeal_id(int meal_id) {
        this.meal_id = meal_id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ProductMeal{" +
                "id=" + id +
//                ", product=" + product.getId() +
                ", meal_id=" + meal_id +
                ", weight=" + weight +
                '}';
    }
}
