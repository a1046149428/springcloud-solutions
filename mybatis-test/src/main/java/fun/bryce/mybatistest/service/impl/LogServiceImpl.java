package fun.bryce.mybatistest.service.impl;

import fun.bryce.mybatistest.domain.bean.Log;
import fun.bryce.mybatistest.mapper.LogMapper;
import fun.bryce.mybatistest.service.ILogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * log表 服务实现类
 * </p>
 *
 * @author bryce
 * @since 2019-07-18
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements ILogService {

}
