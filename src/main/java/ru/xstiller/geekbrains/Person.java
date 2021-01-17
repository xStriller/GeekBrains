package ru.xstiller.geekbrains;

public class Person {
    //ФИО
    private final String fio;
    //Должность
    private final String position;
    //Емайл
    private final String email;
    //Номер телефона
    private final String phoneNumber;
    //Зарплата
    private final int salary;
    //Возраст
    private final int age;


    public void printPersonInfo() {
        System.out.println("ФИО: " + fio);
        System.out.println("Должность: " + position);
        System.out.println("Емайл: " + email);
        System.out.println("Номер телефона: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public Person(){
        this("Иванов Иван", "Специалист", "youemail@mail.ru", "89999999999", 50000, 35);
    }

    public Person(String fio, String position, String email, String phoneNumber, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
