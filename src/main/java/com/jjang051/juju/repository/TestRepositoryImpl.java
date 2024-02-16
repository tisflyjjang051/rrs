package com.jjang051.juju.repository;

import com.jjang051.juju.entity.QTestEntity;
import com.jjang051.juju.entity.TestEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TestRepositoryImpl implements TestRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    @Override
    public List<TestEntity> findAllByNameByQuerydsl(String name) {
        return queryFactory
                .selectFrom(QTestEntity.testEntity)
                .fetch();
    }
}
