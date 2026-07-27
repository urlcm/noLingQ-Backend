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
    Integer idDifficulty;

    @Enumerated(EnumType.STRING)
    @Column(name = "description")
    DifficultyLevel description;

    public enum DifficultyLevel{
        IGNORE,
        NEW,
        SEEN,
        RECOGNIZED,
        VERY_RECOGNIZED,
        VERY_RECOGNIZED_2,
        LEARNED,
        CHECK
    }
}
