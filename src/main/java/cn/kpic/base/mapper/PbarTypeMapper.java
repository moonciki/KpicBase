package cn.kpic.base.mapper;

import cn.kpic.base.domain.PbarType;

import java.util.List;

/**
 * Created by bjsunqinwen on 2016/4/7.
 */
public interface PbarTypeMapper {

    List<PbarType> getAllType();

    void update(PbarType pbarType);

}
