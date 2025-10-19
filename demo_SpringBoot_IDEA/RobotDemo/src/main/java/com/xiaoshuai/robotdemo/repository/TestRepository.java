package com.xiaoshuai.robotdemo.repository;

import com.xiaoshuai.robotdemo.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 测试实体的数据访问接口
 * 该接口继承自JpaRepository，提供了对TestEntity实体的基本CRUD操作，
 * 包括保存、删除、查询等方法，无需手动实现即可使用。
 */
// 继承JpaRepository，自动拥有CRUD方法
public interface TestRepository extends JpaRepository<TestEntity, Long> {
}

