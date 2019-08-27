SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` bigint(32) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(8) NOT NULL,
  `user_password` varchar(64) NOT NULL,
  `user_email` varchar(32) NOT NULL,
  `user_address` varchar(64) CHARACTER SET utf8mb4 NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'xinxing', '54xinxing', '54xinxing@gmail.com', '北京');
INSERT INTO `user` VALUES ('2', 'xinxing', '54xinxing', '54xinxing@gmail.com', '北京');
INSERT INTO `user` VALUES ('3', 'xinxing', '54xinxing', '54xinxing@gmail.com', '上海');
INSERT INTO `user` VALUES ('4', 'xinxing', '54xinxing', '54xinxing@gmail.com', '上海');
INSERT INTO `user` VALUES ('5', 'xinxing', '54xinxing', '54xinxing@gmail.com', '上海');
INSERT INTO `user` VALUES ('6', 'xinxing', '54xinxing', '54xinxing@gmail.com', '上海');
INSERT INTO `user` VALUES ('7', 'xinxing', '54xinxing', '54xinxing@gmail.com', '厦门');
INSERT INTO `user` VALUES ('8', 'xinxing', '54xinxing', '54xinxing@gmail.com', '成都');
