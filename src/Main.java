import genericsInvollectionssndmethods.MagicBox;

public class Main {
    public static void main(String[] args) {
        MagicBox<Object> magicBox1 = new MagicBox<>(347);

        for (int i = 0; i < 340; i++) {
            magicBox1.add(magicBox1);
        }

        magicBox1.pick();
    }
}
