package hw1;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T extends Fruit> {
    private List<T> container;

    public FruitBox() {

        this.container = new ArrayList<>();
    }

    public float getWeight() {
        float z = 0.0f;
        for (T fruit : container) {
            z += fruit.getWeight();
        }
        return z;
    }

    public boolean compare(FruitBox<?>another){

        return Math.abs(this.getWeight()-another.getWeight())<0.001;
    }
    public void moveFruit(FruitBox<T> another){
        if(another==this){
            return;
        }
        another.container.addAll(this.container);
        this.container.clear();
    }
public void add(T fruit){
   container.add(fruit);
}
}









