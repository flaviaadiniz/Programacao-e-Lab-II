package src.main.java.semanas9e10;

public class Box<T> {

    T object;

    public void add(T o) {
        object = o;
    }

    public T get() {
        return object;
    }

}
