package com.jjang051.juju.api;

import com.jjang051.juju.entity.TestEntity;
import com.jjang051.juju.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestQueryApi {

    private final TestService testService;
    @GetMapping("/test/query/jpa")
    public List<TestEntity> queryJpa() {
        return testService.findAllByNameByJPA("피자01");
    }

    @GetMapping("/test/query/querydsl")
    public List<TestEntity> queryDsl() {
        return testService.findAllByNameByJPA("피자01");
    }


}
