/*
 Navicat Premium Data Transfer

 Source Server         : wisejay
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : mydb

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 14/05/2020 18:04:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for addlist
-- ----------------------------
DROP TABLE IF EXISTS `addlist`;
CREATE TABLE `addlist`  (
  `no` int(6) NOT NULL AUTO_INCREMENT,
  `tag` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userid` int(11) NULL DEFAULT NULL,
  `addname` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `addtype` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `addmark` int(11) NULL DEFAULT NULL,
  `adddate` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `adddesc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `addpath` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`no`) USING BTREE,
  INDEX `user_addlist`(`userid`) USING BTREE,
  CONSTRAINT `user_addlist` FOREIGN KEY (`userid`) REFERENCES `user` (`userid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 100019 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of addlist
-- ----------------------------
INSERT INTO `addlist` VALUES (100001, '是', 1840224142, '111', '专业技能', 3, '2020-03-05', '222222222', 'http://localhost:8080/upload/2020/03/08/7123be8d-1bf0-4e96-8845-55cd3bcfcedb.png');
INSERT INTO `addlist` VALUES (100004, '否', 1840224141, '运动会100米第1名', '文体能力', 3, '2020-03-10', '2020系运动会第一名', 'http://localhost:8080/upload/2020/03/10/bedb69c5-3cf8-43a8-a58a-3b4a81765680.png');
INSERT INTO `addlist` VALUES (100005, '否', 1840224142, '00000', '专业技能', 7, '2020-03-17', '45555', 'http://localhost:8080/upload/2020/03/10/a8ea0151-f3a5-445d-8d21-a649765dc1bb.png');
INSERT INTO `addlist` VALUES (100006, '否', 1840224141, '999', '组织管理能力', 6, '2020-03-05', '111111111111111', 'http://localhost:8080/upload/2020/03/10/f0c6496a-576e-47ae-9f5d-1e97642283e3.png');
INSERT INTO `addlist` VALUES (100007, '否', 1840224141, '999999999999', '创造能力', 7, '2020-03-21', '99999999999999999', 'http://localhost:8080/upload/2020/03/21/3c464fbf-ecf9-4743-bb28-dcefe0f2eaae.png');
INSERT INTO `addlist` VALUES (100008, '否', 1840224142, 'bbbbbbbbbbbbbbbbb', '创造能力', 9, '2020-03-11', 'bbbbbbbbbbbbbb', 'http://localhost:8080/upload/2020/03/21/98524e81-e7d3-4f9f-91c0-34b08d248b42.png');
INSERT INTO `addlist` VALUES (100009, '否', 1840224141, 'aaa', '专业技能', 7, '2020-03-02', 'aaaaaaaaaaaaa', '上传失败');
INSERT INTO `addlist` VALUES (100010, '否', 1840224101, '9999999', '组织管理能力', 4, '2020-03-29', '1111', 'http://localhost:9827/upload/2020/03/29/82d6e758-90dc-4a88-ad57-196c7dacb428.jpg');
INSERT INTO `addlist` VALUES (100011, '否', 1840224141, '01', '创造能力', 2, '2020-03-29', '11', 'http://localhost:9827/upload/2020/03/29/d0de0c20-899b-43e5-8c7f-f1a82caff044.png');
INSERT INTO `addlist` VALUES (100012, '否', 1840224141, '0101', '创造能力', 3, '2020-03-29', '01041', 'http://localhost:9827/upload/2020/03/29/be8fb274-64f0-40ec-b0cd-c4fcb73a2e27.jpg');
INSERT INTO `addlist` VALUES (100013, '否', 1840224101, '0001111', '创造能力', 4, '2020-03-17', '············', 'http://localhost:9827/upload/2020/03/29/4610b94e-dd3a-4817-bc81-906999cd5bb9.jpg');
INSERT INTO `addlist` VALUES (100014, '否', 1840224101, 'a', '组织管理能力', 2, '2020-03-02', 'aaaaaaa', 'http://localhost:9827/upload/2020/03/29/0483433a-5a45-40a5-a76b-a7166ac0f497.png');
INSERT INTO `addlist` VALUES (100015, '否', 1840224142, '66666', '创造能力', 3, '2020-03-09', 'aaa', 'http://localhost:9827/upload/2020/03/29/f5ba3f7c-de77-43af-9d8d-0698cad9664b.png');
INSERT INTO `addlist` VALUES (100016, '否', 1840224141, '06006', '创造能力', 3, '2020-03-29', '6666666666666666666666666666', 'http://localhost:9827/upload/2020/03/29/7cfca1cd-0019-4185-a60b-87bac7749378.png');
INSERT INTO `addlist` VALUES (100017, '否', 1840224141, 'last', '社会实践能力', 5, '2020-03-01', 'aa', 'http://localhost:9827/upload/2020/03/29/bc74d550-e7d5-498d-8ff6-e0fb66f5c8a4.jpg');
INSERT INTO `addlist` VALUES (100018, '否', 1840224101, '00', '专业技能', 6, '2020-02-24', '111', 'http://localhost:9827/upload/2020/03/29/17dd71cb-9b0b-45d9-ab5b-a3ffe5072f40.png');
INSERT INTO `addlist` VALUES (100019, '否', 1840224101, '1', '组织管理能力', 3, '2020-03-10', '111', 'http://localhost:9827/upload/2020/03/29/317d8949-bb5b-4434-8b1e-f1094298e040.png');

-- ----------------------------
-- Table structure for depts
-- ----------------------------
DROP TABLE IF EXISTS `depts`;
CREATE TABLE `depts`  (
  `Deptid` int(11) NOT NULL,
  `Deptname` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`Deptid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of depts
-- ----------------------------
INSERT INTO `depts` VALUES (1, '软件系');
INSERT INTO `depts` VALUES (2, '网络系');

-- ----------------------------
-- Table structure for grades
-- ----------------------------
DROP TABLE IF EXISTS `grades`;
CREATE TABLE `grades`  (
  `GradeId` int(11) NOT NULL,
  `Deptid` int(11) NULL DEFAULT NULL,
  `Gradename` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`GradeId`) USING BTREE,
  INDEX `Deptid`(`Deptid`) USING BTREE,
  CONSTRAINT `grades_ibfk_1` FOREIGN KEY (`Deptid`) REFERENCES `depts` (`Deptid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of grades
-- ----------------------------
INSERT INTO `grades` VALUES (1, 1, '软件系');
INSERT INTO `grades` VALUES (2, 2, '网络系');
INSERT INTO `grades` VALUES (18111, 1, '18软件开发1班');
INSERT INTO `grades` VALUES (18112, 1, '18软件开发2班');
INSERT INTO `grades` VALUES (18211, 2, '18网络安全1班');
INSERT INTO `grades` VALUES (18212, 2, '18网络安全2班');

-- ----------------------------
-- Table structure for nav
-- ----------------------------
DROP TABLE IF EXISTS `nav`;
CREATE TABLE `nav`  (
  `id` int(11) NOT NULL,
  `Path` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Component` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Parentid` int(11) NULL DEFAULT NULL,
  `enabled` int(11) NULL DEFAULT NULL,
  `Keepalive` int(11) NULL DEFAULT NULL,
  `requireauth` int(11) NULL DEFAULT NULL,
  `perms` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of nav
-- ----------------------------
INSERT INTO `nav` VALUES (1, '/students', 'home', '学生系统', NULL, 1, NULL, 1, 0);
INSERT INTO `nav` VALUES (2, '/monitors', 'home', '审核系统', NULL, 1, NULL, 1, 1);
INSERT INTO `nav` VALUES (3, '/teachers', 'home', '教师系统', NULL, 1, NULL, 1, 10);
INSERT INTO `nav` VALUES (4, '/manages', 'home', '管理系统', NULL, 1, NULL, 1, 100);
INSERT INTO `nav` VALUES (5, '/students/addmark', 'stu_addmark', '上传加分', 1, 1, NULL, 1, 0);
INSERT INTO `nav` VALUES (6, '/students/addhistory', 'stu_addhistory', '查看加分', 1, 1, NULL, 1, 0);
INSERT INTO `nav` VALUES (7, '/monitors/addlist', 'mon_addlist', '加分列表', 2, 1, NULL, 1, 1);
INSERT INTO `nav` VALUES (8, '/monitors/addcount', 'mon_addcount', '加分统计', 2, 1, NULL, 1, 1);
INSERT INTO `nav` VALUES (9, '/teachers/studentManage', 'tea_studentManage', '班干任命', 3, 1, NULL, 1, 10);
INSERT INTO `nav` VALUES (10, '/manages/user', 'man_user', '用户管理', 4, 1, NULL, 1, 100);
INSERT INTO `nav` VALUES (11, '/manages/grade', 'man_grade', '班级管理', 4, 1, NULL, 1, 100);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `userid` int(11) NOT NULL,
  `Password` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Username` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `perms` int(11) NULL DEFAULT NULL,
  `GradeId` int(11) NULL DEFAULT NULL,
  `Email` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`userid`) USING BTREE,
  INDEX `user_garde`(`GradeId`) USING BTREE,
  CONSTRAINT `user_garde` FOREIGN KEY (`GradeId`) REFERENCES `grades` (`GradeId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1111, 'admin', '软件系管理员', 100, 1, NULL);
INSERT INTO `user` VALUES (1998, 'admin', '软件系辅导员', 10, 1, NULL);
INSERT INTO `user` VALUES (2222, 'admin', '网络系管理员', 100, 2, NULL);
INSERT INTO `user` VALUES (9757, 'admin', '网络系辅导员', 10, 2, NULL);
INSERT INTO `user` VALUES (1840114141, 'admin', '五五', 0, 18111, NULL);
INSERT INTO `user` VALUES (1840114142, 'admin', '张十', 1, 18111, NULL);
INSERT INTO `user` VALUES (1840224101, 'admin', '李一', 0, 18211, NULL);
INSERT INTO `user` VALUES (1840224102, 'admin', '陈二', 1, 18211, NULL);
INSERT INTO `user` VALUES (1840224141, 'admin', '冯六', 1, 18212, NULL);
INSERT INTO `user` VALUES (1840224142, 'admin', '张三', 0, 18212, NULL);

SET FOREIGN_KEY_CHECKS = 1;
