package observer;

import observer.Observer;

interface Subject {
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notifyObservers();
}