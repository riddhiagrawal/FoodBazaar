import java.util.*;

public class Checkout {

    ShoppingCart checkout;


    Checkout(ShoppingCart currentCart){
        this.checkout = currentCart;
    }

    double getTotal(){
        Double total = 0.00;
        for(Item item:checkout.getItems()){
            total = total + item.getAmount();
        }
        return total;
    }


    void printReciept(){
        System.out.println("Customer Name: " + checkout.getCustomer());
        System.out.println("----------------------------");
        System.out.println("Item  |  Quantity  |  Amount");
        System.out.println("----------------------------");
        for(Item item:checkout.getItems()){
            System.out.println(item.name+"  |  "+item.quantity+"  |  "+item.getAmount());
        }
        System.out.println("-----------------------------");
        System.out.println("Total: " + getTotal());
    }
}
