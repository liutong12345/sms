package cn.kj.sms.service.impl;

import cn.kj.sms.common.QuartzManager;
import cn.kj.sms.dao.TaskDao;
import cn.kj.sms.domain.Task;
import cn.kj.sms.service.TaskService;

import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;



@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao taskDao;
    @Autowired
    private QuartzManager quart;


    @Override
    public Task get(Long id) {
        return taskDao.get(id);
    }

    @Override
    public List<Task> list(Task task) {

        return taskDao.list();
    }

    @Override
    public int save(Task taskScheduleJob) {
        return taskDao.save(taskScheduleJob);
    }

    @Override
    public int update(Task taskScheduleJob) {
        return 0;
    }

    @Override
    public int remove(Long id) {
        return 0;
    }

    @Override
    public int removeBatch(Long[] ids) {
        return 0;
    }

    @Override
    public void initSchedule() throws SchedulerException {
        List<Task> tasks = taskDao.list();
        for (Task task :tasks
             ) {
            if("1".equals(task.getJobStatus())){
                quart.addJob(task);
            }

        }
    }

    @Override
    public void changeStatus(Long jobId, String jobStatus) throws SchedulerException {

    }

    @Override
    public void updateCron(Long jobId) throws SchedulerException {

    }

    @Override
    public void run(Task scheduleJob) throws SchedulerException {

    }


}
