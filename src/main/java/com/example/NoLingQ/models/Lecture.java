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

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_source_lecture_fk", unique = true)
    SourceLecture sourceLecture;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_source_media_fk", unique = true)
    SourceMedia sourceMedia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_dictionary_fk")
    DictionarySource dictionarySource;
}
