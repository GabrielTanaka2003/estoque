package com.example.estoque.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record EstoqueDTO (@NotBlank String name, @NotNull BigDecimal value, @NotNull BigDecimal quantity){
}
