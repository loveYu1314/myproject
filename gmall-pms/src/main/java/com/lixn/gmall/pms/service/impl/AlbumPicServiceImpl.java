package com.lixn.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lixn.gmall.pms.entity.AlbumPic;
import com.lixn.gmall.pms.mapper.AlbumPicMapper;
import com.lixn.gmall.pms.service.AlbumPicService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 画册图片表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Service // 暴露dubbo服务
@Component
public class AlbumPicServiceImpl extends ServiceImpl<AlbumPicMapper, AlbumPic> implements AlbumPicService {

}
