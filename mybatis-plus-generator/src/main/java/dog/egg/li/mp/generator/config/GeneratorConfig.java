package dog.egg.li.mp.generator.config;

import com.baomidou.mybatisplus.annotation.IdType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
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
public class GeneratorConfig {
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

    // Entity 包名：默认值:entity
    private String entityPkgName;
    // service 包名：默认值:service
    private String servicePkgName;
    // serviceImpl 包名：默认值:service.impl
    private String serviceImplPkgName;
    // mapper 包名：默认值:dao，如果项目中为mapper，可修改为mapper
    private String mapperPkgName;
    // controller 包名：默认值:controller
    private String controllerPkgName;

    // 格式化 mapper 文件名称：默认格式："%sDao"
    private String formatMapperFileName;

}
