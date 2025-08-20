package observer;

import observer.Observer;

class Customer implements Observer {
    private String name;

    Customer(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println("Hi " + this.name + ", " + message);
    }

    public String getName() {
        return this.name;
    }
}