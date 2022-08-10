package com.fourspring.model;

import lombok.Data;

import javax.persistence.*;
//сущность создаваемой таблицы
@Entity
@Table(name = "clients")
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    public Client(String name, String email, String phone) {
        this.id = null;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Client() {

    }

    @Override
    public String toString() {
        return String.format(
                "Client[id=%d, name='%s', email='%s', phone='%s']",
                id, name, email, phone);
    }
}
