package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChadaozhishikuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChadaozhishikuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChadaozhishikuView;


/**
 * 茶道知识库
 *
 * @author 
 * @email 
 * @date 2025-01-31 22:14:08
 */
public interface ChadaozhishikuService extends IService<ChadaozhishikuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChadaozhishikuVO> selectListVO(Wrapper<ChadaozhishikuEntity> wrapper);
   	
   	ChadaozhishikuVO selectVO(@Param("ew") Wrapper<ChadaozhishikuEntity> wrapper);
   	
   	List<ChadaozhishikuView> selectListView(Wrapper<ChadaozhishikuEntity> wrapper);
   	
   	ChadaozhishikuView selectView(@Param("ew") Wrapper<ChadaozhishikuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChadaozhishikuEntity> wrapper);

   	

}

