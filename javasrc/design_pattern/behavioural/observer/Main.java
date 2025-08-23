package observer;

class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Shubham");
        Product p = new Product("Micorosoft Surface II");
        p.attach(c1);
        p.releaseStock();
        p.getStock();
    }
}