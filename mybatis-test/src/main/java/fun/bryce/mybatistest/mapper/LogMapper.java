package fun.bryce.mybatistest.mapper;

import fun.bryce.mybatistest.domain.bean.Log;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * log表 Mapper 接口
 * </p>
 *
 * @author bryce
 * @since 2019-07-18
 */
@Mapper
public interface LogMapper extends BaseMapper<Log> {


}
