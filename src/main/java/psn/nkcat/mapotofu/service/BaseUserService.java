package psn.nkcat.mapotofu.service;

import org.springframework.stereotype.Service;
import psn.nkcat.mapotofu.mapper.BaseUserMapper;
import psn.nkcat.mapotofu.model.BaseUser;

/**
 * @Classname BaseUser
 * @Description 用户的业务逻辑实现
 * @Date 2022/6/1 0:21
 * @Created by gaoqi
 */

@Service
public class BaseUserService implements IBaseUserService {
    final
    BaseUserMapper baseUserMapper;

    public BaseUserService(BaseUserMapper baseUserMapper) {
        this.baseUserMapper = baseUserMapper;
    }

    @Override
    public synchronized BaseUser createUser(String name) {
        if (isLegal(name)) {
            BaseUser user = new BaseUser(name);
            baseUserMapper.insert(user);
            return user;
        }
        else
            return null;
    }

    private boolean isLegal(String name) {
        if (name.length() > 12)
            return false;
        if (false) {
            //这里做一些格式判断
            return false;
        }
        if (baseUserMapper.selectByName(name) != null)
            return false;

        return true;
    }

}
