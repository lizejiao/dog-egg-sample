package dog.egg.li.mp.generator;

import com.baomidou.mybatisplus.annotation.IdType;
import dog.egg.li.mp.generator.pojo.MysqlConnectInfo;

/**
 * 本地环境
 */
public class LocalHost {
    public static void main(String[] args) {
        CodeGenerator353.doGenerator(MysqlConnectInfo.builder()
                // ↓↓↓↓↓↓-----> 数据库连接信息
                .url("jdbc:mysql://127.0.0.1:3306/lgd_demo?useUnicode=true&useSSL=false&characterEncoding=utf8")
                .username("root")
                .password("123456")
                // ↓↓↓↓↓↓-----> 作者（类@author后的名称）
                .author("李苟蛋")
                // ↓↓↓↓↓↓-----> 项目路径(项目所在的全路径) 例如当前目录：System.getProperty("user.dir")
                .classPath(System.getProperty("user.dir"))
                // ↓↓↓↓↓↓-----> 项目下的模块
                .module("mybatis-plus-generator")
                // ↓↓↓↓↓↓-----> 设置包名:src.main.java包下开始写....
                .parentPackageName("dog.egg.li.mp.generator")
                // ↓↓↓↓↓↓-----> 主键策略，使用Mybatis-plus提供的雪花算法
                .idType(IdType.ASSIGN_ID)
                // ↓↓↓↓↓↓-----> 是否生成Controller、service/serviceImpl、mapper接口、mapper.xml文件
                .controller(false)
                .service(false)
                .entity(true)
                .xml(true)
                .build());
    }
}