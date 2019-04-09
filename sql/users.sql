/*
Navicat MySQL Data Transfer

Source Server         : lvshihao
Source Server Version : 50561
Source Host           : localhost:3306
Source Database       : blogs

Target Server Type    : MYSQL
Target Server Version : 50561
File Encoding         : 65001

Date: 2019-04-09 15:11:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_sinhala_ci DEFAULT NULL,
  `describe` varchar(255) COLLATE utf8_sinhala_ci DEFAULT NULL,
  `tercharId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `tercharid-terchar` (`tercharId`),
  CONSTRAINT `tercharid-terchar` FOREIGN KEY (`tercharId`) REFERENCES `terchar` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_sinhala_ci;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'lvssssddd', '521', '1');
INSERT INTO `users` VALUES ('2', 'lvxiao', '777777', null);
INSERT INTO `users` VALUES ('3', 'xxxlvxxx', '5555', null);
INSERT INTO `users` VALUES ('4', 'aaaad', 'dassa', null);
