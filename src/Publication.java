public class Publication {
    private String title;
    private String publisher;
    private int year;
    private String ident;
    private double price;
    private int quantity;

    public Publication(String title, String publisher, int year, String ident, double price, int quantity) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.ident = ident;
        this.price = price;
        this.quantity = quantity;
    }

    public void buyNCopies(int quantity) {
        this.quantity += quantity;
        System.out.println("Current quantity: " + this.quantity);
    }

    public boolean sellNCopies(int quantity) {
        if(quantity > this.quantity){
            System.out.printf("Can't buy this amount, we have only %d items",quantity);
            return false;
        }
        this.quantity -= quantity;
        System.out.println("Sold " + quantity + " copies.");
        System.out.println("Price: " + quantity * price);
        System.out.println("Remaining supply: " + this.quantity);
        return true;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", ident='" + ident + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
