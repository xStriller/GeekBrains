package ru.xstiller.geekbrains;

public class Main {

    public static void main(String[] args) {

        Person[] staffArray = new Person[5];
        staffArray[0] = new Person("Иванов Иван", "Консультант", "ivivan@mailbox.com", "89999999999", 35000, 24);
        staffArray[1] = new Person("Федорова Елена", "Специалист", "elena@mailbox.com", "89998888888", 40000, 27);
        staffArray[2] = new Person("Кравченко Евгений", "Начальник отдела", "evgeniy@mailbox.com", "89997777777", 45000, 40);
        staffArray[3] = new Person("Зубова Виктория", "Заместитель директора", "victoria@mailbox.com", "89996666666", 75000, 42);
        staffArray[4] = new Person("Пупкин Василий", "Директор", "pupkin@gmail.com", "89995555555", 100000, 47);

        for (Person current : staffArray) {
            if (current.getAge() >= 40) {
                current.printPersonInfo();
                System.out.println();
            }
        }
    }
}