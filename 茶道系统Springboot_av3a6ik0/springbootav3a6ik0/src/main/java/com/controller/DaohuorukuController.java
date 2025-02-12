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

import com.entity.DaohuorukuEntity;
import com.entity.view.DaohuorukuView;

import com.service.DaohuorukuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 到货入库
 * 后端接口
 * @author 
 * @email 
 * @date 2025-01-31 22:14:08
 */
@RestController
@RequestMapping("/daohuoruku")
public class DaohuorukuController {
    @Autowired
    private DaohuorukuService daohuorukuService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DaohuorukuEntity daohuoruku,
		HttpServletRequest request){
        EntityWrapper<DaohuorukuEntity> ew = new EntityWrapper<DaohuorukuEntity>();

		PageUtils page = daohuorukuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, daohuoruku), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DaohuorukuEntity daohuoruku, 
		HttpServletRequest request){
        EntityWrapper<DaohuorukuEntity> ew = new EntityWrapper<DaohuorukuEntity>();

		PageUtils page = daohuorukuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, daohuoruku), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DaohuorukuEntity daohuoruku){
       	EntityWrapper<DaohuorukuEntity> ew = new EntityWrapper<DaohuorukuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( daohuoruku, "daohuoruku")); 
        return R.ok().put("data", daohuorukuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DaohuorukuEntity daohuoruku){
        EntityWrapper< DaohuorukuEntity> ew = new EntityWrapper< DaohuorukuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( daohuoruku, "daohuoruku")); 
		DaohuorukuView daohuorukuView =  daohuorukuService.selectView(ew);
		return R.ok("查询到货入库成功").put("data", daohuorukuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DaohuorukuEntity daohuoruku = daohuorukuService.selectById(id);
        return R.ok().put("data", daohuoruku);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DaohuorukuEntity daohuoruku = daohuorukuService.selectById(id);
        return R.ok().put("data", daohuoruku);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DaohuorukuEntity daohuoruku, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(daohuoruku);
        daohuorukuService.insert(daohuoruku);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DaohuorukuEntity daohuoruku, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(daohuoruku);
        daohuorukuService.insert(daohuoruku);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DaohuorukuEntity daohuoruku, HttpServletRequest request){
        //ValidatorUtils.validateEntity(daohuoruku);
        daohuorukuService.updateById(daohuoruku);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        daohuorukuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
