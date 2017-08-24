public class Item {
    Double quantity;
    String name;
    Double ratePerKG;

    Item(String itemName,Double rate, Double toBuy){
            this.name = itemName;
            this.ratePerKG = rate;
            this.quantity = toBuy;
    }

    double getAmount(){
        return quantity * ratePerKG;
    }
}
