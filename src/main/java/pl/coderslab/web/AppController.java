package pl.coderslab.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Category;
import pl.coderslab.entity.Meal;
import pl.coderslab.entity.Product;
import pl.coderslab.entity.ProductMeal;
import pl.coderslab.repositories.CategoryRepository;
import pl.coderslab.repositories.MealRepository;
import pl.coderslab.repositories.ProductMealRepository;
import pl.coderslab.repositories.ProductRepository;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
@SessionAttributes("actMeal")
public class AppController {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    MealRepository mealRepository;
    @Autowired
    ProductMealRepository productMealRepository;


    @ModelAttribute("categories")
    public Collection<Category> categories(){
        List<Category> categories = categoryRepository.findAll();
        return categories;
    }

//    @ModelAttribute("actProductMeal")
//    public ProductMeal actProduct(){
//        ProductMeal actProduct = new ProductMeal();
//        return actProduct;
//    }

    @ModelAttribute("actProductsList")
    public Collection<ProductMeal> actProducts(){
        List<ProductMeal> actProductsList = new ArrayList<>();
        return actProductsList;
    }

    @RequestMapping("/")
    public String start(){
        return "start";
    }

    @GetMapping("/products")
    public String ProductsList(Model model){
        List<Product> list = productRepository.findAll();
        model.addAttribute("list", list);
        return "productsList";
    }

    @GetMapping("/categorieslist")
    public String categorieslist(){
        return "categoriesList";
    }

    @RequestMapping(value = "/addproduct", method = RequestMethod.GET)
    public String addProduct(Model model){
        model.addAttribute("product", new Product());
        return "addProduct";
    }

    @RequestMapping(value = "/addproduct", method = RequestMethod.POST)
    public String addedProduct(@ModelAttribute Product product, Model model){

        productRepository.save(product);
        model.addAttribute("product", product);
        System.out.println(product);
        return "addedProduct";

    }

    @RequestMapping("/search")
    public String chooseCategories(Model model){
        List<Category> catlist = categoryRepository.findAll();
        model.addAttribute("catlist", catlist);
        return "searchProducts";
    }

    @RequestMapping("/choosen")
    public String productsFromCategories(@ModelAttribute Category choosen, Model model){
        List<Product> pList = productRepository.findAllByCategories(choosen);
        model.addAttribute("list", pList);
        return "productsList";
    }

    @RequestMapping("/query")
    public String productsByQuery(@ModelAttribute String squery, Model model){
        List<Product> qList = productRepository.findProductsByNameIsLike(squery);
        model.addAttribute("List", qList);
        return "productsList";
    }
    @RequestMapping(value = "/addmeal", method = RequestMethod.GET)
    public String addMeal(Model model){
        Meal actMeal = new Meal();
        actMeal.setDate( new Timestamp(System.currentTimeMillis()));
        model.addAttribute("actMeal", actMeal);
        return "addMeal";
    }

    @RequestMapping(value = "/addmeal", method = RequestMethod.POST)
    public String added(@ModelAttribute Meal actMeal, Model model){
        actMeal.setDate( new Timestamp(System.currentTimeMillis()));
        model.addAttribute("actMeal", actMeal);
        return "addMeal";
    }

    @RequestMapping("/addtomeallist")
    public String addPMToMeal(@ModelAttribute ProductMeal actProductMeal, @RequestParam Product product,
                              @ModelAttribute Meal actMeal, @ModelAttribute List<ProductMeal> actProductsList,
                              Model model){
        actProductMeal.setMeal_id(actMeal.getId());
        actProductMeal.setProduct(product);
        actProductsList.add(actProductMeal);
        model.addAttribute("actProductMeal", actProductMeal);
        return "productList";
    }

    @RequestMapping("/mealshistory")
    public String mealslist(Model model){
        model.addAttribute("mealshistory", mealRepository.findAll());
        return "mealshistory";
    }


}
