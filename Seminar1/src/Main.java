import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        OnlineShop onlineShop = new OnlineShop("Emag", "logo.jpg", new ArrayList<Product>());

        Product p1 = new Product("Laptop", 3200.5, 1,1, 1123, "");
        Product p2 = new Product("Frigider", 207.95, 1,2, 1245, "");

        Product p3 = new Product(p1);

        p3.setQuantity(5);
        p3.setName("Paine");

//        o.modifyProductsList(1,p1);
        onlineShop.addProduct(p1);
//        o.modifyProductsList(1,p2);
        onlineShop.addProduct(p2);

//        o.modifyProductsList(2, p1);
        onlineShop.removeProduct(p2);
        System.out.println(p1.isEqual(p2));
    }
}

class OnlineShop {
    private String name;
    private String image;
    private ArrayList<Product> productList;

    OnlineShop(String name, String image, ArrayList<Product> productList)
    {
        this.productList = new ArrayList<Product>();
        this.image = image;
        this.name = name;
    }

//    public void modifyProductsList(int what, Prod p)
//    {
//        if(what == 1)
//        {
//            this.products.add(p);
//        }
//        else
//            this.products.remove(p);
//    }

    public void addProduct(Product product){
        this.productList.add(product);
    }
    public void removeProduct(Product product){
        this.productList.remove(product);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

class Product
{
    private int id;
    private String name;
    private double price;
    private int type;
    private int category;
    private int quantity;
    private String expiryDate; //expiry date - only for goods
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(String name, double price, int type, int category, int id, String expiryDate)
    {
        this.name = name;
        this.price = price;
        this.type = type;
        this.category = category;
        this.id = id;
        this.expiryDate = expiryDate;
    }

    public Product(Product product)
    {
        this.name = product.name;
        this.price = product.price;
        this.type = product.type;
        this.category = product.category;
        this.id = product.id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isEqual(Product p)
    {
        if(p.id != this.id)
            return false;
        if(!p.name.equals(this.name))
            return false;
        if(p.price != this.price)
            return false;
        if(p.type != this.type)
            return false;
        if(p.category != this.category)
            return false;

        return true;
    }

    //    public void modify(boolean flag, double val)
//    {
//        if(flag)
//            this.productPrice+=this.productPrice*val;
//        if(!flag)
//            this.productPrice-=this.productPrice*val/100;
//    }
    public void increasePrice(double val) {
        this.price += this.price * val;
    }
    public void decreasePrice(double val) {
        this.price -= this.price * val/100;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

class User
{
    private String username;
    private String id;
    private ArrayList<Order> orderList;
//    private ArrayList<Order> c;-- lista nu este utilizata

    public User(String username, String id)
    {
        this.username = username;
        this.id = id;
        orderList =new ArrayList<Order>();
//        c=new ArrayList<Order>();
    }

    public void addOrder(Order order)
    {
        this.orderList.add(order);
    }

//    public void addO2(Order o)
//    {
//        this.c.add(o);
//    } -- lista nu este utilizata
}

class Order
{
    private ArrayList<Product> productList;
    private String address;

    public Order()
    {
        productList = new ArrayList<Product>();
    }
    public void addProduct(Product product)
    {
        if(productList.size() > 99)
            return;

        productList.add(product);
    }

    public void remove(Product product)
    {
        productList.remove(product);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Inventory
{
    private Product product;
    private int quantity;

    public Inventory(Product product, int quantity)
    {
        this.product = new Product(product);
        this.quantity = quantity;
    }
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}



