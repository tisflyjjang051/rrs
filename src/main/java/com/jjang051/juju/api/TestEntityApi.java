package com.jjang051.juju.api;

import com.jjang051.juju.service.TestService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class TestEntityApi {
    private final TestService testService;
    @GetMapping("/test/entity/create")
    public void createTestEntity() {
        testService.create("jjang051",30);
    }
    @PostMapping("/test/entity/create")
    public void createTestEntity02(@RequestBody CreateTestEntityRequest req) {
        testService.create(req.getName(), req.getAge());
    }

    @DeleteMapping("/test/entity/{id}")
    public void deleteTestEntity(@PathVariable Long id) {
        testService.delete(id);
    }
    @PutMapping("/test/entity/{id}")
    public void putTestEntity(@PathVariable Long id,@RequestBody CreateTestEntityRequest req) {
        testService.update(id,req.getName(),req.getAge());
    }





    @Getter
    @RequiredArgsConstructor
    public static class CreateTestEntityRequest {
        private final String name;
        private  final Integer age;
    }
}
