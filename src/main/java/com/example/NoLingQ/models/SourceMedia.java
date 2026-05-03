package com.example.NoLingQ.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Table(name = "source_media")
public class SourceMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_source_media")
    int idSourceMedia;

    @Column(name = "url_source")
    String urlSource;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    MediaType type;

    public enum MediaType{
        audio,
        video

    }

}
