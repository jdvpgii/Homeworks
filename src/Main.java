import GenericsInCollectionsAndMethods.MagicBox;

public class Main {
    public static void main(String[] args) {
        MagicBox<Object> magicBox1 = new MagicBox<>(347);

        magicBox1.add(magicBox1);

        magicBox1.pick();
    }
}
