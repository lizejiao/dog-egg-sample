package dog.egg.li.mybatis.dao;

import dog.egg.li.mybatis.entity.DemoUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 用户表(demo)(DemoUser)表数据库访问层
 *
 * @author 李苟蛋
 * @since 2022-08-09 11:49:34
 */
public interface DemoUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DemoUser queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param demoUser 查询条件
     * @return 对象列表
     */
    List<DemoUser> queryAll(DemoUser demoUser);

    /**
     * 统计总行数
     *
     * @param demoUser 查询条件
     * @return 总行数
     */
    long count(DemoUser demoUser);

    /**
     * 新增数据
     *
     * @param demoUser 实例对象
     * @return 影响行数
     */
    int insert(@Param("demoUser") DemoUser demoUser);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<DemoUser> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<DemoUser> entities);

    /**
     * 修改数据
     *
     * @param demoUser 实例对象
     * @return 影响行数
     */
    int updateById(@Param("demoUser") DemoUser demoUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

