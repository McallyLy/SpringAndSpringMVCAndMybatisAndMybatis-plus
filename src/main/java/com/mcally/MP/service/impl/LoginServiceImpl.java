package com.mcally.MP.service.impl;

import com.mcally.MP.entity.Login;
import com.mcally.MP.dao.LoginMapper;
import com.mcally.MP.service.LoginService;
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
public class LoginServiceImpl extends ServiceImpl<LoginMapper, Login> implements LoginService {

}
