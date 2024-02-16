package com.jjang051.juju.repository;

import com.jjang051.juju.entity.TestEntity;

import java.util.List;

public interface TestRepositoryCustom {
    public List<TestEntity> findAllByNameByQuerydsl(String name);
}
