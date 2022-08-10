package com.fourspring.controller;

import com.fourspring.model.Client;
import com.fourspring.service.ClientsService;
import org.springframework.web.bind.annotation.*;
//класс для работы с rest
import java.util.List;
import java.util.Optional;

@RestController
public class ClientController {
    private final ClientsService clientsService;
    public ClientController(ClientsService clientsService) {
        this.clientsService = clientsService;
    }

    @RequestMapping("/clients")
    public Iterable<Client> getClients() {
        List<Client> clientList = clientsService.readAll();
        return clientList;
    }
    @GetMapping("/clients/{id}")
    Optional<Client> one(@PathVariable Long id) {
        return clientsService.findById(id);
    }
    @PostMapping("/clients")
    Client newEmployee(@RequestBody Client newClient) {
        return clientsService.create(newClient);
    }

    @PutMapping("/clients/{id}")
    Client updateClient (@RequestBody Client newClient1, @PathVariable Long id) {
        Optional<Client> updateClient = clientsService.findById(id);
        Client cki = updateClient.get();
        cki.setName(newClient1.getName());
        cki.setEmail(newClient1.getEmail());
        cki.setPhone(newClient1.getPhone());
        return clientsService.create(cki);
    }
    @PutMapping("/clients/update")
    Client updateClient1 (@RequestBody Client newClient1) {
        return clientsService.create(newClient1);
    }

}
