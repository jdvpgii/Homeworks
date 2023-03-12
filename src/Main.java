import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<String> listCart = new ArrayList<>();
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        while (true) {
            System.out.println("============================================\n" +
                    "Выберите операцию (введите \"end\" для выхода)\n" +
                    "1.Добавить\t2.Показать\t3.Удалить\t4.Найти\n" +
                    "============================================");
            String input = bufferedReader.readLine();

            switch (input) {
                case "1" -> addCart();
                case "2"  -> showCart();
                case "3" -> deleteFromCart();
                case "4"  -> findInCart();
                case "end"  -> System.exit(0);
            }
        }

    }
    private static void addCart() {
        try {
            System.out.println("Какую покупку хотите добавить?");
            listCart.add(bufferedReader.readLine());
            System.out.println("Итого в списке покупок: " + listCart.size() + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void showCart() {
        System.out.println("Список покупок:");
        for (String str : listCart) {
            System.out.print((listCart.indexOf(str)+1) + ". " + str + "\n");
        }
        System.out.println();
    }
    private  static void deleteFromCart() {
        try {
            System.out.println("Какую хотите удалить? Введите номер или название\n");
            String itemToDelete = bufferedReader.readLine();
            listCart.remove(listCart.indexOf(itemToDelete));
            System.out.println("Покупка "+ itemToDelete +" удалена, список покупок:");
            showCart();
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        } catch (NumberFormatException nfe) {
            System.out.println("Все хуйня, Миш, давай по новой");
        }
    }
    /*
    4.Find
    операцию поиска покупок по ключевым словам.
    При этом не должен учитываться регистр букв
    (т.е. без разницы большая или маленькая)
     */
    private static void findInCart() {
        System.out.println("Введите текст для поиска:\n");
    }
}
