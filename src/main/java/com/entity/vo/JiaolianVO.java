package com.entity.vo;

import com.entity.JiaolianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 教练
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiaolian")
public class JiaolianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 教练姓名
     */

    @TableField(value = "jiaolian_name")
    private String jiaolianName;


    /**
     * 头像
     */

    @TableField(value = "jiaolian_photo")
    private String jiaolianPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 联系方式
     */

    @TableField(value = "jiaolian_phone")
    private String jiaolianPhone;


    /**
     * 邮箱
     */

    @TableField(value = "jiaolian_email")
    private String jiaolianEmail;


    /**
     * 擅长项目
     */

    @TableField(value = "jiaolian_xiangmu")
    private String jiaolianXiangmu;


    /**
     * 获得奖项
     */

    @TableField(value = "jiaolian_jiangxiang")
    private String jiaolianJiangxiang;


    /**
     * 教练简介
     */

    @TableField(value = "jiaolian_content")
    private String jiaolianContent;


    /**
     * 假删
     */

    @TableField(value = "jiaolian_delete")
    private Integer jiaolianDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：教练姓名
	 */
    public String getJiaolianName() {
        return jiaolianName;
    }


    /**
	 * 获取：教练姓名
	 */

    public void setJiaolianName(String jiaolianName) {
        this.jiaolianName = jiaolianName;
    }
    /**
	 * 设置：头像
	 */
    public String getJiaolianPhoto() {
        return jiaolianPhoto;
    }


    /**
	 * 获取：头像
	 */

    public void setJiaolianPhoto(String jiaolianPhoto) {
        this.jiaolianPhoto = jiaolianPhoto;
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
	 * 设置：联系方式
	 */
    public String getJiaolianPhone() {
        return jiaolianPhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setJiaolianPhone(String jiaolianPhone) {
        this.jiaolianPhone = jiaolianPhone;
    }
    /**
	 * 设置：邮箱
	 */
    public String getJiaolianEmail() {
        return jiaolianEmail;
    }


    /**
	 * 获取：邮箱
	 */

    public void setJiaolianEmail(String jiaolianEmail) {
        this.jiaolianEmail = jiaolianEmail;
    }
    /**
	 * 设置：擅长项目
	 */
    public String getJiaolianXiangmu() {
        return jiaolianXiangmu;
    }


    /**
	 * 获取：擅长项目
	 */

    public void setJiaolianXiangmu(String jiaolianXiangmu) {
        this.jiaolianXiangmu = jiaolianXiangmu;
    }
    /**
	 * 设置：获得奖项
	 */
    public String getJiaolianJiangxiang() {
        return jiaolianJiangxiang;
    }


    /**
	 * 获取：获得奖项
	 */

    public void setJiaolianJiangxiang(String jiaolianJiangxiang) {
        this.jiaolianJiangxiang = jiaolianJiangxiang;
    }
    /**
	 * 设置：教练简介
	 */
    public String getJiaolianContent() {
        return jiaolianContent;
    }


    /**
	 * 获取：教练简介
	 */

    public void setJiaolianContent(String jiaolianContent) {
        this.jiaolianContent = jiaolianContent;
    }
    /**
	 * 设置：假删
	 */
    public Integer getJiaolianDelete() {
        return jiaolianDelete;
    }


    /**
	 * 获取：假删
	 */

    public void setJiaolianDelete(Integer jiaolianDelete) {
        this.jiaolianDelete = jiaolianDelete;
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

}
