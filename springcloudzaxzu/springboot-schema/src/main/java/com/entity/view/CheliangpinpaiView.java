package com.entity.view;

import com.entity.CheliangpinpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车辆品牌
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-09 17:23:57
 */
@TableName("cheliangpinpai")
public class CheliangpinpaiView  extends CheliangpinpaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CheliangpinpaiView(){
	}
 
 	public CheliangpinpaiView(CheliangpinpaiEntity cheliangpinpaiEntity){
 	try {
			BeanUtils.copyProperties(this, cheliangpinpaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
