package com.xima.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 角色实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    
    private Long id;
    private RoleType name;
    
    public Role(RoleType name) {
        this.name = name;
    }
}

/**
 * 角色类型枚举
 */
enum RoleType {
    ROLE_USER,       // 普通用户
    ROLE_MODERATOR,  // 管理员
    ROLE_ADMIN       // 超级管理员
} 