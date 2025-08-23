package observer;

import java.util.List;
import java.util.ArrayList;

class Product implements Subject {
    private String name;
    private List<Observer> customers;
    private int stockAvailable;

    Product(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
        this.stockAvailable = 1;
    }

    public void attach(Observer customer) {
        customers.add(customer);
    }

    public void detach(Observer customer) {
        customers.remove(customer);
    }

    public void notifyObservers() {
        for(Observer customer : customers) {
            customer.update(this.name + " is availabe");
        }
    }

    public void getStock() {
        int previousStock = stockAvailable;
        stockAvailable += 1;

        // Freshly available stocks
        if(previousStock == 0 && stockAvailable == 1) {
            this.notifyObservers();
        }
    }

    public void releaseStock() {
        if(this.stockAvailable == 0) return;
        this.stockAvailable -= 1;
    }
}