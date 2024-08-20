package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    public  static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String nome, Double price, Date manufactureDate) {
        super(nome, price);
        this.manufactureDate = manufactureDate;
    }
    @Override
    public String priceTag(){
        return name + " (Used) $ " + String.format("%.2f",price) + " (Manufacture date: " + sdf.format(manufactureDate)
                + ")";
    }
}
