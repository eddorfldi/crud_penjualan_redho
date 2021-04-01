package demo.com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.com.example.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

    Product findByName(String product_nama);

}