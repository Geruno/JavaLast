import Model.ModelCheck;


public class Main {
    public static void main(String[] args) {
        // Проверка данных реализована в ModelCheck (package Model)
        // Запись в файл в классе Writer (package Model)
        // Кастомные исключения в папке MyException
        // Итоговая строка для записи берется из класса Person
        // Ввод пользовательских данных и вывод на экран View

        Controller controller = new Controller(new ModelCheck(), new View());
        controller.run();
    }
}