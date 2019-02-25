package com.mcally.MP.controller;


import com.mcally.MP.entity.Employee;
import com.mcally.MP.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Mcally
 * @since 2018-08-20
 */
@Controller
@RequestMapping("/emp")
@ResponseBody
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/getEmps")
    public List<Employee> getEmps(){
        return  employeeService.selectList(null);
    }


}

