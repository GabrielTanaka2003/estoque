package com.example.estoque.repositories;

import com.example.estoque.models.EstoqueModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface EstoqueRepository extends JpaRepository<EstoqueModel, UUID>{

    @Repository
    public interface ProductRepository extends JpaRepository<EstoqueModel, UUID> {}
}
