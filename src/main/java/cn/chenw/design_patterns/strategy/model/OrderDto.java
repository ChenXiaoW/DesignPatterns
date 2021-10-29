package cn.chenw.design_patterns.strategy.model;

import cn.chenw.design_patterns.strategy.model.enummodel.SkuSourceEnum;
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
