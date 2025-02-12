package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscusschadaozhishikuEntity;
import com.entity.view.DiscusschadaozhishikuView;

import com.service.DiscusschadaozhishikuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 茶道知识库评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2025-01-31 22:14:09
 */
@RestController
@RequestMapping("/discusschadaozhishiku")
public class DiscusschadaozhishikuController {
    @Autowired
    private DiscusschadaozhishikuService discusschadaozhishikuService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusschadaozhishikuEntity discusschadaozhishiku,
		HttpServletRequest request){
        EntityWrapper<DiscusschadaozhishikuEntity> ew = new EntityWrapper<DiscusschadaozhishikuEntity>();

		PageUtils page = discusschadaozhishikuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschadaozhishiku), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusschadaozhishikuEntity discusschadaozhishiku, 
		HttpServletRequest request){
        EntityWrapper<DiscusschadaozhishikuEntity> ew = new EntityWrapper<DiscusschadaozhishikuEntity>();

		PageUtils page = discusschadaozhishikuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschadaozhishiku), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusschadaozhishikuEntity discusschadaozhishiku){
       	EntityWrapper<DiscusschadaozhishikuEntity> ew = new EntityWrapper<DiscusschadaozhishikuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusschadaozhishiku, "discusschadaozhishiku")); 
        return R.ok().put("data", discusschadaozhishikuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusschadaozhishikuEntity discusschadaozhishiku){
        EntityWrapper< DiscusschadaozhishikuEntity> ew = new EntityWrapper< DiscusschadaozhishikuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusschadaozhishiku, "discusschadaozhishiku")); 
		DiscusschadaozhishikuView discusschadaozhishikuView =  discusschadaozhishikuService.selectView(ew);
		return R.ok("查询茶道知识库评论表成功").put("data", discusschadaozhishikuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusschadaozhishikuEntity discusschadaozhishiku = discusschadaozhishikuService.selectById(id);
        return R.ok().put("data", discusschadaozhishiku);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusschadaozhishikuEntity discusschadaozhishiku = discusschadaozhishikuService.selectById(id);
        return R.ok().put("data", discusschadaozhishiku);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusschadaozhishikuEntity discusschadaozhishiku, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(discusschadaozhishiku);
        discusschadaozhishikuService.insert(discusschadaozhishiku);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusschadaozhishikuEntity discusschadaozhishiku, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(discusschadaozhishiku);
        discusschadaozhishikuService.insert(discusschadaozhishiku);
        return R.ok();
    }



     /**
     * 获取用户密保
     */
    @RequestMapping("/security")
    @IgnoreAuth
    public R security(@RequestParam String username){
        DiscusschadaozhishikuEntity discusschadaozhishiku = discusschadaozhishikuService.selectOne(new EntityWrapper<DiscusschadaozhishikuEntity>().eq("", username));
        return R.ok().put("data", discusschadaozhishiku);
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody DiscusschadaozhishikuEntity discusschadaozhishiku, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusschadaozhishiku);
        discusschadaozhishikuService.updateById(discusschadaozhishiku);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusschadaozhishikuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DiscusschadaozhishikuEntity discusschadaozhishiku, HttpServletRequest request,String pre){
        EntityWrapper<DiscusschadaozhishikuEntity> ew = new EntityWrapper<DiscusschadaozhishikuEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = discusschadaozhishikuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusschadaozhishiku), params), params));
        return R.ok().put("data", page);
    }










}
