public class Person {
    String firstName;
    String secondName;
    String patronomyc;
    String dateBirthday;
    String numberPhone;
    String gender;

    public Person(String secondName, String firstName, String patronomyc, String dateBirthday,
                  String numberPhone, String gender) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.patronomyc = patronomyc;
        this.dateBirthday = dateBirthday;
        this.numberPhone = numberPhone;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("<%s> <%s> <%s> <%s> <%s> <%s>", secondName, firstName,
                patronomyc, dateBirthday,
                numberPhone, gender);
    }
}