package com.bn.atvdjava.repositories;

import com.bn.atvdjava.models.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroModel, Long> {
}
