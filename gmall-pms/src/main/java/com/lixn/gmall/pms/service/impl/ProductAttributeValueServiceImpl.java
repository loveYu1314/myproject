package com.lixn.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lixn.gmall.pms.entity.ProductAttributeValue;
import com.lixn.gmall.pms.mapper.ProductAttributeValueMapper;
import com.lixn.gmall.pms.service.ProductAttributeValueService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 存储产品参数信息的表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Service
public class ProductAttributeValueServiceImpl extends ServiceImpl<ProductAttributeValueMapper, ProductAttributeValue> implements ProductAttributeValueService {

}
