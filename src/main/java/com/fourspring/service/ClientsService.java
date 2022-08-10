package com.fourspring.service;
//сервис
import com.fourspring.model.Client;
import com.fourspring.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientsService{
    @Autowired
    private ClientRepository clientRepository;
    public Client create(Client client) {
        clientRepository.save(client);
        return client;
    }
    public List<Client>  readAll() {
        return clientRepository.findAll();
    }

    public Optional<Client> findById(Long id) {
        return clientRepository.findById(id);
    }
}

