package io.lihongbin.sqltest;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class CodeGenerator {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql:///sql-test?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8", "", "")
                .globalConfig(builder -> {
                    builder
                            .outputDir(System.getProperty("user.dir") + "/src/main/java") // 指定输出目录
                            .author("Li Hong Bin") // 设置作者
                            .disableOpenDir()
                            .enableSwagger(); // 开启 swagger 模式
                })
                .packageConfig(builder -> {
                    builder.parent("io.lihongbin.sqltest") // 设置父包名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, System.getProperty("user.dir") + "/src/main/resources/mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("association_test2") // 设置需要生成的表名
                            .controllerBuilder()
                            .enableRestStyle()
                            .enableHyphenStyle() //url中驼峰转连字符
                            .serviceBuilder()
                            .formatServiceFileName("%sService")
                            .entityBuilder()
                            .enableLombok()
                            .enableChainModel()
                            .idType(IdType.AUTO)
                    ;
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

}
