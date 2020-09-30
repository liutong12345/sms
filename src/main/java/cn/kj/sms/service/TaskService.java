package cn.kj.sms.service;

import cn.kj.sms.domain.Task;
import org.quartz.SchedulerException;

import java.util.List;


public interface TaskService {
    
    Task get(Long id);
    
    List<Task> list(Task task);
    
    int save(Task taskScheduleJob);
    
    int update(Task taskScheduleJob);
    
    int remove(Long id);
    
    int removeBatch(Long[] ids);

    void initSchedule() throws SchedulerException;

    void changeStatus(Long jobId, String jobStatus) throws SchedulerException;

    void updateCron(Long jobId) throws SchedulerException;
    
    void run(Task scheduleJob) throws SchedulerException;
}
