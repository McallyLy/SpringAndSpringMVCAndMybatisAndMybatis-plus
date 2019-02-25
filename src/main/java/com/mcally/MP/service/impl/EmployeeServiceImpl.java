package com.mcally.MP.service.impl;

import com.mcally.MP.entity.Employee;
import com.mcally.MP.dao.EmployeeMapper;
import com.mcally.MP.service.EmployeeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Mcally
 * @since 2018-08-20
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
