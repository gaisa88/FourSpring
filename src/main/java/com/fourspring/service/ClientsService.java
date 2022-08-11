package com.fourspring.service;
//сервис
import com.fourspring.model.Address;
import com.fourspring.model.Client;
import com.fourspring.repository.BranchRepository;
import com.fourspring.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service // подключаем сервис для Rest методов
public class ClientsService{
    @Autowired
    private ClientRepository clientRepository;  // переопределяем репозиторий Spring Data для работы переопределения методов сервиса
    @Autowired
    private BranchRepository branchRepository;
    public Client create(Client client) { // метод для создания и сохранения объекта в таблицу
        clientRepository.save(client);
        return client;
    }
    public List<Client>  readAll() {
        return clientRepository.findAll();
    } // метод для чтения и поиска объекта в таблице

    public Optional<Client> findById(Long id) { // опционально возвращаем объект, для возможности работы с ним
        return clientRepository.findById(id);
    } // метод для чтения и поиска объектов по id


    public Address create (Address address){
        branchRepository.save(address);
        return address;
    }
    public List<Address>  findAll() {
        return branchRepository.findAll();
    } // метод для чтения и поиска объекта в таблице

    public Optional<Address> searchById(Long id) { // опционально возвращаем объект, для возможности работы с ним
        return branchRepository.findById(id);
    } // метод для чтения и поиска объектов по id

    public Optional<Client> findBranchById(Long id) {
        return branchRepository.findAllById();
    }

}

