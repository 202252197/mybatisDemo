/*
Navicat MySQL Data Transfer

Source Server         : lvshihao
Source Server Version : 50561
Source Host           : localhost:3306
Source Database       : blogs

Target Server Type    : MYSQL
Target Server Version : 50561
File Encoding         : 65001

Date: 2019-04-09 15:10:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `book` varchar(11) COLLATE utf8_sinhala_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_sinhala_ci;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES ('1', '奇幻小说');
INSERT INTO `books` VALUES ('2', '科幻小说');
INSERT INTO `books` VALUES ('3', '恐怖小说');
INSERT INTO `books` VALUES ('4', '漫画小说');
