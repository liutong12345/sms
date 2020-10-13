package cn.kj.sms.controller;

import cn.kj.sms.domain.Task;
import cn.kj.sms.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/hello")
public class TaskController{
    @Autowired
    private TaskService taskService;
    @RequestMapping
    public String taskScheduleJob() {
        return "management/task";
    }
    
    @RequestMapping("/add")
    public String taskAddScheduleJob() {
        return "management/task_add";
    }

    @ResponseBody
    @RequestMapping("/list")
    public List<Task> list(Task task) {
        // 查询列表数据

        return taskService.list(task);
    }

/*    @Log("修改任务")
    @RequiresPermissions("sys:task:update")
    @PostMapping("/edit")
    @ResponseBody
    public YYBlogResult edit(TaskDO task) {
        TaskDO taskServer = taskService.get(task.getId());
        if (JobStatusEnum.RUNNING.getCode().equals(taskServer.getJobStatus())) {
            return YYBlogResult.build(403, "修改之前请先停止任务！");
        }
        taskService.update(task);
        return YYBlogResult.ok();
    }

    @Log("修改任务状态")
    @RequiresPermissions("sys:task:update")
    @PostMapping("/changeStatus/{id}")
    @ResponseBody
    public YYBlogResult changeStatus(@PathVariable("id") Long id, Boolean jobStatus) {
        String status = jobStatus == true ? JobStatusEnum.RUNNING.getCode() : JobStatusEnum.STOP.getCode();
        try {
            taskService.changeStatus(id, status);
            return YYBlogResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return YYBlogResult.build(403, "任务状态修改失败");
    }

    *//**
     * 删除
     *//*
    @Log("删除任务")
    @RequiresPermissions("sys:task:delete")
    @PostMapping("/remove/{id}")
    @ResponseBody
    public YYBlogResult remove(@PathVariable("id") Long id) {
        TaskDO taskServer = taskService.get(id);
        if (JobStatusEnum.RUNNING.getCode().equals(taskServer.getJobStatus())) {
            return YYBlogResult.build(403, "删除前请先停止任务！");
        }
        if (taskService.remove(id) > 0) {
            return YYBlogResult.ok();
        }
        return YYBlogResult.build(403, "删除任务失败！");
    }
    
    *//**
     * 立即运行
     *//*
    @Log("立即运行任务")
    @RequiresPermissions("sys:task:update")
    @PostMapping("/run/{id}")
    @ResponseBody
    public YYBlogResult run(@PathVariable("id") Long id) {
        TaskDO taskServer = taskService.get(id);
        try {
            if (JobStatusEnum.STOP.getCode().equals(taskServer.getJobStatus())) {
                return YYBlogResult.build(403, "立即执行请先开启任务！");
            }
            taskService.run(taskServer);
            return YYBlogResult.ok();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        return YYBlogResult.build(403, "立即运行任务失败！");
    }

    *//**
     * 删除
     *//*
    @Log("批量删除任务")
    @RequiresPermissions("sys:task:delete")
    @PostMapping("/removeBatch")
    @ResponseBody
    public YYBlogResult removeBatch(@RequestParam("ids[]") Long[] ids) {
        for (Long id : ids) {
            TaskDO taskServer = taskService.get(id);
            if (JobStatusEnum.RUNNING.getCode().equals(taskServer.getJobStatus())) {
                return YYBlogResult.build(403, "删除前请先停止任务！");
            }
        }
        taskService.removeBatch(ids);
        return YYBlogResult.ok();
    }
    
    *//**
     * 新增保存
     *//*
    @Log("新增任务")
    @RequiresPermissions("sys:task:add")
    @ResponseBody
    @PostMapping("/save")
    public YYBlogResult save(TaskDO task) {
        if (taskService.save(task) > 0) {
            return YYBlogResult.ok();
        }
        return YYBlogResult.build(403, "新增任务失败！");
    }*/
}
