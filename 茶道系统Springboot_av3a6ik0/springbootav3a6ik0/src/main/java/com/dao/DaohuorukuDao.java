package com.dao;

import com.entity.DaohuorukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaohuorukuVO;
import com.entity.view.DaohuorukuView;


/**
 * 到货入库
 * 
 * @author 
 * @email 
 * @date 2025-01-31 22:14:08
 */
public interface DaohuorukuDao extends BaseMapper<DaohuorukuEntity> {
	
	List<DaohuorukuVO> selectListVO(@Param("ew") Wrapper<DaohuorukuEntity> wrapper);
	
	DaohuorukuVO selectVO(@Param("ew") Wrapper<DaohuorukuEntity> wrapper);
	
	List<DaohuorukuView> selectListView(@Param("ew") Wrapper<DaohuorukuEntity> wrapper);

	List<DaohuorukuView> selectListView(Pagination page,@Param("ew") Wrapper<DaohuorukuEntity> wrapper);

	
	DaohuorukuView selectView(@Param("ew") Wrapper<DaohuorukuEntity> wrapper);
	

}
