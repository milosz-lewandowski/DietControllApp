package pl.coderslab.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private List<Category> categories;
    private String name;
    @NotNull
    private String isCountable;
    private int fat;
    private int proteins;
    private int simpleCarbo;
    private int complexCarbo;
    private int dietaryFiber;
    private int kcal;

    public int getKcal() {
        this.kcal = fat * 9 + proteins * 4 + simpleCarbo * 4 + complexCarbo * 4 + dietaryFiber * 2;
        return kcal;
    }

    public Product() {
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsCountable() {
        return isCountable;
    }

    public void setIsCountable(String isCountable) {
        this.isCountable = isCountable;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }

    public int getSimpleCarbo() {
        return simpleCarbo;
    }

    public void setSimpleCarbo(int simpleCarbo) {
        this.simpleCarbo = simpleCarbo;
    }

    public int getComplexCarbo() {
        return complexCarbo;
    }

    public void setComplexCarbo(int complexCarbo) {
        this.complexCarbo = complexCarbo;
    }

    public int getDietaryFiber() {
        return dietaryFiber;
    }

    public void setDietaryFiber(int dietaryFiber) {
        this.dietaryFiber = dietaryFiber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", categories=" + categories +
                ", name='" + name + '\'' +
                ", isCountable='" + isCountable + '\'' +
                ", fat=" + fat +
                ", proteins=" + proteins +
                ", simpleCarbo=" + simpleCarbo +
                ", complexCarbo=" + complexCarbo +
                ", dietaryFiber=" + dietaryFiber +
                ", kcal=" + kcal +
                '}';
    }
}