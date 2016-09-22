package appdesign1.form;

/**
 * Created by fantasy on 2016/9/22 0022.
 * A form class is mapped to a html form
 */
public class ProductForm {
    /*product name*/
    private String name;
    /*product price*/
    private String price;
    /*product description*/
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
