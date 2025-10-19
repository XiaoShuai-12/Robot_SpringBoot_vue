package com.xiaoshuai.robotdemo.entity;

import jakarta.persistence.*; // Spring Boot 3.x用jakarta；2.x用javax
import lombok.Data;

/**
 * 测试实体类
 * 用于演示JPA实体映射的基本用法
 * 对应数据库中的test表
 */
@Data  // Lombok自动生成getter/setter
@Entity  // 标记为JPA实体
@Table(name = "test")  // 映射到数据库的test表
public class TestEntity {
    /**
     * 实体主键ID
     * 使用数据库自增策略生成唯一标识
     */
    @Id  // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 自增ID
    private Long id;

    /**
     * 名称字段
     * 用于存储测试相关的名称信息
     */
    private String name;  // 测试字段
}

