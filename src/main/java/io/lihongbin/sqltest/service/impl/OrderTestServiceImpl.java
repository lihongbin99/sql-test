package io.lihongbin.sqltest.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.lihongbin.sqltest.entity.OrderTest;
import io.lihongbin.sqltest.mapper.OrderTestMapper;
import io.lihongbin.sqltest.service.OrderTestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Li Hong Bin
 * @since 2022-05-24
 */
@Service
public class OrderTestServiceImpl extends ServiceImpl<OrderTestMapper, OrderTest> implements OrderTestService {

    private final OrderTestMapper orderTestMapper;

    public OrderTestServiceImpl(OrderTestMapper orderTestMapper) {
        this.orderTestMapper = orderTestMapper;
    }

    @Override
    public IPage<OrderTest> getPageList() {
        Page<OrderTest> page = new Page<>(2, 5);
        return orderTestMapper.getPageList(page);
    }
}
