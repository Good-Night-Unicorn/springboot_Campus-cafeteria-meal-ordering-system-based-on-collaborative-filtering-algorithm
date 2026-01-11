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
 * 商家
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-12-18 18:40:52
 */
@TableName("shangjia")
public class ShangjiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShangjiaEntity() {
		
	}
	
	public ShangjiaEntity(T t) {
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
    @TableId
    private Long id;
	/**
	 * 店铺账号
	 */
					
	private String dianpuzhanghao;
	
	/**
	 * 店铺名称
	 */
					
	private String dianpumingcheng;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 店铺简介
	 */
					
	private String dianpujianjie;
	
	/**
	 * 店铺地址
	 */
					
	private String dianpudizhi;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 店铺照片
	 */
					
	private String dianpuzhaopian;
	
	/**
	 * 余额
	 */
					
	private Double money;
	
	
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
	 * 设置：店铺账号
	 */
	public void setDianpuzhanghao(String dianpuzhanghao) {
		this.dianpuzhanghao = dianpuzhanghao;
	}
	/**
	 * 获取：店铺账号
	 */
	public String getDianpuzhanghao() {
		return dianpuzhanghao;
	}
	/**
	 * 设置：店铺名称
	 */
	public void setDianpumingcheng(String dianpumingcheng) {
		this.dianpumingcheng = dianpumingcheng;
	}
	/**
	 * 获取：店铺名称
	 */
	public String getDianpumingcheng() {
		return dianpumingcheng;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：店铺简介
	 */
	public void setDianpujianjie(String dianpujianjie) {
		this.dianpujianjie = dianpujianjie;
	}
	/**
	 * 获取：店铺简介
	 */
	public String getDianpujianjie() {
		return dianpujianjie;
	}
	/**
	 * 设置：店铺地址
	 */
	public void setDianpudizhi(String dianpudizhi) {
		this.dianpudizhi = dianpudizhi;
	}
	/**
	 * 获取：店铺地址
	 */
	public String getDianpudizhi() {
		return dianpudizhi;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：店铺照片
	 */
	public void setDianpuzhaopian(String dianpuzhaopian) {
		this.dianpuzhaopian = dianpuzhaopian;
	}
	/**
	 * 获取：店铺照片
	 */
	public String getDianpuzhaopian() {
		return dianpuzhaopian;
	}
	/**
	 * 设置：余额
	 */
	public void setMoney(Double money) {
		this.money = money;
	}
	/**
	 * 获取：余额
	 */
	public Double getMoney() {
		return money;
	}

}
