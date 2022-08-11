package io.lihongbin.sqltest.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.lihongbin.sqltest.entity.OrderTest;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Li Hong Bin
 * @since 2022-05-24
 */
public interface OrderTestService extends IService<OrderTest> {

    IPage<OrderTest> getPageList();

}
