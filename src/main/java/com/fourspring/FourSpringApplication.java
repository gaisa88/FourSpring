package com.fourspring;

import com.fourspring.model.Client;
import com.fourspring.repository.ClientRepository;
import com.fourspring.service.ClientsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication // объявление приложения spring boot
public class FourSpringApplication {

    public static void main(String[] args) {


        ConfigurableApplicationContext context = SpringApplication.run(FourSpringApplication.class); // класс приложения укладываем в переменную context с типом данных ConfigurableApplicationContext
       /* ClientsService repository = context.getBean(ClientsService.class); // в методе getBean нашего приложения передаем наш сервис, которому присваиваем тип данных нашего сервиса


        repository.create(new Client("Jack", "Bauer","77011112233"));  // через сервис создаем в таблице новые записи с полями имя, почта, телефон
        repository.create(new Client("Chloe", "O'Brian","77011112233"));
        repository.create(new Client("Kim", "Bauer","77011112233"));
        repository.create(new Client("David", "Palmer","77011112233"));
        repository.create(new Client("Michelle", "Dessler","77011112233"));

        // fetch all customers
        Iterable<Client> ClientList = repository.readAll();  // создаем иттерируемый объект из сервиса прочитав записи с таблицы
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Client customer : ClientList) { // циклом вытаскиваем каждый объект из списка
            System.out.println(customer.toString()); // переопределенным методом toString выводим данные объекта в том виде, в котором задали при создании сущности
        }
        System.out.println();
        context.close; */ // выключаем наше приложение
    }
}
