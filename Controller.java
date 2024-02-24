import Model.ModelCheck;
import Model.Writer;
import Exceptions.DataCount;

public class Controller {
    ModelCheck model;
    View view;

    public Controller(ModelCheck model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        view.showMsg();
        String data = view.getData("\nВаш ввод: ");
        String[] parseData = view.parseString(data);

        if (parseData.length == 6) {
            String secondName = parseData[0];
            String firstName = parseData[1];
            String patronomyc = parseData[2];
            String dateBirthday = model.checkDate(parseData[3]);
            String numberPhone = model.checkPhone(parseData[4]);
            String gen = model.checkGender(parseData[5]);

            String fileName = secondName + ".txt";

            Person person = new Person(secondName, firstName, patronomyc, dateBirthday, numberPhone, gen);

            Writer writer = new Writer();
            writer.writeFile(person.toString(), fileName);

        }

        else throw new DataCount("Введены некорректные данные. Проверьте количество полей, " +
                "оно должно равняться 6");

    }
}