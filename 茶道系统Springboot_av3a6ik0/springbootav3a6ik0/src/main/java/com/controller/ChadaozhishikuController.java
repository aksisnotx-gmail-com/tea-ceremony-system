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

import com.entity.ChadaozhishikuEntity;
import com.entity.view.ChadaozhishikuView;

import com.service.ChadaozhishikuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 茶道知识库
 * 后端接口
 * @author 
 * @email 
 * @date 2025-01-31 22:14:08
 */
@RestController
@RequestMapping("/chadaozhishiku")
public class ChadaozhishikuController {
    @Autowired
    private ChadaozhishikuService chadaozhishikuService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChadaozhishikuEntity chadaozhishiku,
		HttpServletRequest request){
        EntityWrapper<ChadaozhishikuEntity> ew = new EntityWrapper<ChadaozhishikuEntity>();

		PageUtils page = chadaozhishikuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chadaozhishiku), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChadaozhishikuEntity chadaozhishiku, 
		HttpServletRequest request){
        EntityWrapper<ChadaozhishikuEntity> ew = new EntityWrapper<ChadaozhishikuEntity>();

		PageUtils page = chadaozhishikuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chadaozhishiku), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChadaozhishikuEntity chadaozhishiku){
       	EntityWrapper<ChadaozhishikuEntity> ew = new EntityWrapper<ChadaozhishikuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chadaozhishiku, "chadaozhishiku")); 
        return R.ok().put("data", chadaozhishikuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChadaozhishikuEntity chadaozhishiku){
        EntityWrapper< ChadaozhishikuEntity> ew = new EntityWrapper< ChadaozhishikuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chadaozhishiku, "chadaozhishiku")); 
		ChadaozhishikuView chadaozhishikuView =  chadaozhishikuService.selectView(ew);
		return R.ok("查询茶道知识库成功").put("data", chadaozhishikuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChadaozhishikuEntity chadaozhishiku = chadaozhishikuService.selectById(id);
		chadaozhishiku.setClicknum(chadaozhishiku.getClicknum()+1);
		chadaozhishiku.setClicktime(new Date());
		chadaozhishikuService.updateById(chadaozhishiku);
        chadaozhishiku = chadaozhishikuService.selectView(new EntityWrapper<ChadaozhishikuEntity>().eq("id", id));
        return R.ok().put("data", chadaozhishiku);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChadaozhishikuEntity chadaozhishiku = chadaozhishikuService.selectById(id);
		chadaozhishiku.setClicknum(chadaozhishiku.getClicknum()+1);
		chadaozhishiku.setClicktime(new Date());
		chadaozhishikuService.updateById(chadaozhishiku);
        chadaozhishiku = chadaozhishikuService.selectView(new EntityWrapper<ChadaozhishikuEntity>().eq("id", id));
        return R.ok().put("data", chadaozhishiku);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChadaozhishikuEntity chadaozhishiku, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chadaozhishiku);
        chadaozhishikuService.insert(chadaozhishiku);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChadaozhishikuEntity chadaozhishiku, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(chadaozhishiku);
        chadaozhishikuService.insert(chadaozhishiku);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChadaozhishikuEntity chadaozhishiku, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chadaozhishiku);
        chadaozhishikuService.updateById(chadaozhishiku);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chadaozhishikuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ChadaozhishikuEntity chadaozhishiku, HttpServletRequest request,String pre){
        EntityWrapper<ChadaozhishikuEntity> ew = new EntityWrapper<ChadaozhishikuEntity>();
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
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = chadaozhishikuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chadaozhishiku), params), params));
        return R.ok().put("data", page);
    }










}
