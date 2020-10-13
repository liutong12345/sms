package cn.kj.sms.dao;

import cn.kj.sms.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {

    User getUserByName(String username);

    User getUserById(long id);

    List<User> listUserByNickname(@Param("nickname") String nickname);

    int update(User user);

    int updateByUsername(User user);


    int save(User user);

    String getNicknameById(long id);
}
