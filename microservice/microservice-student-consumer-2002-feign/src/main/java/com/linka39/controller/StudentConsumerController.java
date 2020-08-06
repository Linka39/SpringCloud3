package com.linka39.controller;

import java.util.List;
import java.util.Map;

import com.linka39.service.StudentClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.linka39.entity.Student;

/**
 * 服务消费者-学生信息控制器
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/student")
public class StudentConsumerController {

	@Autowired
	private StudentClientService studentClientService;

    /**
     * 添加或者修改学生信息
     * @param student
     * @return
     */
    @PostMapping(value="/save")
    public boolean save( Student student){
    	return studentClientService.save(student);
    }

    /**
     * 查询学生信息
     * @return
     */
	@GetMapping(value="/list")
    public List<Student> list(){
        return studentClientService.list();
    }

    /**
     * 根据id查询学生信息
     * @return
     */
    @GetMapping(value="/get/{id}")
    public Student get(@PathVariable("id") Integer id){
        return studentClientService.get(id);
    }

    /**
     * 根据id删除学生信息
     * @return
     */
    @GetMapping(value="/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return studentClientService.delete(id);
    }

    /**
     * 获取信息
     * @return
     */
    @GetMapping(value="/getInfo2")
    public Map<String,Object> getInfo2() {
        return studentClientService.getInfo();
    }

    /**
     * 获取信息
     * @return
     */
    @GetMapping(value="/getInfo")
    public Map<String,Object> getInfo() {
        return studentClientService.getInfo();
    }

}
