package practice3;

import java.util.Random;

public class task1 {
    static final int LENGHT = 50;

    public static void main(String[] args) {
        String[] femaleNames = new String[]{"Мария", "Анна", "Светлана", "Екатерина", "Валерия"};
        String[] femaleSurnames = new String[]{"Иванова", "Петрова", "Сидорова", "Крайнова", "Пименова", "Баженова"};
        String[] maleNames = new String[]{"Дмитрий", "Алексей", "Петр", "Иван", "Александр"};
        String[] maleSurnames = new String[]{"Иванов", "Петров", "Сидоров", "Крайнов", "Пименов", "Баженов"};

        Person[] people = new Person[LENGHT];
        Random random = new Random();
        for (int i = 0; i < LENGHT; i++) {
            int iperson = random.nextInt(2);
            int iname = random.nextInt(5);
            int isurname = random.nextInt(6);
            if (iperson == 0) {
                people[i] = new Person(femaleNames[iname], femaleSurnames[isurname]);
            } else {
                people[i] = new Person(maleNames[iname], maleSurnames[isurname]);
            }
            System.out.printf("Человек №{%d} - %s%n", i, people[i].toString());
        }
    }
}
