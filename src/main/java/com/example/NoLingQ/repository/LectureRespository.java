package com.example.NoLingQ.repository;

import com.example.NoLingQ.models.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRespository extends JpaRepository<Lecture,Integer> {
}
