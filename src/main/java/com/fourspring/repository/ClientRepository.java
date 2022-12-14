package com.fourspring.repository;
//репозиторий для работы с таблицей
import com.fourspring.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> { // добавление репозитория который наследует методы из JpaRep для работы со SpringData
}
