class product{
    private String name;
    private double price;
    private int quantity;
}

public product(String name){
    this.name =name;
    this.price=0.0;
    this.quantity=0;
}

public product(String name, double price, int quantity){
    this.name=name;
    this.price=price;
    this.quantity=quantity;
}

public void displayProductDetails(){
    System.out.println("product name:"+this.name);
    System.out.println("product price:"+this.price);
    System.out.println("product quantity:"+this.quantity);
}

public class productTest {
    public static void
}
