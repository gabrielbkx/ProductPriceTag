package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        List<Product> list = new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Product " + "#" + (n + 1) + "data:");
            System.out.print("Common, used or imported (c/u/i)?");
            char e = sc.next().charAt(0);

            if (e == 'i'){
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                double customs = sc.nextDouble();
                Product p = new ImportedProduct(name,price,customs);
                list.add(p);
            } else if (e == 'c') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                Product p = new Product(name,price);
                list.add(p);
            }else{
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY):");
                Date date = sdf.parse(sc.next());
                Product p = new UsedProduct(name,price,date);
                list.add(p);
            }
        }
        for (Product p : list){
            System.out.print(p.priceTag());
        }


        sc.close();
    }
}
