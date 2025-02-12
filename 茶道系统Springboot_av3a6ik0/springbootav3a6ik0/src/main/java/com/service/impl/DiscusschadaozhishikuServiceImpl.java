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


import com.dao.DiscusschadaozhishikuDao;
import com.entity.DiscusschadaozhishikuEntity;
import com.service.DiscusschadaozhishikuService;
import com.entity.vo.DiscusschadaozhishikuVO;
import com.entity.view.DiscusschadaozhishikuView;

@Service("discusschadaozhishikuService")
public class DiscusschadaozhishikuServiceImpl extends ServiceImpl<DiscusschadaozhishikuDao, DiscusschadaozhishikuEntity> implements DiscusschadaozhishikuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschadaozhishikuEntity> page = this.selectPage(
                new Query<DiscusschadaozhishikuEntity>(params).getPage(),
                new EntityWrapper<DiscusschadaozhishikuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschadaozhishikuEntity> wrapper) {
		  Page<DiscusschadaozhishikuView> page =new Query<DiscusschadaozhishikuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscusschadaozhishikuVO> selectListVO(Wrapper<DiscusschadaozhishikuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschadaozhishikuVO selectVO(Wrapper<DiscusschadaozhishikuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschadaozhishikuView> selectListView(Wrapper<DiscusschadaozhishikuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschadaozhishikuView selectView(Wrapper<DiscusschadaozhishikuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
