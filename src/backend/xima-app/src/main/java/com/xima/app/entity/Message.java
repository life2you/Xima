package com.xima.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 消息实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    private Long id;
    private User sender;
    private User receiver;
    private String content;
    private MessageContentType contentType = MessageContentType.TEXT;
    private MessageStatus status = MessageStatus.SENT;
    private LocalDateTime createTime;

    // 构造函数
    public Message(User sender, User receiver, String content, MessageContentType contentType) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.contentType = contentType;
    }
}

/**
 * 消息内容类型枚举
 */
enum MessageContentType {
    TEXT,   // 文本
    IMAGE,  // 图片
    FILE,   // 文件
    AUDIO,  // 音频
    VIDEO   // 视频
}

/**
 * 消息状态枚举
 */
enum MessageStatus {
    SENT,      // 已发送
    DELIVERED, // 已送达
    READ       // 已读
} 