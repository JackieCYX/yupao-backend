package com.yupi.yupao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.yupao.model.domain.Tag;
import com.yupi.yupao.service.TagService;
import com.yupi.yupao.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author CYX
* @description 针对表【tag(标签)】的数据库操作Service实现
* @createDate 2024-03-07 19:45:32
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




