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


import com.dao.DaohuorukuDao;
import com.entity.DaohuorukuEntity;
import com.service.DaohuorukuService;
import com.entity.vo.DaohuorukuVO;
import com.entity.view.DaohuorukuView;

@Service("daohuorukuService")
public class DaohuorukuServiceImpl extends ServiceImpl<DaohuorukuDao, DaohuorukuEntity> implements DaohuorukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaohuorukuEntity> page = this.selectPage(
                new Query<DaohuorukuEntity>(params).getPage(),
                new EntityWrapper<DaohuorukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaohuorukuEntity> wrapper) {
		  Page<DaohuorukuView> page =new Query<DaohuorukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DaohuorukuVO> selectListVO(Wrapper<DaohuorukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaohuorukuVO selectVO(Wrapper<DaohuorukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaohuorukuView> selectListView(Wrapper<DaohuorukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaohuorukuView selectView(Wrapper<DaohuorukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
