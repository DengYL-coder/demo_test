package com.deng.dao;

import com.deng.entity.TestUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TestUser)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-06 10:43:26
 */
public interface TestUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    TestUser queryById(Integer uid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TestUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param testUser 实例对象
     * @return 对象列表
     */
    List<TestUser> queryAll(TestUser testUser);

    /**
     * 新增数据
     *
     * @param testUser 实例对象
     * @return 影响行数
     */
    int insert(TestUser testUser);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TestUser> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TestUser> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TestUser> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TestUser> entities);

    /**
     * 修改数据
     *
     * @param testUser 实例对象
     * @return 影响行数
     */
    int update(TestUser testUser);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 影响行数
     */
    int deleteById(Integer uid);

}

