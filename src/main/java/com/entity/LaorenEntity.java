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
 * 老人
 *
 * @author 
 * @email
 */
@TableName("laoren")
public class LaorenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LaorenEntity() {

	}

	public LaorenEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 老人姓名
     */
    @TableField(value = "laoren_name")

    private String laorenName;


    /**
     * 老人手机号
     */
    @TableField(value = "laoren_phone")

    private String laorenPhone;


    /**
     * 老人身份证号
     */
    @TableField(value = "laoren_id_number")

    private String laorenIdNumber;


    /**
     * 照片
     */
    @TableField(value = "yonghu_photo")

    private String yonghuPhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 是否独居
     */
    @TableField(value = "duju_types")

    private Integer dujuTypes;


    /**
     * 是否残疾
     */
    @TableField(value = "canji_types")

    private Integer canjiTypes;


    /**
     * 养老方式类型
     */
    @TableField(value = "yanglaofanghsi_types")

    private Integer yanglaofanghsiTypes;


    /**
     * 慢性疾病
     */
    @TableField(value = "jibing_content")

    private String jibingContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：老人姓名
	 */
    public String getLaorenName() {
        return laorenName;
    }


    /**
	 * 获取：老人姓名
	 */

    public void setLaorenName(String laorenName) {
        this.laorenName = laorenName;
    }
    /**
	 * 设置：老人手机号
	 */
    public String getLaorenPhone() {
        return laorenPhone;
    }


    /**
	 * 获取：老人手机号
	 */

    public void setLaorenPhone(String laorenPhone) {
        this.laorenPhone = laorenPhone;
    }
    /**
	 * 设置：老人身份证号
	 */
    public String getLaorenIdNumber() {
        return laorenIdNumber;
    }


    /**
	 * 获取：老人身份证号
	 */

    public void setLaorenIdNumber(String laorenIdNumber) {
        this.laorenIdNumber = laorenIdNumber;
    }
    /**
	 * 设置：照片
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：是否独居
	 */
    public Integer getDujuTypes() {
        return dujuTypes;
    }


    /**
	 * 获取：是否独居
	 */

    public void setDujuTypes(Integer dujuTypes) {
        this.dujuTypes = dujuTypes;
    }
    /**
	 * 设置：是否残疾
	 */
    public Integer getCanjiTypes() {
        return canjiTypes;
    }


    /**
	 * 获取：是否残疾
	 */

    public void setCanjiTypes(Integer canjiTypes) {
        this.canjiTypes = canjiTypes;
    }
    /**
	 * 设置：养老方式类型
	 */
    public Integer getYanglaofanghsiTypes() {
        return yanglaofanghsiTypes;
    }


    /**
	 * 获取：养老方式类型
	 */

    public void setYanglaofanghsiTypes(Integer yanglaofanghsiTypes) {
        this.yanglaofanghsiTypes = yanglaofanghsiTypes;
    }
    /**
	 * 设置：慢性疾病
	 */
    public String getJibingContent() {
        return jibingContent;
    }


    /**
	 * 获取：慢性疾病
	 */

    public void setJibingContent(String jibingContent) {
        this.jibingContent = jibingContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Laoren{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", laorenName=" + laorenName +
            ", laorenPhone=" + laorenPhone +
            ", laorenIdNumber=" + laorenIdNumber +
            ", yonghuPhoto=" + yonghuPhoto +
            ", sexTypes=" + sexTypes +
            ", dujuTypes=" + dujuTypes +
            ", canjiTypes=" + canjiTypes +
            ", yanglaofanghsiTypes=" + yanglaofanghsiTypes +
            ", jibingContent=" + jibingContent +
            ", createTime=" + createTime +
        "}";
    }
}
