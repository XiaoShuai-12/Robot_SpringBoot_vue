package com.xiaoshuai.robotdemo;// 替换原有的 import org.testng.annotations.Test;
import com.xiaoshuai.robotdemo.entity.TestEntity;
import com.xiaoshuai.robotdemo.repository.TestRepository;
import org.junit.jupiter.api.Test;  // JUnit 5 注解
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * RobotDemoApplicationTests类
 * 用于测试RobotDemo应用程序的各种功能
 */
@SpringBootTest
class RobotDemoApplicationTests {

    @Autowired
    private TestRepository testRepository;

    /**
     * 测试数据库连接功能
     * 通过保存和查询TestEntity实体来验证数据库连接是否正常
     */
    @Test  // 使用 JUnit 5 的 @Test
    void testDbConnection() {
        // 创建测试实体并保存到数据库
        TestEntity test = new TestEntity();
        test.setName("数据库连接测试");
        testRepository.save(test);

        // 从数据库查询保存的实体并验证
        TestEntity saved = testRepository.findById(test.getId()).orElseThrow();
        System.out.println("插入成功！ID：" + saved.getId() + "，名称：" + saved.getName());
        // 删除测试实体
        testRepository.delete(saved);
    }
}

