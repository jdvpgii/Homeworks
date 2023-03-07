import GenericsInCollectionsAndMethods.MagicBox;

public class Main {
    public static void main(String[] args) {
        MagicBox<Object> magicBox1 = new MagicBox<>(111);

        String text = new String("some tetx");

//        magicBox1.add(33);
//        for (int i = 0; i < 11; i++) {
//            magicBox1.add(text);
//        }
        magicBox1.pick();
    }
}
