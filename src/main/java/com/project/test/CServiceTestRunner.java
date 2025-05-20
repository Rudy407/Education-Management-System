package com.project.test;

import com.project.entity.po.C;
import com.project.entity.query.CQuery;
import com.project.entity.vo.ResponseVO;
import com.project.service.CService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component  // 必须加这个注解让 Spring 扫描并管理这个类
public class CServiceTestRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(CServiceTestRunner.class);

    @Autowired
    private CService cService;

    @Override
    public void run(String... args){
//        runTestCode1();
    }

    public void runTestCode1() {
                // 以下函数请勿给前端开放接口！！！  仅用于数据库与后端通信。
        logger.info(">>> 测试开始 <<<");

        CQuery cq = new CQuery();
        cq.setKmFuzzy("结构");
        C c=new C();
        c.setXf(123);
        List<C> tmp = cService.findListByPage(cq).getList();
        for(C temp : tmp ){
            logger.info("{}",temp.toString());
        }


//        try {
//            int count = cService.findCountByParam(cq);
//            logger.info(">>> 查询结果数量：{} <<<", count);
//        } catch (Exception e) {
//            logger.error(">>> 测试出错 <<<", e);
//        }

//        cService.addOrUpdate(c);
//        logger.info(">>> secondtest <<<");
//        c.setXf(23);
//        c.setKh("08305555");
//        c.setKm("测试结果");
//        c.setXs(6);
//        c.setYxh("02");
//        cService.addOrUpdate(c);
        logger.info(">>> 测试结束 <<<");
    }
}
