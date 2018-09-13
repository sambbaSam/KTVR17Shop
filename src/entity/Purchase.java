package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author pupil
 */
public class Purchase implements Serializable{
    private Long id;
    private Product product;
    private Customer customer;
    private Date saleProduct;
    private Integer quantity;

    public Purchase() {
    }

    public Purchase(Long id, Product product, Customer customer, Date saleProduct, Integer quantity) {
        this.id = id;
        this.product = product;
        this.customer = customer;
        this.saleProduct = saleProduct;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getSaleProduct() {
        return saleProduct;
    }

    public void setSaleProduct(Date saleProduct) {
        this.saleProduct = saleProduct;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.product);
        hash = 97 * hash + Objects.hashCode(this.customer);
        hash = 97 * hash + Objects.hashCode(this.saleProduct);
        hash = 97 * hash + Objects.hashCode(this.quantity);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Purchase other = (Purchase) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        if (!Objects.equals(this.customer, other.customer)) {
            return false;
        }
        if (!Objects.equals(this.saleProduct, other.saleProduct)) {
            return false;
        }
        if (!Objects.equals(this.quantity, other.quantity)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
//        return "Purchase{" + "id=" + id + ", product=" + product + ", customer=" + customer + ", saleProduct=" + saleProduct + ", quantity=" + quantity + '}';
          return "ПОКУПКА №:" + id + ". " + product.toString() + " Покупатель - " + customer.getName() + customer.getSurname() +", date=" + saleProduct.toString() + ", купил в количестве " + quantity + " шт"+' ';
//    
    }
    
}
