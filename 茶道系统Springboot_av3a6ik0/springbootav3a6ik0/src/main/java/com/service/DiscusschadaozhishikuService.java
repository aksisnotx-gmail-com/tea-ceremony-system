package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschadaozhishikuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschadaozhishikuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschadaozhishikuView;


/**
 * 茶道知识库评论表
 *
 * @author 
 * @email 
 * @date 2025-01-31 22:14:09
 */
public interface DiscusschadaozhishikuService extends IService<DiscusschadaozhishikuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschadaozhishikuVO> selectListVO(Wrapper<DiscusschadaozhishikuEntity> wrapper);
   	
   	DiscusschadaozhishikuVO selectVO(@Param("ew") Wrapper<DiscusschadaozhishikuEntity> wrapper);
   	
   	List<DiscusschadaozhishikuView> selectListView(Wrapper<DiscusschadaozhishikuEntity> wrapper);
   	
   	DiscusschadaozhishikuView selectView(@Param("ew") Wrapper<DiscusschadaozhishikuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschadaozhishikuEntity> wrapper);

   	

}

