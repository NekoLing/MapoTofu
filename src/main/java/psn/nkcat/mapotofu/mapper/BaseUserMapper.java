package psn.nkcat.mapotofu.mapper;

import org.apache.ibatis.annotations.Mapper;
import psn.nkcat.mapotofu.model.BaseUser;

@Mapper
public interface BaseUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BaseUser record);

    int insertSelective(BaseUser record);

    BaseUser selectByPrimaryKey(Integer id);

    BaseUser selectByName(String name);

    int updateByPrimaryKeySelective(BaseUser record);

    int updateByPrimaryKey(BaseUser record);
}