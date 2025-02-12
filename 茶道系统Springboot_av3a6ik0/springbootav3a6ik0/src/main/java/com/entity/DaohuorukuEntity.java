package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 到货入库
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2025-01-31 22:14:08
 */
@TableName("daohuoruku")
public class DaohuorukuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DaohuorukuEntity() {
		
	}
	
	public DaohuorukuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 入库编号
	 */
					
	private String rukubianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：入库编号
	 */
	public void setRukubianhao(String rukubianhao) {
		this.rukubianhao = rukubianhao;
	}
	/**
	 * 获取：入库编号
	 */
	public String getRukubianhao() {
		return rukubianhao;
	}
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
