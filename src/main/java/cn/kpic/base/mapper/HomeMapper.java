package cn.kpic.base.mapper;

import cn.kpic.base.domain.Home;

import java.util.List;

/**
 * Created by bjsunqinwen on 2016/6/17.
 */
public interface HomeMapper {

    List<Home> getAllHome(Integer id);

    void insert(Home home);

    void update(Home home);

}
