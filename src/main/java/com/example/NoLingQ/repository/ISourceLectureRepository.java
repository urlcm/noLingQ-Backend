package com.example.NoLingQ.repository;

import com.example.NoLingQ.models.Lecture;
import com.example.NoLingQ.models.SourceLecture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ISourceLectureRepository extends JpaRepository<SourceLecture, Integer> {

}
