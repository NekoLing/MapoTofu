package psn.nkcat.mapotofu.service;

import psn.nkcat.mapotofu.model.BaseUser;

/**
 * @Interfacename IBaseUser
 * @Description 用户的业务逻辑接口
 * @Date 2022/6/1 0:16
 * @Created by gaoqi
 */
public interface IBaseUserService {
    BaseUser createUser(String name);
}
