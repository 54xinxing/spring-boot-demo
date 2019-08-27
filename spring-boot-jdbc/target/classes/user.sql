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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
