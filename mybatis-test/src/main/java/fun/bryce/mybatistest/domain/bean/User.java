package fun.bryce.mybatistest.domain.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author bryce
 * @since 2019-07-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_user")
@ApiModel(value = "User对象", description = "用户表")
public class User implements Serializable
{

    private static final long serialVersionUID = 1L;

    private String id;

    @ApiModelProperty(value = "用户名")
    @TableField("user_name")
    private String userName;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "更新时间 ")
    @TableField("update_time")
    private Date updateTime;

    @ApiModelProperty(value = "创建人")
    @TableField("create_user")
    private String createUser;

    @ApiModelProperty(value = "更新人 ")
    @TableField("update_user")
    private String updateUser;

    private List<Log> logs;
}
