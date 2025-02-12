package com.dao;

import com.entity.DiscusschadaozhishikuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschadaozhishikuVO;
import com.entity.view.DiscusschadaozhishikuView;


/**
 * 茶道知识库评论表
 * 
 * @author 
 * @email 
 * @date 2025-01-31 22:14:09
 */
public interface DiscusschadaozhishikuDao extends BaseMapper<DiscusschadaozhishikuEntity> {
	
	List<DiscusschadaozhishikuVO> selectListVO(@Param("ew") Wrapper<DiscusschadaozhishikuEntity> wrapper);
	
	DiscusschadaozhishikuVO selectVO(@Param("ew") Wrapper<DiscusschadaozhishikuEntity> wrapper);
	
	List<DiscusschadaozhishikuView> selectListView(@Param("ew") Wrapper<DiscusschadaozhishikuEntity> wrapper);

	List<DiscusschadaozhishikuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschadaozhishikuEntity> wrapper);

	
	DiscusschadaozhishikuView selectView(@Param("ew") Wrapper<DiscusschadaozhishikuEntity> wrapper);
	

}
