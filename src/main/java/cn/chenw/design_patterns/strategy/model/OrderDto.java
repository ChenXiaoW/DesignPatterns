package ink.cwblog.strategy_demo.model;

import ink.cwblog.strategy_demo.model.enummodel.SkuSourceEnum;
import lombok.Data;

/**
 * @author  chenw
 * @date  2020/7/3 13:23
 */
@Data
public class OrderDto {

    private SkuSourceEnum source;

    private Order order;
}
