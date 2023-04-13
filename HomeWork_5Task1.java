
public class HomeWork_5Task1 {
    public static void main(String[] args) {
        /*
        Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
         что 1 человек может иметь несколько телефонов.
         */
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Наталья", "375296672179");
        phoneDirectory.add("Алексей", "37529148069");
        phoneDirectory.add("Татьяна", "375255621039");
        phoneDirectory.add("Виктор", "375338521030");
        phoneDirectory.add("Валерия", "375441407893");
        phoneDirectory.add("Лолита", "375446512323");
        phoneDirectory.show();
        phoneDirectory.findNoteByNumber("375446512323");
        phoneDirectory.removeNumber("37533852103");
        phoneDirectory.showNote("Лолита");
        phoneDirectory.removeNote("Виктор");
        phoneDirectory.show();
    }
}
