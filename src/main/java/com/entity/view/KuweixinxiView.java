package com.entity.view;

import com.entity.KuweixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 库位信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-11 11:58:02
 */
@TableName("kuweixinxi")
public class KuweixinxiView  extends KuweixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KuweixinxiView(){
	}
 
 	public KuweixinxiView(KuweixinxiEntity kuweixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, kuweixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
