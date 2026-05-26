package com.example.NoLingQ.repository;

import com.example.NoLingQ.models.Word;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IWordRepository extends JpaRepository<Word, Integer> {
    Optional<Word> findByWord(String word);
}
