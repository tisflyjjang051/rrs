package com.jjang051.juju.repository;

import com.jjang051.juju.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepository extends JpaRepository<TestEntity,Long>, TestRepositoryCustom {
    public List<TestEntity> findAllByName(String name);
    List<TestEntity> findAllByNameByQuerydsl(String name);
}
