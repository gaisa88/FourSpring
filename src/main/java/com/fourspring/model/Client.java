package com.fourspring.model;

import lombok.Data; // добавлен для того чтобы не создавать getter - setter

import javax.persistence.*;
//создаем сущность создаваемой таблицы
@Entity // добавили декоратор для объявления сущности
@Table(name = "clients") // указание таблицы
@Data
public class Client {
    @Id  // объявление id таблицы
    @GeneratedValue(strategy = GenerationType.IDENTITY) // объявление РК
    @Column(name = "id") // объявление стобца- поля таблицы
    private Long id;
    @Column(name = "name")// объявление стобца- поля таблицы
    private String name;

    @Column(name = "email")// объявление стобца- поля таблицы
    private String email;

    @Column(name = "phone")// объявление стобца- поля таблицы
    private String phone;

    @ManyToOne
    private Address address;

    public Client(String name, String email, String phone, Address address) { // конструктор с полями для создания объекта клиента, без указания id так как это уникальное поле
        this.id = null;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;

    }

    public Client() { // spring потребовала объявления пустого конструктора

    }

    @Override
    public String toString() {// переопределение метода toString для вывода данных в json
        return String.format(
                "Client[id=%d, name='%s', email='%s', phone='%s']",
                id, name, email, phone);
    }
}
