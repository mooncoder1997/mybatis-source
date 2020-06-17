package com.why.mybatis.entity;

/**
 * @className: Role
 * @description:
 * @version: v1.0
 * @date: 2020/5/22 11:28
 * @author: Wang, Haoyue
 */
public class Role {

  private long id;
  private String roleName;
  private String note;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }
}
