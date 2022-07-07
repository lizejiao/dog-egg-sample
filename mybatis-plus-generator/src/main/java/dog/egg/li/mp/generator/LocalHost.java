package dog.egg.li.mp.generator;

import dog.egg.li.mp.generator.config.GeneratorConfig;
import dog.egg.li.mp.generator.handle.CodeGenerator353;

/**
 * 本地环境
 */
public class LocalHost {
    public static void main(String[] args) {
        CodeGenerator353.doGenerator(GeneratorConfig.builder()
                // ↓↓↓↓↓↓-----> 数据库连接信息
                .url("jdbc:mysql://127.0.0.1:3306/lgd_demo?useUnicode=true&useSSL=false&characterEncoding=utf8")
                .username("root")
                .password("123456")
                // ↓↓↓↓↓↓-----> 作者（类@author后的名称）
                .author("李苟蛋")
                // ↓↓↓↓↓↓-----> 项目路径(项目所在的全路径) 例如当前目录：System.getProperty("user.dir")
                .classPath(System.getProperty("user.dir"))
                // ↓↓↓↓↓↓-----> 项目下的模块
                .module("lgd-mybatis-plus")
                // ↓↓↓↓↓↓-----> 设置包名:src.main.java包下开始写....
                .parentPackageName("dog.egg.li.mybatisplus")
                // ↓↓↓↓↓↓-----> 主键策略，使用Mybatis-plus提供的雪花算法
//                .idType(IdType.ASSIGN_ID)
                // ↓↓↓↓↓↓-----> 是否生成Controller、service/serviceImpl、mapper接口、mapper.xml文件
                .controller(true)
                .service(true)
                .entity(true)
                .xml(true)
                // xxxDao.java包路径设置(默认为dao)，还可以设置entity，service，controller所在包路径
                .mapperPkgName("dao")
                // xxxMapper.java文件名称格式化为xxxDao.java，默认设置
                .formatMapperFileName("%sDao")
                .build());
    }
}
