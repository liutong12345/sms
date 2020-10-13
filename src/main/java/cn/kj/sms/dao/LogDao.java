package cn.kj.sms.dao;

import cn.kj.sms.domain.Log;
import cn.kj.sms.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface LogDao {

    Log get(Long id);

    List<Log> listByUsernameAndOperation(@Param("username")String username,@Param("operation")String operation);

    int save(Log log);

    int update(Log log);

    int remove(Long id);

    int removeBatch(Long[] ids);
}
