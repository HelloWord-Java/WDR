# Host: localhost  (Version 5.0.96-community-nt)
# Date: 2019-04-11 09:43:07
# Generator: MySQL-Front 6.1  (Build 1.26)


#
# Structure for table "model"
#

DROP TABLE IF EXISTS `model`;
CREATE TABLE `model` (
  `model_id` int(11) NOT NULL,
  `model_name` varchar(50) default NULL COMMENT '婚纱类型名称',
  `model_retailer` varchar(50) default NULL COMMENT '销售商',
  PRIMARY KEY  (`model_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='婚纱类型信息';

#
# Data for table "model"
#

INSERT INTO `model` VALUES (1,'公主型',NULL),(2,'蓬裙型',NULL),(3,'贴身型',NULL);

#
# Structure for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `user_name` varchar(50) default NULL COMMENT '用户名',
  `user_password` varchar(50) default NULL COMMENT '密码',
  `user_state` int(11) default '1' COMMENT '状态',
  `user_ctime` datetime default NULL COMMENT '创建时间',
  `user_mtime` datetime default NULL COMMENT '修改时间',
  `user_real_name` varchar(50) default NULL COMMENT '真实姓名',
  `user_sex` int(11) default '1' COMMENT '性别',
  `user_tel` varchar(50) default NULL COMMENT '手机号',
  `user_e_maill` varchar(50) default NULL COMMENT '邮箱',
  `user_id_number` varchar(18) default NULL COMMENT '身份证号',
  `user_post` varchar(50) default NULL COMMENT '邮编',
  `user_type` int(11) default NULL COMMENT '用户类型',
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

#
# Data for table "user"
#

INSERT INTO `user` VALUES (1,'123','123',1,NULL,NULL,'李四',1,'1816456483','151958022@qq.com','500231354498789','40153',NULL),(123,'2','123',1,NULL,NULL,'王五',1,'1564484651','15615648@qq.com','50021354648216','502315',NULL),(999,'999','999',2,NULL,NULL,NULL,1,NULL,NULL,NULL,NULL,NULL);

#
# Structure for table "weddingdress"
#

DROP TABLE IF EXISTS `weddingdress`;
CREATE TABLE `weddingdress` (
  `weddingdress_id` int(11) NOT NULL,
  `weddingdress_name` varchar(50) default NULL COMMENT '婚纱名称',
  `weddingdress_color` varchar(50) default NULL COMMENT '婚纱颜色',
  `weddingdress_ttm` datetime default NULL COMMENT '上市年份',
  `weddingdress_size` varchar(50) default NULL COMMENT '尺码',
  `weddingdress_fabricname` varchar(50) default NULL COMMENT '面料名称',
  `weddingdress_origin` varchar(50) default NULL COMMENT '产地',
  `weddingdress_price` varchar(50) default NULL COMMENT '建议零售价',
  `weddingdress_ingredient` varchar(50) default NULL COMMENT '主面料成分',
  `weddingdress_num` int(11) default '0' COMMENT '已售数量',
  `weddingdress_deposit` double default NULL COMMENT '押金',
  `weddingdress_dailyM` double default NULL COMMENT '日租金',
  `weddingdress_overtime` double default NULL COMMENT '超时租金',
  PRIMARY KEY  (`weddingdress_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='婚纱信息表';

#
# Data for table "weddingdress"
#

INSERT INTO `weddingdress` VALUES (1,'婚纱（测试1）',NULL,NULL,NULL,NULL,'1','1','1',1,1,1,1),(2,'婚纱（测试2）',NULL,NULL,NULL,NULL,'测试数据','123','测试数据',2,123,123,123),(3,'婚纱（测试3）',NULL,NULL,NULL,NULL,'测试数据','123','测试数据',3,123,123,123),(4,'婚纱（测试4）',NULL,NULL,NULL,NULL,'测试数据','123','测试数据',4,123,123,123);

#
# Structure for table "orderform"
#

DROP TABLE IF EXISTS `orderform`;
CREATE TABLE `orderform` (
  `order_id` int(11) NOT NULL,
  `user_id` int(11) default NULL COMMENT '用户id',
  `weddingdress_id` int(11) default NULL,
  `order_starttime` datetime default NULL COMMENT '开始时间',
  `order_p_endtime` datetime default NULL COMMENT '计划归还时间',
  `order_a_endtime` datetime default NULL COMMENT '实际归还时间',
  `order_basic_c` float default NULL COMMENT '基本消费',
  `order_timeout_c` float default '0' COMMENT '超时消费',
  `order_discount_c` float default NULL COMMENT '优惠金额',
  `order_sum_c` float default NULL COMMENT '消费金额',
  `order_creator` varchar(50) default NULL COMMENT '创建人',
  `order_createtime` datetime default NULL COMMENT '创建时间',
  `order_status` int(11) default '0' COMMENT '订单状态',
  PRIMARY KEY  (`order_id`),
  KEY `FK_user_user` (`user_id`),
  KEY `FK_weddingdress_order` (`weddingdress_id`),
  CONSTRAINT `FK_user_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `FK_weddingdress_order` FOREIGN KEY (`weddingdress_id`) REFERENCES `weddingdress` (`weddingdress_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单信息';

#
# Data for table "orderform"
#

INSERT INTO `orderform` VALUES (1231,123,1,'2019-03-23 08:00:00','2019-03-24 08:00:00','2019-03-23 08:00:00',1,0,NULL,1,NULL,NULL,0),(1233,123,3,'2019-03-23 08:00:00','2019-03-26 08:00:00','2019-03-26 08:00:00',369,0,NULL,369,NULL,NULL,0),(1234,123,4,'2019-03-24 13:51:36','2019-03-27 13:51:36',NULL,369,0,NULL,369,NULL,NULL,1);

#
# Structure for table "shopping_trolley"
#

DROP TABLE IF EXISTS `shopping_trolley`;
CREATE TABLE `shopping_trolley` (
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `weddingdress_id` int(11) NOT NULL,
  PRIMARY KEY  (`user_id`,`weddingdress_id`),
  KEY `FK_shopping_trolley2` (`weddingdress_id`),
  CONSTRAINT `FK_shopping_trolley` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `FK_shopping_trolley2` FOREIGN KEY (`weddingdress_id`) REFERENCES `weddingdress` (`weddingdress_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='购物车';

#
# Data for table "shopping_trolley"
#

INSERT INTO `shopping_trolley` VALUES (1,1);

#
# Structure for table "model_weddingdress"
#

DROP TABLE IF EXISTS `model_weddingdress`;
CREATE TABLE `model_weddingdress` (
  `model_id` int(11) NOT NULL,
  `weddingdress_id` int(11) NOT NULL,
  PRIMARY KEY  (`model_id`,`weddingdress_id`),
  KEY `FK_model_weddingdress2` (`weddingdress_id`),
  CONSTRAINT `FK_model_weddingdress` FOREIGN KEY (`model_id`) REFERENCES `model` (`model_id`),
  CONSTRAINT `FK_model_weddingdress2` FOREIGN KEY (`weddingdress_id`) REFERENCES `weddingdress` (`weddingdress_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='婚纱类型和婚纱关联表';

#
# Data for table "model_weddingdress"
#

INSERT INTO `model_weddingdress` VALUES (1,1),(2,2),(3,3),(3,4);

#
# Structure for table "images"
#

DROP TABLE IF EXISTS `images`;
CREATE TABLE `images` (
  `img_id` int(11) NOT NULL,
  `weddingdress_id` int(11) default NULL,
  `img_url` varchar(50) default NULL,
  `img_name` varchar(254) default NULL,
  PRIMARY KEY  (`img_id`),
  KEY `FK_weddingdress_images` (`weddingdress_id`),
  CONSTRAINT `FK_weddingdress_images` FOREIGN KEY (`weddingdress_id`) REFERENCES `weddingdress` (`weddingdress_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='图片';

#
# Data for table "images"
#

INSERT INTO `images` VALUES (1,1,'upload/png1.png',NULL),(2,2,'upload/photo2.jpg',NULL),(3,3,'upload/photo3.jpg',NULL),(4,4,'upload/photo4.jpg',NULL);
