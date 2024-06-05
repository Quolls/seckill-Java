package com.andy.seckill.db.mappers;

import com.andy.seckill.db.po.SeckillActivity;

import java.util.List;

public interface SeckillActivityMapper {
    int insert(SeckillActivity record);

    int insertSelective(SeckillActivity record);

    List<SeckillActivity> querySeckillActivitysByStatus(int activityStatus);

    SeckillActivity selectByPrimaryKey(long activityId);

    void updateByPrimaryKey(SeckillActivity seckillActivity);
}