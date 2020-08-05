package com.linka39.service;

import com.linka39.entity.Student;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class StudentClientFallbackFactory implements FallbackFactory<StudentClientService> {
    @Override
    public StudentClientService create(Throwable throwable) {
        return new StudentClientService() {
            @Override
            public Student get(Integer id) {
                return null;
            }

            @Override
            public List<Student> list() {
                return null;
            }

            @Override
            public boolean save(Student student) {
                return false;
            }

            @Override
            public boolean delete(Integer id) {
                return false;
            }

            @Override
            public Map<String, Object> getInfo() {
                Map<String,Object> map=new HashMap<String,Object>();
                map.put("code", 500);
                map.put("info", "系统出错，稍后重试");
                return map;
            }
        };
    }
}
