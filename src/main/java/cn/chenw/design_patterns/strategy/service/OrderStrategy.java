package ink.cwblog.strategy_demo.demo3.strategy.strategy;


import ink.cwblog.strategy_demo.model.Order;

/**
 * @author  chenw
 * @date  2020/6/2 10:08
 *
 * 订单策略
 */
public interface OrderStrategy {


    String createOrder(Order order);
}
