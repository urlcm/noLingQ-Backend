package com.example.NoLingQ.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "words", indexes = {
        @Index(name = "Iword", columnList = "word")
})
/*crtl + shift + / (slash)*/
//crtl + / (slash)
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_word")
    Integer idWord;

    @Column(name = "word", length = 100)
    String word;

    @Column(name = "definition",length = 200)
    String definition;

    @Column(name = "image",length = 200)
    String image;

    @ManyToOne
    @JoinColumn(name = "id_difficulty_fk")
    Difficulty difficulty;

    @ManyToOne
    @JoinColumn(name = "id_dictionary_fk")
    DictionarySource dictionarySource;

}
