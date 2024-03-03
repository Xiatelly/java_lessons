import java.time.LocalDate;

public class Product {
    private String type;
    private int price;
    private boolean discount;

    private LocalDate date;

    public Product(
            String type,
            int price,
            boolean discount,
            LocalDate date){
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public int getPrice(){
        return price;
    }

    public boolean getDiscount(){
        return discount;
    }

    public LocalDate getDate() {
        return date;
    }
}
