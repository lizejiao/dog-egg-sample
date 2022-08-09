package dog.egg.li.mybatis.service;

import dog.egg.li.mybatis.entity.DemoUser;

import java.util.List;

/**
 * 用户表(demo)(DemoUser)表服务接口
 *
 * @author 李苟蛋
 * @since 2022-08-09 11:49:34
 */
public interface DemoUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DemoUser queryById(Long id);


    List<DemoUser> queryByName(String name);

    /**
     * 新增数据
     *
     * @param demoUser 实例对象
     * @return 实例对象
     */
    DemoUser insert(DemoUser demoUser);

    /**
     * 修改数据
     *
     * @param demoUser 实例对象
     * @return 实例对象
     */
    DemoUser update(DemoUser demoUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
