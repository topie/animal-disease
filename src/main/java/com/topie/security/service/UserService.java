package com.topie.security.service;

import com.github.pagehelper.PageInfo;
import com.topie.common.service.IService;
import com.topie.database.core.system.model.User;
import com.topie.security.vo.FunctionVO;

import java.util.List;

/**
 * 工程：os-app 创建人 : ChenGJ 创建时间： 2015/9/2 说明：
 */
public interface UserService extends IService<User> {

    int insertUser(User user);

    int updateUser(User user);

    User findUserById(Integer id);

    User findUserByLoginName(String loginName);

    int deleteUser(Integer id);

    int insertUserRole(Integer userId, Integer roleId);

    int deleteUserAllRoles(Integer userId);

    List<Integer> findUserRoleByUserId(int userId);

    PageInfo<User> findUserList(Integer pageNum, Integer pageSize, User user);

    int findExistUser(User user);

    List<FunctionVO> findUserFunctionByLoginName(String loginName);

    int countByLoginName(String loginName);

    int updateLockStatusByUserId(int userId, Boolean accountNonLocked);

    String findLoginNameByUserId(Integer userId);

    int deleteUserRole(Integer userId, Integer roleId);

    int updatePassword(Integer platformId, String password);
}
