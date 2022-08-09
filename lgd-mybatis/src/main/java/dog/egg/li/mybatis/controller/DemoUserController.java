package dog.egg.li.mybatis.controller;

import dog.egg.li.mybatis.entity.DemoUser;
import dog.egg.li.mybatis.service.DemoUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表(demo)(DemoUser)表控制层
 *
 * @author 李苟蛋
 * @since 2022-08-09 11:49:34
 */
@RestController
@RequestMapping("demoUser")
public class DemoUserController {
    /**
     * 服务对象
     */
    @Resource
    private DemoUserService demoUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<DemoUser> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.demoUserService.queryById(id));
    }


    @GetMapping("/ByName/{name}")
    public ResponseEntity<List<DemoUser>> queryByName(@PathVariable("name") String name) {
        return ResponseEntity.ok(this.demoUserService.queryByName(name));
    }

    /**
     * 新增数据
     *
     * @param demoUser 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public ResponseEntity<DemoUser> add(@RequestBody DemoUser demoUser) {
        return ResponseEntity.ok(this.demoUserService.insert(demoUser));
    }

    /**
     * 编辑数据
     *
     * @param demoUser 实体
     * @return 编辑结果
     */
    @PutMapping("/update")
    public ResponseEntity<DemoUser> update(@RequestBody DemoUser demoUser) {
        return ResponseEntity.ok(this.demoUserService.update(demoUser));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.demoUserService.deleteById(id));
    }

}

