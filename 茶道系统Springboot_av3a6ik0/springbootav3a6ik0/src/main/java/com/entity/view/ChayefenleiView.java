package com.entity.view;

import com.entity.ChayefenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 茶叶分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-01-31 22:14:07
 */
@TableName("chayefenlei")
public class ChayefenleiView  extends ChayefenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChayefenleiView(){
	}
 
 	public ChayefenleiView(ChayefenleiEntity chayefenleiEntity){
 	try {
			BeanUtils.copyProperties(this, chayefenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
