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


import com.dao.ChayefenleiDao;
import com.entity.ChayefenleiEntity;
import com.service.ChayefenleiService;
import com.entity.vo.ChayefenleiVO;
import com.entity.view.ChayefenleiView;

@Service("chayefenleiService")
public class ChayefenleiServiceImpl extends ServiceImpl<ChayefenleiDao, ChayefenleiEntity> implements ChayefenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChayefenleiEntity> page = this.selectPage(
                new Query<ChayefenleiEntity>(params).getPage(),
                new EntityWrapper<ChayefenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChayefenleiEntity> wrapper) {
		  Page<ChayefenleiView> page =new Query<ChayefenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChayefenleiVO> selectListVO(Wrapper<ChayefenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChayefenleiVO selectVO(Wrapper<ChayefenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChayefenleiView> selectListView(Wrapper<ChayefenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChayefenleiView selectView(Wrapper<ChayefenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
