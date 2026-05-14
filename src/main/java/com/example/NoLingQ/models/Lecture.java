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
@Table(name = "lecture")
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lecture")
    Integer idLecture;

    @Column(name = "name" ,length = 150, nullable = false)
    String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_source_lecture_fk")
    SourceLecture sourceLecture;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_source_media_fk")
    SourceMedia sourceMedia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_dictionary_fk")
    DictionarySource dictionarySource;
}
