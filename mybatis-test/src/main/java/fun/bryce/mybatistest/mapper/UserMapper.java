package fun.bryce.mybatistest.mapper;

import fun.bryce.mybatistest.domain.bean.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author bryce
 * @since 2019-07-18
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
  User queryUser();
}
