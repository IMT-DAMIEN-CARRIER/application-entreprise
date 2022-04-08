package tp2.injection;

import tp2.JoueurGolf;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.http.WebSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;

import javax.enterprise.event.Event;
import javax.enterprise.event.NotificationOptions;
import javax.enterprise.util.TypeLiteral;

public class EventImp<T> implements Event<T> {
    private static class Listener {
        Object instance;
        Method method;
    }

    private static List<Listener> listeners = new ArrayList<>();

    public static void register(Object instance, Method method) {
       Listener listener = new Listener();
       listener.method = method;
       listener.instance = instance;
       listeners.add(listener);
    }

    @Override
    public void fire(T event) {
       for (Listener listener : listeners) {
           try {
               listener.method.invoke(listener.instance, event);
           } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
               e.printStackTrace();
           }
       }
    }

    @Override
    public <U extends T> CompletionStage<U> fireAsync(U event) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <U extends T> CompletionStage<U> fireAsync(U event, NotificationOptions options) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Event<T> select(Annotation... qualifiers) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <U extends T> Event<U> select(Class<U> subtype, Annotation... qualifiers) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <U extends T> Event<U> select(TypeLiteral<U> subtype, Annotation... qualifiers) {
        // TODO Auto-generated method stub
        return null;
    }

}