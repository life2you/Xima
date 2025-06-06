# 微服务聊天应用（Xima）

这是一个基于微服务架构的聊天应用，从单体应用逐步演进为完整的微服务系统。该项目旨在通过实践学习现代软件开发技术和架构设计。

## 项目概述

Xima聊天应用支持以下功能：
- 用户注册与登录
- 好友添加与管理
- 一对一即时聊天
- 群组聊天
- 文件传输
- 消息历史记录

## 技术栈

- **后端**：
  - Java（Spring Boot/Cloud）
  - Go（高性能服务模块）
  - 数据库：MySQL、Redis、MongoDB
  - 消息队列：Kafka/RabbitMQ
  - 服务发现与配置：Nacos/Eureka

- **前端**：
  - Web：Vue
  - 移动端：跨平台框架（可选）

- **运维**：
  - 容器化：Docker
  - 编排：Kubernetes
  - CI/CD：Jenkins/GitHub Actions

## 项目结构

```
Xima/
├── docs/                # 项目文档
├── src/                 # 源代码
│   ├── backend/         # 后端服务
│   ├── frontend/        # 前端应用
│   └── infrastructure/  # 基础设施代码
└── scripts/             # 部署和环境搭建脚本
```

## 开发阶段

1. 单体应用 - 实现基础聊天功能
2. 服务拆分 - 拆分为用户服务、消息服务等
3. 高级功能 - 群聊、文件传输等
4. 架构优化 - 性能优化、高可用设计
5. 部署与运维 - 容器化与自动部署

## 参与开发

本项目是一个学习型项目，欢迎贡献代码和提出建议。