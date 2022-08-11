package io.lihongbin.sqltest.main;

import io.lihongbin.sqltest.entity.OrderTest;
import io.lihongbin.sqltest.service.OrderTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class OrderTestMain implements InitializingBean {

    private final OrderTestService orderTestService;

    public OrderTestMain(OrderTestService orderTestService) {
        this.orderTestService = orderTestService;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        log.info("start order test");
//        long start = System.currentTimeMillis();
//
//        List<OrderTest> list = new ArrayList<>();
//
//        LocalDateTime now = LocalDateTime.now();
//        for (int i = 0; i < 4000000; i++) {
//            int random = (int) (Math.random() * 315_360_000);
//            LocalDateTime testTime = now.plusSeconds(-random);
//            list.add(new OrderTest(testTime));
//        }
//        orderTestService.saveBatch(list);
//
//        long end = System.currentTimeMillis();
//        log.info("order exec time: {}ms", end - start);
//        log.info("end order test");
    }

}
