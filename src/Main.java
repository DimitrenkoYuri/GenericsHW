public class Main {
    public static void main(String[] args) {
        MagicBox<String> stringMagicBox = new MagicBox<>(6);
        stringMagicBox.add("Тарелка");
        stringMagicBox.add("Миска");
        stringMagicBox.add("Кружка");
        stringMagicBox.add("Стакан");
        stringMagicBox.add("Ложка");
        stringMagicBox.add("Вилка");
        String pick = stringMagicBox.pick();
        System.out.println(pick);

    }
}