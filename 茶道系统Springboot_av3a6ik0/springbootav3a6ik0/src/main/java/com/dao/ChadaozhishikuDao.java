package com.dao;

import com.entity.ChadaozhishikuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChadaozhishikuVO;
import com.entity.view.ChadaozhishikuView;


/**
 * 茶道知识库
 * 
 * @author 
 * @email 
 * @date 2025-01-31 22:14:08
 */
public interface ChadaozhishikuDao extends BaseMapper<ChadaozhishikuEntity> {
	
	List<ChadaozhishikuVO> selectListVO(@Param("ew") Wrapper<ChadaozhishikuEntity> wrapper);
	
	ChadaozhishikuVO selectVO(@Param("ew") Wrapper<ChadaozhishikuEntity> wrapper);
	
	List<ChadaozhishikuView> selectListView(@Param("ew") Wrapper<ChadaozhishikuEntity> wrapper);

	List<ChadaozhishikuView> selectListView(Pagination page,@Param("ew") Wrapper<ChadaozhishikuEntity> wrapper);

	
	ChadaozhishikuView selectView(@Param("ew") Wrapper<ChadaozhishikuEntity> wrapper);
	

}
