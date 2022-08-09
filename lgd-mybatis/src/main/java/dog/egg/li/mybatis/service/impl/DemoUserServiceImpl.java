package dog.egg.li.mybatis.service.impl;

import dog.egg.li.mybatis.entity.DemoUser;
import dog.egg.li.mybatis.dao.DemoUserDao;
import dog.egg.li.mybatis.service.DemoUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表(demo)(DemoUser)表服务实现类
 *
 * @author 李苟蛋
 * @since 2022-08-09 11:49:34
 */
@Service("demoUserService")
public class DemoUserServiceImpl implements DemoUserService {
    @Resource
    private DemoUserDao demoUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DemoUser queryById(Long id) {
        return this.demoUserDao.queryById(id);
    }

    @Override
    public List<DemoUser> queryByName(String name) {
        List<DemoUser> demoUsers = this.demoUserDao.queryAll(DemoUser.builder().userName(name).build());
        return demoUsers;
    }

    /**
     * 新增数据
     *
     * @param demoUser 实例对象
     * @return 实例对象
     */
    @Override
    public DemoUser insert(DemoUser demoUser) {
        this.demoUserDao.insert(demoUser);
        return demoUser;
    }

    /**
     * 修改数据
     *
     * @param demoUser 实例对象
     * @return 实例对象
     */
    @Override
    public DemoUser update(DemoUser demoUser) {
        this.demoUserDao.updateById(demoUser);
        return this.queryById(demoUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.demoUserDao.deleteById(id) > 0;
    }
}
