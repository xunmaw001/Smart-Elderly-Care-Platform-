package com.entity.model;

import com.entity.JigoushequEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 机构社区人员
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JigoushequModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 姓名
     */
    private String jigoushequName;


    /**
     * 手机号
     */
    private String jigoushequPhone;


    /**
     * 身份证号
     */
    private String jigoushequIdNumber;


    /**
     * 照片
     */
    private String jigoushequPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：姓名
	 */
    public String getJigoushequName() {
        return jigoushequName;
    }


    /**
	 * 设置：姓名
	 */
    public void setJigoushequName(String jigoushequName) {
        this.jigoushequName = jigoushequName;
    }
    /**
	 * 获取：手机号
	 */
    public String getJigoushequPhone() {
        return jigoushequPhone;
    }


    /**
	 * 设置：手机号
	 */
    public void setJigoushequPhone(String jigoushequPhone) {
        this.jigoushequPhone = jigoushequPhone;
    }
    /**
	 * 获取：身份证号
	 */
    public String getJigoushequIdNumber() {
        return jigoushequIdNumber;
    }


    /**
	 * 设置：身份证号
	 */
    public void setJigoushequIdNumber(String jigoushequIdNumber) {
        this.jigoushequIdNumber = jigoushequIdNumber;
    }
    /**
	 * 获取：照片
	 */
    public String getJigoushequPhoto() {
        return jigoushequPhoto;
    }


    /**
	 * 设置：照片
	 */
    public void setJigoushequPhoto(String jigoushequPhoto) {
        this.jigoushequPhoto = jigoushequPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
