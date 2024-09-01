package com.fulian.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fulian.springbootinit.mapper.ChartMapper;
import com.fulian.springbootinit.model.entity.Chart;
import com.fulian.springbootinit.service.ChartService;
import org.springframework.stereotype.Service;

/**
* @author fulian
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2024-09-01 21:31:16
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




