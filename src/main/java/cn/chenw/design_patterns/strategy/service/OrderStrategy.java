package cn.chenw.design_patterns.strategy.service;


import cn.chenw.design_patterns.strategy.model.Order;

/**
 * @author  chenw
 * @date  2020/6/2 10:08
 *
 * 订单策略
 */
public interface OrderStrategy {


    String createOrder(Order order);
}
