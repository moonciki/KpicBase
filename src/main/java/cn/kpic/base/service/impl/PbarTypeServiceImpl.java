package cn.kpic.base.service.impl;

import cn.kpic.base.domain.PbarType;
import cn.kpic.base.mapper.PbarTypeMapper;
import cn.kpic.base.redis.RedisCacheKey;
import cn.kpic.base.service.PbarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bjsunqinwen on 2016/6/17.
 */
@Service
public class PbarTypeServiceImpl implements PbarTypeService{

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private PbarTypeMapper pbarTypeMapper;

    @Override
    public List<PbarType> getAllPbarType() {
        return this.pbarTypeMapper.getAllType();
    }

    @Override
    @Transactional
    public void update(PbarType pbarType) {
        this.pbarTypeMapper.update(pbarType);
        /** 清首页类型缓存*/
        String key = RedisCacheKey.PBAR_TYPE_INDEX;
        if(redisTemplate.hasKey(key)){
            redisTemplate.delete(key);
        }
    }
}
