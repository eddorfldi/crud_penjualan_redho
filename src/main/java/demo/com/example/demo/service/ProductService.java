package demo.com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import demo.com.example.demo.repository.ProductRepository;
import demo.com.example.demo.entity.Product;

@Service
@Controller
@Repository
public class ProductService {
    @Autowired 
    private ProductRepository repository;
    
    public Product saveProduct(Product product){
        return repository.save(product);
    }
    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }
    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }
    public Product getProductByName(String nama){
        return repository.findByName(nama); 
    }

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "product "+id+" have been remove!";
    }

    public Product updateProduct(Product product){
        Product existingProduct=repository.findById(product.getProduct_Id()).orElse(null);
        existingProduct.setProduct_nama(product.getProduct_nama());
        existingProduct.setProduct_stok(product.getProduct_stok());
        existingProduct.setProduct_harga(product.getProduct_harga());
        return repository.save(existingProduct);
    }
}
