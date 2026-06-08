package com.example.NoLingQ.repository;

import com.example.NoLingQ.models.Lecture;
import com.example.NoLingQ.models.Progress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProgressRepository extends JpaRepository<Progress, Integer> {

    Progress findByLecture(Lecture lecture);
}
