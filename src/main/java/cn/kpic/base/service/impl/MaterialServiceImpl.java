package cn.kpic.base.service.impl;

import cn.kpic.base.domain.Material;
import cn.kpic.base.mapper.MaterialMapper;
import cn.kpic.base.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by bjsunqinwen on 2016/6/17.
 */
@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private MaterialMapper materialMapper;

    @Override
    @Transactional
    public void insert(Material material) {
        this.materialMapper.insert(material);
    }

    @Override
    public List<Material> getAllMaterial(Integer page) {
        return this.materialMapper.getAllMaterial(page);
    }
}
