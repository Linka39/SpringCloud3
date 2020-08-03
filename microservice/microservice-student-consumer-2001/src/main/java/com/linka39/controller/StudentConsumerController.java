package com.linka39.controller;

import java.util.List;

import javax.annotation.Resource;

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
	private RestTemplate restTemplate;
    //访问服务提供者时是按 大写字符访问的
	private final static String PRE_HOST="http://MICROSERVICE-STUDENT";

    /**
     * 添加或者修改学生信息
     * @param student
     * @return
     */
    @PostMapping(value="/save")

    public boolean save( Student student){
    	return restTemplate.postForObject(PRE_HOST+"/student/save", student, Boolean.class);
    }

    /**
     * 查询学生信息
     * @return
     */
    @SuppressWarnings("unchecked")
	@GetMapping(value="/list")
    public List<Student> list(){
        return restTemplate.getForObject(PRE_HOST+"/student/list", List.class);
    }

    /**
     * 根据id查询学生信息
     * @return
     */
    @GetMapping(value="/get/{id}")
    public Student get(@PathVariable("id") Integer id){
        return restTemplate.getForObject(PRE_HOST+"/student/get/"+id, Student.class);
    }

    /**
     * 根据id删除学生信息
     * @return
     */
    @GetMapping(value="/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return restTemplate.getForObject(PRE_HOST+"/student/delete/"+id, Boolean.class);
    }

}
