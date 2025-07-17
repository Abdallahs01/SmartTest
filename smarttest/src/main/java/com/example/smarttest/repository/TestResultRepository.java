package com.example.smarttest.repository;

import com.example.smarttest.model.TestResult;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestResultRepository extends MongoRepository<TestResult, String> {
    List<TestResult> findByStatus(String status);

}
