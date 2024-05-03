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

import com.entity.KuweixinxiEntity;
import com.entity.view.KuweixinxiView;

import com.service.KuweixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 库位信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-11 11:58:02
 */
@RestController
@RequestMapping("/kuweixinxi")
public class KuweixinxiController {
    @Autowired
    private KuweixinxiService kuweixinxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KuweixinxiEntity kuweixinxi,
		HttpServletRequest request){
        EntityWrapper<KuweixinxiEntity> ew = new EntityWrapper<KuweixinxiEntity>();

		PageUtils page = kuweixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kuweixinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KuweixinxiEntity kuweixinxi, 
		HttpServletRequest request){
        EntityWrapper<KuweixinxiEntity> ew = new EntityWrapper<KuweixinxiEntity>();

		PageUtils page = kuweixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kuweixinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KuweixinxiEntity kuweixinxi){
       	EntityWrapper<KuweixinxiEntity> ew = new EntityWrapper<KuweixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kuweixinxi, "kuweixinxi")); 
        return R.ok().put("data", kuweixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KuweixinxiEntity kuweixinxi){
        EntityWrapper< KuweixinxiEntity> ew = new EntityWrapper< KuweixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kuweixinxi, "kuweixinxi")); 
		KuweixinxiView kuweixinxiView =  kuweixinxiService.selectView(ew);
		return R.ok("查询库位信息成功").put("data", kuweixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KuweixinxiEntity kuweixinxi = kuweixinxiService.selectById(id);
        return R.ok().put("data", kuweixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KuweixinxiEntity kuweixinxi = kuweixinxiService.selectById(id);
        return R.ok().put("data", kuweixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KuweixinxiEntity kuweixinxi, HttpServletRequest request){
    	kuweixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kuweixinxi);
        kuweixinxiService.insert(kuweixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KuweixinxiEntity kuweixinxi, HttpServletRequest request){
    	kuweixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kuweixinxi);
        kuweixinxiService.insert(kuweixinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KuweixinxiEntity kuweixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kuweixinxi);
        kuweixinxiService.updateById(kuweixinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kuweixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
