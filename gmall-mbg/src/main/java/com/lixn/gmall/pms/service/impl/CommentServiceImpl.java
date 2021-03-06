package com.lixn.gmall.pms.service.impl;

import com.lixn.gmall.pms.entity.Comment;
import com.lixn.gmall.pms.mapper.CommentMapper;
import com.lixn.gmall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
