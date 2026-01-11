package com.entity.vo;

import com.entity.ShangjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 商家
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-12-18 18:40:52
 */
public class ShangjiaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
