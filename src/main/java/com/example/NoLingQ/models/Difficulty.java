package com.example.NoLingQ.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Difficulty {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id_difficulty")
    public int idDifficulty;

    @Enumerated(EnumType.STRING)
    @Column(name = "difficulty_description")
    public DifficultyLevel difficultyDescription;

    public enum DifficultyLevel{
        IGNORE,
        NEW,
        SEEN,
        RECONIZED,
        RECONIZED_2,
        RECOGNIZED_3,
        LEARNED
    }
}
