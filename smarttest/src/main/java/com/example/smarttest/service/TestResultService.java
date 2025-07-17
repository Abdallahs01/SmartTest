package com.example.smarttest.service;

import com.example.smarttest.model.TestResult;
import com.example.smarttest.repository.TestResultRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestResultService {

    private final TestResultRepository repository;

    public TestResultService(TestResultRepository repository) {
        this.repository = repository;
    }

    public TestResult save(TestResult result) {
        return repository.save(result);
    }

    public List<TestResult> getAll() {
        return repository.findAll();
    }

    public Optional<TestResult> getById(String id) {
        return repository.findById(id);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

    public List<TestResult> getByStatus(String status) {
        return repository.findByStatus(status);
    }
}
