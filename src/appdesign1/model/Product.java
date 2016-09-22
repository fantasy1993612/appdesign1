package appdesign1.model;

import java.math.BigDecimal;

/**
 * Created by fantasy on 2016/9/22 0022.
 * A Product instance is a JavaBean that encapsulates product information
 */
public class Product {
    private String price;
    private String name;
    private BigDecimal description;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getDescription() {
        return description;
    }

    public void setDescription(BigDecimal description) {
        this.description = description;
    }
}
