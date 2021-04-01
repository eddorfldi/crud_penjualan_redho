package demo.com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product")
public class Product{

    @Id
    @GeneratedValue
    private int product_id;
    private String product_nama;
    private int product_stok;
    private int product_harga;

    public String getProduct_nama() {
        return product_nama;
    }
    public void setProduct_nama(String product_nama) {
        this.product_nama = product_nama;
    }

    public int getProduct_harga() {
        return product_harga;
    }
    public void setProduct_harga(int product_harga) {
        this.product_harga = product_harga;
    }

    public int getProduct_stok() {
        return product_stok;
    }
    public void setProduct_stok(int product_stok) {
        this.product_stok = product_stok;
    }

    public Integer getProduct_Id() {
        return product_id;
    }

    

} 