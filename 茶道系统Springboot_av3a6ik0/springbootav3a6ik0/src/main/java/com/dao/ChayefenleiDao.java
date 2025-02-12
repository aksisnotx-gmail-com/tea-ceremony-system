package com.dao;

import com.entity.ChayefenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChayefenleiVO;
import com.entity.view.ChayefenleiView;


/**
 * 茶叶分类
 * 
 * @author 
 * @email 
 * @date 2025-01-31 22:14:07
 */
public interface ChayefenleiDao extends BaseMapper<ChayefenleiEntity> {
	
	List<ChayefenleiVO> selectListVO(@Param("ew") Wrapper<ChayefenleiEntity> wrapper);
	
	ChayefenleiVO selectVO(@Param("ew") Wrapper<ChayefenleiEntity> wrapper);
	
	List<ChayefenleiView> selectListView(@Param("ew") Wrapper<ChayefenleiEntity> wrapper);

	List<ChayefenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ChayefenleiEntity> wrapper);

	
	ChayefenleiView selectView(@Param("ew") Wrapper<ChayefenleiEntity> wrapper);
	

}
