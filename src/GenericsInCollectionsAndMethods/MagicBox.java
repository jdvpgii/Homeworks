package GenericsInCollectionsAndMethods;

import java.util.Random;

public class MagicBox<T> {
    Random random = new Random();
    T[] item;
    public MagicBox(int howManyObjects) {
        item = (T[]) new Object[howManyObjects];
    }

    public boolean add(T items) {
        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) {
                item[i] = items;
            }
            return true;
        }
        return false;
    }

    public T pick() {
        int randomRange = random.nextInt(item.length);
        T obj = item[randomRange];
        int nullCounter = 0;

        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) {
                nullCounter++;
            }
        }

        if (nullCounter != 0) {
            throw new RuntimeException("Коробка не полная, осталось заполнить еще " + nullCounter + " ячеек");
        } else {
            return obj;
        }
    }
}
