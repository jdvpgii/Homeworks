import java.io.File;
import java.util.Map;

public class Basket {
    //конструктор, принимающий массив цен и названий продуктов;
    public Basket(Map<String, Integer> map) {
    }

    //TODO DELETE AFTER SOLUTION
    public Basket() {
    }

    //метод добавления amount штук продукта номер productNum в корзину;
    void addToCart(int productNum, int amount){

    }

    //метод вывода на экран покупательской корзины
    void printCart() {

    }

    //метод сохранения корзины в текстовый файл; использовать встроенные сериализаторы нельзя;
    void saveTxt() {

    }

    //статический(!) метод восстановления объекта корзины из текстового файла, в который ранее была она сохранена;
    static Basket loadFromTxtFile(File textFile) {
        return new Basket();
    }

    //для сохранения в файл в бинарном формате.
    void saveBin(File file) {

    }
    // для загрузки корзины из бинарного файла.
    static Basket loadFromBinFile(File file) {
        return new Basket();
    }

}
