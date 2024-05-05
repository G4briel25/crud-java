package br.com.trabalho.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.trabalho.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
