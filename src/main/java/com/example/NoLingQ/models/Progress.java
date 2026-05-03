package com.example.NoLingQ.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Table(name = "progress")
public class Progress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "progress")
    Integer idProgress;

    @OneToOne
    @JoinColumn(name = "id_lecture_fk", unique = true, nullable = false)
    Lecture lecture;

    @Column(name = "current_page")
    Integer CurrentPage;

    @Column(name = "current_time_secs")
    Long currentTimeSecs;

}
