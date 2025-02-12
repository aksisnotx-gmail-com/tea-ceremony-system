package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaohuorukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaohuorukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaohuorukuView;


/**
 * 到货入库
 *
 * @author 
 * @email 
 * @date 2025-01-31 22:14:08
 */
public interface DaohuorukuService extends IService<DaohuorukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaohuorukuVO> selectListVO(Wrapper<DaohuorukuEntity> wrapper);
   	
   	DaohuorukuVO selectVO(@Param("ew") Wrapper<DaohuorukuEntity> wrapper);
   	
   	List<DaohuorukuView> selectListView(Wrapper<DaohuorukuEntity> wrapper);
   	
   	DaohuorukuView selectView(@Param("ew") Wrapper<DaohuorukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaohuorukuEntity> wrapper);

   	

}

