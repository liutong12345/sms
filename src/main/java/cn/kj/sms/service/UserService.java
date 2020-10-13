package cn.kj.sms.service;

import cn.kj.sms.domain.Task;
import cn.kj.sms.domain.User;
import org.apache.ibatis.annotations.Param;
import org.quartz.SchedulerException;

import java.util.List;


public interface UserService {

    User getUserByName(String username);

    User getUserById(long id);

    List<User> listUserByNickname(@Param("nickname") String nickname);

    int update(User user);

    int updateByUsername(User user);


    int save(User user);

    String getNicknameById(long id);
}
