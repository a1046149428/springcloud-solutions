package fun.bryce.mybatistest.service.impl;

import fun.bryce.mybatistest.domain.bean.User;
import fun.bryce.mybatistest.mapper.UserMapper;
import fun.bryce.mybatistest.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author bryce
 * @since 2019-07-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
