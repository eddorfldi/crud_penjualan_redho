package demo.com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import demo.com.example.demo.repository.ProductRepository;
import demo.com.example.demo.entity.Product;

@Service
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
    public Product getProductById(int product_id){
        return repository.findById(product_id).orElse(null);
    }
    public Product getProductByName(String product_nama){
        return repository.findByName(product_nama); 
    }

    public String deleteProduct(int product_id){
        repository.deleteById(product_id);
        return "product "+product_id+" have been remove!";
    }

    public Product updateProduct(Product product){
        Product existingProduct=repository.findById(product.getProduct_Id()).orElse(null);
        existingProduct.setProduct_nama(product.getProduct_nama());
        existingProduct.setProduct_stok(product.getProduct_stok());
        existingProduct.setProduct_harga(product.getProduct_harga());
        return repository.save(existingProduct);
    }
}
