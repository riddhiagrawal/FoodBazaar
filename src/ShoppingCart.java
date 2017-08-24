import java.util.*;

public class ShoppingCart {

    List<Item> cart=new ArrayList<Item>();
    String customer;
    ShoppingCart(String name){
        customer = name;
    }

    void add(Item item){
        cart.add(item);
    }

    List<Item> getItems(){
        return cart;
    }

    String getCustomer(){
        return customer;
    }

}
