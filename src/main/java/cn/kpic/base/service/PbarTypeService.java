package cn.kpic.base.service;

import cn.kpic.base.domain.PbarType;

import java.util.List;

/**
 * Created by bjsunqinwen on 2016/6/17.
 */
public interface PbarTypeService {

    List<PbarType> getAllPbarType();

    void update(PbarType pbarType);

}
