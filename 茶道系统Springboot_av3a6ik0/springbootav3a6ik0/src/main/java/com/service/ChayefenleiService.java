package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChayefenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChayefenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChayefenleiView;


/**
 * 茶叶分类
 *
 * @author 
 * @email 
 * @date 2025-01-31 22:14:07
 */
public interface ChayefenleiService extends IService<ChayefenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChayefenleiVO> selectListVO(Wrapper<ChayefenleiEntity> wrapper);
   	
   	ChayefenleiVO selectVO(@Param("ew") Wrapper<ChayefenleiEntity> wrapper);
   	
   	List<ChayefenleiView> selectListView(Wrapper<ChayefenleiEntity> wrapper);
   	
   	ChayefenleiView selectView(@Param("ew") Wrapper<ChayefenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChayefenleiEntity> wrapper);

   	

}

