package cn.chenw.design_patterns.strategy.service.context;

import cn.chenw.design_patterns.strategy.model.Order;
import cn.chenw.design_patterns.strategy.model.OrderDto;
import cn.chenw.design_patterns.strategy.model.enummodel.SkuSourceEnum;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderContextTest {

    @Resource
    private OrderContext orderContext;


    @Test
    void execute() {
        OrderDto orderDto = new OrderDto();
        orderDto.setOrder(new Order());
        orderDto.setSource(SkuSourceEnum.JD);
        String execute = orderContext.execute(orderDto);
        System.out.println("打印:"+execute);
    }
}