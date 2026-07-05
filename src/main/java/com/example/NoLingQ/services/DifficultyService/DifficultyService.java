package com.example.NoLingQ.services.DifficultyService;

import com.example.NoLingQ.models.Difficulty;
import com.example.NoLingQ.repository.IDifficultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DifficultyService implements IDifficultyService{
    @Autowired
    private IDifficultyRepository difficultyRepository;

    @Override
    public Difficulty getDifficulty(int id) {
        return this.difficultyRepository.findById(id).orElse(null);
    }
}
