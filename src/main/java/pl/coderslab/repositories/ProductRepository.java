package pl.coderslab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.entity.Category;
import pl.coderslab.entity.Product;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository <Product, Integer> {
    public List<Product> findAllByCategories(Category category);
    public List<Product> findProductsByNameIsLike(String string);
}
