package hw1;

public class GenHw1<T> {

    private T obj;


    public GenHw1(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}

