package observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String latestNews;
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String news) {
        for (Observer observer : observers){
            observer.update(news);
        }
    }
    public void publishNews (String news){
        latestNews = news;
        notifyObservers(news);
    }
}
