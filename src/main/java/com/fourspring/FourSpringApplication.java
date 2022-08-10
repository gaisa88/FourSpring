package com.fourspring;

import com.fourspring.model.Client;
import com.fourspring.repository.ClientRepository;
import com.fourspring.service.ClientsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class FourSpringApplication {

    public static void main(String[] args) {


        ConfigurableApplicationContext context = SpringApplication.run(FourSpringApplication.class);
       /* ClientsService repository = context.getBean(ClientsService.class);


        repository.create(new Client("Jack", "Bauer","77011112233"));
        repository.create(new Client("Chloe", "O'Brian","77011112233"));
        repository.create(new Client("Kim", "Bauer","77011112233"));
        repository.create(new Client("David", "Palmer","77011112233"));
        repository.create(new Client("Michelle", "Dessler","77011112233"));

        // fetch all customers
        Iterable<Client> ClientList = repository.readAll();
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Client customer : ClientList) {
            System.out.println(customer.toString());
        }
        System.out.println();*/
    }
}
