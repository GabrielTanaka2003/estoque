package com.example.estoque.controllers;

import com.example.estoque.dto.EstoqueDTO;
import com.example.estoque.repositories.EstoqueRepository;
import com.example.estoque.models.EstoqueModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class EstoqueController {

    @Autowired
    EstoqueRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/estoque")
    public ResponseEntity<EstoqueModel> saveProduct(@RequestBody @Valid EstoqueDTO estoque){
        var estoqueModel = new EstoqueModel();
        BeanUtils.copyProperties(estoque, estoqueModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(estoqueModel));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/estoque")
    public ResponseEntity<List<EstoqueModel>> getAllProducts(){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/estoque/{id}")
    public ResponseEntity<Object> getOneProduct(@PathVariable(value="id") UUID id){
        Optional<EstoqueModel> product = repository.findById(id);
        if(product.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(product.get());
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/estoque/{id}")
    public ResponseEntity<Object> updateProduct(@PathVariable(value="id") UUID id,
                                                @RequestBody @Valid EstoqueDTO productDto){
        Optional<EstoqueModel> product = repository.findById(id);
        if(product.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
        }

        var estoqueModel = product.get();
        BeanUtils.copyProperties(productDto, estoqueModel);
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(estoqueModel));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/estoque/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable(value="id") UUID id){
        Optional<EstoqueModel> estoque = repository.findById(id);
        if(estoque.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
        }

        repository.delete(estoque.get());
        return ResponseEntity.status(HttpStatus.OK).body("Produto deletado!");
    }
}
