package demo.com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.com.example.demo.entity.Product;
import demo.com.example.demo.service.ProductService;

@RestController
@Controller
@RequestMapping("/api/v1")
public class ProductController {
    
    @Autowired
    private ProductService serviceProduct;

    @GetMapping("/halo")
    public String sayHalo(){
        return "hei kamu bisa.";
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return serviceProduct.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return serviceProduct.saveProducts(products);
    }

    @GetMapping(value = "/produtcs")
    public List<Product> findAllProducts(){
        return serviceProduct.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable int id){
        return serviceProduct.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String nama){
        return serviceProduct.getProductByName(nama);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return serviceProduct.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return serviceProduct.deleteProduct(id);
    }
}
