package fun.bryce.conf.common;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author bryce
 * 2019/7/4 17:58
 */
@Data
public class BaseEntiy implements Serializable
{
    private static final long serialVersionUID = -9127725235422811609L;
    @TableId(type = IdType.UUID)
    private String id;
}
