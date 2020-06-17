package com.why.mybatis.dao;

import com.why.mybatis.entity.Role;

/**
 * @className: RoleMapper
 * @description:
 * @version: v1.0
 * @date: 2020/5/22 11:28
 * @author: Wang, Haoyue
 */
public interface RoleMapper {

  public Role getRole(Long id);

  public Role findRole(String roleName);

  public int deleteRole(Long id);

  public int insertRole(Role role);
}
