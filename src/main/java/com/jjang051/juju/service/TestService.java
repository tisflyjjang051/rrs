package com.jjang051.juju.service;

import com.jjang051.juju.entity.TestEntity;
import com.jjang051.juju.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;
    public void create(String name,Integer age) {
        TestEntity testEntity = new TestEntity(name,age);
        testRepository.save(testEntity);
    }

    public void delete(Long id) {
        TestEntity testEntity = testRepository.findById(id).get();
        testRepository.delete(testEntity);
    }
    @Transactional
    public void update(Long id, String name, Integer age) {
        TestEntity testEntity = testRepository.findById(id).orElseThrow();
        testEntity.changeNameAndAge(name,age);
        //testRepository.save(testEntity);
    }

    public List<TestEntity> findAllByNameByJPA(String name) {
        return testRepository.findAllByName(name);
    }
    public List<TestEntity> findAllByNameByQueryDsl(String name) {
        return testRepository.findAllByNameByQuerydsl(name);
    }

}
