package com.example.NoLingQ.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "dictionary_source")
public class DictionarySource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dictionary")
    int idDictionary;

    @Column(name = "name", nullable = false, length = 100)
    String name;

    @Column(name = "url_dictionary", unique = true, length = 299)
    String urlDictionary;
}
