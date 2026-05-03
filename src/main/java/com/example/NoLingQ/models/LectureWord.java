package com.example.NoLingQ.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Table(name = "lecture_words")
public class LectureWord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lecture_words")
    Integer idLectureWord;

    @ManyToOne
    @JoinColumn(name = "id_lecture_fk", nullable = false)
    Lecture lecture;

    @ManyToOne
    @JoinColumn(name = "id_word_fk", nullable = false)
    Word word;
}
