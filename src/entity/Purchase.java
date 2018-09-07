package entity;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author pupil
 */
public class Purchase {
    private Long id;
    private Product product;
    private Customer customer;
    private Date transactionDate;
    private Integer quantity;

    public Purchase() {
    }

    public Purchase(Long id, Product product, Customer customer, Date transactionDate, Integer quantity) {
        this.id = id;
        this.product = product;
        this.customer = customer;
        this.transactionDate = transactionDate;
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
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

    public Date getDate() {
        return transactionDate;
    }

    public void setDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.product);
        hash = 53 * hash + Objects.hashCode(this.customer);
        hash = 53 * hash + Objects.hashCode(this.transactionDate);
        hash = 53 * hash + Objects.hashCode(this.quantity);
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
        if (!Objects.equals(this.transactionDate, other.transactionDate)) {
            return false;
        }
        if (!Objects.equals(this.quantity, other.quantity)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ПОКУПКА №:" + " " + id + "." + product.toString() + ".Покупатель - " + customer.getName() + customer.getSurname() +", date=" + transactionDate.toString() + ",в количестве" + quantity + '}';
    }

   
    
}
