package com.springcloud.service;

import org.springframework.data.domain.Page;

import com.springcloud.entity.Users;

/**
 * 模型层的接口，用于定义用户模块的方法
 * 
 * @author asus-1005
 *
 */
public interface UsersService {
	
	/**
	 * 	验证用户登录是否成功
	 * 
	 * @param userId	用户编号
	 * @param userPassword	用户密码
	 * @param jdictionId	权限编号
	 * @return	成功返回登录用户完整的信息，失败返回null
	 */
	public abstract Users login(Integer userId,String userPassword,Integer jdictionId);
	
	/**
	 * 	添加新的用户信息
	 * @param users	新的用户信息
	 * @return	添加成功，返回com.springcloud.entity.Users类型的实体类，否则返回null
	 */
	public abstract Users insert(Users users);
	
	/**
	 * 查询满足条件的用户信息
	 * 
	 * @param users	查询条件
	 * @param pageNumber	查询页数
	 * @return	成功返回，返回com.springframewprk.data.domain.Page的实类，否则返回null
	 */
	public abstract Page<Users>select(Users users,Integer pageNumber);
	
	/**
	 * 修改指定编号用户的状态
	 * 
	 * @param userId	用户编号
	 * @param userStatus 用户状态
	 * @return	修改成功返回大于0的整数，否则返回0
	 */
	public abstract Integer updateStatus(Integer userId,Integer userStatus);

	/**
	 * 查询指定编号的用户
	 * 
	 * @param userId   用户编号
	 * @return	成功返回com.springcloud.enity.Users类型的实例，否则返回null
	 */
	public abstract Users selectById(Integer userId);
	
	/**
	 * 修改还定编号的用户信息
	 * 
	 * @param users	修改的用户信息
	 * @return 成功返回大于0 的整数，否则返回0 
	 */
	public abstract Integer update(Users users);
	
	/**
	 * 根据参数修改指定编号用户头像或密码或昵称
	 * 
	 * @param users	修改的用户信息
	 * @return 成功返回大于0 的整数，否则返回0 
	 */
	public abstract Integer updateMessage(Users users);
}
