public class Product {
    private String ProductId;
    private int Price;
    private int Place;
    public Product(String ProductId, int Price, int Place){
        this.ProductId = ProductId;
        this.Price = Price;
        this.Place = Place;
    }
    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        this.ProductId = productId;
    }

    public int getPlace() {
        return Place;
    }

    public void setPlace(int place) {
        this.Place = place;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        this.Price = price;
    }

}
