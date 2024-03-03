import java.time.LocalDate;

public class ProductWithId {

    private int id;
    private String type;
    private int price;
    private boolean discount;
    private LocalDate date;

    public ProductWithId(
            int id,
            String type,
            int price,
            boolean discount,
            LocalDate date){
        this.id = id;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.date = date;
    }

    public int getId() {
        return id;
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
