package io.lihongbin.sqltest.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.lihongbin.sqltest.entity.OrderTest;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Li Hong Bin
 * @since 2022-05-24
 */
@Repository
public interface OrderTestMapper extends BaseMapper<OrderTest> {

    IPage<OrderTest> getPageList(Page<OrderTest> page);

}
