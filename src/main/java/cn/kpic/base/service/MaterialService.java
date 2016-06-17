package cn.kpic.base.service;

import cn.kpic.base.domain.Material;

import java.util.List;
import java.util.Map;

/**
 * Created by bjsunqinwen on 2016/6/17.
 */
public interface MaterialService {

    void insert(Material material);

    List<Material> getAllMaterial(Integer page);

}
