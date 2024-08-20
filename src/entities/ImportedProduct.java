package entities;

import java.text.SimpleDateFormat;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String nome, Double price, Double customsFee) {
        super(nome, price);
        this.customsFee = customsFee;
    }

    public double totalPrice() {
        return price * customsFee;

    }
    @Override
    public String priceTag(){
        this.price += customsFee;
        return super.priceTag() + " (Customs Fee: $ " + customsFee + ")";


    }
}