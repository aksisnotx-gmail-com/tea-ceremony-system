package com.entity.vo;

import com.entity.DaohuorukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 到货入库
 * @author 
 * @email 
 * @date 2025-01-31 22:14:08
 */
public class DaohuorukuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 茶叶名称
	 */
	
	private String chayemingcheng;
		
	/**
	 * 茶叶分类
	 */
	
	private String chayefenlei;
		
	/**
	 * 数量
	 */
	
	private Integer alllimittimes;
		
	/**
	 * 入库日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date rukuriqi;
		
	/**
	 * 供应商
	 */
	
	private String gongyingshang;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：茶叶名称
	 */
	 
	public void setChayemingcheng(String chayemingcheng) {
		this.chayemingcheng = chayemingcheng;
	}
	
	/**
	 * 获取：茶叶名称
	 */
	public String getChayemingcheng() {
		return chayemingcheng;
	}
				
	
	/**
	 * 设置：茶叶分类
	 */
	 
	public void setChayefenlei(String chayefenlei) {
		this.chayefenlei = chayefenlei;
	}
	
	/**
	 * 获取：茶叶分类
	 */
	public String getChayefenlei() {
		return chayefenlei;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setAlllimittimes(Integer alllimittimes) {
		this.alllimittimes = alllimittimes;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getAlllimittimes() {
		return alllimittimes;
	}
				
	
	/**
	 * 设置：入库日期
	 */
	 
	public void setRukuriqi(Date rukuriqi) {
		this.rukuriqi = rukuriqi;
	}
	
	/**
	 * 获取：入库日期
	 */
	public Date getRukuriqi() {
		return rukuriqi;
	}
				
	
	/**
	 * 设置：供应商
	 */
	 
	public void setGongyingshang(String gongyingshang) {
		this.gongyingshang = gongyingshang;
	}
	
	/**
	 * 获取：供应商
	 */
	public String getGongyingshang() {
		return gongyingshang;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
