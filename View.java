import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public void showMsg() {
        System.out.println("Введите данные в одну строку через пробел: \n" +
                "Фамилия Имя Отчество дата_рождения номер_телефона пол\n");
        System.out.println("Форматы данных:\n" +
                "фамилия, имя, отчество - строки\n" +
                "дата _ рождения - строка формата dd.mm.yyyy\n" +
                "номер _ телефона - целое беззнаковое число без форматирования\n" +
                "пол - символ латиницей f или m.");
    }

    public String getData(String msg) {
        System.out.print(msg);
        String data = in.nextLine();

        return data;
    }

    public String[] parseString(String str) {
        return str.split(" ");
    }
}
