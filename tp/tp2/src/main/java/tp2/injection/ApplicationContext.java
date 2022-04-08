package tp2.injection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class ApplicationContext {
    private static HashMap<Class<?>, Class<?>> classes = new HashMap<>();

    static public <T, U extends T> void register(final Class<T> interface_, final Class<U> concrete) {
        classes.put(interface_, concrete);
    }

    static public <T> T getBean(final Class<T> typeConcret) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
    {
        T objet = typeConcret.getDeclaredConstructor().newInstance();

        for(Field field: typeConcret.getDeclaredFields()) {
            if(classes.get(field.getType()) != null) {
                Object valeurAttribut = classes.get(field.getType()).getDeclaredConstructor().newInstance();
                field.setAccessible(true);
                field.set(objet, valeurAttribut);
            }
        }

        return objet;
    }

}