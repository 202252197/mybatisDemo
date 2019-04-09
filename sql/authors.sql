/*
Navicat MySQL Data Transfer

Source Server         : lvshihao
Source Server Version : 50561
Source Host           : localhost:3306
Source Database       : blogs

Target Server Type    : MYSQL
Target Server Version : 50561
File Encoding         : 65001

Date: 2019-04-09 15:10:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for authors
-- ----------------------------
DROP TABLE IF EXISTS `authors`;
CREATE TABLE `authors` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `b_id` int(11) NOT NULL,
  `author` varchar(255) COLLATE utf8_sinhala_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `b_id` (`b_id`),
  CONSTRAINT `b_id` FOREIGN KEY (`b_id`) REFERENCES `books` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_sinhala_ci;

-- ----------------------------
-- Records of authors
-- ----------------------------
INSERT INTO `authors` VALUES ('1', '1', '吕世昊');
INSERT INTO `authors` VALUES ('2', '1', '吕旭');
INSERT INTO `authors` VALUES ('3', '3', '喵喵');
INSERT INTO `authors` VALUES ('4', '3', '刘新宇');
INSERT INTO `authors` VALUES ('5', '2', '张莹');
INSERT INTO `authors` VALUES ('6', '4', '闺蜜');
INSERT INTO `authors` VALUES ('7', '2', '吕世昊');
