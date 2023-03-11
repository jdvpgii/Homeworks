package genericsInvollectionssndmethods;

import java.util.Random;

public class MagicBox<T> {
    private Random random = new Random();
    private T[] item;

    public MagicBox(int howManyObjects) {
        this.item = (T[]) new Object[howManyObjects];
    }

    public Random getRandom() {
        return random;
    }

    public T[] getItem() {
        return item;
    }

    public boolean add(T items) {
        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) {
                item[i] = items;
                return true;
            }
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
