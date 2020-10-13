package cn.kj.sms.service.impl;

import cn.kj.sms.common.QuartzManager;
import cn.kj.sms.dao.TaskDao;
import cn.kj.sms.dao.UserDao;
import cn.kj.sms.domain.Task;
import cn.kj.sms.domain.User;
import cn.kj.sms.service.TaskService;
import cn.kj.sms.service.UserService;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public User getUserByName(String username) {
        return userDao.getUserByName(username);
    }

    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> listUserByNickname(String nickname) {
        return userDao.listUserByNickname(nickname);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int updateByUsername(User user) {
        return userDao.updateByUsername(user);
    }

    @Override
    public int save(User user) {
        return userDao.save(user);
    }

    @Override
    public String getNicknameById(long id) {
        return userDao.getNicknameById(id);
    }
}
