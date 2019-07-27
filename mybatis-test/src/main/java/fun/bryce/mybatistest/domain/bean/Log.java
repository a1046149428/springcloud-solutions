package fun.bryce.mybatistest.domain.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * log表
 * </p>
 *
 * @author bryce
 * @since 2019-07-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_log")
@ApiModel(value = "Log对象", description = "log表")
public class Log implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String id;
    @ApiModelProperty(value = "标题 ")
    @TableField("title")
    private String title;

    @ApiModelProperty(value = "日志内容")
    @TableField("content")
    private String content;

    @ApiModelProperty(value = "用户id")
    @TableField("user_id")
    private String userId;
}
