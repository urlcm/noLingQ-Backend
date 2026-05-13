package com.example.NoLingQ.repository;

import com.example.NoLingQ.models.DictionarySource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDictionaryRepository extends JpaRepository<DictionarySource,Integer> {
}
