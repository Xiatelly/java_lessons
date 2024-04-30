import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        List<Product> products = new ArrayList<>();
        products.add(new Product("Coffee", 45, true, LocalDate.of(2023, 9, 15)));
        products.add(new Product("Book", 5, false, LocalDate.of(2024, 2, 3)));
        products.add(new Product("Book", 65, false, LocalDate.of(2024, 2, 1)));
        products.add(new Product("Book", 44, false, LocalDate.of(2024, 2, 1)));
        products.add(new Product("Book", 250, true, LocalDate.of(2022, 1, 19)));
        products.add(new Product("Book", 300, true, LocalDate.of(2023, 1, 10)));
        products.add(new Product("Window", 115, false, LocalDate.of(2024, 3, 1)));
        products.add(new Product("NoteBook", 855, false, LocalDate.of(2024, 2, 2)));
        products.add(new Product("Tea", 15, false, LocalDate.of(2024, 1, 15)));
        products.add(new Product("Knife", 25, true, LocalDate.of(2024, 1, 25)));
        products.add(new Product("Rise", 2, true, LocalDate.of(2024, 2, 29)));
        products.add(new Product("Table", 95, true, LocalDate.of(2024, 2, 25)));
        products.add(new Product("Book", 1145, true, LocalDate.of(2024, 3, 3)));

        List<ProductWithId> productWithIds = new ArrayList<>();
        productWithIds.add(new ProductWithId(1, "Book", 56, true, LocalDate.of(2024, 1, 14)));
        productWithIds.add(new ProductWithId(2, "Flower", 78, true, LocalDate.of(2024, 2, 29)));
        productWithIds.add(new ProductWithId(3, "Book", 87, true, LocalDate.of(2024, 2, 21)));
        productWithIds.add(new ProductWithId(4, "Flower", 75, true, LocalDate.of(2024, 3, 1)));
        productWithIds.add(new ProductWithId(5, "Toy", 14, true, LocalDate.of(2024, 3, 2)));

        main.printBooks(products, 250);
        System.out.println();

        main.printBooksDiscounted(products, 10.0f);
        System.out.println();

        main.printCheapestProduct(products, "Book");
        System.out.println();

        main.printCheapestProduct(products, "Flower");
        System.out.println();

        main.printLastThreeAddedProduct(products);
        System.out.println();

        main.printCurrentYearBooks(products,"Book", 2024, 75);
        System.out.println();

        Map<String, List<ProductWithId>> result = main.convertProductsToMap(productWithIds);
        result.forEach((type, productsList) -> {
            System.out.println(type);
            System.out.println();
            for (ProductWithId product : productsList)
                System.out.printf(
                        "ID: %d, Type: %s, price: %d, discount: %s, create date: %s%n",
                        product.getId(),
                        product.getType(),
                        product.getPrice(),
                        product.getDiscount(),
                        product.getDate().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        });
    }

    private void printBooks(List<Product> products, final int priceOver){
        products.stream()
                .filter(product -> {
                    return product.getType().equals("Book");
                })
                .filter(product -> {
                    return product.getPrice() >= priceOver;
                })
                .forEach(product -> System.out.printf(
                        "Type: %s, price: %d%n",
                        product.getType(),
                        product.getPrice()));
    }

    private void printBooksDiscounted(List<Product> products, final float discount){
        products.stream()
                .filter(product -> {
                    return product.getType().equals("Book");
                })
                .filter(Product::getDiscount)
                .forEach(product -> System.out.printf("Type: %s, price with discount: %.1f%n",
                        product.getType(),
                        product.getPrice() * (1.0f - discount / 100.0f)));
    }

    private void printCheapestProduct(List<Product> products, String type){
        Optional<Product> first = products.stream()
                .filter(product -> product.getType().equals(type))
                .sorted((o1, o2) -> Integer.compare(o2.getPrice(), o1.getPrice()))
                .findFirst();
        if (first.isPresent())
            System.out.printf("Type: %s, Cheapest price: %d%n",
                    first.get().getType(), first.get().getPrice());
        else
            System.out.printf("Current type not exist: %s%n", type);
    }

    private void printLastThreeAddedProduct(List<Product> products){
        products.stream()
                .sorted((o1, o2) -> o2.getDate().compareTo(o1.getDate()))
                .limit(3)
                .forEach(product -> System.out.printf(
                        "Type: %s, Price: %d, Date: %s%n",
                        product.getType(),
                        product.getPrice(),
                        product.getDate().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))));
    }

    private void printCurrentYearBooks(List<Product> products, String type, int year, int priseLess) {
        int result = products.stream()
                .filter(product -> {
                    return product.getType().equals(type);
                })
                .filter(product -> {
                    return product.getDate().getYear() == year;
                })
                .filter(product -> {
                    return product.getPrice() <= priseLess;
                })
                .mapToInt(Product::getPrice)
                .sum();
        System.out.printf(
                "Type: %s, Price less than: %d, Year: %d, total price: %d%n",
                type,
                priseLess,
                year,
                result);
    }

    private Map<String, List<ProductWithId>> convertProductsToMap(List<ProductWithId> productWithIds){
        return productWithIds.stream()
                .collect(Collectors.groupingBy(productWithId -> productWithId.getType()));
    }
}