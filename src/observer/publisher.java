package observer;
import java.util.ArrayList;
import java.util.List;

import creational.LibraryItemFactory;
import library.User;

public abstract class publisher {
    private List <User> subscribers = new ArrayList<>();
   // private String mainState;

    public void subscribe(User a){
        subscribers.add(a);
    }

    public void unsubscribe(User b){
        subscribers.remove(b);
    }

    public void notifySubscribers(LibraryItemFactory c){
        for (User user : subscribers){
            user.update(c);
        }
    }

    public void businessLogic(LibraryItemFactory d){
        if(!d.isBorrowed()){
            notifySubscribers(d);
        }
    }
}
