package dog.egg.li.mp.generator.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import lombok.*;
import lombok.experimental.Accessors;


/**
 * @author lzj
 * @date 2022年06月29日 19:35
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class MysqlConnectInfo {
    private String url;
    private String username;
    private String password;
    // 设置作者
    private String author;
    // 生成文件所在模块
    private String module;
    // 设置父包名
    private String parentPackageName;
    // 设置需要生成的表名
    private String tableName;
    // 项目目录设置
    private String classPath;
    // 主键策略
    private IdType idType;
    // 是否生成Controller、service、entity、xml
    private boolean controller;
    private boolean service;
    private boolean entity;
    private boolean xml;
}
