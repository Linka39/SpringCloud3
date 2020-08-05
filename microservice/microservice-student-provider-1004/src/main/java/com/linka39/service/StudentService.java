package com.linka39.service;

import com.linka39.entity.Student;

import java.util.List;
import java.util.Map;

/**
 * 学生信息Service接口
 * @author Administrator
 *
 */
public interface StudentService {

    /**
     * 添加或者修改学生信息
     * @param student
     */
    public void save(Student student);

    /**
     * 根据id查找学生信息
     * @param id
     * @return
     */
    public Student findById(Integer id);

    /**
     * 查询学生信息
     * @return
     */
    public List<Student> list();

    /**
     * 根据id删除学生信息
     * @param id
     */
    public void delete(Integer id);


    /**
     * 获取信息
     * @return
     */
    public Map<String,Object> getInfo();
}
