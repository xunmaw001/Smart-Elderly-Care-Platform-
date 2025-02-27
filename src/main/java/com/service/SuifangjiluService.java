package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SuifangjiluEntity;
import java.util.Map;

/**
 * 随访记录 服务类
 */
public interface SuifangjiluService extends IService<SuifangjiluEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}