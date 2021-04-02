package demo.com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import demo.com.example.demo.entity.Product;

@Repository
@Controller
@Service
public interface ProductRepository extends JpaRepository<Product,Integer>{

    Product findByName(String product_nama);

}