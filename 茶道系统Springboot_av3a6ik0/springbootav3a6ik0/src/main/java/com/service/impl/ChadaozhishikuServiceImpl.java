package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChadaozhishikuDao;
import com.entity.ChadaozhishikuEntity;
import com.service.ChadaozhishikuService;
import com.entity.vo.ChadaozhishikuVO;
import com.entity.view.ChadaozhishikuView;

@Service("chadaozhishikuService")
public class ChadaozhishikuServiceImpl extends ServiceImpl<ChadaozhishikuDao, ChadaozhishikuEntity> implements ChadaozhishikuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChadaozhishikuEntity> page = this.selectPage(
                new Query<ChadaozhishikuEntity>(params).getPage(),
                new EntityWrapper<ChadaozhishikuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChadaozhishikuEntity> wrapper) {
		  Page<ChadaozhishikuView> page =new Query<ChadaozhishikuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChadaozhishikuVO> selectListVO(Wrapper<ChadaozhishikuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChadaozhishikuVO selectVO(Wrapper<ChadaozhishikuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChadaozhishikuView> selectListView(Wrapper<ChadaozhishikuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChadaozhishikuView selectView(Wrapper<ChadaozhishikuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
