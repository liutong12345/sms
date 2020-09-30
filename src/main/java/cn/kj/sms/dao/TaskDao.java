package cn.kj.sms.dao;

import cn.kj.sms.domain.Task;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TaskDao {

    Task get(Long id);
    
    List<Task> list();
    
   List<Task> listTaskVoByDesc(@Param("desc") String desc);
    
   int save(Task task);
    
    int update(Task task);
    
    int remove(Long id);
    
    int removeBatch(Long[] ids);
}
