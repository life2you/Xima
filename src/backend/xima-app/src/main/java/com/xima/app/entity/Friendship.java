package com.xima.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 好友关系实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Friendship {

    private Long id;
    private User user;
    private User friend;
    private FriendshipStatus status = FriendshipStatus.PENDING;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    // 构造函数
    public Friendship(User user, User friend) {
        this.user = user;
        this.friend = friend;
    }

    public Friendship(User user, User friend, FriendshipStatus status) {
        this.user = user;
        this.friend = friend;
        this.status = status;
    }
}

/**
 * 好友关系状态枚举
 */
enum FriendshipStatus {
    PENDING,  // 待确认
    ACCEPTED, // 已接受
    REJECTED, // 已拒绝
    BLOCKED   // 已屏蔽
} 