package dog.egg.li.mp.generator.handle;

import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import dog.egg.li.mp.generator.config.GeneratorConfig;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.Optional;
import java.util.Scanner;

/**
 * 代码生成器（新）
 * 注： 适用版本：mybatis-plus-generator 3.5.3 及其以上版本，对历史版本不兼容！
 *
 * @作者 李苟蛋
 * @date 2022年02月07日 3:55 PM
 * 参考url: https://baomidou.com/pages/779a6e/#%E5%BF%AB%E9%80%9F%E5%85%A5%E9%97%A8
 * 代码生成器配置：https://baomidou.com/pages/981406/#%E6%95%B0%E6%8D%AE%E5%BA%93%E9%85%8D%E7%BD%AE-datasourceconfig
 */
public class CodeGenerator353 {

    /**
     * 自动生成器处理逻辑
     */
    public static void doGenerator(GeneratorConfig config) {
        /* -----------   生成文件路径设置（下面不需要更改）  ------------ */
        String classPath = StringUtils.hasText(config.getClassPath()) ? config.getClassPath() : System.getProperty("user.dir");
        // java 文件输出路径
        String outputDir = classPath + "/" + config.getModule() + "/src/main/java";
        // mapper.xml 文件输出路径
        String xmlOutputDir = classPath + "/" + config.getModule() + "/src/main/resources/mapper/";

        FastAutoGenerator.create(config.getUrl(), config.getUsername(), config.getPassword())
                .globalConfig(builder -> {
                    builder.author(config.getAuthor()) // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
//                            .fileOverride() // 全局覆盖已有文件的配置已失效，已迁移到策略配置中,3.5.4版本会删除此方法
                            .outputDir(outputDir) // 指定输出目录
                            .disableOpenDir(); // 禁止打开输出目录
                })
                .packageConfig(builder -> { //包配置(PackageConfig)
                    builder.parent(config.getParentPackageName()) // 设置父包名
                            .moduleName("") // 设置父包模块名,默认值:无
                            .entity(StringUtils.hasText(config.getEntityPkgName()) ? config.getEntityPkgName() : "entity")
                            .service(StringUtils.hasText(config.getServicePkgName()) ? config.getServicePkgName() : "service")
                            .serviceImpl(StringUtils.hasText(config.getServiceImplPkgName()) ? config.getServiceImplPkgName() : "service.impl")
                            .mapper(StringUtils.hasText(config.getMapperPkgName()) ? config.getMapperPkgName() : "dao")
                            .controller(StringUtils.hasText(config.getControllerPkgName()) ? config.getControllerPkgName() : "controller")
                            .pathInfo(Collections.singletonMap(OutputFile.xml, xmlOutputDir)); // 设置mapperXml生成路径
                })
                .templateConfig(builder -> {  // 模板配置(TemplateConfig)
                    builder.xml(config.isXml() ? "/templates/lgd_mapper.xml" : "") // 自定义模板
                            .controller(config.isController() ? "/templates/controller.java" : "")
                            .service(config.isService() ? "/templates/service.java" : "")
                            .serviceImpl(config.isService() ? "/templates/serviceImpl.java" : "")
                            .mapper(config.isEntity() ? "/templates/mapper.java" : "")
                            .entity("/templates/lgd_entity.java")
                            .build();
                })
                .strategyConfig(builder -> { //策略配置(StrategyConfig)
                    builder.addInclude(Optional.ofNullable(config.getTableName()).orElse(scanner("表名"))) // 设置需要生成的表名
                            .addTablePrefix("t_", "c_") // 设置过滤表前缀
                            // ------------->>> Entity 策略配置
                            .entityBuilder()
                            .idType(config.getIdType())
                            .enableLombok() // 开启 lombok 模型	默认值:false
                            .enableChainModel() // 开启链式模型
                            .enableFileOverride()
                            // ------------->>> Controller 策略配置
                            .controllerBuilder()
                            .enableRestStyle() // 开启生成@RestController 控制器
                            .enableFileOverride()
                            // ------------->>> Service 策略配置
                            .serviceBuilder()
                            .formatServiceFileName("%sService") // 格式化 service 接口文件名称
                            .enableFileOverride()
                            // ------------->>> Mapper 策略配置
                            .mapperBuilder()
                            .enableBaseResultMap() // 启用 BaseResultMap 生成
                            .enableBaseColumnList() // 启用 BaseColumnList
                            .formatMapperFileName(StringUtils.hasText(config.getFormatMapperFileName()) ? config.getFormatMapperFileName() : "%sDao")
                            .enableFileOverride()
                    ;
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

    /**
     * 读取控制台内容
     */
    private static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入-> " + tip + "......");
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.hasText(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

}
