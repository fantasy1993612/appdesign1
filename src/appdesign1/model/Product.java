package appdesign1.model;


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by fantasy on 2016/9/22 0022.
 * A Product instance is a JavaBean that encapsulates product information
 */
public class Product implements Serializable{
    /*product price*/
    private BigDecimal price;
    /*product name*/
    private String name;
    /*product description*/
    private  String description;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
