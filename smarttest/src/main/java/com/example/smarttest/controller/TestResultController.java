package com.example.smarttest.controller;

import com.example.smarttest.model.TestResult;
import com.example.smarttest.service.TestResultService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tests")
public class TestResultController {

    private final TestResultService service;

    public TestResultController(TestResultService service) {
        this.service = service;
    }

    // POST /api/tests
    @PostMapping
    public TestResult addTestResult(@RequestBody TestResult testResult) {
        return service.save(testResult);
    }

    // GET /api/tests
    @GetMapping
    public List<TestResult> getAllTests() {
        return service.getAll();
    }

    // GET /api/tests/{id}
    @GetMapping("/{id}")
    public Optional<TestResult> getTestById(@PathVariable String id) {
        return service.getById(id);
    }

    // DELETE /api/tests/{id}
    @DeleteMapping("/{id}")
    public void deleteTest(@PathVariable String id) {
        service.deleteById(id);
    }

    // GET /api/tests/status/{status}
    @GetMapping("/status/{status}")
    public List<TestResult> getTestsByStatus(@PathVariable String status) {
        return service.getByStatus(status.toUpperCase());
    }
}
