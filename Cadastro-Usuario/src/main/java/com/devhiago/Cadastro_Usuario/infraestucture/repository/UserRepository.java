package com.devhiago.Cadastro_Usuario.infraestucture.repository;

import com.devhiago.Cadastro_Usuario.infraestucture.entities.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Usuario, Integer> {

   Optional<Usuario>  findByEmail(String email);

   @Transactional
   void deleteByEmail(String email);
}
