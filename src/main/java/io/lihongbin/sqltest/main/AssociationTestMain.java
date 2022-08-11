package io.lihongbin.sqltest.main;

import io.lihongbin.sqltest.entity.AssociationTest1;
import io.lihongbin.sqltest.entity.AssociationTest2;
import io.lihongbin.sqltest.service.AssociationTest1Service;
import io.lihongbin.sqltest.service.AssociationTest2Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class AssociationTestMain implements InitializingBean {

    private final AssociationTest1Service associationTest1Service;
    private final AssociationTest2Service associationTest2Service;

    public AssociationTestMain(AssociationTest1Service associationTest1Service, AssociationTest2Service associationTest2Service) {
        this.associationTest1Service = associationTest1Service;
        this.associationTest2Service = associationTest2Service;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("start order test");
        long start = System.currentTimeMillis();

        for (int i = 0; i < 500000; i++) {
            AssociationTest1 associationTest1 = new AssociationTest1(getRandom(), "parent_" + i);
            associationTest1Service.save(associationTest1);
            List<AssociationTest2> list = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                AssociationTest2 associationTest2 = new AssociationTest2(associationTest1.getId(), getRandom(), "son_" + i + "_" + j);
                list.add(associationTest2);
            }
            associationTest2Service.saveBatch(list);
        }

        long end = System.currentTimeMillis();
        log.info("order exec time: {}ms", end - start);
        log.info("end order test");
    }

    private static long getRandom() {
        return (long) (Math.random() * 100_000_000);
    }

}
