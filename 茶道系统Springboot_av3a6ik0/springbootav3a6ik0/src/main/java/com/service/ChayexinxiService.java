package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChayexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChayexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChayexinxiView;


/**
 * 茶叶信息
 *
 * @author 
 * @email 
 * @date 2025-01-31 22:14:07
 */
public interface ChayexinxiService extends IService<ChayexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChayexinxiVO> selectListVO(Wrapper<ChayexinxiEntity> wrapper);
   	
   	ChayexinxiVO selectVO(@Param("ew") Wrapper<ChayexinxiEntity> wrapper);
   	
   	List<ChayexinxiView> selectListView(Wrapper<ChayexinxiEntity> wrapper);
   	
   	ChayexinxiView selectView(@Param("ew") Wrapper<ChayexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChayexinxiEntity> wrapper);

   	

}

