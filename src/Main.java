import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Passport passport11 = new Passport(20, "Dubai", "Female");
        Passport passport1=new Passport(18, "Japan", "Male");



        Bank bank = new Bank("AdelZh", 12345, 1000000);
        Bank bank1=new Bank("AzizZh", 5678, 20000);


        Product product11 = new Product("Coca Cola", "Beverage", 234, 100, 2023, "No");
        Product product12 = new Product("Fanta", "Beverage", 89, 890, 2023, "Yes");
        Product product13=new Product("Pepsi", "Beverage", 89, 456, 2022, "No");
        Product product14=new Product("KFC", "Beverage", 77, 5, 2022, "Yes");
        Product product15=new Product("Mac", "Beverage", 90, 67, 2023, "No");

        Product [] products={product11, product12};
        Product [] products1={product13, product14};

        Customer customer=new Customer("Elina", products, bank, passport11);
       Customer customer1=new Customer("Alina", products1, bank1, passport1);


        System.out.println(Arrays.toString( customer.addProduct(product15)));




        customer.getCustomerOfMyProducts("Elina");
        System.out.println("-----------------------------");

        System.out.println("I removed Fanta, so there's left only Coca Cola");
        customer.deleteProductByName("Fanta", "Fanta");
        System.out.println("------------------------------------------");

        System.out.println("I removed Pepsi, so left only KFC");
        customer1.deleteProductByName("Pepsi", "Pepsi");
        System.out.println("--------------------------------------------");





        product11.checkPoint(products1);
        product11.checkPoint(products);
        System.out.println("--------------------------------------");

        System.out.println(product11.checkPoint2(products));
        System.out.println(product11.checkPoint2(products1));
        System.out.println("--------------------------------------");



        System.out.println(customer1.getAge2("Alina"));
        System.out.println("-------------------------------");


        System.out.println("The age of my customers buying products like Coca Cola and Fanta is");
        System.out.println(customer.getAge222(products));
        System.out.println("The age of customers buying products like Pepsi and KFC is");

        System.out.println(customer1.getAge222(products1));

        System.out.println("------------------------------");









    }
}