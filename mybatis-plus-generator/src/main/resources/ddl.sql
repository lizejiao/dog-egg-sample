CREATE TABLE `demo_user` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `user_name` varchar(20) DEFAULT NULL COMMENT '用户名',
    `age` int(11) DEFAULT NULL COMMENT '年龄',
    `address` varchar(50) DEFAULT NULL COMMENT '地址',
    `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
    `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `create_user` varchar(16) NOT NULL DEFAULT 'system' COMMENT '创建者',
    `update_user` varchar(16) NOT NULL DEFAULT 'system' COMMENT '更新者',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='用户表';