package com.topie.security.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.topie.common.service.impl.BaseService;
import com.topie.common.utils.TreeNode;
import com.topie.database.core.system.dao.FunctionMapper;
import com.topie.database.core.system.model.Function;
import com.topie.security.service.FunctionService;
import com.topie.security.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 工程：os-app 创建人 : ChenGJ 创建时间： 2015/9/4 说明：
 */
@Service("functionService")
public class FunctionServiceImpl extends BaseService<Function> implements FunctionService {

    @Autowired
    private FunctionMapper functionMapper;

    @Autowired
    private RoleService roleService;

    @Override
    public int insertFunction(Function function) {
        return getMapper().insertSelective(function);
    }

    @Override
    public int updateFunction(Function function) {
        int result = getMapper().updateByPrimaryKeySelective(function);
        List<Integer> roleIds = functionMapper.findRoleIdsByFunctionId(function.getId());
        if (roleIds.size() > 0) {
            for (Integer roleId : roleIds) {
                roleService.refreshAuthAndResource(roleId);
            }
        }
        return result;
    }

    @Override
    public Function findFunctionById(int id) {
        return getMapper().selectByPrimaryKey(id);
    }

    @Override
    public int deleteFunctionById(int id) {
        int result = getMapper().deleteByPrimaryKey(id);
        List<Integer> roleIds = functionMapper.findRoleIdsByFunctionId(id);
        if (roleIds.size() > 0) {
            functionMapper.deleteRoleFunctionByFunctionId(id);
            for (Integer roleId : roleIds) {
                roleService.refreshAuthAndResource(roleId);
            }
        }
        return result;
    }

    @Override
    public List<TreeNode> getFunctionTreeNodes(Function function) {
        return functionMapper.selectFunctionTreeNodes(function);
    }

    @Override
    public PageInfo<Function> findFunctionList(int pageNum, int pageSize, Function function) {
        PageHelper.startPage(pageNum, pageSize);
        List<Function> list = functionMapper.findFunctionList(function);
        return new PageInfo<Function>(list);
    }
}
