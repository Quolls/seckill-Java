package com.andy.seckill.db.mappers;

import com.andy.seckill.db.po.SeckillCommodity;

public interface SeckillCommodityMapper {
    int insert(SeckillCommodity record);

    int insertSelective(SeckillCommodity record);

    SeckillCommodity selectByPrimaryKey(long commodityId);
}