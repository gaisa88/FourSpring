package com.fourspring.controller;

import com.fourspring.model.Client;
import com.fourspring.service.ClientsService;
import org.springframework.web.bind.annotation.*;
//класс для работы с rest
import java.util.List;
import java.util.Optional;

@RestController // объявлем контроллер Rest
public class ClientController {
    private final ClientsService clientsService; // объявлем клиентский сервис
    public ClientController(ClientsService clientsService) {
        this.clientsService = clientsService;
    } // объявляем конструктор контролера с контстантой клиентского сервиса

    @RequestMapping("/clients") // объявляем rest запрос для получения списка сущностей
    public Iterable<Client> getClients() { // получаем иттерированный список
        List<Client> clientList = clientsService.readAll(); // объявлем переменную лист объектов, которые получаем сервиса прочитав данные из таблицы
        return clientList; // возвращаем лист сущностей
    }
    @GetMapping("/clients/{id}") // объявлем запрос get для получения данных
    Optional<Client> one(@PathVariable Long id) { // получаем опциональную сущность, по id
        return clientsService.findById(id); // возвращаем сущность полученную сервисом через id
    }
    @PostMapping("/clients") // объявлем запрос добавление данных
    Client newClient(@RequestBody Client newClient) { // добавляем нового клиента в таблицу
        return clientsService.create(newClient); // передаем возвращенного объекта в таблицу
    }

    @PutMapping("/clients/{id}") // обновляем объект по id
    Client updateClient (@RequestBody Client newClient1, @PathVariable Long id) { // получаем объект newClient1 и возвращаем обновленый объект updateClient
        Optional<Client> updateClient = clientsService.findById(id); // опционально берем обновляемый объект, который получили через метод сервиса по id
        Client cki = updateClient.get(); // берем обновляемый объект и присваиваем переменной
        cki.setName(newClient1.getName()); // присваеваем обновляемому объекту новое значение поля name из получаемого объекта
        cki.setEmail(newClient1.getEmail()); // присваеваем обновляемому объекту новое значение поля email из получаемого объекта
        cki.setPhone(newClient1.getPhone()); // присваеваем обновляемому объекту новое значение поля phone из получаемого объекта
        return clientsService.create(cki); // сохраняем уже обновленный объект и возвращаем его
    }
    @PutMapping("/clients/update")
    Client updateClient1 (@RequestBody Client newClient1) {
        return clientsService.create(newClient1);
    } // получаем объект newClient1 и возвращаем обновленый объект updateClient1

}
