package cn.chenw.design_patterns.strategy.service.impl;

import cn.chenw.design_patterns.strategy.model.Order;
import cn.chenw.design_patterns.strategy.service.OrderStrategy;
import org.springframework.stereotype.Component;

/**
 * @author chenw
 * @date 2020/6/2 10:10
 */
@Component("MCOrder")
public class MCOrderStrategy implements OrderStrategy {
    @Override
    public String createOrder(Order order) {
        return "执行自营订单创建策略";
    }
}
