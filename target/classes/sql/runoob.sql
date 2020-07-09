/*
Navicat MySQL Data Transfer

Source Server         : runoob
Source Server Version : 50647
Source Host           : 134.175.21.43:3306
Source Database       : runoob

Target Server Type    : MYSQL
Target Server Version : 50647
File Encoding         : 65001

Date: 2020-07-09 15:58:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for alltype
-- ----------------------------
DROP TABLE IF EXISTS `alltype`;
CREATE TABLE `alltype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) DEFAULT NULL,
  `typeclass` varchar(50) DEFAULT NULL,
  `typename` varchar(100) DEFAULT NULL,
  `content` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of alltype
-- ----------------------------
INSERT INTO `alltype` VALUES ('11', '0', null, '顶部栏', '<p><img src=\"http://192.168.2.119:8080//image/模型描述/1578652052754.png\" alt=\"\" width=\"1000\" height=\"54\" /><img src=\"http://134.175.21.43:6066//image/模型描述/1587623524838.png\" alt=\"\" width=\"1273\" height=\"68\" /></p>');
INSERT INTO `alltype` VALUES ('12', '11', null, '左侧', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587623546586.png\" alt=\"\" width=\"683\" height=\"98\" /></p>');
INSERT INTO `alltype` VALUES ('13', '11', null, '右侧', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587623923878.png\" alt=\"\" width=\"648\" height=\"112\" /><img src=\"http://192.168.2.119:8080//image/模型描述/1578652453447.png\" alt=\"\" width=\"1000\" height=\"173\" /></p>');
INSERT INTO `alltype` VALUES ('14', '12', null, '系统时间', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587623595194.png\" alt=\"\" width=\"624\" height=\"114\" /></p>\n<p><video controls=\"controls\" width=\"798\" height=\"399\">\n<source src=\"http://134.175.21.43:6066//image/模型描述/1587721743595.mp4\" type=\"video/mp4\" /></video></p>');
INSERT INTO `alltype` VALUES ('15', '12', null, '项目名称', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587623754815.png\" alt=\"\" width=\"486\" height=\"77\" /></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 11pt;\">显示当前保存的文件名称</span>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</p>');
INSERT INTO `alltype` VALUES ('16', '12', null, '展开收起', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587623825811.png\" alt=\"\" width=\"285\" height=\"169\" /> &nbsp;<img src=\"http://134.175.21.43:6066//image/模型描述/1587623832991.png\" alt=\"\" width=\"282\" height=\"99\" /></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;点击可收起顶部工具栏</span> </span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">点击可展开顶部工具栏</span> </span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&nbsp;</span></p>');
INSERT INTO `alltype` VALUES ('17', '13', null, '人行模式', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587623968051.png\" alt=\"\" width=\"103\" height=\"98\" /> &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 22pt;\">可在场景中自由行走，受重力及碰撞影响</span></p>\n<p class=\"MsoNormal\" style=\"text-indent: 22.0000pt; mso-char-indent-count: 2.0000;\"><video style=\"text-indent: 0px;\" controls=\"controls\" width=\"1076\" height=\"538\">\n<source src=\"http://134.175.21.43:6066//image/模型描述/人行模式.mp4\" type=\"video/mp4\" /></video></p>');
INSERT INTO `alltype` VALUES ('18', '13', null, '驾驶模式', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587623996986.png\" alt=\"\" width=\"100\" height=\"106\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 22pt;\">可在场景中自由驾驶，受重力及碰撞影响</span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 22pt;\"><video controls=\"controls\" width=\"1102\" height=\"551\">\n<source src=\"http://134.175.21.43:6066//image/模型描述/驾驶模式.mp4\" type=\"video/mp4\" /></video></span></p>\n<p class=\"MsoNormal\" style=\"text-indent: 22.0000pt; mso-char-indent-count: 2.0000;\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('19', '13', null, '飞行模式', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624027996.png\" alt=\"\" width=\"100\" height=\"97\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 22pt;\">可在场景中自由飞行，不受重力及碰撞影响</span></p>\n<p class=\"MsoNormal\" style=\"text-indent: 22.0000pt; mso-char-indent-count: 2.0000;\"><video controls=\"controls\" width=\"1122\" height=\"561\">\n<source src=\"http://134.175.21.43:6066//image/模型描述/飞行模式.mp4\" type=\"video/mp4\" /></video></p>');
INSERT INTO `alltype` VALUES ('20', '13', null, '线框显示', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624072864.png\" alt=\"\" width=\"100\" height=\"109\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 22pt;\">场景模型显示为线框状态</span></p>\n<p class=\"MsoNormal\" style=\"text-indent: 22.0000pt; mso-char-indent-count: 2.0000;\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('21', '13', null, '声音', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624094347.png\" alt=\"\" width=\"100\" height=\"100\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 22pt;\">控制场景中的音效</span></p>\n<p class=\"MsoNormal\" style=\"text-indent: 22.0000pt; mso-char-indent-count: 2.0000;\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('22', '13', null, '天气', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624137365.png\" alt=\"\" width=\"100\" height=\"105\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 22pt;\">调整场景的灯光效果</span></p>\n<p class=\"MsoNormal\" style=\"text-indent: 22.0000pt; mso-char-indent-count: 2.0000;\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('23', '13', null, '帮助', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624160948.png\" alt=\"\" width=\"100\" height=\"100\" />&nbsp;&nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 22pt;\">打开帮助文档</span></p>\n<p class=\"MsoNormal\" style=\"text-indent: 22.0000pt; mso-char-indent-count: 2.0000;\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('24', '13', null, '全屏', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624282510.png\" alt=\"\" width=\"100\" height=\"96\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 22pt;\">切换屏幕大小</span></p>\n<p class=\"MsoNormal\" style=\"text-indent: 22.0000pt; mso-char-indent-count: 2.0000;\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('25', '13', null, '关闭', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624308439.png\" alt=\"\" width=\"100\" height=\"103\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 22pt;\">退出系统</span></p>\n<p class=\"MsoNormal\" style=\"text-indent: 22.0000pt; mso-char-indent-count: 2.0000;\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('26', '0', null, '菜单栏', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624326782.png\" alt=\"\" width=\"1089\" height=\"53\" /></p>');
INSERT INTO `alltype` VALUES ('27', '26', null, '文件', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624355294.png\" alt=\"\" width=\"149\" height=\"301\" /></p>');
INSERT INTO `alltype` VALUES ('28', '26', null, '资源库', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624600911.png\" alt=\"\" width=\"121\" height=\"200\" /> &nbsp;<img src=\"http://134.175.21.43:6066//image/模型描述/1587624590083.png\" alt=\"\" width=\"332\" height=\"465\" /></p>');
INSERT INTO `alltype` VALUES ('29', '26', null, '进度管理', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624870964.png\" alt=\"\" width=\"789\" height=\"108\" /></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">模型进行关联</span></span></p>');
INSERT INTO `alltype` VALUES ('30', '27', null, '新建', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624375119.png\" alt=\"\" width=\"126\" height=\"39\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">新建一个空白场景</span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 11pt;\"><video controls=\"controls\" width=\"1016\" height=\"508\">\n<source src=\"http://134.175.21.43:6066//image/模型描述/新建预设场景.mp4\" type=\"video/mp4\" /></video></span></p>');
INSERT INTO `alltype` VALUES ('31', '27', null, '导入', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624400950.png\" alt=\"\" width=\"156\" height=\"44\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">导入外部地形模型</span><span style=\"font-family: 微软雅黑; font-size: 11pt;\"> </span><span style=\"font-family: 微软雅黑; font-size: 11pt;\">地形数据</span><span style=\"font-family: 微软雅黑; font-size: 11pt;\"> BIM模型</span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 11pt;\"><video controls=\"controls\" width=\"1112\" height=\"556\">\n<source src=\"http://134.175.21.43:6066//image/模型描述/导入模型.mp4\" type=\"video/mp4\" /></video></span></p>\n<p class=\"MsoNormal\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('32', '27', null, '保存', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624422023.png\" alt=\"\" width=\"132\" height=\"44\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">保存当前已经编辑好的场景</span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 11pt;\"><video controls=\"controls\" width=\"992\" height=\"496\">\n<source src=\"http://134.175.21.43:6066//image/模型描述/保存.mp4\" type=\"video/mp4\" /></video></span></p>');
INSERT INTO `alltype` VALUES ('33', '27', null, '另存', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624442288.png\" alt=\"\" width=\"131\" height=\"41\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">不覆盖之前保存的文件，新存一份场景</span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 11pt;\"><video controls=\"controls\" width=\"1110\" height=\"555\">\n<source src=\"http://134.175.21.43:6066//image/模型描述/另存.mp4\" type=\"video/mp4\" /></video></span></p>\n<p class=\"MsoNormal\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('34', '27', null, '最近打开', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624470263.png\" alt=\"\" width=\"127\" height=\"37\" />&nbsp; &nbsp;<span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">当已经累计打开过几个场景时，可通过这个按钮选择最近打开的某一个场景，使用时间久了之后这个按钮会比较人性化、有利于快速操作。</span></span></p>\n<p><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\"><video controls=\"controls\" width=\"1102\" height=\"551\">\n<source src=\"http://134.175.21.43:6066//image/模型描述/最近打开.mp4\" type=\"video/mp4\" /></video></span></span></p>');
INSERT INTO `alltype` VALUES ('35', '27', null, '载入', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624508762.png\" alt=\"\" width=\"135\" height=\"40\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">载入之前保存的场景</span></p>\n<p class=\"MsoNormal\"><video controls=\"controls\" width=\"1096\" height=\"548\">\n<source src=\"http://134.175.21.43:6066//image/模型描述/载入.mp4\" type=\"video/mp4\" /></video></p>');
INSERT INTO `alltype` VALUES ('36', '27', null, '设置', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624531672.png\" alt=\"\" width=\"132\" height=\"39\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">设置场景的单位</span><span style=\"font-family: 微软雅黑; font-size: 11pt;\"> </span><span style=\"font-family: 微软雅黑; font-size: 11pt;\">坐标原点等</span></p>\n<p class=\"MsoNormal\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('37', '27', null, '退出', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624555554.png\" alt=\"\" width=\"140\" height=\"44\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">退出系统</span></p>\n<p class=\"MsoNormal\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('38', '26', null, '资源库', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629160804.png\" alt=\"\" width=\"167\" height=\"176\" /></p>');
INSERT INTO `alltype` VALUES ('39', '28', null, '临建构件模型库', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624616652.png\" alt=\"\" width=\"139\" height=\"46\" /></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">包含办公区与生活区、钢筋加工厂、拌合厂、预制厂、钢栈桥及便道六大类，按照三级分类树状结构显示，点选构件后，拖曳即可进行临建布置</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\"><video controls=\"controls\" width=\"1058\" height=\"529\">\n<source src=\"http://134.175.21.43:6066//image/模型描述/临建资源库.mp4\" type=\"video/mp4\" /></video></span></span></p>');
INSERT INTO `alltype` VALUES ('40', '28', null, '特种设备模型库', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624691074.png\" alt=\"\" width=\"156\" height=\"45\" /></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">包括桥式起重机、门式起重机、塔式起重机、流动式起重机、门座式起重机、升降机、缆索式起重机、桅杆式起重机等特种设备，拖曳即可进行设备布置</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\"><video controls=\"controls\" width=\"1114\" height=\"557\">\n<source src=\"http://134.175.21.43:6066//image/模型描述/特种设备库.mp4\" type=\"video/mp4\" /></video></span></span></p>');
INSERT INTO `alltype` VALUES ('41', '28', null, '场景素材库', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624801373.png\" alt=\"\" width=\"166\" height=\"50\" /></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">包括植物、构筑物、建筑物（涉及桥梁、房建、水运等专业）、人物、交通工具等素材，点选素材后，拖曳即可进行场地环境布置</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\"><video controls=\"controls\" width=\"1106\" height=\"553\">\n<source src=\"http://134.175.21.43:6066//image/模型描述/场景素材库.mp4\" type=\"video/mp4\" /></video></span></span></p>');
INSERT INTO `alltype` VALUES ('42', '28', null, '资源库管理', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624823708.png\" alt=\"\" width=\"148\" height=\"43\" /></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">对资源库数据进行更新、删除</span></span></p>');
INSERT INTO `alltype` VALUES ('43', '28', null, '模型管理', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587624843586.png\" alt=\"\" width=\"151\" height=\"41\" /></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">对模型数据进行导出、删除</span></span></p>');
INSERT INTO `alltype` VALUES ('44', '29', null, '图标注解', null);
INSERT INTO `alltype` VALUES ('45', '44', null, '顶部工具栏', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587625512747.png\" alt=\"\" width=\"738\" height=\"59\" /></p>\n<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587625523338.png\" alt=\"\" width=\"43\" height=\"43\" />&nbsp;&nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\"><span style=\"font-family: 微软雅黑;\">显示日期按钮，按下旁边会显示</span></span><span style=\"font-family: 微软雅黑; font-size: 11pt; background: #ffff00;\"><span style=\"font-family: 微软雅黑;\">当前时间</span></span><span style=\"font-family: 微软雅黑; font-size: 11pt;\"><span style=\"font-family: 微软雅黑;\">（当前时间可以手动修改）、</span><span style=\"font-family: 微软雅黑;\">右边关键帧栏的顶部也会出现</span></span><span style=\"font-family: 微软雅黑; font-size: 11pt; background: #ffff00;\"><span style=\"font-family: 微软雅黑;\">时间显示</span></span><span style=\"font-family: 微软雅黑; font-size: 11pt;\"><span style=\"font-family: 微软雅黑;\">，如图：</span> &nbsp;</span></p>\n<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587625564269.png\" alt=\"\" width=\"608\" height=\"54\" /></p>\n<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587625576485.png\" alt=\"\" width=\"112\" height=\"38\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 33pt;\">动画时间，显示当前动画播放到多少秒的位置。</span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 33pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587625727777.png\" alt=\"\" width=\"45\" height=\"44\" />&nbsp; &nbsp;</span><span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 33pt;\">增加动画行按钮，点击增加一个动画行。</span></p>\n<p class=\"MsoNormal\" style=\"text-indent: 33.0000pt; mso-char-indent-count: 3.0000;\">&nbsp;</p>\n<p><span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 33pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587625748839.png\" alt=\"\" width=\"45\" height=\"39\" />&nbsp; &nbsp;</span><span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 32pt;\">复制动画行按钮，选中一个动画行点击此按钮，则会复制该动画行，只能一个一个复制不能多个同时复制。</span></p>\n<p class=\"MsoNormal\" style=\"text-indent: 32.0000pt; mso-char-indent-count: 2.0000;\">&nbsp;</p>\n<p><span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 33pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587625761034.png\" alt=\"\" width=\"45\" height=\"34\" />&nbsp; &nbsp;</span><span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 33pt;\">删除动画行，与增加动画行按钮相对，可以删除多余或不想要的动画行。</span></p>\n<p class=\"MsoNormal\" style=\"text-indent: 33.0000pt; mso-char-indent-count: 3.0000;\">&nbsp;</p>\n<p><span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 33pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587626833578.png\" alt=\"\" width=\"45\" height=\"38\" />&nbsp; &nbsp;</span><span style=\"font-family: 微软雅黑; font-size: 11pt;\">编辑动画行，给选中的动画行添加一个组。</span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 33pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587626844293.png\" alt=\"\" width=\"45\" height=\"40\" />&nbsp; &nbsp;</span><span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 33pt;\">解除动画行编辑，与</span><span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 33pt;\">&ldquo;编辑动画行&rdquo;按钮相对，点此按钮把选中的动画行从组里面剥离出来。</span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 33pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587626872397.png\" alt=\"\" width=\"45\" height=\"40\" />&nbsp; &nbsp;</span><span style=\"font-family: 微软雅黑; font-size: 11pt;\">自动关键帧，需要自动记录关键帧的时候用；激活此按钮，拖动时间滑块到某一时间点，改变物体状态，此时便会自动记录动画自动在当前时间点创建一个关键帧。</span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 33pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587626895562.png\" alt=\"\" width=\"45\" height=\"36\" />&nbsp; &nbsp;</span><span style=\"font-family: 微软雅黑; font-size: 11pt;\">手动关键帧，跟自动关键帧一样同是为动画创建关键帧的，区别是此按钮需手动控制：拖动时间滑块到某一点，改变物体状态，手动点击此按钮才会在当前时间生产关键帧。</span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 11pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587626923873.png\" alt=\"\" width=\"45\" height=\"39\" />&nbsp; &nbsp;</span><span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 33pt;\">删除关键帧，激活此按钮，关键帧图标上会出现一个叉，点击其中想要删除的帧即可将其删除。</span></p>\n<p class=\"MsoNormal\" style=\"text-indent: 33.0000pt; mso-char-indent-count: 3.0000;\">&nbsp;</p>\n<p><span style=\"font-family: 微软雅黑; font-size: 11pt; text-indent: 33pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587626941103.png\" alt=\"\" width=\"45\" height=\"38\" />&nbsp; &nbsp;</span><span style=\"font-family: 微软雅黑; font-size: 11pt;\">设置</span><span style=\"font-family: 微软雅黑; font-size: 11pt;\">AB区段，AB区段为当前编辑区段，也是播放和预览的动画区段，常用于编辑一段长动画的某一小段时，将这一小段动画设置成AB区段进行编辑会节省很多操作时间，提高效率。</span></p>\n<p class=\"MsoNormal\" style=\"text-indent: 33.0000pt; mso-char-indent-count: 3.0000;\">&nbsp;</p>\n<p class=\"MsoNormal\" style=\"text-indent: 33.0000pt; mso-char-indent-count: 3.0000;\">&nbsp;</p>\n<p>&nbsp;</p>\n<p>&nbsp;</p>\n<p>&nbsp;</p>\n<p class=\"MsoNormal\" style=\"text-indent: 33.0000pt; mso-char-indent-count: 3.0000;\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('46', '44', null, '底部播放工具栏', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587627347087.png\" alt=\"\" width=\"1080\" height=\"41\" /></p>\n<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587627361660.png\" alt=\"\" width=\"93\" height=\"35\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 10.5pt; text-indent: 33pt;\">每个动画行都有两栏不同颜色的显示，如此图标的字体颜色一样，黄色为计划时间动画，蓝色为实际时间完成的动画，点击</span><span style=\"font-family: 微软雅黑; font-size: 10.5pt; text-indent: 33pt;\">&ldquo;计划&rdquo;动画行显示黄色动画条，点击&ldquo;实际&rdquo;动画行显示蓝色动画条，二者可以独立查看和编辑。</span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 10.5pt; text-indent: 33pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587627386021.png\" alt=\"\" width=\"94\" height=\"30\" />&nbsp; &nbsp;</span><span style=\"font-family: 微软雅黑; font-size: 10.5pt;\">切换模型着色按钮，此按钮用来给模型标注颜色，例如某些模型已经安装完毕、某些模型尚未完成施工，这种情况就可以点击</span><span style=\"font-family: 微软雅黑; font-size: 10.5pt;\">&ldquo;着色&rdquo;将二者附着上不同的颜色，便于区分。</span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 10.5pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587627409504.png\" alt=\"\" width=\"45\" height=\"38\" />&nbsp; &nbsp;</span><span style=\"font-family: 微软雅黑; font-size: 10.5pt; text-indent: 33pt;\">循环播放按钮，激活的时候动画播放完会继续从头播放，不激活动画播放完就停止在末尾状态了。</span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 10.5pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587627422760.png\" alt=\"\" width=\"45\" height=\"44\" />&nbsp; &nbsp;</span><span style=\"font-family: 微软雅黑; font-size: 10.5pt; text-indent: 33pt;\">播放动画，点击播放动画（在</span><span style=\"font-family: 微软雅黑; font-size: 10.5pt; text-indent: 33pt;\">AB区段进行播放）。</span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 10.5pt; text-indent: 33pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587627437788.png\" alt=\"\" width=\"45\" height=\"42\" />&nbsp;&nbsp;</span><span style=\"font-family: 微软雅黑; font-size: 10.5pt;\">到开头按钮，时间跳到开头。</span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 10.5pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587628775835.png\" alt=\"\" width=\"45\" height=\"33\" />&nbsp;&nbsp;</span><span style=\"font-family: 微软雅黑; font-size: 10.5pt; text-indent: 33pt;\">到上一帧，时间跳到前面一帧。</span></p>\n<p class=\"MsoNormal\" style=\"text-indent: 33.0000pt; mso-char-indent-count: 3.0000;\">&nbsp;</p>\n<p><span style=\"font-family: 微软雅黑; font-size: 10.5pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587628790424.png\" alt=\"\" width=\"45\" height=\"40\" />&nbsp; &nbsp;<span style=\"font-size: 10.5pt; text-indent: 33pt; font-family: 微软雅黑;\">到结尾按钮，相教于</span><span style=\"font-size: 10.5pt; text-indent: 33pt;\">&ldquo;到开头&rdquo;，点此按钮直接跳到结尾。</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 10.5000pt;\">&ldquo;到开头&rdquo;和&ldquo;到结尾&rdquo;两个按钮都是针对AB区段而言的。</span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 10.5pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587628806963.png\" alt=\"\" width=\"45\" height=\"32\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 10.5pt;\">&nbsp;<span style=\"font-size: 10.5pt; text-indent: 33pt; font-family: 微软雅黑;\">到下一帧，相较于</span><span style=\"font-size: 10.5pt; text-indent: 33pt;\">&ldquo;到上一帧&rdquo;，点此直接跳到下一帧。</span></span><span style=\"font-size: 10.5pt;\">&ldquo;到上一帧&rdquo;和&ldquo;下一帧&rdquo;两个按钮只关乎所有动画帧的先后顺序，跟哪个动画行的帧无关。</span></span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 10.5pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587628820666.png\" alt=\"\" width=\"55\" height=\"35\" />&nbsp; &nbsp;<span style=\"font-size: 10.5pt; font-family: 微软雅黑;\">速率，默认值是</span><span style=\"font-size: 10.5pt;\">1，最小是0.1，最大是10；1是标准动画速度，0.1是以十分之一的慢速度播放、10是以十倍的快速度播放。</span></span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 10.5pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587628830263.png\" alt=\"\" width=\"93\" height=\"34\" />&nbsp; &nbsp;<span style=\"font-size: 10.5pt;\">音量调节按钮，当有声音文件时用来调节声音大小。</span></span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 10.5pt;\"><span style=\"font-size: 10.5pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587628919268.png\" alt=\"\" width=\"95\" height=\"36\" />&nbsp; &nbsp;</span><span style=\"font-size: 10.5pt; text-indent: 31.5pt;\">时间标尺，用来缩小或者放大时间区域，拉到左边是缩到最短、拉到右边是放到最大，常用于编辑比较短的动画和很长的动画。</span></span></p>\n<p class=\"MsoNormal\" style=\"text-indent: 31.5000pt; mso-char-indent-count: 3.0000;\">&nbsp;</p>\n<p><span style=\"font-family: 微软雅黑; font-size: 10.5pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587628927969.png\" alt=\"\" width=\"187\" height=\"30\" />&nbsp;&nbsp;<span style=\"font-size: 10.5pt; font-family: 微软雅黑;\">显示动画时间按钮，用来显示动画的起止时间，跟</span><span style=\"font-size: 10.5pt;\">AB区段无关。</span></span></p>\n<p class=\"MsoNormal\" style=\"text-indent: 33.0000pt; mso-char-indent-count: 3.0000;\">&nbsp;</p>\n<p class=\"MsoNormal\" style=\"text-indent: 33.0000pt; mso-char-indent-count: 3.0000;\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('47', '29', null, '操作讲解', null);
INSERT INTO `alltype` VALUES ('48', '47', null, '用自动关键帧模式制作一段动画', '<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">点击<img src=\"http://134.175.21.43:6066//image/模型描述/1587628981267.png\" alt=\"\" width=\"31\" height=\"30\" /></span></span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">添加一个动画行</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">选中场景中某个物体</span></span></p>\n<p class=\"MsoNormal\"><span style=\"position: absolute; z-index: 1; margin-left: 67.8667px; margin-top: 17.8000px; width: 139.0000px; height: 112.0000px;\"><br /></span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">点击</span></span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt; background: #ffff00; mso-highlight: #ffff00;\"><span style=\"font-family: 微软雅黑;\">左箭头</span></span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">图标、选择</span>&ldquo;场景物体&rdquo;</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587628995197.png\" alt=\"\" width=\"594\" height=\"219\" /></span></p>\n<p class=\"MsoNormal\"><span style=\"position: absolute; z-index: 1; margin-left: 92.8667px; margin-top: 19.5333px; width: 89.0000px; height: 97.0000px;\"><br /></span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">名称栏出现场景中被选中的</span></span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt; background: #ffff00; mso-highlight: #ffff00;\"><span style=\"font-family: 微软雅黑;\">物体名称</span></span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">，同时后面几个工具按钮亮显</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587629026851.png\" alt=\"\" width=\"593\" height=\"169\" /></span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">点击<img src=\"http://134.175.21.43:6066//image/模型描述/1587629050716.png\" alt=\"\" width=\"38\" height=\"34\" /></span></span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">激活自动记录关键帧</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">拖动时间滑块到任意一点、移动场景中的物体</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">此时会自动生成一个关键帧</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">播放动画试试！</span></span></p>\n<p class=\"MsoNormal\">&nbsp;</p>\n<p class=\"MsoNormal\">&nbsp;</p>\n<p class=\"MsoNormal\">&nbsp;</p>\n<p class=\"MsoNormal\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('49', '47', null, '设置AB区段', '<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">如图所示，红色动画条即为</span>AB区段</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587629078713.png\" alt=\"\" width=\"319\" height=\"115\" /></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">鼠标放到红色条尾部拖动，即改变了</span>AB区段。</span></p>');
INSERT INTO `alltype` VALUES ('50', '38', null, '工程量统计', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629181979.png\" alt=\"\" width=\"117\" height=\"34\" /> &nbsp;<img src=\"http://134.175.21.43:6066//image/模型描述/1587629191579.png\" alt=\"\" width=\"438\" height=\"578\" /></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">统计场景中临建模型构件的相关信息</span></span></p>');
INSERT INTO `alltype` VALUES ('51', '38', null, '表单管理', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629212068.png\" alt=\"\" width=\"127\" height=\"36\" />&nbsp; &nbsp;<span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">对统计表单进行保存、修改、删除和导出，支持</span>excel、word等格式导出</span></p>');
INSERT INTO `alltype` VALUES ('52', '26', null, '安全管理', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629228633.png\" alt=\"\" width=\"142\" height=\"191\" /></p>');
INSERT INTO `alltype` VALUES ('53', '26', null, '模拟', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629323017.png\" alt=\"\" width=\"132\" height=\"139\" /></p>');
INSERT INTO `alltype` VALUES ('54', '26', null, '出图', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629383941.png\" alt=\"\" width=\"129\" height=\"65\" />&nbsp; &nbsp;<img src=\"http://134.175.21.43:6066//image/模型描述/1587629398504.png\" alt=\"\" width=\"439\" height=\"186\" /></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">把搭建好的三维场景导出图片、支持</span>jpg、jpeg、png、bmp等格式</span></p>');
INSERT INTO `alltype` VALUES ('55', '26', null, '窗口', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629424360.png\" alt=\"\" width=\"139\" height=\"419\" /></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">显示和隐藏当前画面的</span>UI</span></p>');
INSERT INTO `alltype` VALUES ('56', '26', null, 'BIM 8 D', '<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">附件功能，默认状态不显示，可通过设置面板调出</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587629474683.png\" alt=\"\" width=\"145\" height=\"417\" /></span></span></p>');
INSERT INTO `alltype` VALUES ('57', '26', null, '编辑工具', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629841049.png\" alt=\"\" width=\"154\" height=\"431\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">对场景中的模型进行编辑操作</span></p>');
INSERT INTO `alltype` VALUES ('58', '57', null, '返回', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629863487.png\" alt=\"\" width=\"71\" height=\"59\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">返回上一步操作</span></p>');
INSERT INTO `alltype` VALUES ('59', '57', null, '撤销', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629880112.png\" alt=\"\" width=\"67\" height=\"64\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">返回下一步操作</span></p>');
INSERT INTO `alltype` VALUES ('60', '57', null, '参数设置', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629894011.png\" alt=\"\" width=\"70\" height=\"68\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">设置模型的相关参数</span></p>');
INSERT INTO `alltype` VALUES ('61', '57', null, '移动', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629910915.png\" alt=\"\" width=\"63\" height=\"61\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 10.5pt;\">对当前对象进行移动操作（可手动随机调节，也可输入数值进行调节</span></p>');
INSERT INTO `alltype` VALUES ('62', '57', null, '旋转', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629930342.png\" alt=\"\" width=\"68\" height=\"63\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 10.5pt;\">对当前对象进行旋转操作（可手动随机调节，也可输入数值进行调节）</span></p>\n<p class=\"MsoNormal\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('63', '57', null, '缩放', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629948408.png\" alt=\"\" width=\"70\" height=\"70\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 10.5pt;\">对当前对象进行缩放操作（可手动随机调节，也可输入数值进行调节）</span></p>');
INSERT INTO `alltype` VALUES ('64', '57', null, '对齐', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629965279.png\" alt=\"\" width=\"71\" height=\"66\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 10.5pt;\">两个物体按照一定方式进行对齐</span></p>');
INSERT INTO `alltype` VALUES ('65', '57', null, '标注', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629980779.png\" alt=\"\" width=\"65\" height=\"62\" />&nbsp;&nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">对模型进行标注</span></p>');
INSERT INTO `alltype` VALUES ('66', '57', null, '切片', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629997895.png\" alt=\"\" width=\"64\" height=\"64\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">对场景进行切片</span></p>');
INSERT INTO `alltype` VALUES ('67', '57', null, '图层', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587630015955.png\" alt=\"\" width=\"62\" height=\"62\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 10.5pt;\">可对全场景物体进行分图层操作，方便局部隐藏、局部查看、优化操作速度等。</span></p>');
INSERT INTO `alltype` VALUES ('68', '57', null, '列表', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587630040493.png\" alt=\"\" width=\"69\" height=\"67\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">对场景中的物体进行分类，选择和查找</span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 11pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587630054704.png\" alt=\"\" width=\"381\" height=\"619\" /></span></p>');
INSERT INTO `alltype` VALUES ('69', '56', null, '环境', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629488606.png\" alt=\"\" width=\"125\" height=\"41\" />&nbsp; &nbsp;<img src=\"http://134.175.21.43:6066//image/模型描述/1587629497419.png\" alt=\"\" width=\"393\" height=\"365\" /></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">调整场景中的灯光效果和天气变化</span></span></p>');
INSERT INTO `alltype` VALUES ('70', '56', null, '画刷', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629514034.png\" alt=\"\" width=\"134\" height=\"32\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">场景中快速布置花草树木，通过笔刷半径控制范围</span></p>\n<p class=\"MsoNormal\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('71', '56', null, '材质', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629530500.png\" alt=\"\" width=\"134\" height=\"38\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">创建一个新的材质球，鼠标左键不放指定给场景中的三维模型</span></p>\n<p class=\"MsoNormal\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('72', '56', null, '灯光', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629556807.png\" alt=\"\" width=\"130\" height=\"43\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">在三维场景中布置灯光效果，目前有平行光</span><span style=\"font-family: 微软雅黑; font-size: 11pt;\"> </span><span style=\"font-family: 微软雅黑; font-size: 11pt;\">点光</span><span style=\"font-family: 微软雅黑; font-size: 11pt;\"> </span><span style=\"font-family: 微软雅黑; font-size: 11pt;\">聚光灯</span><span style=\"font-family: 微软雅黑; font-size: 11pt;\"> </span><span style=\"font-family: 微软雅黑; font-size: 11pt;\">面光</span></p>\n<p class=\"MsoNormal\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('73', '56', null, '角色切换', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629577104.png\" alt=\"\" width=\"118\" height=\"35\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">以第三人称模式显示</span></p>');
INSERT INTO `alltype` VALUES ('74', '56', null, '工艺视频', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629748476.png\" alt=\"\" width=\"116\" height=\"34\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">播放外部导入的视频动画</span></p>');
INSERT INTO `alltype` VALUES ('75', '56', null, '碰撞检测', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629767394.png\" alt=\"\" width=\"128\" height=\"36\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 10.5pt;\">碰撞检测，点击会出现一个球形的碰撞检测射线球，将其附着在物体上可以实时检测该物体与其他物体之间的碰撞。</span></p>\n<p class=\"MsoNormal\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('76', '56', null, '画质设置', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629784946.png\" alt=\"\" width=\"114\" height=\"38\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">调整画面的清晰度，可根据电脑的配置自适应</span></p>');
INSERT INTO `alltype` VALUES ('77', '56', null, '联机', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629801169.png\" alt=\"\" width=\"125\" height=\"37\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">邀请多人协同作业</span></p>');
INSERT INTO `alltype` VALUES ('78', '56', null, '切换模块', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629822731.png\" alt=\"\" width=\"119\" height=\"37\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">跳转到其他系统</span></p>');
INSERT INTO `alltype` VALUES ('79', '53', null, '安拆模拟', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629339405.png\" alt=\"\" width=\"150\" height=\"47\" />&nbsp;&nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">实现环境模型场景下特种设备安拆、作业工序及安全风险的三维可视化模拟展示</span></p>\n<p class=\"MsoNormal\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('80', '53', null, '施工模拟', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629361502.png\" alt=\"\" width=\"147\" height=\"44\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">对场地进行施工模拟</span></p>');
INSERT INTO `alltype` VALUES ('81', '52', null, '安全距离设置', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629240610.png\" alt=\"\" width=\"143\" height=\"48\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">对构件模型进行安全距离设置，在模型周围形成一道透明的正方体边界框</span></p>');
INSERT INTO `alltype` VALUES ('82', '52', null, '安全预警', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629278337.png\" alt=\"\" width=\"134\" height=\"39\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">触碰构件模型安全距离后，边界框会爆红显示，起到预警提醒功能</span></p>\n<p class=\"MsoNormal\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('83', '0', null, '常用快捷工具栏', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587630097242.png\" alt=\"\" width=\"577\" height=\"71\" /></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">展开收起</span></span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&nbsp;</span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"font-family: 微软雅黑;\">保存</span></span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&nbsp;</span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&nbsp;&nbsp;<span style=\"font-family: 微软雅黑;\">载入资源库</span></span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&nbsp;</span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&nbsp;&nbsp;<span style=\"font-family: 微软雅黑;\">设置</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">可把常用的按钮拖入到空白处</span></span></p>');
INSERT INTO `alltype` VALUES ('84', '52', null, '风险源可视化', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629298468.png\" alt=\"\" width=\"141\" height=\"43\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">构件模型（包括特种设备）的附加属性（风险源）在模型周围以红色文本标签形式显示，也可以手工添加其他风险源；标签可自由切换显隐状态</span></p>');
INSERT INTO `alltype` VALUES ('87', '83', null, '保存', null);
INSERT INTO `alltype` VALUES ('88', '0', null, '通用快捷工具栏', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587630187458.png\" alt=\"\" width=\"69\" height=\"451\" />&nbsp; &nbsp;<img src=\"http://134.175.21.43:6066//image/模型描述/1587630193069.png\" alt=\"\" width=\"152\" height=\"38\" />&nbsp; &nbsp;<img src=\"http://134.175.21.43:6066//image/模型描述/1587630204868.png\" alt=\"\" width=\"128\" height=\"395\" /></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">和菜单栏编辑工具对应</span></span></p>');
INSERT INTO `alltype` VALUES ('89', '0', null, '参数化模型编辑系统', null);
INSERT INTO `alltype` VALUES ('90', '0', null, '特种设备操控模型', null);
INSERT INTO `alltype` VALUES ('91', '0', null, '底部和右侧工具栏', null);
INSERT INTO `alltype` VALUES ('92', '91', null, '常用工具栏', '<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">底部工具栏位于画面最底部偏下角位置，如下图：</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587629529557.png\" alt=\"\" width=\"166\" height=\"58\" /></span></span></p>');
INSERT INTO `alltype` VALUES ('93', '91', null, '对话框', '<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">点击出现聊天窗口，如图：<img src=\"http://134.175.21.43:6066//image/模型描述/1587629391856.png\" alt=\"\" width=\"277\" height=\"166\" />&nbsp; &nbsp;</span></span><span style=\"font-family: 微软雅黑; font-size: 11pt;\"><span style=\"font-family: 微软雅黑;\">可实现类似</span>QQ</span></p>\n<p class=\"MsoNormal\"><span style=\"font-family: 微软雅黑; font-size: 11pt;\">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <img src=\"http://134.175.21.43:6066//image/模型描述/1587629442050.png\" alt=\"\" width=\"231\" height=\"47\" /></span></p>\n<p class=\"MsoNormal\"><span style=\"font-family: 微软雅黑; font-size: 11pt;\">一样的互动聊天，可以选择插入表情，也可以查看聊天记录，点击</span><span style=\"font-family: 微软雅黑; font-size: 11pt; background: #ffff00;\"><span style=\"font-family: 微软雅黑;\">最小化</span></span><span style=\"font-family: 微软雅黑; font-size: 11pt;\"><span style=\"font-family: 微软雅黑;\">缩小聊天窗</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">口，缩小后如图<img src=\"http://134.175.21.43:6066//image/模型描述/1587629480319.png\" alt=\"\" width=\"231\" height=\"44\" />&nbsp; &nbsp;</span></span><span style=\"font-family: 微软雅黑; font-size: 11pt;\">单行显示最近一次输入的聊天内</span></p>\n<p class=\"MsoNormal\"><span style=\"font-family: 微软雅黑; font-size: 11pt;\">容，鼠标放在此行滚动中键可以实现翻动查看聊天内容。</span></p>\n<p class=\"MsoNormal\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('94', '91', null, '显示当前选择物体名称', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629341812.png\" alt=\"\" width=\"193\" height=\"36\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">当选中场景中某个模型的时候此处会显示该模型的名称，如果选择的是多个模型，此处显示选中模型个数。</span></p>');
INSERT INTO `alltype` VALUES ('95', '91', null, '独立显示模型', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629296116.png\" alt=\"\" width=\"60\" height=\"57\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">孤立模式，点此仅显示选中模型，孤立模式下再次点击退出孤立模式。</span></p>');
INSERT INTO `alltype` VALUES ('96', '91', null, '坐标轴心切换', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629267546.png\" alt=\"\" width=\"58\" height=\"56\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">切换坐标按钮，默认是世界坐标，当点击变成此图标时切换成为自身坐标</span></p>');
INSERT INTO `alltype` VALUES ('97', '91', null, '模型坐标归中', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629238012.png\" alt=\"\" width=\"51\" height=\"51\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">更改模型的坐标位置到模型中心</span></p>');
INSERT INTO `alltype` VALUES ('98', '91', null, '回到原点', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629211882.png\" alt=\"\" width=\"46\" height=\"53\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">视图快速切换到起始点</span></p>\n<p class=\"MsoNormal\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('99', '91', null, '显示隐藏', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629184788.png\" alt=\"\" width=\"68\" height=\"53\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">显示和隐藏当前选择的物体</span></p>\n<p class=\"MsoNormal\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('100', '91', null, '绘制二维线', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629157929.png\" alt=\"\" width=\"57\" height=\"51\" />&nbsp; &nbsp;&nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">绘制二线线条生成模型或路径动画工具</span></p>');
INSERT INTO `alltype` VALUES ('101', '91', null, '放大视角', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629081518.png\" alt=\"\" width=\"65\" height=\"56\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">鼠标框选区域进行放大</span></p>\n<p class=\"MsoNormal\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('102', '91', null, '位置', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587629045291.png\" alt=\"\" width=\"555\" height=\"58\" />&nbsp; &nbsp;</p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">显示当前模型位置坐标值。</span></span></p>');
INSERT INTO `alltype` VALUES ('103', '91', null, '角度', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587628920439.png\" alt=\"\" width=\"270\" height=\"57\" />&nbsp; &nbsp;<span style=\"font-family: 微软雅黑; font-size: 11pt;\">锁定旋转角度</span></p>');
INSERT INTO `alltype` VALUES ('104', '91', null, '右侧工具栏', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587628806039.png\" alt=\"\" width=\"218\" height=\"132\" /><img style=\"font-family: 微软雅黑; font-size: 14.6667px;\" src=\"http://134.175.21.43:6066//image/%E6%A8%A1%E5%9E%8B%E6%8F%8F%E8%BF%B0/1587628829833.png\" alt=\"\" width=\"101\" height=\"107\" /><span style=\"font-family: 微软雅黑; font-size: 11pt;\">右侧右上角有两个工具，如左图：</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">一个是速度滑竿，可调节相机运行时的高低速度。</span> </span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"font-family: 微软雅黑;\">收起</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">另一个是视角切换立方体，鼠标碰到反射出高亮黄色，点击则跳转到对应视角。</span></span></p>');
INSERT INTO `alltype` VALUES ('105', '90', null, '公路架桥机', null);
INSERT INTO `alltype` VALUES ('106', '90', null, '汽车起重机', null);
INSERT INTO `alltype` VALUES ('107', '90', null, '履带起重机', null);
INSERT INTO `alltype` VALUES ('108', '90', null, '轮胎起重机', null);
INSERT INTO `alltype` VALUES ('109', '90', null, '门式起重机', null);
INSERT INTO `alltype` VALUES ('110', '90', null, '塔式起重机', null);
INSERT INTO `alltype` VALUES ('111', '89', null, '二区', '<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">单击选中一条画好的道路，右键如图：</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">点击下面</span></span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt; background: #ffff00; mso-highlight: #ffff00;\">&ldquo;属性&rdquo;</span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">，弹出</span>&ldquo;道路编辑</span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">器</span>&rdquo;窗口，如图：</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587629974504.png\" alt=\"\" width=\"339\" height=\"310\" /></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">（当小三角直角指向右中为收起状态<img src=\"http://134.175.21.43:6066//image/模型描述/1587629988542.png\" alt=\"\" width=\"21\" height=\"24\" />&nbsp;&nbsp;</span></span><span style=\"font-family: 微软雅黑; font-size: 11pt;\">单击，直角变成指向右下为展开状态<img src=\"http://134.175.21.43:6066//image/模型描述/1587630002860.png\" alt=\"\" width=\"22\" height=\"23\" />&nbsp;&nbsp;</span><span style=\"font-family: 微软雅黑; font-size: 11pt;\">）</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">&nbsp; &nbsp; 如图所示，道路编辑器里面自上而下共包含七个展开栏和一个切割栏；从左到右</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">竖向观察分别是：下拉三角，栏目名称，元素个数，增加按钮<img src=\"http://134.175.21.43:6066//image/模型描述/1587630041507.png\" alt=\"\" width=\"29\" height=\"27\" />&nbsp;&nbsp;</span></span><span style=\"font-family: 微软雅黑; font-size: 11pt;\">和清空按钮&nbsp;<img src=\"http://134.175.21.43:6066//image/模型描述/1587630054321.png\" alt=\"\" width=\"32\" height=\"26\" /> 。</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">（元素后面的&nbsp;<img src=\"http://134.175.21.43:6066//image/模型描述/1587630081769.png\" alt=\"\" width=\"32\" height=\"26\" />&nbsp;&nbsp;</span></span><span style=\"font-family: 微软雅黑; font-size: 11pt;\">图标为删除此元素）。下拉三角是用来展开、收起参数的，增加是</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">指增加元素、删除也是指删除该元素，清空是一键删除所有此栏下面的元素。增加和</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">删除的结果都会即时通过元素个数直观显示出来。</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">看下每个栏目的具体功能：</span></span></p>\n<p class=\"MsoNormal\" style=\"text-indent: 22.0000pt; mso-char-indent-count: 2.0000;\"><strong><span style=\"font-family: 微软雅黑; font-size: 11pt;\"><span style=\"font-family: 微软雅黑;\">替换集合：</span></span></strong><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">此栏主要是针对单个节点替换的。当你想替换整条线路里面的某一个</span></span></p>\n<p class=\"MsoNormal\" style=\"text-indent: 22.0000pt; mso-char-indent-count: 2.0000;\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">节点时在此栏操作；</span></span></p>\n<p class=\"MsoNormal\"><strong><span style=\"font-family: 微软雅黑; font-size: 11pt;\"><span style=\"font-family: 微软雅黑;\">&nbsp; &nbsp; &nbsp; &nbsp;可重复集合：</span></span></strong><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">此栏主要是针对重复替换很多个节点，是相较于前一种的。当你想</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">一次替换整条线路里面连续的很多个节点时在此栏操作；</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">&nbsp; &nbsp; &nbsp; &nbsp;</span></span><strong style=\"text-indent: 22pt;\"><span style=\"font-family: 微软雅黑; font-size: 11pt;\"><span style=\"font-family: 微软雅黑;\">附加物体集合：</span></span></strong><span style=\"text-indent: 22pt; font-family: 微软雅黑; font-size: 11pt;\"><span style=\"font-family: 微软雅黑;\">当需要在路线里面全线添加有间隔的元素（例如路灯）时，在此</span></span></p>\n<p class=\"MsoNormal\"><span style=\"text-indent: 22pt; font-family: 微软雅黑; font-size: 11pt;\"><span style=\"font-family: 微软雅黑;\">栏操作；强调的是所添加的元素像路灯一样，每个之间是有一定距离差的；</span></span></p>\n<p class=\"MsoNormal\"><span style=\"text-indent: 22pt; font-family: 微软雅黑; font-size: 11pt;\"><span style=\"font-family: 微软雅黑;\">&nbsp; &nbsp; &nbsp; &nbsp;</span></span><strong style=\"text-indent: 22pt;\"><span style=\"font-family: 微软雅黑; font-size: 11pt;\"><span style=\"font-family: 微软雅黑;\">附加地面集合：</span></span></strong><span style=\"text-indent: 22pt; font-family: 微软雅黑; font-size: 11pt;\"><span style=\"font-family: 微软雅黑;\">此栏是上一栏的补充，专门针对连续性元素的。当需要在路线里</span></span></p>\n<p class=\"MsoNormal\"><span style=\"text-indent: 22pt; font-family: 微软雅黑; font-size: 11pt;\"><span style=\"font-family: 微软雅黑;\">面全线添加连续性的元素（如栏杆）时，在此栏操作；强调的是所添加的元素像</span></span></p>\n<p class=\"MsoNormal\"><span style=\"text-indent: 22pt; font-family: 微软雅黑; font-size: 11pt;\"><span style=\"font-family: 微软雅黑;\">栏杆一样，每个之间是无缝连接的，这种连接即使在道路出现弯道时也可以自动</span></span></p>\n<p class=\"MsoNormal\"><span style=\"text-indent: 22pt; font-family: 微软雅黑; font-size: 11pt;\"><span style=\"font-family: 微软雅黑;\">处理好元素之间的相互衔接，不会出现莫名的穿插；</span></span></p>\n<p class=\"MsoNormal\"><strong><span style=\"font-family: 微软雅黑; font-size: 11pt;\"><span style=\"font-family: 微软雅黑;\">&nbsp; &nbsp; &nbsp; &nbsp;附加动态模型集合：</span></span></strong><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">此栏是以上两栏的对比，上两栏都是针对静态元素而此栏是</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">专门针对动态元素（如汽车）的。当想在全线道路添加行驶的汽车时在此栏操作。</span></span></p>\n<p class=\"MsoNormal\" style=\"text-indent: 22.0000pt; mso-char-indent-count: 2.0000;\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('112', '89', null, '三厂', '<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">相较于上一栏，此栏用来添加连续无间隔的模型。点击增加按钮增加一个元素，</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">展开如下图：</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587629900677.png\" alt=\"\" width=\"351\" height=\"263\" /></span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&ldquo;开始&rdquo;为开始节段号，结束为想要结束位置的节段号，&ldquo;缩放&rdquo;即缩放所选模型；</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&ldquo;平移&rdquo;即按照坐标调整模型位置；&ldquo;模型&rdquo;选择模型；&ldquo;Y翻转&rdquo;是镜像模型，常</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">用的情况是：在道路一侧新增一个栏杆元素，设置好相应参数，然后再新增一个一模</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">一样的栏杆元素，第一个不勾选&ldquo;Y翻转&rdquo;第二个勾选&ldquo;Y翻转&rdquo;，这样，道路两侧就</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">会得到一模一样、互相朝向的两排栏杆。</span></p>');
INSERT INTO `alltype` VALUES ('113', '89', null, '关键临时设施', '<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">此栏用来添加车流。点击增加按钮增加一个元素，展开如下图所示：</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587629757385.png\" alt=\"\" width=\"319\" height=\"280\" /></span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&ldquo;数量&rdquo;即车辆总数；&ldquo;宽度&rdquo;即一股车道的宽度；&ldquo;角度&rdquo;设为180度的时候车辆</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">倒车行驶；&ldquo;速度&rdquo;起始值是所有车辆速度随机的一个区间值；&ldquo;路线&rdquo;区间是车道</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">数量；&ldquo;平移&rdquo;可调节车辆位置；&ldquo;模型&rdquo;选择模块用来选择不同车型；&ldquo;重置&rdquo;选</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">项勾选即镜像车流到对向。</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><img src=\"http://134.175.21.43:6066//image/模型描述/1587629793082.png\" alt=\"\" width=\"375\" height=\"274\" /><img src=\"http://134.175.21.43:6066//image/模型描述/1587629825721.png\" alt=\"\" width=\"84\" height=\"274\" /></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">需要强调的是</span>&ldquo;道路编辑器&rdquo;里的所有编辑都仅仅是针对当前选中的这一节模型的。</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">编号</span>&rdquo;输入栏可以自定义此节段的编号或名称，点击右边的</span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt; background: #ffff00; mso-highlight: #ffff00;\"><span style=\"font-family: 微软雅黑;\">保存按钮</span></span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">会将此节段从</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">整条线路中独立出来，成为单独的一个</span>Item，Item名称就是输入栏里面输入的名称。</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">如果不点击保存按钮，此节段依然是整条线路的一个构成部分。</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&ldquo;位置&rdquo;、&ldquo;旋转&rdquo;、&ldquo;缩放&rdquo;都是对此节段模型的基本编辑，目前作用效果都是基</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">于坐标轴在起始点位置的（并不是理想状态，坐标轴有待进一步改良）</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&ldquo;尺寸&rdquo;目前尚不可用。</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&ldquo;模型&rdquo;栏用来替换基准模型。</span></p>\n<p class=\"MsoNormal\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('114', '113', null, '钢栈桥', null);
INSERT INTO `alltype` VALUES ('115', '113', null, '便道', null);
INSERT INTO `alltype` VALUES ('116', '112', null, '钢筋加工厂', null);
INSERT INTO `alltype` VALUES ('117', '112', null, '预制厂', null);
INSERT INTO `alltype` VALUES ('118', '112', null, '拌合厂', null);
INSERT INTO `alltype` VALUES ('119', '111', null, '办公与生活区主要设施', null);
INSERT INTO `alltype` VALUES ('120', '111', null, '临时用水用电及消防设施', null);
INSERT INTO `alltype` VALUES ('121', '88', null, '返回', null);
INSERT INTO `alltype` VALUES ('122', '88', null, '撤销', null);
INSERT INTO `alltype` VALUES ('123', '88', null, '参数设置', null);
INSERT INTO `alltype` VALUES ('124', '88', null, '移动', null);
INSERT INTO `alltype` VALUES ('125', '88', null, '旋转', null);
INSERT INTO `alltype` VALUES ('126', '88', null, '缩放', null);
INSERT INTO `alltype` VALUES ('127', '88', null, '对齐', null);
INSERT INTO `alltype` VALUES ('128', '88', null, '标注', null);
INSERT INTO `alltype` VALUES ('129', '88', null, '切片', null);
INSERT INTO `alltype` VALUES ('130', '88', null, '图层', null);
INSERT INTO `alltype` VALUES ('131', '88', null, '列表', null);
INSERT INTO `alltype` VALUES ('133', '91', null, '右下工具栏', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587628723702.png\" alt=\"\" width=\"298\" height=\"203\" /></p>\n<p>&nbsp; &nbsp;<img style=\"font-family: 微软雅黑; font-size: 14.6667px;\" src=\"http://134.175.21.43:6066//image/%E6%A8%A1%E5%9E%8B%E6%8F%8F%E8%BF%B0/1587628972586.png\" alt=\"\" width=\"95\" height=\"119\" /><span style=\"font-family: 微软雅黑; font-size: 11pt;\">右侧右下角是小地图，黄色带小三角的</span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 11pt;\"><span style=\"font-family: 微软雅黑;\">圆圈是当前位置，随操控者的移动而变动，</span></span><span style=\"font-family: 微软雅黑; font-size: 11pt; background: #ffff00;\"><span style=\"font-family: 微软雅黑;\">右下角黄色小图标</span></span><span style=\"font-family: 微软雅黑; font-size: 11pt;\"><span style=\"font-family: 微软雅黑;\">是最小化小地图显示，</span></span></p>\n<p><span style=\"font-family: 微软雅黑; font-size: 11pt;\"><span style=\"font-family: 微软雅黑;\">点击可以缩小小地图，再次点击展开</span></span></p>\n<p class=\"MsoNormal\">&nbsp;</p>');
INSERT INTO `alltype` VALUES ('135', '0', null, '快捷键', '<p><img src=\"http://134.175.21.43:6066//image/模型描述/1587628591667.png\" alt=\"\" width=\"203\" height=\"773\" /><img src=\"http://134.175.21.43:6066//image/模型描述/1587628601060.png\" alt=\"\" width=\"248\" height=\"413\" /></p>');
INSERT INTO `alltype` VALUES ('136', '0', null, '系统环境', '<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">操作系统：</span>windows7</span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&nbsp;</span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">windows8</span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&nbsp;</span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">windows10</span></p>\n<p class=\"MsoNormal\" style=\"line-height: 150%;\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">电脑推荐配置：</span></span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">内存最少</span>32GB</span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&nbsp;</span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">硬盘空间</span>1T以上 </span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&nbsp;</span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">独立显卡</span>8G以上；</span></p>\n<p class=\"MsoNormal\" style=\"line-height: 150%;\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&nbsp;</span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">CPU:</span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">i7七代以上 </span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">&nbsp;&nbsp;&nbsp;&nbsp;</span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">驱动环境</span>:DX11以上</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">编程语言：</span></span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">Visual Studio</span><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\">/java/JavaScript/html/Ajax</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">开发环境</span>: &nbsp;&nbsp;Eclipse/Tomcat7.0/Maven3.6.2</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">软件架构：</span>Spring+Springmvc+Mybatis+MySql</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">本系统主要完成注册登录模块，用户模块，菜单模块，角色模块，日志模块，授权认证等模块。</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">注册登录模块主要实现用户的注册和登录。</span></span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">用户模块主要是实现对用户信息的管理</span>,包括用户查询,保存,更新,禁用启用等操作。</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">菜单是系统资源对外的表现形式</span>,我们可以基于菜单操作系统中的资源(例如系统管理,日志管理等)。</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">角色模块主要实现的是企业内部角色</span>(岗位)的管理,可以在添加角色时,为角色分配资源访问权限。</span></p>\n<p class=\"MsoNormal\"><span style=\"mso-spacerun: \'yes\'; font-family: 微软雅黑; font-size: 11.0000pt;\"><span style=\"font-family: 微软雅黑;\">日志模块主要实现对用户行为日志进行记录、查询、删除等操作。</span></span></p>');

-- ----------------------------
-- Table structure for approvetable
-- ----------------------------
DROP TABLE IF EXISTS `approvetable`;
CREATE TABLE `approvetable` (
  `approvenum` bigint(20) NOT NULL,
  `approver` varchar(50) DEFAULT NULL,
  `approvetime` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `proposer` varchar(50) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `flownum` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`approvenum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of approvetable
-- ----------------------------

-- ----------------------------
-- Table structure for excelapplay
-- ----------------------------
DROP TABLE IF EXISTS `excelapplay`;
CREATE TABLE `excelapplay` (
  `applyid` varchar(255) NOT NULL,
  `applyname` varchar(50) DEFAULT NULL,
  `excelname` varchar(50) DEFAULT NULL,
  `applyreson` varchar(50) DEFAULT NULL,
  `applycreattime` varchar(50) DEFAULT NULL,
  `applystatus` int(10) DEFAULT NULL,
  PRIMARY KEY (`applyid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of excelapplay
-- ----------------------------

-- ----------------------------
-- Table structure for excelapplayauthor
-- ----------------------------
DROP TABLE IF EXISTS `excelapplayauthor`;
CREATE TABLE `excelapplayauthor` (
  `applyid` varchar(50) NOT NULL,
  `authorid` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of excelapplayauthor
-- ----------------------------
INSERT INTO `excelapplayauthor` VALUES ('20200509175714', '6a4d764095ed486999d0ec42da01dea5');
INSERT INTO `excelapplayauthor` VALUES ('20200509175714', '0cc9cbe116884e5198f9d3881a45c9cf');
INSERT INTO `excelapplayauthor` VALUES ('20200509175714', 'c951026ca60c435b90c3de95d19681da');
INSERT INTO `excelapplayauthor` VALUES ('20200513143949', '739533f3768e4f3bb62c6fe9e89287dc');
INSERT INTO `excelapplayauthor` VALUES ('20200513143949', '93022e804d7843dfb5b7ff22a098e8be');
INSERT INTO `excelapplayauthor` VALUES ('20200513143949', 'dc967713ebdb42b39e430d0fa2cd3770');
INSERT INTO `excelapplayauthor` VALUES ('20200618201053', 'ebb52025662146b4a4d0ff38c99e0843');
INSERT INTO `excelapplayauthor` VALUES ('20200618201053', 'd6d8d48d7a034f9d80e23ce6e643a846');
INSERT INTO `excelapplayauthor` VALUES ('20200618201053', 'f9fbce87693f4227b955501e7b7a736c');

-- ----------------------------
-- Table structure for excelauthor
-- ----------------------------
DROP TABLE IF EXISTS `excelauthor`;
CREATE TABLE `excelauthor` (
  `authorid` varchar(50) NOT NULL,
  `authorname` varchar(50) DEFAULT NULL,
  `authorreson` varchar(50) DEFAULT NULL,
  `authortime` varchar(255) DEFAULT NULL,
  `authorstatus` int(11) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  PRIMARY KEY (`authorid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of excelauthor
-- ----------------------------

-- ----------------------------
-- Table structure for excelcontent
-- ----------------------------
DROP TABLE IF EXISTS `excelcontent`;
CREATE TABLE `excelcontent` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eid` varchar(50) DEFAULT NULL,
  `str1` varchar(50) DEFAULT NULL,
  `str2` varchar(50) DEFAULT NULL,
  `str3` varchar(50) DEFAULT NULL,
  `str4` varchar(50) DEFAULT NULL,
  `str5` varchar(50) DEFAULT NULL,
  `str6` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3545 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of excelcontent
-- ----------------------------
INSERT INTO `excelcontent` VALUES ('3509', '68f12f1db7e849168bd3904b13a10539', '类别', '构件编码', '专业代码', '产品代码', '名称', null);
INSERT INTO `excelcontent` VALUES ('3510', '68f12f1db7e849168bd3904b13a10539', '化粪池', '01010400', '01010400', '', '', '混凝土  砖');
INSERT INTO `excelcontent` VALUES ('3511', '68f12f1db7e849168bd3904b13a10539', '', '01010400-002', '01010400', '002', '化粪池1', '1.22  5.50');
INSERT INTO `excelcontent` VALUES ('3512', '68f12f1db7e849168bd3904b13a10539', '', '01010400-001', '01010400', '001', '化粪池0', '1.22  5.50');
INSERT INTO `excelcontent` VALUES ('3513', '68f12f1db7e849168bd3904b13a10539', '', '01010400-003', '01010400', '003', '化粪池2', '1.22  5.50');
INSERT INTO `excelcontent` VALUES ('3514', '68f12f1db7e849168bd3904b13a10539', '', '01010400-004', '01010400', '004', '化粪池3', '1.22  5.50');
INSERT INTO `excelcontent` VALUES ('3515', '68f12f1db7e849168bd3904b13a10539', '', '01010400-005', '01010400', '005', '化粪池4', '1.22  5.50');
INSERT INTO `excelcontent` VALUES ('3516', '68f12f1db7e849168bd3904b13a10539', '', '01010400-006', '01010400', '006', '化粪池5', '1.22  5.50');
INSERT INTO `excelcontent` VALUES ('3517', '68f12f1db7e849168bd3904b13a10539', '', '01010400-007', '01010400', '007', '化粪池6', '1.22  5.50');
INSERT INTO `excelcontent` VALUES ('3518', '68f12f1db7e849168bd3904b13a10539', '', '', '', '', '总计', '8.54  38.50');
INSERT INTO `excelcontent` VALUES ('3519', '68f12f1db7e849168bd3904b13a10539', '洗漱池', '01010800', '01010800', '', '', '混凝土/m³  砖砌/m³');
INSERT INTO `excelcontent` VALUES ('3520', '68f12f1db7e849168bd3904b13a10539', '', '01010800-001', '01010800', '001', '洗漱池0', '0.08  2.41');
INSERT INTO `excelcontent` VALUES ('3521', '68f12f1db7e849168bd3904b13a10539', '', '01010800-002', '01010800', '002', '洗漱池1', '0.08  2.41');
INSERT INTO `excelcontent` VALUES ('3522', '68f12f1db7e849168bd3904b13a10539', '', '01010800-003', '01010800', '003', '洗漱池2', '0.08  2.41');
INSERT INTO `excelcontent` VALUES ('3523', '68f12f1db7e849168bd3904b13a10539', '', '01010800-004', '01010800', '004', '洗漱池3', '0.08  2.41');
INSERT INTO `excelcontent` VALUES ('3524', '68f12f1db7e849168bd3904b13a10539', '', '01010800-005', '01010800', '005', '洗漱池4', '0.08  2.41');
INSERT INTO `excelcontent` VALUES ('3525', '68f12f1db7e849168bd3904b13a10539', '', '01010800-006', '01010800', '006', '洗漱池5', '0.08  2.41');
INSERT INTO `excelcontent` VALUES ('3526', '68f12f1db7e849168bd3904b13a10539', '', '01010800-007', '01010800', '007', '洗漱池6', '0.08  2.41');
INSERT INTO `excelcontent` VALUES ('3527', '68f12f1db7e849168bd3904b13a10539', '', '01010800-008', '01010800', '008', '洗漱池7', '0.08  2.41');
INSERT INTO `excelcontent` VALUES ('3528', '68f12f1db7e849168bd3904b13a10539', '', '01010800-009', '01010800', '009', '洗漱池8', '0.08  2.41');
INSERT INTO `excelcontent` VALUES ('3529', '68f12f1db7e849168bd3904b13a10539', '', '01010800-010', '01010800', '010', '洗漱池9', '0.08  2.41');
INSERT INTO `excelcontent` VALUES ('3530', '68f12f1db7e849168bd3904b13a10539', '', '', '', '', '总计', '0.80  24.10');
INSERT INTO `excelcontent` VALUES ('3531', '68f12f1db7e849168bd3904b13a10539', '板房_办公楼', '01010101', '01010101', '', '', '建筑面积/m²');
INSERT INTO `excelcontent` VALUES ('3532', '68f12f1db7e849168bd3904b13a10539', '', '01010101-001', '01010101', '001', '板房_办公楼0', '188.92');
INSERT INTO `excelcontent` VALUES ('3533', '68f12f1db7e849168bd3904b13a10539', '', '01010101-002', '01010101', '002', '板房_办公楼1', '188.92');
INSERT INTO `excelcontent` VALUES ('3534', '68f12f1db7e849168bd3904b13a10539', '', '01010101-003', '01010101', '003', '板房_办公楼2', '188.92');
INSERT INTO `excelcontent` VALUES ('3535', '68f12f1db7e849168bd3904b13a10539', '', '01010101-004', '01010101', '004', '板房_办公楼3', '188.92');
INSERT INTO `excelcontent` VALUES ('3536', '68f12f1db7e849168bd3904b13a10539', '', '01010101-005', '01010101', '005', '板房_办公楼4', '188.92');
INSERT INTO `excelcontent` VALUES ('3537', '68f12f1db7e849168bd3904b13a10539', '', '01010101-006', '01010101', '006', '板房_办公楼5', '188.92');
INSERT INTO `excelcontent` VALUES ('3538', '68f12f1db7e849168bd3904b13a10539', '', '01010101-007', '01010101', '007', '板房_办公楼6', '188.92');
INSERT INTO `excelcontent` VALUES ('3539', '68f12f1db7e849168bd3904b13a10539', '', '', '', '', '总计', '1322.44');
INSERT INTO `excelcontent` VALUES ('3540', '68f12f1db7e849168bd3904b13a10539', '建筑面积/m²', '1322.44', null, null, null, null);
INSERT INTO `excelcontent` VALUES ('3541', '68f12f1db7e849168bd3904b13a10539', '混凝土/m³', '0.80', null, null, null, null);
INSERT INTO `excelcontent` VALUES ('3542', '68f12f1db7e849168bd3904b13a10539', '砖砌/m³', '24.10', null, null, null, null);
INSERT INTO `excelcontent` VALUES ('3543', '68f12f1db7e849168bd3904b13a10539', '混凝土', '8.54', null, null, null, null);
INSERT INTO `excelcontent` VALUES ('3544', '68f12f1db7e849168bd3904b13a10539', '砖', '38.50', null, null, null, null);

-- ----------------------------
-- Table structure for excelmanage
-- ----------------------------
DROP TABLE IF EXISTS `excelmanage`;
CREATE TABLE `excelmanage` (
  `eid` varchar(50) NOT NULL,
  `excelname` varchar(50) DEFAULT NULL,
  `uid` varchar(50) DEFAULT NULL,
  `creattime` varchar(50) DEFAULT NULL,
  `realpath` varchar(255) DEFAULT NULL,
  `excelstatus` int(11) DEFAULT NULL,
  PRIMARY KEY (`eid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of excelmanage
-- ----------------------------
INSERT INTO `excelmanage` VALUES ('68f12f1db7e849168bd3904b13a10539', 'example.xlsx', '4499182d18e54e8f97f75c5c257d9afa', '2020-05-09 17:56:17', '/mnt/javaweb/shop/upload/excel/example.xlsx', '1');

-- ----------------------------
-- Table structure for fileinfo
-- ----------------------------
DROP TABLE IF EXISTS `fileinfo`;
CREATE TABLE `fileinfo` (
  `id` varchar(100) NOT NULL,
  `catalog` varchar(100) DEFAULT NULL,
  `fileurl` varchar(255) DEFAULT NULL,
  `uploadtime` varchar(50) DEFAULT NULL,
  `role` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fileinfo
-- ----------------------------
INSERT INTO `fileinfo` VALUES ('/image/模型描述/school_Heightmap02.png', '模型描述', '/mnt/javaweb/shop/upload/模型描述/school_Heightmap02.png', '2020-06-04', '0');
INSERT INTO `fileinfo` VALUES ('/image/模型描述/临建资源库.mp4', '模型描述', '/mnt/javaweb/shop/upload/模型描述/临建资源库.mp4', '2020-05-26', '0');
INSERT INTO `fileinfo` VALUES ('/image/模型描述/人行模式.mp4', '模型描述', '/mnt/javaweb/shop/upload/模型描述/人行模式.mp4', '2020-05-27', '0');
INSERT INTO `fileinfo` VALUES ('/image/模型描述/保存.mp4', '模型描述', '/mnt/javaweb/shop/upload/模型描述/保存.mp4', '2020-05-26', '0');
INSERT INTO `fileinfo` VALUES ('/image/模型描述/另存.mp4', '模型描述', '/mnt/javaweb/shop/upload/模型描述/另存.mp4', '2020-05-26', '0');
INSERT INTO `fileinfo` VALUES ('/image/模型描述/场景素材库.mp4', '模型描述', '/mnt/javaweb/shop/upload/模型描述/场景素材库.mp4', '2020-05-26', '0');
INSERT INTO `fileinfo` VALUES ('/image/模型描述/导入模型.mp4', '模型描述', '/mnt/javaweb/shop/upload/模型描述/导入模型.mp4', '2020-05-26', '0');
INSERT INTO `fileinfo` VALUES ('/image/模型描述/新建预设场景.mp4', '模型描述', '/mnt/javaweb/shop/upload/模型描述/新建预设场景.mp4', '2020-05-26', '0');
INSERT INTO `fileinfo` VALUES ('/image/模型描述/最近打开.mp4', '模型描述', '/mnt/javaweb/shop/upload/模型描述/最近打开.mp4', '2020-05-26', '0');
INSERT INTO `fileinfo` VALUES ('/image/模型描述/特种设备库.mp4', '模型描述', '/mnt/javaweb/shop/upload/模型描述/特种设备库.mp4', '2020-05-26', '0');
INSERT INTO `fileinfo` VALUES ('/image/模型描述/载入.mp4', '模型描述', '/mnt/javaweb/shop/upload/模型描述/载入.mp4', '2020-05-26', '0');
INSERT INTO `fileinfo` VALUES ('/image/模型描述/飞行模式.mp4', '模型描述', '/mnt/javaweb/shop/upload/模型描述/飞行模式.mp4', '2020-05-27', '0');
INSERT INTO `fileinfo` VALUES ('/image/模型描述/驾驶模式.mp4', '模型描述', '/mnt/javaweb/shop/upload/模型描述/驾驶模式.mp4', '2020-05-27', '0');
INSERT INTO `fileinfo` VALUES ('001.pak', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/001.pak', '2020-05-19', '0');
INSERT INTO `fileinfo` VALUES ('002.pak', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/002.pak', '2020-05-19', '0');
INSERT INTO `fileinfo` VALUES ('003.pak', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/003.pak', '2020-05-19', '0');
INSERT INTO `fileinfo` VALUES ('004.pak', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/004.pak', '2020-05-19', '0');
INSERT INTO `fileinfo` VALUES ('005.pak', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/005.pak', '2020-05-19', '0');
INSERT INTO `fileinfo` VALUES ('006.pak', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/006.pak', '2020-05-19', '0');
INSERT INTO `fileinfo` VALUES ('007.pak', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/007.pak', '2020-05-19', '0');
INSERT INTO `fileinfo` VALUES ('009.pak', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/009.pak', '2020-05-19', '0');
INSERT INTO `fileinfo` VALUES ('010.pak', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/010.pak', '2020-05-19', '0');
INSERT INTO `fileinfo` VALUES ('011.pak', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/011.pak', '2020-05-19', '0');
INSERT INTO `fileinfo` VALUES ('012.pak', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/012.pak', '2020-05-19', '0');
INSERT INTO `fileinfo` VALUES ('013.pak', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/013.pak', '2020-05-19', '0');
INSERT INTO `fileinfo` VALUES ('014.pak', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/014.pak', '2020-05-19', '0');
INSERT INTO `fileinfo` VALUES ('015.pak', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/015.pak', '2020-05-19', '0');
INSERT INTO `fileinfo` VALUES ('016.pak', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/016.pak', '2020-05-19', '0');
INSERT INTO `fileinfo` VALUES ('1588932990004.gltf', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/1588932990004.gltf', '2020-05-08', '0');
INSERT INTO `fileinfo` VALUES ('1588932990356.png', '模型封面', '/mnt/javaweb/shop/upload/web/模型封面/1588932990356.png', '2020-05-08', '0');
INSERT INTO `fileinfo` VALUES ('1589018660146.png', '模型封面', '/mnt/javaweb/shop/upload/web/模型封面/1589018660146.png', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589026581945.fbx', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/1589026581945.fbx', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589027119177.png', '模型封面', '/mnt/javaweb/shop/upload/web/模型封面/1589027119177.png', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589027152451.zip', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/1589027152451.zip', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589027201759.png', '模型封面', '/mnt/javaweb/shop/upload/web/模型封面/1589027201759.png', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589027207139.zip', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/1589027207139.zip', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028134052.png', '模型封面', '/mnt/javaweb/shop/upload/web/模型封面/1589028134052.png', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028138601.zip', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/1589028138601.zip', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028187823.png', '模型封面', '/mnt/javaweb/shop/upload/web/模型封面/1589028187823.png', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028191368.zip', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/1589028191368.zip', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028248744.png', '模型封面', '/mnt/javaweb/shop/upload/web/模型封面/1589028248744.png', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028256823.zip', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/1589028256823.zip', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028278016.png', '模型封面', '/mnt/javaweb/shop/upload/web/模型封面/1589028278016.png', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028298916.zip', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/1589028298916.zip', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028401996.png', '模型封面', '/mnt/javaweb/shop/upload/web/模型封面/1589028401996.png', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028407001.zip', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/1589028407001.zip', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028441962.png', '模型封面', '/mnt/javaweb/shop/upload/web/模型封面/1589028441962.png', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028446026.zip', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/1589028446026.zip', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028536581.png', '模型封面', '/mnt/javaweb/shop/upload/web/模型封面/1589028536581.png', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028542287.zip', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/1589028542287.zip', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028577706.png', '模型封面', '/mnt/javaweb/shop/upload/web/模型封面/1589028577706.png', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028582704.zip', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/1589028582704.zip', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028674848.png', '模型封面', '/mnt/javaweb/shop/upload/web/模型封面/1589028674848.png', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028719997.png', '模型封面', '/mnt/javaweb/shop/upload/web/模型封面/1589028719997.png', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028768833.png', '模型封面', '/mnt/javaweb/shop/upload/web/模型封面/1589028768833.png', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028775244.zip', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/1589028775244.zip', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028915362.zip', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/1589028915362.zip', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028920313.png', '模型封面', '/mnt/javaweb/shop/upload/web/模型封面/1589028920313.png', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028964083.png', '模型封面', '/mnt/javaweb/shop/upload/web/模型封面/1589028964083.png', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028968600.png', '模型封面', '/mnt/javaweb/shop/upload/web/模型封面/1589028968600.png', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589028975532.zip', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/1589028975532.zip', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589029008015.png', '模型封面', '/mnt/javaweb/shop/upload/web/模型封面/1589029008015.png', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589029011120.zip', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/1589029011120.zip', '2020-05-09', '0');
INSERT INTO `fileinfo` VALUES ('1589334761025.png', '模型封面', '/mnt/javaweb/shop/upload/web/模型封面/1589334761025.png', '2020-05-13', '0');
INSERT INTO `fileinfo` VALUES ('mould.zip', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/mould.zip', '2020-05-19', '0');
INSERT INTO `fileinfo` VALUES ('wuzi.gltf', '模型源文件', '/mnt/javaweb/shop/upload/web/模型源文件/wuzi.gltf', '2020-05-19', '0');

-- ----------------------------
-- Table structure for flowmodel
-- ----------------------------
DROP TABLE IF EXISTS `flowmodel`;
CREATE TABLE `flowmodel` (
  `fid` varchar(50) NOT NULL,
  `uid` varchar(50) DEFAULT NULL,
  `mid` int(11) DEFAULT NULL,
  `endaccount` varchar(50) DEFAULT NULL,
  `cycle` int(11) DEFAULT NULL,
  `starttime` varchar(50) DEFAULT NULL,
  `endtime` varchar(50) DEFAULT NULL,
  `saynew` int(11) DEFAULT NULL,
  `creattime` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of flowmodel
-- ----------------------------
INSERT INTO `flowmodel` VALUES ('773da5dd8f404325a3acfdde0a3e2845', '4499182d18e54e8f97f75c5c257d9afa', '6', '3000.00', '4', '2020-05-08', '', '2', '2020-05-08 18:32:48');
INSERT INTO `flowmodel` VALUES ('c1c6d163e4b244dd874a47911cf1f154', '2af6fe7ea00242fc8739d3bf6a333990', '6', '3000.0', '4', '2020-05-09', '', '2', '2020-05-09 18:06:15');
INSERT INTO `flowmodel` VALUES ('590c1b05c782464380ff29fd6bd0507e', '2af6fe7ea00242fc8739d3bf6a333990', '9', '150.0', '1', '2020-05-09', '2020-06-09', '2', '2020-05-09 21:08:33');
INSERT INTO `flowmodel` VALUES ('2caa2b4b098f4cb38771e30aaf1c81b3', '2af6fe7ea00242fc8739d3bf6a333990', '7', '540.0', '2', '2020-05-09', '2020-11-09', '2', '2020-05-09 21:09:15');
INSERT INTO `flowmodel` VALUES ('65699d61b58541308e7000e2d32e9e45', '2af6fe7ea00242fc8739d3bf6a333990', '15', '4320.0', '2', '2020-05-09', '2020-11-09', '2', '2020-05-09 21:09:26');
INSERT INTO `flowmodel` VALUES ('350c5e4d265e43df88e2f7f25e568473', '456378e2523e4100a3ef9388e08ae709', '6', '3000.0', '4', '2020-05-11', '', '2', '2020-05-11 10:28:30');
INSERT INTO `flowmodel` VALUES ('99b7100307e24acc8e502de2ee01879a', '11d21d9ca1f94984b682e89985006fd4', '6', '648.00', '2', '2020-05-12', '2020-11-12', '2', '2020-05-12 14:34:22');
INSERT INTO `flowmodel` VALUES ('35b32be9ddda451aba2d08774411c458', '11d21d9ca1f94984b682e89985006fd4', '9', '1440.00', '3', '2020-05-19', '2021-05-19', '2', '2020-05-19 12:15:03');
INSERT INTO `flowmodel` VALUES ('c99ab4d439144390a4aac643437467c2', '4499182d18e54e8f97f75c5c257d9afa', '9', '1200.00', '4', '2020-05-19', '', '2', '2020-05-19 14:52:54');
INSERT INTO `flowmodel` VALUES ('911cdb4c2e0c4ae5a942523a648e673f', '4499182d18e54e8f97f75c5c257d9afa', '20', '4320.00', '3', '2020-05-22', '2021-05-22', '2', '2020-05-22 09:47:56');
INSERT INTO `flowmodel` VALUES ('30ac9caf30ed4ec8bb9e37d567056062', '4499182d18e54e8f97f75c5c257d9afa', '7', '500.0', '4', '2020-06-28', '', '2', '2020-06-28 20:02:33');
INSERT INTO `flowmodel` VALUES ('da9e0af98e494062998059e1d1e4304a', '4499182d18e54e8f97f75c5c257d9afa', '14', '20000.0', '4', '2020-07-06', '', '2', '2020-07-06 16:00:30');

-- ----------------------------
-- Table structure for flowtable
-- ----------------------------
DROP TABLE IF EXISTS `flowtable`;
CREATE TABLE `flowtable` (
  `flownum` bigint(20) NOT NULL,
  `proposer` varchar(50) DEFAULT NULL,
  `flowtime` datetime DEFAULT NULL,
  `node` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `formname` varchar(50) DEFAULT NULL,
  `filepath` varchar(255) DEFAULT NULL,
  `isapprove` int(11) DEFAULT NULL,
  PRIMARY KEY (`flownum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of flowtable
-- ----------------------------

-- ----------------------------
-- Table structure for industry
-- ----------------------------
DROP TABLE IF EXISTS `industry`;
CREATE TABLE `industry` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) DEFAULT NULL,
  `iname` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of industry
-- ----------------------------
INSERT INTO `industry` VALUES ('1', '0', '项目');
INSERT INTO `industry` VALUES ('2', '0', '汽车与交通运输');
INSERT INTO `industry` VALUES ('10', '10', 'asd234234');
INSERT INTO `industry` VALUES ('16', '1', '大临项目');
INSERT INTO `industry` VALUES ('26', '0', '训练与模拟');

-- ----------------------------
-- Table structure for industrymodel
-- ----------------------------
DROP TABLE IF EXISTS `industrymodel`;
CREATE TABLE `industrymodel` (
  `id` int(11) NOT NULL,
  `mid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of industrymodel
-- ----------------------------
INSERT INTO `industrymodel` VALUES ('16', '6');
INSERT INTO `industrymodel` VALUES ('16', '7');
INSERT INTO `industrymodel` VALUES ('16', '8');
INSERT INTO `industrymodel` VALUES ('16', '9');
INSERT INTO `industrymodel` VALUES ('16', '10');
INSERT INTO `industrymodel` VALUES ('16', '11');
INSERT INTO `industrymodel` VALUES ('16', '12');
INSERT INTO `industrymodel` VALUES ('16', '13');
INSERT INTO `industrymodel` VALUES ('16', '14');
INSERT INTO `industrymodel` VALUES ('16', '15');
INSERT INTO `industrymodel` VALUES ('16', '16');
INSERT INTO `industrymodel` VALUES ('16', '17');
INSERT INTO `industrymodel` VALUES ('16', '18');
INSERT INTO `industrymodel` VALUES ('16', '19');
INSERT INTO `industrymodel` VALUES ('16', '20');
INSERT INTO `industrymodel` VALUES ('16', '21');
INSERT INTO `industrymodel` VALUES ('16', '22');
INSERT INTO `industrymodel` VALUES ('2', '6');
INSERT INTO `industrymodel` VALUES ('2', '7');
INSERT INTO `industrymodel` VALUES ('2', '8');
INSERT INTO `industrymodel` VALUES ('2', '9');
INSERT INTO `industrymodel` VALUES ('2', '10');
INSERT INTO `industrymodel` VALUES ('2', '11');
INSERT INTO `industrymodel` VALUES ('26', '9');
INSERT INTO `industrymodel` VALUES ('26', '10');
INSERT INTO `industrymodel` VALUES ('26', '11');
INSERT INTO `industrymodel` VALUES ('26', '12');
INSERT INTO `industrymodel` VALUES ('26', '13');
INSERT INTO `industrymodel` VALUES ('26', '14');
INSERT INTO `industrymodel` VALUES ('26', '15');
INSERT INTO `industrymodel` VALUES ('26', '16');
INSERT INTO `industrymodel` VALUES ('26', '17');
INSERT INTO `industrymodel` VALUES ('26', '18');
INSERT INTO `industrymodel` VALUES ('26', '19');
INSERT INTO `industrymodel` VALUES ('26', '20');
INSERT INTO `industrymodel` VALUES ('26', '21');
INSERT INTO `industrymodel` VALUES ('26', '22');

-- ----------------------------
-- Table structure for modelinfo
-- ----------------------------
DROP TABLE IF EXISTS `modelinfo`;
CREATE TABLE `modelinfo` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `modelname` varchar(50) DEFAULT NULL,
  `modelprice` double DEFAULT NULL,
  `unitprice` double DEFAULT NULL,
  `buildtype` varchar(255) DEFAULT NULL,
  `resource_one` varchar(50) DEFAULT NULL,
  `resource_two` varchar(50) DEFAULT NULL,
  `resource_three` varchar(50) DEFAULT NULL,
  `resource_four` varchar(50) DEFAULT NULL,
  `filePics` varchar(255) DEFAULT NULL,
  `fileModel` varchar(255) DEFAULT NULL,
  `mdescribe` text,
  `download` int(11) DEFAULT '0',
  `starclass` int(11) DEFAULT '1',
  `creatTime` varchar(50) DEFAULT NULL,
  `userid` varchar(50) DEFAULT NULL,
  `modelstatus` int(11) DEFAULT NULL,
  `examine` int(11) DEFAULT NULL,
  `examinepeople` varchar(50) DEFAULT NULL,
  `examinetime` varchar(50) DEFAULT NULL,
  `examineremark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of modelinfo
-- ----------------------------
INSERT INTO `modelinfo` VALUES ('6', '挖掘机', '2', '1', '可操控', '12', '28', '', '', '1589018660146.png', '1589026581945.fbx', '<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">相关参数</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">操作重量</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">操作重量是挖掘机三个重要参数(发动机功率，铲斗容量，操作重量)之一</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">操作重量决定了挖掘机的级别，决定了挖掘机挖掘力的上限。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">挖掘力≦m;工作重量</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">m:地面和履带间的附着力系数</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">如果挖掘力超过这个极限，在反铲的情况下，挖掘机将打滑，并被向前拉动，这非常危险。在正铲情况下，挖掘机将向后打滑。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">挖掘力</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">对于挖掘力来说，挖掘力主要分为小臂挖掘力和铲斗挖掘力。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">两个挖掘力的作用点均为铲斗的齿根(铲斗的唇边)，只是动力不同，小臂挖掘力来自小臂油缸;而铲斗挖掘力来自铲斗油缸。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">铲斗挖掘力</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">铲斗挖掘力</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">接地比压</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">接地比压的大小决定了挖掘机适合工作的地面条件。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">接地压力指机器重量对地面产生的压力，用下面的公式表示:</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">接地比压=工作重量&divide;全部与地面接触的面积</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">履带板</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&middot;给机器装上合适的履带板是很重要的。对履带式挖掘机来说，选择履带的标准是:只要有可能，尽量使用最窄的履带板。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&middot;常用履带类型:齿履带板、</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">平履带板</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">平履带板</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">行走速度</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">对于履带式挖掘机而言，行走时间大概占整个工作时间的十分之一。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">一般而言，两速可以满足挖掘机的行走性能。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">牵引力</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">牵引力是指挖掘机行走时所产生的力，主要取决于挖掘机的行走马达。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">这两个行走性能参数表明了挖掘机行走的机动灵活性及其行走能力。在各个厂家的样本中均能体现。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">爬坡能力</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">爬坡能力是指爬坡、下坡，或在一个坚实、平整的坡上停止的能力。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">两种表示方法:角度，百分比</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">提升能力</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">提升能力是指额定稳定提升能力或额定液压提升能力中较小的一个。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">额定稳定提升能力:75%的倾翻载荷</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">额定液压提升能力:87%的液压提升能力</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">回转速度</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">回转速度是指挖掘机空载时，稳定回转所能达到的平均最大速度。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">这意味着定义的回转速度，既不是指起动时的，也不是指制动时的回转速度;也就是说，不是加速或减速的回转速度。对于一般的挖掘工作来说，这种挖掘机在0&deg;到180&deg;的范围内工作时，回转马达有加速或减速，当转到270&deg;到360&deg;范围内时，回转速度达到稳定。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">因此，在实际的挖掘工作中，上面定义的回转速度是不切实际的。也就是说，需要的实际回转性能是可用回转扭矩表示的加速/减速。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">发动机功率</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">总功率(gross horsepower)指在没有消耗功率附件，如消音器、风扇、交流发电机和空气滤清器的情况下，在发动机飞轮上测得的输出功率。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">有效的功率(net horsepower)指在装有全部消耗功率附件，如消音器、风扇、交流发电机及空气滤清器的情况下，在发动机飞轮上测得的输出功率。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">噪音的测定</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">挖掘机噪音的主要来源于发动机。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">两种噪音:操作人员耳边的噪音测定、机器周围噪音测定</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">折叠编辑本段分类</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">常见的挖掘机按驱动方式有内燃机驱动挖掘机和电力驱动挖掘机两种。其中电动挖掘机主要应用在高原缺氧与地下矿井和其它一些易燃易爆的场所。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">按照规模大小的不同，挖掘机可以分为大型挖掘机、中型挖掘机和小型挖掘机</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">按照行走方式的不同，挖掘机可分为履带式挖掘机和轮式挖掘机。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">按照传动方式的不同，挖掘机可分为液压挖掘机和机械挖掘机。机械挖掘机主要用在一些大型矿山上。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">按照用途来分，挖掘机又可以分为通用挖掘机，矿用挖掘机，船用挖掘机，特种挖掘机等不同的类别</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">按照铲斗来分，挖掘机又可以分为正铲挖掘机、反铲挖掘机、拉铲挖掘机和抓铲挖掘机。正铲挖掘机多用于挖掘地表以上的物料，反铲挖掘机多用于挖掘地表以下的物料。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">1.反铲挖掘机反铲式是我们见过最常见的，向后向下，强制切土。可以用于停机作业面以下的挖掘，基本作业方式有:沟端挖掘、沟侧挖掘、直线挖掘、曲线挖掘、保持一定角度挖掘、超深沟挖掘和沟坡挖掘等。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">2.正铲挖掘机</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">正铲挖掘机的铲土动作形式。其特点是\"前进向上，强制切土\"。正铲挖掘力大，能开挖停机面以上的土，宜用于开挖高度大于2m的干燥基坑，但须设置上下坡道。正铲的挖斗比同当量的反铲的挖掘机的斗要大一些，可开挖含水量不大于27%的一</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">至三类土，且与自卸汽车配合完成整个挖掘运输作业，还可以挖掘大型干燥基坑和土丘等。正铲挖土机的开挖方式根据开挖路线与运输车辆的相对位置的不同，挖土和卸土的方式有以下两种:正向挖土，侧向卸土;正向挖土，反向卸土。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">3.拉铲挖掘机</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">拉铲挖土机也叫索铲挖土机。其挖土特点是:\"向后向下，自重切土\"。宜用于开挖停机面以下的Ⅰ、Ⅱ类土。工作时，利用惯性力将铲斗甩出去，挖得比较远，挖土半径和挖土深度较大，但不如反铲灵活准确。尤其适用于开挖大而深的基坑或水下挖土。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">4.抓铲挖土机</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">抓铲挖土机也叫抓斗挖土机。其挖土特点是:\"直上直下，自重切土\"。宜用于开挖停机面以下的Ⅰ、Ⅱ类土，在软土地区常用于开挖基坑、沉井等。尤其适用于挖深而窄的基坑，疏通旧有渠道以及挖取水中淤泥等，或用于装载碎石、矿渣等松散料等。开挖方式有沟侧开挖和定位开挖两种。如将抓斗做成栅条状，还可用于储木场装载矿石块、木片、木材等。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">全液压全回转挖掘机</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">现今的挖掘机占绝大部分的是全液压全回转挖掘机。液压挖掘机主要由发动机、液压系统、工作装置、行走装置和电气控制等部分组成。液压系统由液压泵、控制阀、液压缸、液压马达、管路、油箱等组成。电气控制系统包括监控盘、发动机控制系统、泵控制系统、各类传感器、电磁阀等。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">液压挖掘机一般由工作装置、上部车体和下部车体三大部分组成。据其构造和用途可以区分为:履带式、轮胎式、步履式、全液压、半液压、全回转、非全回转、通用型、专用型、铰接式、伸缩臂式等多种类型。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">工作装置是直接完成挖掘任务的装置。它由动臂、斗杆、铲斗等三部分铰接而成。为了适应各种不同施工作业的需要，液压挖掘机可以配装多种工作装置，如挖掘、起重、装载、平整、夹钳、推土、冲击锤，旋挖钻等多种作业机具。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">回转与行走装置是液压挖掘机的机体，转台上部设有动力装置和传动系统。发动机是液压挖掘机的动力源，大多采用柴油要在方便的场地， 也可改用电动机。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">液压传动系统通过液压泵将发动机的动力传递给液压马达、液压缸等执行元件，推动工作装置动作，从而完成各种作业。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">折叠编辑本段发展历史</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">最初挖掘机是手动的，从发明到2013年已经有一百三十多年了，期间经历了由蒸汽驱动斗回转挖掘机到电力驱动和内燃机驱动回转挖掘机、应用机电液一体化技术的全自动液压挖掘机的逐步发展过程。第一台液压挖掘机由法国波克兰工厂发明成功。由于液压技术的应用，20世纪40年代有了在拖拉机上配装液压反铲地悬挂式挖掘机。1951 年，第一台全液压反铲挖掘机由位于法国的 Poclain( 波克兰 ) 工厂推出，从而在挖掘机的技术发展领域开创了全新空间，20世纪50年代初期和中期相继研制出拖式全回转液压挖掘机和履带式全液压挖掘机。初期试制的液压挖掘机是采用飞机和机床的液压技术，缺少适用于挖掘机各种工况的液压元件，制造质量不够稳定，配套件也不齐全。从20世纪60年代起，液压挖掘机进入推广和蓬勃发展阶段，各国挖掘机制造厂和品种增加很快，产量猛增。1968-1970年间，液压挖掘机产量已占挖掘机总产量的83%，已接近100%。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">第一代挖掘机:电动机、内燃机的出现，使挖掘机有了先进而合适的电动装置，于是各种挖掘机产品相继诞生。1899年，第一台电动挖掘机出现了。第一次世界大战后，柴油发动机也应用在挖掘机上，这种柴油发动机(或电动机)驱动的机械式挖掘机是第一代挖掘机。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">第二代挖掘机:随着液压技术的广泛使用，使挖掘机有了更加科学适用的传动装置，液压传动代替机械传动是挖掘机技术上的一次大飞跃。1950年德国的第一台液压挖掘机诞生了。机械传动液压化是第二代挖掘机。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">第三代挖掘机:电子技术尤其是计算机技术的广泛应用，使挖掘机有了自动化的控制系统，也使挖掘机向高性能、自动化和智能化方向发展。机电一体化的萌芽约发生在1965年前后，而在批量生产的液压挖掘机上采用机电一体化技术则在1985年左右，当时主要目的是为了节能。挖掘机电子化是第三代挖掘机的标志。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">折叠编辑本段结构构成</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">常见的挖掘机结构包括，动力装置，工作装置，回转机构，操纵机构，传动机构，行走机构和辅助设施等。</span></span></p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">&nbsp;</span></span></p>\n<p>&nbsp;</p>\n<p style=\"text-indent: 28px;\"><span style=\"color: #ecf0f1; font-family: arial, sans-serif;\"><span style=\"font-size: 14px;\">传动机构通过液压泵将发动机的动力传递给液压马达、液压缸等执行元件，推动工作装置动作，从而完成各种作业。</span></span></p>', '22', '4', '2020-05-08', '00da3c04c1b14519862301666987bfcd', '1', '1', '00da3c04c1b14519862301666987bfcd', '2020-05-08', null);
INSERT INTO `modelinfo` VALUES ('7', '钢管堆放', '50', '10', '静态', '1', '43', '45', '', '1589027119177.png', 'mould.zip', '<p>钢管堆放</p>', '1', '3', '2020-05-09', '00da3c04c1b14519862301666987bfcd', '1', '1', '00da3c04c1b14519862301666987bfcd', '2020-05-09', null);
INSERT INTO `modelinfo` VALUES ('8', '钢筋加工厂', '200', '50', '参数化', '1', '43', '45', '', '1589027201759.png', '001.pak', '<p>钢筋加工厂</p>', '0', '1', '2020-05-09', '00da3c04c1b14519862301666987bfcd', '1', '1', '00da3c04c1b14519862301666987bfcd', '2020-05-09', null);
INSERT INTO `modelinfo` VALUES ('9', '门卫室', '120', '15', '参数化', '1', '37', '40', '', '1589028134052.png', '002.pak', '<p>门卫室</p>', '6', '3', '2020-05-09', '00da3c04c1b14519862301666987bfcd', '1', '1', '00da3c04c1b14519862301666987bfcd', '2020-05-09', null);
INSERT INTO `modelinfo` VALUES ('10', '宿舍', '350', '40', '参数化', '1', '37', '40', '', '1589028187823.png', '003.pak', '<p>宿舍</p>', '0', '1', '2020-05-09', '00da3c04c1b14519862301666987bfcd', '1', '1', '00da3c04c1b14519862301666987bfcd', '2020-05-09', null);
INSERT INTO `modelinfo` VALUES ('11', '会议室', '300', '25', '参数化', '1', '37', '40', '', '1589028248744.png', '004.pak', '<p>会议室</p>', '0', '1', '2020-05-09', '00da3c04c1b14519862301666987bfcd', '1', '1', '00da3c04c1b14519862301666987bfcd', '2020-05-09', null);
INSERT INTO `modelinfo` VALUES ('12', '塔吊 ', '500', '80', '可操控', '12', '50', '0', '', '1589028278016.png', '005.pak', '<p>塔吊&nbsp;</p>', '0', '1', '2020-05-09', '00da3c04c1b14519862301666987bfcd', '1', '1', '00da3c04c1b14519862301666987bfcd', '2020-05-09', null);
INSERT INTO `modelinfo` VALUES ('13', '淋浴间', '150', '20', '静态', '1', '37', '42', '', '1589028401996.png', '006.pak', '<p>淋浴间</p>', '0', '1', '2020-05-09', '00da3c04c1b14519862301666987bfcd', '1', '1', '00da3c04c1b14519862301666987bfcd', '2020-05-09', null);
INSERT INTO `modelinfo` VALUES ('14', '项目部', '2000', '500', '静态', '1', '37', '40', '', '1589028441962.png', '007.pak', '<p>项目部</p>', '1', '1', '2020-05-09', '00da3c04c1b14519862301666987bfcd', '1', '1', '00da3c04c1b14519862301666987bfcd', '2020-05-09', null);
INSERT INTO `modelinfo` VALUES ('15', '材料堆场', '350', '80', '静态', '1', '43', '46', '', '1589028536581.png', '009.pak', '<p>材料堆场</p>', '0', '1', '2020-05-09', '00da3c04c1b14519862301666987bfcd', '1', '1', '00da3c04c1b14519862301666987bfcd', '2020-05-09', null);
INSERT INTO `modelinfo` VALUES ('16', '主体建筑', '2000', '1000', '静态', '1', '37', '40', '', '1589028577706.png', '010.pak', '<p>主体建筑</p>', '0', '1', '2020-05-09', '00da3c04c1b14519862301666987bfcd', '1', '1', '00da3c04c1b14519862301666987bfcd', '2020-05-09', null);
INSERT INTO `modelinfo` VALUES ('17', '花坛', '50', '5', '参数化', '1', '37', '40', '', '1589028674848.png', '011.pak', '<p>花坛</p>', '0', '1', '2020-05-09', '00da3c04c1b14519862301666987bfcd', '1', '1', '00da3c04c1b14519862301666987bfcd', '2020-05-09', null);
INSERT INTO `modelinfo` VALUES ('18', '木板堆放', '350', '45', '静态', '1', '37', '41', '', '1589028719997.png', '012.pak', '<p>木板堆放</p>', '0', '1', '2020-05-09', '00da3c04c1b14519862301666987bfcd', '1', '1', '00da3c04c1b14519862301666987bfcd', '2020-05-09', null);
INSERT INTO `modelinfo` VALUES ('19', '停车位', '450', '20', '静态', '1', '37', '41', '', '1589028768833.png', '013.pak', '<p>停车位</p>', '0', '1', '2020-05-09', '00da3c04c1b14519862301666987bfcd', '1', '1', '00da3c04c1b14519862301666987bfcd', '2020-05-09', null);
INSERT INTO `modelinfo` VALUES ('20', '卫生洗浴间', '500', '45', '静态', '1', '37', '41', '', '1589028920313.png', '014.pak', '<p>卫生洗浴间</p>', '1', '3', '2020-05-09', '00da3c04c1b14519862301666987bfcd', '1', '1', '00da3c04c1b14519862301666987bfcd', '2020-05-09', null);
INSERT INTO `modelinfo` VALUES ('21', '钢筋存放02', '450', '55', '静态', '1', '43', '45', '', '1589028964083.png,1589028968600.png', '015.pak', '<p>钢筋存放02</p>', '0', '1', '2020-05-09', '00da3c04c1b14519862301666987bfcd', '1', '1', '00da3c04c1b14519862301666987bfcd', '2020-05-09', null);
INSERT INTO `modelinfo` VALUES ('22', '宿舍01', '550', '65', '参数化', '1', '37', '40', '', '1589029008015.png', '016.pak', '<p>宿舍01</p>', '0', '1', '2020-05-09', '00da3c04c1b14519862301666987bfcd', '1', '1', '00da3c04c1b14519862301666987bfcd', '2020-05-09', null);

-- ----------------------------
-- Table structure for orderflow
-- ----------------------------
DROP TABLE IF EXISTS `orderflow`;
CREATE TABLE `orderflow` (
  `oid` varchar(50) NOT NULL,
  `orderstatus` int(11) DEFAULT NULL,
  `orderamount` varchar(50) DEFAULT NULL,
  `mids` varchar(255) DEFAULT NULL,
  `createtime` varchar(50) DEFAULT NULL,
  `paidtime` varchar(50) DEFAULT NULL,
  `paidmethod` int(11) DEFAULT NULL,
  `str1` varchar(50) DEFAULT NULL,
  `str2` varchar(50) DEFAULT NULL,
  `uid` varchar(50) DEFAULT NULL,
  `cycle` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderflow
-- ----------------------------
INSERT INTO `orderflow` VALUES ('ae418bd72d1640e49c454e03f3d89fbc', '0', '3000.00', '6', '2020-05-08', null, '3', '2', null, '4499182d18e54e8f97f75c5c257d9afa', '4');
INSERT INTO `orderflow` VALUES ('773da5dd8f404325a3acfdde0a3e2845', '1', '3000.00', '6', '2020-05-08', '2020-05-08', '3', '2', null, '4499182d18e54e8f97f75c5c257d9afa', '4');
INSERT INTO `orderflow` VALUES ('6e0cdd7c3c3c413284a720b1224d8da2', '0', '120.00', '6', '2020-05-09', null, '3', '1', null, '2af6fe7ea00242fc8739d3bf6a333990', '1');
INSERT INTO `orderflow` VALUES ('c1c6d163e4b244dd874a47911cf1f154', '1', '3000.00', '6', '2020-05-09', '2020-05-09 18:06:15', '3', '1', null, '2af6fe7ea00242fc8739d3bf6a333990', '4');
INSERT INTO `orderflow` VALUES ('590c1b05c782464380ff29fd6bd0507e', '1', '150.00', '9', '2020-05-09', '2020-05-09 21:08:33', '3', '1', null, '2af6fe7ea00242fc8739d3bf6a333990', '1');
INSERT INTO `orderflow` VALUES ('73741fa610e8419b84d4ad357c478116', '0', '54.00', '7', '2020-05-09', null, '1', '1', null, '2af6fe7ea00242fc8739d3bf6a333990', '2');
INSERT INTO `orderflow` VALUES ('2caa2b4b098f4cb38771e30aaf1c81b3', '1', '540.00', '7', '2020-05-09', '2020-05-09 21:09:15', '3', '1', null, '2af6fe7ea00242fc8739d3bf6a333990', '2');
INSERT INTO `orderflow` VALUES ('65699d61b58541308e7000e2d32e9e45', '1', '4320.00', '15', '2020-05-09', '2020-05-09 21:09:26', '3', '1', null, '2af6fe7ea00242fc8739d3bf6a333990', '2');
INSERT INTO `orderflow` VALUES ('350c5e4d265e43df88e2f7f25e568473', '1', '3000.00', '6', '2020-05-11', '2020-05-11 10:28:30', '3', '1', null, '456378e2523e4100a3ef9388e08ae709', '4');
INSERT INTO `orderflow` VALUES ('99b7100307e24acc8e502de2ee01879a', '1', '648.00', '6', '2020-05-12', '2020-05-12', '3', '2', null, '11d21d9ca1f94984b682e89985006fd4', '2');
INSERT INTO `orderflow` VALUES ('35b32be9ddda451aba2d08774411c458', '1', '1440.00', '9', '2020-05-19', '2020-05-19', '3', '2', null, '11d21d9ca1f94984b682e89985006fd4', '3');
INSERT INTO `orderflow` VALUES ('c99ab4d439144390a4aac643437467c2', '1', '1200.00', '9', '2020-05-19', '2020-05-19', '3', '2', null, '4499182d18e54e8f97f75c5c257d9afa', '4');
INSERT INTO `orderflow` VALUES ('47b19572f2da447ba2541b1dfc536756', '0', '1000.00', '16', '2020-05-19', null, '1', '1', null, '4499182d18e54e8f97f75c5c257d9afa', '1');
INSERT INTO `orderflow` VALUES ('911cdb4c2e0c4ae5a942523a648e673f', '1', '4320.00', '20', '2020-05-22', '2020-05-22', '3', '2', null, '4499182d18e54e8f97f75c5c257d9afa', '3');
INSERT INTO `orderflow` VALUES ('3575fd0907bf470e97a0a00d9198edc3', '0', '450.00', '21', '2020-05-30', null, '1', '1', null, '4499182d18e54e8f97f75c5c257d9afa', '4');
INSERT INTO `orderflow` VALUES ('c682b013c1eb4201ad55598b16e8a675', '0', '20000.00', '16', '2020-06-10', null, '3', '1', null, '11d21d9ca1f94984b682e89985006fd4', '4');
INSERT INTO `orderflow` VALUES ('5cc7987042f0403b814798ad7e838a12', '0', '450.00', '19', '2020-06-15', null, '1', '1', null, 'be9fd6e1e2664603b3f8769b159963e8', '4');
INSERT INTO `orderflow` VALUES ('ca2448d3b0034335bd590297097c4ce1', '0', '9600.00', '16', '2020-06-24', null, '1', '1', null, '4499182d18e54e8f97f75c5c257d9afa', '3');
INSERT INTO `orderflow` VALUES ('30ac9caf30ed4ec8bb9e37d567056062', '1', '500.00', '7', '2020-06-28', '2020-06-28 20:02:33', '3', '1', null, '4499182d18e54e8f97f75c5c257d9afa', '4');
INSERT INTO `orderflow` VALUES ('141345b5862e4dd3a67ad44c65380bc0', '0', '500.00', '12', '2020-07-02', null, '1', '1', null, '4499182d18e54e8f97f75c5c257d9afa', '4');
INSERT INTO `orderflow` VALUES ('da9e0af98e494062998059e1d1e4304a', '1', '20000.00', '14', '2020-07-06', '2020-07-06 16:00:30', '3', '1', null, '4499182d18e54e8f97f75c5c257d9afa', '4');
INSERT INTO `orderflow` VALUES ('84e566b2fe7647eb8bb627b909f63e99', '0', '1200.00', '9', '2020-07-07', null, '3', '1', null, 'ba78098dc8d54d2cadf226aa5e2366e6', '4');

-- ----------------------------
-- Table structure for pakinfo
-- ----------------------------
DROP TABLE IF EXISTS `pakinfo`;
CREATE TABLE `pakinfo` (
  `pakgamepath` varchar(255) NOT NULL COMMENT '包游戏路径',
  `pakname` varchar(255) NOT NULL,
  `pakdownloadpath` varchar(255) DEFAULT NULL COMMENT '包下载路径',
  `type` varchar(255) NOT NULL COMMENT '包类型',
  `pakpicturepath` varchar(255) DEFAULT NULL COMMENT '包缩略图路径',
  `classname` varchar(255) NOT NULL,
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `displayname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pakgamepath`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pakinfo
-- ----------------------------
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_banbianlian', 'Item_banbianlian', 'http://134.175.21.43:6066/file/download?fileModel=Item_banbianlian.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_banbianlian.jpg', '花', '', '半边莲');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_banbianlian2', 'Item_banbianlian2', 'http://134.175.21.43:6066/file/download?fileModel=Item_banbianlian2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_banbianlian2.jpg', '花', '', '半边莲2');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bangjian1', 'Item_bangjian1', 'http://134.175.21.43:6066/file/download?fileModel=Item_bangjian1.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bangjian1.jpg', '片树', '', '棒樫1');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bangjian2', 'Item_bangjian2', 'http://134.175.21.43:6066/file/download?fileModel=Item_bangjian2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bangjian2.jpg', '片树', '', '棒樫2');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui001', 'Item_bui001', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui001.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui001.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui002', 'Item_bui002', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui002.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui002.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui003', 'Item_bui003', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui003.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui003.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui004', 'Item_bui004', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui004.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui004.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui005', 'Item_bui005', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui005.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui005.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui006', 'Item_bui006', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui006.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui006.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui007', 'Item_bui007', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui007.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui007.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui008', 'Item_bui008', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui008.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui008.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui009', 'Item_bui009', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui009.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui009.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui010', 'Item_bui010', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui010.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui010.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui011', 'Item_bui011', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui011.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui011.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui012', 'Item_bui012', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui012.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui012.jpg', '', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui013', 'Item_bui013', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui013.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui013.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui014', 'Item_bui014', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui014.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui014.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui015', 'Item_bui015', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui015.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui015.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui016', 'Item_bui016', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui016.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui016.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui017', 'Item_bui017', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui017.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui017.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui018', 'Item_bui018', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui018.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui018.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui019', 'Item_bui019', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui019.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui019.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui020', 'Item_bui020', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui020.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui020.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui021', 'Item_bui021', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui021.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui021.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_bui022', 'Item_bui022', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui022.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui022.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_caocong', 'Item_caocong', 'http://134.175.21.43:6066/file/download?fileModel=Item_caocong.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_caocong.jpg', '草', '', '草丛');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car001', 'Item_car001', 'http://134.175.21.43:6066/file/download?fileModel=Item_car001.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car001.jpg', '交通', '', '中型货车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car002', 'Item_car002', 'http://134.175.21.43:6066/file/download?fileModel=Item_car002.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car002.jpg', '交通', '', '小轿车_浅蓝');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car003', 'Item_car003', 'http://134.175.21.43:6066/file/download?fileModel=Item_car003.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car003.jpg', '交通', '', '小轿车_宝石蓝');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car004', 'Item_car004', 'http://134.175.21.43:6066/file/download?fileModel=Item_car004.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car004.jpg', '交通', '', '小轿车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car005', 'Item_car005', 'http://134.175.21.43:6066/file/download?fileModel=Item_car005.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car005.jpg', '交通', '', '小轿车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car006', 'Item_car006', 'http://134.175.21.43:6066/file/download?fileModel=Item_car006.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car006.jpg', '交通', '', '面包车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car007', 'Item_car007', 'http://134.175.21.43:6066/file/download?fileModel=Item_car007.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car007.jpg', '交通', '', '出租车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car008', 'Item_car008', 'http://134.175.21.43:6066/file/download?fileModel=Item_car008.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car008.jpg', '交通', '', '跑车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car009', 'Item_car009', 'http://134.175.21.43:6066/file/download?fileModel=Item_car009.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car009.jpg', '', '', '小轿车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car010', 'Item_car010', 'http://134.175.21.43:6066/file/download?fileModel=Item_car010.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car010.jpg', '交通', '', '出租车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car011', 'Item_car011', 'http://134.175.21.43:6066/file/download?fileModel=Item_car011.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car011.jpg', '交通', '', '跑车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car012', 'Item_car012', 'http://134.175.21.43:6066/file/download?fileModel=Item_car012.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car012.jpg', '交通', '', '出租车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car013', 'Item_car013', 'http://134.175.21.43:6066/file/download?fileModel=Item_car013.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car013.jpg', '交通', '', '出租车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car014', 'Item_car014', 'http://134.175.21.43:6066/file/download?fileModel=Item_car014.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car014.jpg', '交通', '', '小轿车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car015', 'Item_car015', 'http://134.175.21.43:6066/file/download?fileModel=Item_car015.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car015.jpg', '交通', '', '小轿车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car016', 'Item_car016', 'http://134.175.21.43:6066/file/download?fileModel=Item_car016.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car016.jpg', '交通', '', '小轿车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car017', 'Item_car017', 'http://134.175.21.43:6066/file/download?fileModel=Item_car017.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car017.jpg', '交通', '', '小轿车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car018', 'Item_car018', 'http://134.175.21.43:6066/file/download?fileModel=Item_car018.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car018.jpg', '交通', '', '出租车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car019', 'Item_car019', 'http://134.175.21.43:6066/file/download?fileModel=Item_car019.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car019.jpg', '交通', '', '私家车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car020', 'Item_car020', 'http://134.175.21.43:6066/file/download?fileModel=Item_car020.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car020.jpg', '交通', '', '大型货运车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car021', 'Item_car021', 'http://134.175.21.43:6066/file/download?fileModel=Item_car021.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car021.jpg', '交通', '', '货运车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car022', 'Item_car022', 'http://134.175.21.43:6066/file/download?fileModel=Item_car022.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car022.jpg', '', '', '大型货运车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car023', 'Item_car023', 'http://134.175.21.43:6066/file/download?fileModel=Item_car023.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car023.jpg', '交通', '', '公交车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car024', 'Item_car024', 'http://134.175.21.43:6066/file/download?fileModel=Item_car024.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car024.jpg', '交通', '', '公交车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car025', 'Item_car025', 'http://134.175.21.43:6066/file/download?fileModel=Item_car025.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car025.jpg', '交通', '', '大巴车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car026', 'Item_car026', 'http://134.175.21.43:6066/file/download?fileModel=Item_car026.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car026.jpg', '交通', '', '大巴车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car027', 'Item_car027', 'http://134.175.21.43:6066/file/download?fileModel=Item_car027.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car027.jpg', '交通', '', '大巴车');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car_chuan2', 'Item_car_chuan2', 'http://134.175.21.43:6066/file/download?fileModel=Item_car_chuan2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car_chuan2.jpg', '交通', '', '船2');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car_fanzhou01', 'Item_car_fanzhou01', 'http://134.175.21.43:6066/file/download?fileModel=Item_car_fanzhou01.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car_fanzhou01.jpg', '交通', '', '泛舟');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_car_hexiehao', 'Item_car_hexiehao', 'http://134.175.21.43:6066/file/download?fileModel=Item_car_hexiehao.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car_hexiehao.jpg', '交通', '', '和谐号');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_chaiyexiaopi', 'Item_chaiyexiaopi', 'http://134.175.21.43:6066/file/download?fileModel=Item_chaiyexiaopi.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_chaiyexiaopi.jpg', '草', '', '紫叶小劈');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_changqingteng', 'Item_changqingteng', 'http://134.175.21.43:6066/file/download?fileModel=Item_changqingteng.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_changqingteng.jpg', '片树', '', '常青藤');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_changyecikui', 'Item_changyecikui', 'http://134.175.21.43:6066/file/download?fileModel=Item_changyecikui.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_changyecikui.jpg', '片树', '', '长叶刺葵');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_ChaZuo', 'Item_ChaZuo', 'http://134.175.21.43:6066/file/download?fileModel=Item_ChaZuo.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_ChaZuo.jpg', '电器电缆', '', '插座');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_ChePeng', 'Item_ChePeng', 'http://134.175.21.43:6066/file/download?fileModel=Item_ChePeng.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_ChePeng.jpg', '', '', '车棚');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_chiyang', 'Item_chiyang', 'http://134.175.21.43:6066/file/download?fileModel=Item_chiyang.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_chiyang.jpg', '3D树', '', '赤杨');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_chuanhuangbo', 'Item_chuanhuangbo', 'http://134.175.21.43:6066/file/download?fileModel=Item_chuanhuangbo.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_chuanhuangbo.jpg', '3D树', '', '川黄柏');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_cuijushu', 'Item_cuijushu', 'http://134.175.21.43:6066/file/download?fileModel=Item_cuijushu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_cuijushu.jpg', '花', '', '翠菊属');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_cuishu', 'Item_cuishu', 'http://134.175.21.43:6066/file/download?fileModel=Item_cuishu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_cuishu.jpg', '花', '', '翠雀');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_Dabiancao', 'Item_Dabiancao', 'http://134.175.21.43:6066/file/download?fileModel=Item_Dabiancao.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Dabiancao.jpg', '卫浴间', '', '大便槽');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_dalihua', 'Item_dalihua', 'http://134.175.21.43:6066/file/download?fileModel=Item_dalihua.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_dalihua.jpg', '花', '', '大丽花');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_DianLanCao', 'Item_DianLanCao', 'http://134.175.21.43:6066/file/download?fileModel=Item_DianLanCao.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_DianLanCao.jpg', '电器电缆', '', '电缆槽');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_diliya', 'Item_diliya', 'http://134.175.21.43:6066/file/download?fileModel=Item_diliya.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_diliya.jpg', '3D树', '', '蒂利亚');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_diliya2', 'Item_diliya2', 'http://134.175.21.43:6066/file/download?fileModel=Item_diliya2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_diliya2.jpg', '3D树', '', '蒂利亚2');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_diliya3', 'Item_diliya3', 'http://134.175.21.43:6066/file/download?fileModel=Item_diliya3.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_diliya3.jpg', '3D树', '', '蒂利亚3');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_diliya4', 'Item_diliya4', 'http://134.175.21.43:6066/file/download?fileModel=Item_diliya4.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_diliya4.jpg', '3D树', '', '蒂利亚4');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_Dormitoryd', 'Item_Dormitoryd', 'http://134.175.21.43:6066/file/download?fileModel=Item_Dormitoryd.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Dormitoryd.jpg', '办公与生活用房', '', '板房_宿舍楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_dujuanhua', 'Item_dujuanhua', 'http://134.175.21.43:6066/file/download?fileModel=Item_dujuanhua.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_dujuanhua.jpg', '片树', '', '杜鹃花');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_ezhangqiu', 'Item_ezhangqiu', 'http://134.175.21.43:6066/file/download?fileModel=Item_ezhangqiu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_ezhangqiu.jpg', '片树', '', '落新妇');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_fanmushu', 'Item_fanmushu', 'http://134.175.21.43:6066/file/download?fileModel=Item_fanmushu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_fanmushu.jpg', '3D树', '', '番木树');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_feizhouju', 'Item_feizhouju', 'http://134.175.21.43:6066/file/download?fileModel=Item_feizhouju.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_feizhouju.jpg', '片花', '', '长叶刺葵');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_fengshu', 'Item_fengshu', 'http://134.175.21.43:6066/file/download?fileModel=Item_fengshu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_fengshu.jpg', '片树', '', '枫树');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_Geduanban', 'Item_Geduanban', 'http://134.175.21.43:6066/file/download?fileModel=Item_Geduanban.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Geduanban.jpg', '卫浴间', '', '隔断板');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_Gongdidamen', 'Item_Gongdidamen', 'http://134.175.21.43:6066/file/download?fileModel=Item_Gongdidamen.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Gongdidamen.jpg', '大门', '', '工地大门');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_gongdimenjing', 'Item_gongdimenjing', 'http://134.175.21.43:6066/file/download?fileModel=Item_gongdimenjing.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_gongdimenjing.jpg', '大门', '', '工地大门-门禁系统');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_guangyehuashu1', 'Item_guangyehuashu1', 'http://134.175.21.43:6066/file/download?fileModel=Item_guangyehuashu1.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_guangyehuashu1.jpg', '片树', '', '光叶榉树1');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_guangyehuashu2', 'Item_guangyehuashu2', 'http://134.175.21.43:6066/file/download?fileModel=Item_guangyehuashu2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_guangyehuashu2.jpg', '片树', '', '光叶榉树2');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_guangyehuashu3', 'Item_guangyehuashu3', 'http://134.175.21.43:6066/file/download?fileModel=Item_guangyehuashu3.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_guangyehuashu3.jpg', '片数', '', '光叶榉树');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_guangyeshilan', 'Item_guangyeshilan', 'http://134.175.21.43:6066/file/download?fileModel=Item_guangyeshilan.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_guangyeshilan.jpg', '片树', '', '光叶石楠');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_guanmu', 'Item_guanmu', 'http://134.175.21.43:6066/file/download?fileModel=Item_guanmu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_guanmu.jpg', '', '', '草灌木');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_haikui', 'Item_haikui', 'http://134.175.21.43:6066/file/download?fileModel=Item_haikui.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_haikui.jpg', '3D树', '', '海葵');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_haiyezi', 'Item_haiyezi', 'http://134.175.21.43:6066/file/download?fileModel=Item_haiyezi.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_haiyezi.jpg', '', '', '海椰子');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_haizao', 'Item_haizao', 'http://134.175.21.43:6066/file/download?fileModel=Item_haizao.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_haizao.jpg', '3D树', '', '海枣');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_haizao2', 'Item_haizao2', 'http://134.175.21.43:6066/file/download?fileModel=Item_haizao2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_haizao2.jpg', '3D树', '', '海枣2');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_hanjinglian', 'Item_hanjinglian', 'http://134.175.21.43:6066/file/download?fileModel=Item_hanjinglian.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_hanjinglian.jpg', '花', '', '旱金莲');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_hanjinglian2', 'Item_hanjinglian2', 'http://134.175.21.43:6066/file/download?fileModel=Item_hanjinglian2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_hanjinglian2.jpg', '花', '', '旱金莲2');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_heimaicao', 'Item_heimaicao', 'http://134.175.21.43:6066/file/download?fileModel=Item_heimaicao.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_heimaicao.jpg', '草', '', '阿多尼斯');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_heimaicao2', 'Item_heimaicao2', 'http://134.175.21.43:6066/file/download?fileModel=Item_heimaicao2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_heimaicao2.jpg', '草', '', '黑麦草2');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_hongduanmu', 'Item_hongduanmu', 'http://134.175.21.43:6066/file/download?fileModel=Item_hongduanmu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_hongduanmu.jpg', '草', '', '红端木');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_huafengchi', 'Item_huafengchi', 'http://134.175.21.43:6066/file/download?fileModel=Item_huafengchi.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_huafengchi.jpg', '', '', '化粪池');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_huakui', 'Item_huakui', 'http://134.175.21.43:6066/file/download?fileModel=Item_huakui.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_huakui.jpg', '花', '', '花葵');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_huamu', 'Item_huamu', 'http://134.175.21.43:6066/file/download?fileModel=Item_huamu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_huamu.jpg', '3D树', '', '桦木');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_huamu2', 'Item_huamu2', 'http://134.175.21.43:6066/file/download?fileModel=Item_huamu2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_huamu2.jpg', '3D树', '', '桦木2');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_huashengdunzong', 'Item_huashengdunzong', 'http://134.175.21.43:6066/file/download?fileModel=Item_huashengdunzong.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_huashengdunzong.jpg', '3D树', '', '华盛顿棕');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_huashengdunzong2', 'Item_huashengdunzong2', 'http://134.175.21.43:6066/file/download?fileModel=Item_huashengdunzong2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_huashengdunzong2.jpg', '3D树', '', '华盛顿棕2');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_huashengdunzong3', 'Item_huashengdunzong3', 'http://134.175.21.43:6066/file/download?fileModel=Item_huashengdunzong3.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_huashengdunzong3.jpg', '3D树', '', '华盛顿棕3');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_HuLanWeiqiang', 'Item_HuLanWeiqiang', 'http://134.175.21.43:6066/file/download?fileModel=Item_HuLanWeiqiang.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_HuLanWeiqiang.jpg', '围墙', '', 'PVC护栏式围墙');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_huojusong', 'Item_huojusong', 'http://134.175.21.43:6066/file/download?fileModel=Item_huojusong.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_huojusong.jpg', '3D树', '', '火炬松');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_jing', 'Item_jing', 'http://134.175.21.43:6066/file/download?fileModel=Item_jing.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_jing.jpg', '片花', '', '蓟');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_jinguangju', 'Item_jinguangju', 'http://134.175.21.43:6066/file/download?fileModel=Item_jinguangju.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_jinguangju.jpg', '片花', '', '野茉莉');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_jingzhanhua', 'Item_jingzhanhua', 'http://134.175.21.43:6066/file/download?fileModel=Item_jingzhanhua.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_jingzhanhua.jpg', '片花', '', '金盏花');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_Jizhuangxiang', 'Item_Jizhuangxiang', 'http://134.175.21.43:6066/file/download?fileModel=Item_Jizhuangxiang.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Jizhuangxiang.jpg', '办公与生活用房', '', '集装箱');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_Kaiguan', 'Item_Kaiguan', 'http://134.175.21.43:6066/file/download?fileModel=Item_Kaiguan.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Kaiguan.jpg', '电器电缆', '', '开关');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_Kaiguanxiang', 'Item_Kaiguanxiang', 'http://134.175.21.43:6066/file/download?fileModel=Item_Kaiguanxiang.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Kaiguanxiang.jpg', '', '', '开关箱');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_Lanqiuchang', 'Item_Lanqiuchang', 'http://134.175.21.43:6066/file/download?fileModel=Item_Lanqiuchang.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Lanqiuchang.jpg', '', '', '篮球场');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_lashu', 'Item_lashu', 'http://134.175.21.43:6066/file/download?fileModel=Item_lashu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_lashu.jpg', '3D树', '', '蜡树');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_lashu2', 'Item_lashu2', 'http://134.175.21.43:6066/file/download?fileModel=Item_lashu2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_lashu2.jpg', '3D树', '', '蜡树2');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_lashu3', 'Item_lashu3', 'http://134.175.21.43:6066/file/download?fileModel=Item_lashu3.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_lashu3.jpg', '3D树', '', '蜡树3');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_lashu4', 'Item_lashu4', 'http://134.175.21.43:6066/file/download?fileModel=Item_lashu4.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_lashu4.jpg', '3D树', '', '蜡树4');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_lincai', 'Item_lincai', 'http://134.175.21.43:6066/file/download?fileModel=Item_lincai.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_lincai.jpg', '花', '', '陵菜');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_liushan', 'Item_liushan', 'http://134.175.21.43:6066/file/download?fileModel=Item_liushan.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_liushan.jpg', '花', '', '柳杉');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_liushu', 'Item_liushu', 'http://134.175.21.43:6066/file/download?fileModel=Item_liushu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_liushu.jpg', '3D树', '', '柳树');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_lvli', 'Item_lvli', 'http://134.175.21.43:6066/file/download?fileModel=Item_lvli.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_lvli.jpg', '片树', '', '绿篱');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_lvqiu', 'Item_lvqiu', 'http://134.175.21.43:6066/file/download?fileModel=Item_lvqiu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_lvqiu.jpg', '片花', '', '绿球');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_macao', 'Item_macao', 'http://134.175.21.43:6066/file/download?fileModel=Item_macao.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_macao.jpg', '草', '', '麻草');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_man_mw_L01', 'Item_man_mw_L01', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_mw_L01.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_mw_L01.jpg', '人物', '', '常服男01');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_man_mw_L02', 'Item_man_mw_L02', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_mw_L02.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_mw_L02.jpg', '人物', '', '常服男02');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_man_mw_L03', 'Item_man_mw_L03', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_mw_L03.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_mw_L03.jpg', '人物', '', '常服男03');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_man_mw_L04', 'Item_man_mw_L04', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_mw_L04.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_mw_L04.jpg', '人物', '', '常服男04');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_man_mw_L05', 'Item_man_mw_L05', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_mw_L05.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_mw_L05.jpg', '人物', '', '常服男05');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_man_mw_L06', 'Item_man_mw_L06', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_mw_L06.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_mw_L06.jpg', '人物', '', '常服男06');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_man_mw_L07', 'Item_man_mw_L07', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_mw_L07.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_mw_L07.jpg', '人物', '', '常服男07');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_man_mw_L08', 'Item_man_mw_L08', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_mw_L08.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_mw_L08.jpg', '人物', '', '常服男08');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_man_mw_L09', 'Item_man_mw_L09', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_mw_L09.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_mw_L09.jpg', '人物', '', '常服男09');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_man_mw_L10', 'Item_man_mw_L10', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_mw_L10.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_mw_L10.jpg', '人物', '', '常服男10');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_man_wmw_L01', 'Item_man_wmw_L01', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_wmw_L01.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_wmw_L01.jpg', '人物', '', '常服女01');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_man_wmw_L02', 'Item_man_wmw_L02', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_wmw_L02.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_wmw_L02.jpg', '人物', '', '常服女02');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_man_wmw_L03', 'Item_man_wmw_L03', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_wmw_L03.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_wmw_L03.jpg', '人物', '', '常服女03');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_man_wmw_L04', 'Item_man_wmw_L04', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_wmw_L04.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_wmw_L04.jpg', '人物', '', '常服女04');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_man_wmw_L05', 'Item_man_wmw_L05', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_wmw_L05.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_wmw_L05.jpg', '人物', '', '常服女05');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_man_wmw_L06', 'Item_man_wmw_L06', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_wmw_L06.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_wmw_L06.jpg', '人物', '', '常服女06');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_man_wmw_L07', 'Item_man_wmw_L07', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_wmw_L07.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_wmw_L07.jpg', '人物', '', '常服女07');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_man_wmw_L08', 'Item_man_wmw_L08', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_wmw_L08.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_wmw_L08.jpg', '人物', '', '常服女08');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_man_wmw_L09', 'Item_man_wmw_L09', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_wmw_L09.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_wmw_L09.jpg', '人物', '', '常服女09');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_man_wmw_L10', 'Item_man_wmw_L10', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_wmw_L10.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_wmw_L10.jpg', '人物', '', '常服女10');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_mengweishi', 'Item_mengweishi', 'http://134.175.21.43:6066/file/download?fileModel=Item_mengweishi.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_mengweishi.jpg', '门卫室', '', '门卫室');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_mugesong', 'Item_mugesong', 'http://134.175.21.43:6066/file/download?fileModel=Item_mugesong.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_mugesong.jpg', '3D树', '', '穆戈松');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_OfficeBuilding', 'Item_OfficeBuilding', 'http://134.175.21.43:6066/file/download?fileModel=Item_OfficeBuilding.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_OfficeBuilding.jpg', '办公与生活用房', '', '板房_办公楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_ParametricModeling', 'Item_ParametricModeling', 'http://134.175.21.43:6066/file/download?fileModel=Item_ParametricModeling.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_ParametricModeling.jpg', '', '', '办公楼');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_Peidiangui', 'Item_Peidiangui', 'http://134.175.21.43:6066/file/download?fileModel=Item_Peidiangui.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Peidiangui.jpg', '', '', '配电柜');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_Peidianxiang', 'Item_Peidianxiang', 'http://134.175.21.43:6066/file/download?fileModel=Item_Peidianxiang.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Peidianxiang.jpg', '', '', '配电箱');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_pianshu', 'Item_pianshu', 'http://134.175.21.43:6066/file/download?fileModel=Item_pianshu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_pianshu.jpg', '片树', '', '铁冬青_可调节');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_qiaosong', 'Item_qiaosong', 'http://134.175.21.43:6066/file/download?fileModel=Item_qiaosong.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_qiaosong.jpg', '3D树', '', '乔松');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_Qitai', 'Item_Qitai', 'http://134.175.21.43:6066/file/download?fileModel=Item_Qitai.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Qitai.jpg', '旗台', '', '旗台');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_qiuyu', 'Item_qiuyu', 'http://134.175.21.43:6066/file/download?fileModel=Item_qiuyu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_qiuyu.jpg', '', '', '秋榆');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_qiyeshu', 'Item_qiyeshu', 'http://134.175.21.43:6066/file/download?fileModel=Item_qiyeshu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_qiyeshu.jpg', '', '', '七叶树');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_sansedong', 'Item_sansedong', 'http://134.175.21.43:6066/file/download?fileModel=Item_sansedong.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_sansedong.jpg', '', '', '三色堇');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_sanweikui', 'Item_sanweikui', 'http://134.175.21.43:6066/file/download?fileModel=Item_sanweikui.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_sanweikui.jpg', '', '', '散尾葵');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_shanzha', 'Item_shanzha', 'http://134.175.21.43:6066/file/download?fileModel=Item_shanzha.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_shanzha.jpg', '', '', '山楂');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_shensuomen', 'Item_shensuomen', 'http://134.175.21.43:6066/file/download?fileModel=Item_shensuomen.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_shensuomen.jpg', '大门', '', '伸缩门');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_shuishan1', 'Item_shuishan1', 'http://134.175.21.43:6066/file/download?fileModel=Item_shuishan1.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_shuishan1.jpg', '', '', '水杉1');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_shuishan2', 'Item_shuishan2', 'http://134.175.21.43:6066/file/download?fileModel=Item_shuishan2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_shuishan2.jpg', '', '', '水杉2');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_shuishan3', 'Item_shuishan3', 'http://134.175.21.43:6066/file/download?fileModel=Item_shuishan3.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_shuishan3.jpg', '片数', '', '水杉3');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_sizhaohua', 'Item_sizhaohua', 'http://134.175.21.43:6066/file/download?fileModel=Item_sizhaohua.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_sizhaohua.jpg', '', '', '四照花');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_songshu', 'Item_songshu', 'http://134.175.21.43:6066/file/download?fileModel=Item_songshu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_songshu.jpg', '', '', '松树');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_songshu2', 'Item_songshu2', 'http://134.175.21.43:6066/file/download?fileModel=Item_songshu2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_songshu2.jpg', '', '', '松树2');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_songshu3', 'Item_songshu3', 'http://134.175.21.43:6066/file/download?fileModel=Item_songshu3.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_songshu3.jpg', '', '', '松树3');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_songshu4', 'Item_songshu4', 'http://134.175.21.43:6066/file/download?fileModel=Item_songshu4.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_songshu4.jpg', '', '', '松树4');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_songshu5', 'Item_songshu5', 'http://134.175.21.43:6066/file/download?fileModel=Item_songshu5.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_songshu5.jpg', '', '', '松树5');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_taicao', 'Item_taicao', 'http://134.175.21.43:6066/file/download?fileModel=Item_taicao.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_taicao.jpg', '草', '', '苔草');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_taoshu', 'Item_taoshu', 'http://134.175.21.43:6066/file/download?fileModel=Item_taoshu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_taoshu.jpg', '片树', '', '桃树');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_Tingchechang', 'Item_Tingchechang', 'http://134.175.21.43:6066/file/download?fileModel=Item_Tingchechang.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Tingchechang.jpg', '', '', '停车场');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_Weiqiang', 'Item_Weiqiang', 'http://134.175.21.43:6066/file/download?fileModel=Item_Weiqiang.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Weiqiang.jpg', '围墙', '', 'PVC围挡');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_Wupaiyitu', 'Item_Wupaiyitu', 'http://134.175.21.43:6066/file/download?fileModel=Item_Wupaiyitu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Wupaiyitu.jpg', '', '', '五牌一图');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_xianshu', 'Item_xianshu', 'http://134.175.21.43:6066/file/download?fileModel=Item_xianshu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_xianshu.jpg', '3D树', '', '苋属');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_Xiaobianchi', 'Item_Xiaobianchi', 'http://134.175.21.43:6066/file/download?fileModel=Item_Xiaobianchi.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Xiaobianchi.jpg', '卫浴间', '', '小便池');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_Xiaofangjia', 'Item_Xiaofangjia', 'http://134.175.21.43:6066/file/download?fileModel=Item_Xiaofangjia.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Xiaofangjia.jpg', '', '', '消防架');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_Xilianpen', 'Item_Xilianpen', 'http://134.175.21.43:6066/file/download?fileModel=Item_Xilianpen.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Xilianpen.jpg', '卫浴间', '', '洗脸盆');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_xisuchi', 'Item_xisuchi', 'http://134.175.21.43:6066/file/download?fileModel=Item_xisuchi.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_xisuchi.jpg', '', '', '洗漱池');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_xiuxianju', 'Item_xiuxianju', 'http://134.175.21.43:6066/file/download?fileModel=Item_xiuxianju.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_xiuxianju.jpg', '花', '', '绣线菊');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_xunzhangju', 'Item_xunzhangju', 'http://134.175.21.43:6066/file/download?fileModel=Item_xunzhangju.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_xunzhangju.jpg', '', '', '勋章菊');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yangmei1', 'Item_yangmei1', 'http://134.175.21.43:6066/file/download?fileModel=Item_yangmei1.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yangmei1.jpg', '片树', '', '杨梅1');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yangmei2', 'Item_yangmei2', 'http://134.175.21.43:6066/file/download?fileModel=Item_yangmei2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yangmei2.jpg', '片树', '', '杨梅2');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yangshu', 'Item_yangshu', 'http://134.175.21.43:6066/file/download?fileModel=Item_yangshu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yangshu.jpg', '3D树', '', '杨树');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yangshu2', 'Item_yangshu2', 'http://134.175.21.43:6066/file/download?fileModel=Item_yangshu2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yangshu2.jpg', '3D树', '', '杨树2');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yaoshukui', 'Item_yaoshukui', 'http://134.175.21.43:6066/file/download?fileModel=Item_yaoshukui.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yaoshukui.jpg', '3D树', '', '药蜀葵');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yecaomei', 'Item_yecaomei', 'http://134.175.21.43:6066/file/download?fileModel=Item_yecaomei.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yecaomei.jpg', '草', '', '野草莓');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yemoli', 'Item_yemoli', 'http://134.175.21.43:6066/file/download?fileModel=Item_yemoli.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yemoli.jpg', '片花', '', '野茉莉');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yewandou', 'Item_yewandou', 'http://134.175.21.43:6066/file/download?fileModel=Item_yewandou.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yewandou.jpg', '花', '', '野豌豆');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yinghuashu', 'Item_yinghuashu', 'http://134.175.21.43:6066/file/download?fileModel=Item_yinghuashu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yinghuashu.jpg', '片树', '', '樱花树');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yinghuashukaihua', 'Item_yinghuashukaihua', 'http://134.175.21.43:6066/file/download?fileModel=Item_yinghuashukaihua.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yinghuashukaihua.jpg', '片树', '', '樱花树开花');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yinglian', 'Item_yinglian', 'http://134.175.21.43:6066/file/download?fileModel=Item_yinglian.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yinglian.jpg', '花', '', '银莲花');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yingxing', 'Item_yingxing', 'http://134.175.21.43:6066/file/download?fileModel=Item_yingxing.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yingxing.jpg', '3D树', '', '银杏');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yinxing1', 'Item_yinxing1', 'http://134.175.21.43:6066/file/download?fileModel=Item_yinxing1.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yinxing1.jpg', '片树', '', '银杏1');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yinxing2', 'Item_yinxing2', 'http://134.175.21.43:6066/file/download?fileModel=Item_yinxing2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yinxing2.jpg', '片树', '', '银杏2');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yujingxiangfen', 'Item_yujingxiangfen', 'http://134.175.21.43:6066/file/download?fileModel=Item_yujingxiangfen.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yujingxiangfen.jpg', '片花', '', '郁金香粉色');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yujingxianghuangse', 'Item_yujingxianghuangse', 'http://134.175.21.43:6066/file/download?fileModel=Item_yujingxianghuangse.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yujingxianghuangse.jpg', '片花', '', '郁金香黄色');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yumaoqiuchang', 'Item_yumaoqiuchang', 'http://134.175.21.43:6066/file/download?fileModel=Item_yumaoqiuchang.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yumaoqiuchang.jpg', '', '', '羽毛球场');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yunshan', 'Item_yunshan', 'http://134.175.21.43:6066/file/download?fileModel=Item_yunshan.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yunshan.jpg', '3D树', '', '云杉');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yunshan2', 'Item_yunshan2', 'http://134.175.21.43:6066/file/download?fileModel=Item_yunshan2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yunshan2.jpg', '3D树', '', '云杉2');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yunshan3', 'Item_yunshan3', 'http://134.175.21.43:6066/file/download?fileModel=Item_yunshan3.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yunshan3.jpg', '3D树', '', '云杉3');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yushu', 'Item_yushu', 'http://134.175.21.43:6066/file/download?fileModel=Item_yushu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yushu.jpg', '3D树', '', '榆树');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_yuzan', 'Item_yuzan', 'http://134.175.21.43:6066/file/download?fileModel=Item_yuzan.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yuzan.jpg', '草', '', '玉簪');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_zhangmu1', 'Item_zhangmu1', 'http://134.175.21.43:6066/file/download?fileModel=Item_zhangmu1.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_zhangmu1.jpg', '片树', '', '樟木1');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_zhangmu2', 'Item_zhangmu2', 'http://134.175.21.43:6066/file/download?fileModel=Item_zhangmu2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_zhangmu2.jpg', '片树', '', '樟木2');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_zhilijiuyezi', 'Item_zhilijiuyezi', 'http://134.175.21.43:6066/file/download?fileModel=Item_zhilijiuyezi.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_zhilijiuyezi.jpg', '3D树', '', '智利酒椰子');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_zhouxinwutou', 'Item_zhouxinwutou', 'http://134.175.21.43:6066/file/download?fileModel=Item_zhouxinwutou.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_zhouxinwutou.jpg', '花', '', '舟形乌头');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_Zhuanqihuachi', 'Item_Zhuanqihuachi', 'http://134.175.21.43:6066/file/download?fileModel=Item_Zhuanqihuachi.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Zhuanqihuachi.jpg', '花池', '', '砖砌花池');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_ZhuanQiWeiqiang', 'Item_ZhuanQiWeiqiang', 'http://134.175.21.43:6066/file/download?fileModel=Item_ZhuanQiWeiqiang.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_ZhuanQiWeiqiang.jpg', '围墙', '', '砖砌围墙');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_zhuzan', 'Item_zhuzan', 'http://134.175.21.43:6066/file/download?fileModel=Item_zhuzan.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_zhuzan.jpg', '', '', '珠簪');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_zishan', 'Item_zishan', 'http://134.175.21.43:6066/file/download?fileModel=Item_zishan.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_zishan.jpg', '', '', '紫衫');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_zonglv1', 'Item_zonglv1', 'http://134.175.21.43:6066/file/download?fileModel=Item_zonglv1.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_zonglv1.jpg', '片树', '', '棕榈1');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_zonglv2', 'Item_zonglv2', 'http://134.175.21.43:6066/file/download?fileModel=Item_zonglv2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_zonglv2.jpg', '片树', '', '棕榈2');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/Item_zonglvshu', 'Item_zonglvshu', 'http://134.175.21.43:6066/file/download?fileModel=Item_zonglvshu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_zonglvshu.jpg', '3D树', '', '棕榈树');
INSERT INTO `pakinfo` VALUES ('/Game/DPC/Item/shulin', 'shulin', 'http://134.175.21.43:6066/file/download?fileModel=shulin.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=shulin.jpg', '片树', '', '数林');

-- ----------------------------
-- Table structure for pakinfo_copy1
-- ----------------------------
DROP TABLE IF EXISTS `pakinfo_copy1`;
CREATE TABLE `pakinfo_copy1` (
  `pakgamepath` varchar(255) NOT NULL COMMENT '包游戏路径',
  `pakname` varchar(255) NOT NULL,
  `pakdownloadpath` varchar(255) DEFAULT NULL COMMENT '包下载路径',
  `type` varchar(255) NOT NULL COMMENT '包类型',
  `pakpicturepath` varchar(255) DEFAULT NULL COMMENT '包缩略图路径',
  `classname` varchar(255) NOT NULL,
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `displayname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pakgamepath`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pakinfo_copy1
-- ----------------------------
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_banbianlian', 'Item_banbianlian', 'http://134.175.21.43:6066/file/download?fileModel=Item_banbianlian.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_banbianlian.jpg', '植物', '', '半边莲');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_banbianlian2', 'Item_banbianlian2', 'http://134.175.21.43:6066/file/download?fileModel=Item_banbianlian2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_banbianlian2.jpg', '植物', '', '半边莲2');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bangjian1', 'Item_bangjian1', 'http://134.175.21.43:6066/file/download?fileModel=Item_bangjian1.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bangjian1.jpg', '植物', '', '棒樫1');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bangjian2', 'Item_bangjian2', 'http://134.175.21.43:6066/file/download?fileModel=Item_bangjian2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bangjian2.jpg', '植物', '', '棒樫2');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui001', 'Item_bui001', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui001.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui001.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui002', 'Item_bui002', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui002.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui002.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui003', 'Item_bui003', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui003.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui003.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui004', 'Item_bui004', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui004.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui004.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui005', 'Item_bui005', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui005.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui005.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui006', 'Item_bui006', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui006.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui006.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui007', 'Item_bui007', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui007.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui007.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui008', 'Item_bui008', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui008.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui008.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui009', 'Item_bui009', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui009.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui009.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui010', 'Item_bui010', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui010.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui010.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui011', 'Item_bui011', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui011.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui011.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui012', 'Item_bui012', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui012.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui012.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui013', 'Item_bui013', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui013.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui013.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui014', 'Item_bui014', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui014.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui014.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui015', 'Item_bui015', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui015.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui015.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui016', 'Item_bui016', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui016.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui016.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui017', 'Item_bui017', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui017.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui017.jpg', 'E MAX', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui018', 'Item_bui018', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui018.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui018.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui019', 'Item_bui019', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui019.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui019.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui020', 'Item_bui020', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui020.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui020.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui021', 'Item_bui021', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui021.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui021.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_bui022', 'Item_bui022', 'http://134.175.21.43:6066/file/download?fileModel=Item_bui022.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_bui022.jpg', '建筑', '', '配楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_caocong', 'Item_caocong', 'http://134.175.21.43:6066/file/download?fileModel=Item_caocong.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_caocong.jpg', '植物', '', '草丛');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car001', 'Item_car001', 'http://134.175.21.43:6066/file/download?fileModel=Item_car001.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car001.jpg', '交通', '', '中型货车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car002', 'Item_car002', 'http://134.175.21.43:6066/file/download?fileModel=Item_car002.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car002.jpg', '交通', '', '小轿车_浅蓝');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car003', 'Item_car003', 'http://134.175.21.43:6066/file/download?fileModel=Item_car003.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car003.jpg', '交通', '', '小轿车_宝石蓝');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car004', 'Item_car004', 'http://134.175.21.43:6066/file/download?fileModel=Item_car004.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car004.jpg', '交通', '', '小轿车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car005', 'Item_car005', 'http://134.175.21.43:6066/file/download?fileModel=Item_car005.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car005.jpg', '交通', '', '小轿车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car006', 'Item_car006', 'http://134.175.21.43:6066/file/download?fileModel=Item_car006.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car006.jpg', '交通', '', '面包车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car007', 'Item_car007', 'http://134.175.21.43:6066/file/download?fileModel=Item_car007.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car007.jpg', '交通', '', '出租车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car008', 'Item_car008', 'http://134.175.21.43:6066/file/download?fileModel=Item_car008.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car008.jpg', '交通', '', '跑车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car009', 'Item_car009', 'http://134.175.21.43:6066/file/download?fileModel=Item_car009.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car009.jpg', '交通', '', '小轿车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car010', 'Item_car010', 'http://134.175.21.43:6066/file/download?fileModel=Item_car010.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car010.jpg', '交通', '', '出租车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car011', 'Item_car011', 'http://134.175.21.43:6066/file/download?fileModel=Item_car011.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car011.jpg', '交通', '', '跑车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car012', 'Item_car012', 'http://134.175.21.43:6066/file/download?fileModel=Item_car012.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car012.jpg', '交通', '', '出租车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car013', 'Item_car013', 'http://134.175.21.43:6066/file/download?fileModel=Item_car013.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car013.jpg', '交通', '', '出租车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car014', 'Item_car014', 'http://134.175.21.43:6066/file/download?fileModel=Item_car014.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car014.jpg', '交通', '', '小轿车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car015', 'Item_car015', 'http://134.175.21.43:6066/file/download?fileModel=Item_car015.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car015.jpg', '交通', '', '小轿车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car016', 'Item_car016', 'http://134.175.21.43:6066/file/download?fileModel=Item_car016.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car016.jpg', '交通', '', '小轿车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car017', 'Item_car017', 'http://134.175.21.43:6066/file/download?fileModel=Item_car017.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car017.jpg', '交通', '', '小轿车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car018', 'Item_car018', 'http://134.175.21.43:6066/file/download?fileModel=Item_car018.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car018.jpg', '交通', '', '出租车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car019', 'Item_car019', 'http://134.175.21.43:6066/file/download?fileModel=Item_car019.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car019.jpg', '交通', '', '私家车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car020', 'Item_car020', 'http://134.175.21.43:6066/file/download?fileModel=Item_car020.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car020.jpg', '交通', '', '大型货运车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car021', 'Item_car021', 'http://134.175.21.43:6066/file/download?fileModel=Item_car021.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car021.jpg', '交通', '', '货运车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car022', 'Item_car022', 'http://134.175.21.43:6066/file/download?fileModel=Item_car022.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car022.jpg', '交通', '', '大型货运车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car023', 'Item_car023', 'http://134.175.21.43:6066/file/download?fileModel=Item_car023.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car023.jpg', '交通', '', '公交车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car024', 'Item_car024', 'http://134.175.21.43:6066/file/download?fileModel=Item_car024.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car024.jpg', '交通', '', '公交车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car025', 'Item_car025', 'http://134.175.21.43:6066/file/download?fileModel=Item_car025.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car025.jpg', '交通', '', '大巴车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car026', 'Item_car026', 'http://134.175.21.43:6066/file/download?fileModel=Item_car026.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car026.jpg', '交通', '', '大巴车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car027', 'Item_car027', 'http://134.175.21.43:6066/file/download?fileModel=Item_car027.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car027.jpg', '交通', '', '大巴车');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car_chuan2', 'Item_car_chuan2', 'http://134.175.21.43:6066/file/download?fileModel=Item_car_chuan2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car_chuan2.jpg', '交通', '', '船2');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car_fanzhou01', 'Item_car_fanzhou01', 'http://134.175.21.43:6066/file/download?fileModel=Item_car_fanzhou01.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car_fanzhou01.jpg', '交通', '', '泛舟');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_car_hexiehao', 'Item_car_hexiehao', 'http://134.175.21.43:6066/file/download?fileModel=Item_car_hexiehao.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_car_hexiehao.jpg', '交通', '', '和谐号');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_chaiyexiaopi', 'Item_chaiyexiaopi', 'http://134.175.21.43:6066/file/download?fileModel=Item_chaiyexiaopi.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_chaiyexiaopi.jpg', '植物', '', '紫叶小劈');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_changqingteng', 'Item_changqingteng', 'http://134.175.21.43:6066/file/download?fileModel=Item_changqingteng.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_changqingteng.jpg', '植物', '', '常青藤');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_changyecikui', 'Item_changyecikui', 'http://134.175.21.43:6066/file/download?fileModel=Item_changyecikui.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_changyecikui.jpg', '植物', '', '长叶刺葵');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_ChaZuo', 'Item_ChaZuo', 'http://134.175.21.43:6066/file/download?fileModel=Item_ChaZuo.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_ChaZuo.jpg', '消防及水电设施', '', '插座');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_ChePeng', 'Item_ChePeng', 'http://134.175.21.43:6066/file/download?fileModel=Item_ChePeng.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_ChePeng.jpg', '附属设施', '', '车棚');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_chiyang', 'Item_chiyang', 'http://134.175.21.43:6066/file/download?fileModel=Item_chiyang.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_chiyang.jpg', '植物', '', '赤杨');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_chuanhuangbo', 'Item_chuanhuangbo', 'http://134.175.21.43:6066/file/download?fileModel=Item_chuanhuangbo.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_chuanhuangbo.jpg', '植物', '', '川黄柏');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_cuijushu', 'Item_cuijushu', 'http://134.175.21.43:6066/file/download?fileModel=Item_cuijushu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_cuijushu.jpg', '植物', '', '翠菊属');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_cuishu', 'Item_cuishu', 'http://134.175.21.43:6066/file/download?fileModel=Item_cuishu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_cuishu.jpg', '植物', '', '翠雀');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_Dabiancao', 'Item_Dabiancao', 'http://134.175.21.43:6066/file/download?fileModel=Item_Dabiancao.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Dabiancao.jpg', '土建设施', '', '大便槽');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_dalihua', 'Item_dalihua', 'http://134.175.21.43:6066/file/download?fileModel=Item_dalihua.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_dalihua.jpg', '植物', '', '大丽花');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_DianLanCao', 'Item_DianLanCao', 'http://134.175.21.43:6066/file/download?fileModel=Item_DianLanCao.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_DianLanCao.jpg', '消防及水电设施', '', '电缆槽');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_diliya', 'Item_diliya', 'http://134.175.21.43:6066/file/download?fileModel=Item_diliya.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_diliya.jpg', '植物', '', '蒂利亚');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_diliya2', 'Item_diliya2', 'http://134.175.21.43:6066/file/download?fileModel=Item_diliya2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_diliya2.jpg', '植物', '', '蒂利亚2');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_diliya3', 'Item_diliya3', 'http://134.175.21.43:6066/file/download?fileModel=Item_diliya3.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_diliya3.jpg', '植物', '', '蒂利亚3');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_diliya4', 'Item_diliya4', 'http://134.175.21.43:6066/file/download?fileModel=Item_diliya4.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_diliya4.jpg', '植物', '', '蒂利亚4');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_Dormitoryd', 'Item_Dormitoryd', 'http://134.175.21.43:6066/file/download?fileModel=Item_Dormitoryd.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Dormitoryd.jpg', '土建设施', '', '板房_宿舍楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_dujuanhua', 'Item_dujuanhua', 'http://134.175.21.43:6066/file/download?fileModel=Item_dujuanhua.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_dujuanhua.jpg', '植物', '', '杜鹃花');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_ezhangqiu', 'Item_ezhangqiu', 'http://134.175.21.43:6066/file/download?fileModel=Item_ezhangqiu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_ezhangqiu.jpg', '植物', '', '落新妇');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_fanmushu', 'Item_fanmushu', 'http://134.175.21.43:6066/file/download?fileModel=Item_fanmushu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_fanmushu.jpg', '植物', '', '番木树');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_feizhouju', 'Item_feizhouju', 'http://134.175.21.43:6066/file/download?fileModel=Item_feizhouju.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_feizhouju.jpg', '植物', '', '长叶刺葵');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_fengshu', 'Item_fengshu', 'http://134.175.21.43:6066/file/download?fileModel=Item_fengshu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_fengshu.jpg', '植物', '', '枫树');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_Geduanban', 'Item_Geduanban', 'http://134.175.21.43:6066/file/download?fileModel=Item_Geduanban.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Geduanban.jpg', '土建设施', '', '隔断板');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_Gongdidamen', 'Item_Gongdidamen', 'http://134.175.21.43:6066/file/download?fileModel=Item_Gongdidamen.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Gongdidamen.jpg', '土建设施', '', '工地大门');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_gongdimenjing', 'Item_gongdimenjing', 'http://134.175.21.43:6066/file/download?fileModel=Item_gongdimenjing.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_gongdimenjing.jpg', '土建设施', '', '工地大门-门禁系统');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_guangyehuashu1', 'Item_guangyehuashu1', 'http://134.175.21.43:6066/file/download?fileModel=Item_guangyehuashu1.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_guangyehuashu1.jpg', '植物', '', '光叶榉树1');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_guangyehuashu2', 'Item_guangyehuashu2', 'http://134.175.21.43:6066/file/download?fileModel=Item_guangyehuashu2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_guangyehuashu2.jpg', '植物', '', '光叶榉树2');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_guangyehuashu3', 'Item_guangyehuashu3', 'http://134.175.21.43:6066/file/download?fileModel=Item_guangyehuashu3.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_guangyehuashu3.jpg', '植物', '', '光叶榉树');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_guangyeshilan', 'Item_guangyeshilan', 'http://134.175.21.43:6066/file/download?fileModel=Item_guangyeshilan.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_guangyeshilan.jpg', '植物', '', '光叶石楠');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_guanmu', 'Item_guanmu', 'http://134.175.21.43:6066/file/download?fileModel=Item_guanmu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_guanmu.jpg', '植物', '', '草灌木');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_haikui', 'Item_haikui', 'http://134.175.21.43:6066/file/download?fileModel=Item_haikui.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_haikui.jpg', '植物', '', '海葵');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_haiyezi', 'Item_haiyezi', 'http://134.175.21.43:6066/file/download?fileModel=Item_haiyezi.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_haiyezi.jpg', '植物3D树', '', '海椰子');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_haizao', 'Item_haizao', 'http://134.175.21.43:6066/file/download?fileModel=Item_haizao.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_haizao.jpg', '植物', '', '海枣');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_haizao2', 'Item_haizao2', 'http://134.175.21.43:6066/file/download?fileModel=Item_haizao2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_haizao2.jpg', '植物', '', '海枣2');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_hanjinglian', 'Item_hanjinglian', 'http://134.175.21.43:6066/file/download?fileModel=Item_hanjinglian.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_hanjinglian.jpg', '植物', '', '旱金莲');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_hanjinglian2', 'Item_hanjinglian2', 'http://134.175.21.43:6066/file/download?fileModel=Item_hanjinglian2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_hanjinglian2.jpg', '植物', '', '旱金莲2');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_heimaicao', 'Item_heimaicao', 'http://134.175.21.43:6066/file/download?fileModel=Item_heimaicao.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_heimaicao.jpg', '植物', '', '阿多尼斯');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_heimaicao2', 'Item_heimaicao2', 'http://134.175.21.43:6066/file/download?fileModel=Item_heimaicao2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_heimaicao2.jpg', '植物', '', '黑麦草2');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_hongduanmu', 'Item_hongduanmu', 'http://134.175.21.43:6066/file/download?fileModel=Item_hongduanmu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_hongduanmu.jpg', '植物', '', '红端木');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_huafengchi', 'Item_huafengchi', 'http://134.175.21.43:6066/file/download?fileModel=Item_huafengchi.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_huafengchi.jpg', '土建设施', '', '化粪池');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_huakui', 'Item_huakui', 'http://134.175.21.43:6066/file/download?fileModel=Item_huakui.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_huakui.jpg', '植物', '', '花葵');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_huamu', 'Item_huamu', 'http://134.175.21.43:6066/file/download?fileModel=Item_huamu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_huamu.jpg', '植物', '', '桦木');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_huamu2', 'Item_huamu2', 'http://134.175.21.43:6066/file/download?fileModel=Item_huamu2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_huamu2.jpg', '植物', '', '桦木2');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_huashengdunzong', 'Item_huashengdunzong', 'http://134.175.21.43:6066/file/download?fileModel=Item_huashengdunzong.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_huashengdunzong.jpg', '植物', '', '华盛顿棕');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_huashengdunzong2', 'Item_huashengdunzong2', 'http://134.175.21.43:6066/file/download?fileModel=Item_huashengdunzong2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_huashengdunzong2.jpg', '植物', '', '华盛顿棕2');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_huashengdunzong3', 'Item_huashengdunzong3', 'http://134.175.21.43:6066/file/download?fileModel=Item_huashengdunzong3.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_huashengdunzong3.jpg', '植物', '', '华盛顿棕3');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_HuLanWeiqiang', 'Item_HuLanWeiqiang', 'http://134.175.21.43:6066/file/download?fileModel=Item_HuLanWeiqiang.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_HuLanWeiqiang.jpg', '土建设施', '', 'PVC护栏式围墙');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_huojusong', 'Item_huojusong', 'http://134.175.21.43:6066/file/download?fileModel=Item_huojusong.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_huojusong.jpg', '植物', '', '火炬松');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_jing', 'Item_jing', 'http://134.175.21.43:6066/file/download?fileModel=Item_jing.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_jing.jpg', '植物', '', '蓟');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_jinguangju', 'Item_jinguangju', 'http://134.175.21.43:6066/file/download?fileModel=Item_jinguangju.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_jinguangju.jpg', '植物', '', '野茉莉');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_jingzhanhua', 'Item_jingzhanhua', 'http://134.175.21.43:6066/file/download?fileModel=Item_jingzhanhua.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_jingzhanhua.jpg', '植物', '', '金盏花');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_Jizhuangxiang', 'Item_Jizhuangxiang', 'http://134.175.21.43:6066/file/download?fileModel=Item_Jizhuangxiang.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Jizhuangxiang.jpg', '土建设施', '', '集装箱');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_Kaiguan', 'Item_Kaiguan', 'http://134.175.21.43:6066/file/download?fileModel=Item_Kaiguan.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Kaiguan.jpg', '消防及水电设施', '', '开关');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_Kaiguanxiang', 'Item_Kaiguanxiang', 'http://134.175.21.43:6066/file/download?fileModel=Item_Kaiguanxiang.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Kaiguanxiang.jpg', '消防及水电设施', '', '开关箱');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_Lanqiuchang', 'Item_Lanqiuchang', 'http://134.175.21.43:6066/file/download?fileModel=Item_Lanqiuchang.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Lanqiuchang.jpg', '附属设施', '', '篮球场');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_lashu', 'Item_lashu', 'http://134.175.21.43:6066/file/download?fileModel=Item_lashu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_lashu.jpg', '植物', '', '蜡树');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_lashu2', 'Item_lashu2', 'http://134.175.21.43:6066/file/download?fileModel=Item_lashu2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_lashu2.jpg', '植物', '', '蜡树2');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_lashu3', 'Item_lashu3', 'http://134.175.21.43:6066/file/download?fileModel=Item_lashu3.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_lashu3.jpg', '植物', '', '蜡树3');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_lashu4', 'Item_lashu4', 'http://134.175.21.43:6066/file/download?fileModel=Item_lashu4.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_lashu4.jpg', '植物', '', '蜡树4');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_lincai', 'Item_lincai', 'http://134.175.21.43:6066/file/download?fileModel=Item_lincai.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_lincai.jpg', '植物', '', '陵菜');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_liushan', 'Item_liushan', 'http://134.175.21.43:6066/file/download?fileModel=Item_liushan.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_liushan.jpg', '植物', '', '柳杉');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_liushu', 'Item_liushu', 'http://134.175.21.43:6066/file/download?fileModel=Item_liushu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_liushu.jpg', '植物', '', '柳树');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_lvli', 'Item_lvli', 'http://134.175.21.43:6066/file/download?fileModel=Item_lvli.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_lvli.jpg', '植物', '', '绿篱');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_lvqiu', 'Item_lvqiu', 'http://134.175.21.43:6066/file/download?fileModel=Item_lvqiu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_lvqiu.jpg', '植物', '', '绿球');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_macao', 'Item_macao', 'http://134.175.21.43:6066/file/download?fileModel=Item_macao.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_macao.jpg', '植物', '', '麻草');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_man_mw_L01', 'Item_man_mw_L01', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_mw_L01.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_mw_L01.jpg', '人物', '', '常服男01');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_man_mw_L02', 'Item_man_mw_L02', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_mw_L02.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_mw_L02.jpg', '人物', '', '常服男02');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_man_mw_L03', 'Item_man_mw_L03', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_mw_L03.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_mw_L03.jpg', '人物', '', '常服男03');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_man_mw_L04', 'Item_man_mw_L04', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_mw_L04.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_mw_L04.jpg', '人物', '', '常服男04');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_man_mw_L05', 'Item_man_mw_L05', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_mw_L05.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_mw_L05.jpg', '人物', '', '常服男05');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_man_mw_L06', 'Item_man_mw_L06', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_mw_L06.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_mw_L06.jpg', '人物', '', '常服男06');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_man_mw_L07', 'Item_man_mw_L07', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_mw_L07.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_mw_L07.jpg', '人物', '', '常服男07');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_man_mw_L08', 'Item_man_mw_L08', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_mw_L08.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_mw_L08.jpg', '人物', '', '常服男08');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_man_mw_L09', 'Item_man_mw_L09', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_mw_L09.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_mw_L09.jpg', '人物', '', '常服男09');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_man_mw_L10', 'Item_man_mw_L10', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_mw_L10.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_mw_L10.jpg', '人物', '', '常服男10');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_man_wmw_L01', 'Item_man_wmw_L01', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_wmw_L01.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_wmw_L01.jpg', '人物', '', '常服女01');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_man_wmw_L02', 'Item_man_wmw_L02', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_wmw_L02.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_wmw_L02.jpg', '人物', '', '常服女02');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_man_wmw_L03', 'Item_man_wmw_L03', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_wmw_L03.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_wmw_L03.jpg', '人物', '', '常服女03');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_man_wmw_L04', 'Item_man_wmw_L04', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_wmw_L04.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_wmw_L04.jpg', '人物', '', '常服女04');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_man_wmw_L05', 'Item_man_wmw_L05', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_wmw_L05.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_wmw_L05.jpg', '人物', '', '常服女05');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_man_wmw_L06', 'Item_man_wmw_L06', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_wmw_L06.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_wmw_L06.jpg', '人物', '', '常服女06');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_man_wmw_L07', 'Item_man_wmw_L07', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_wmw_L07.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_wmw_L07.jpg', '人物', '', '常服女07');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_man_wmw_L08', 'Item_man_wmw_L08', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_wmw_L08.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_wmw_L08.jpg', '人物', '', '常服女08');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_man_wmw_L09', 'Item_man_wmw_L09', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_wmw_L09.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_wmw_L09.jpg', '人物', '', '常服女09');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_man_wmw_L10', 'Item_man_wmw_L10', 'http://134.175.21.43:6066/file/download?fileModel=Item_man_wmw_L10.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_man_wmw_L10.jpg', '人物', '', '常服女10');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_mengweishi', 'Item_mengweishi', 'http://134.175.21.43:6066/file/download?fileModel=Item_mengweishi.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_mengweishi.jpg', '土建设施', '', '门卫室');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_mugesong', 'Item_mugesong', 'http://134.175.21.43:6066/file/download?fileModel=Item_mugesong.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_mugesong.jpg', '植物', '', '穆戈松');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_OfficeBuilding', 'Item_OfficeBuilding', 'http://134.175.21.43:6066/file/download?fileModel=Item_OfficeBuilding.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_OfficeBuilding.jpg', '土建设施', '', '板房_办公楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_ParametricModeling', 'Item_ParametricModeling', 'http://134.175.21.43:6066/file/download?fileModel=Item_ParametricModeling.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_ParametricModeling.jpg', '参数化建模', '', '办公楼');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_Peidiangui', 'Item_Peidiangui', 'http://134.175.21.43:6066/file/download?fileModel=Item_Peidiangui.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Peidiangui.jpg', '消防及水电设施', '', '配电柜');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_Peidianxiang', 'Item_Peidianxiang', 'http://134.175.21.43:6066/file/download?fileModel=Item_Peidianxiang.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Peidianxiang.jpg', '消防及水电设施', '', '配电箱');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_pianshu', 'Item_pianshu', 'http://134.175.21.43:6066/file/download?fileModel=Item_pianshu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_pianshu.jpg', '植物', '', '铁冬青_可调节');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_qiaosong', 'Item_qiaosong', 'http://134.175.21.43:6066/file/download?fileModel=Item_qiaosong.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_qiaosong.jpg', '植物', '', '乔松');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_Qitai', 'Item_Qitai', 'http://134.175.21.43:6066/file/download?fileModel=Item_Qitai.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Qitai.jpg', '附属设施', '', '旗台');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_qiuyu', 'Item_qiuyu', 'http://134.175.21.43:6066/file/download?fileModel=Item_qiuyu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_qiuyu.jpg', '植物片树', '', '秋榆');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_qiyeshu', 'Item_qiyeshu', 'http://134.175.21.43:6066/file/download?fileModel=Item_qiyeshu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_qiyeshu.jpg', '植物3D树', '', '七叶树');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_sansedong', 'Item_sansedong', 'http://134.175.21.43:6066/file/download?fileModel=Item_sansedong.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_sansedong.jpg', '植物片树', '', '三色堇');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_sanweikui', 'Item_sanweikui', 'http://134.175.21.43:6066/file/download?fileModel=Item_sanweikui.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_sanweikui.jpg', '植物3D树', '', '散尾葵');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_shanzha', 'Item_shanzha', 'http://134.175.21.43:6066/file/download?fileModel=Item_shanzha.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_shanzha.jpg', '植物3D树', '', '山楂');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_shensuomen', 'Item_shensuomen', 'http://134.175.21.43:6066/file/download?fileModel=Item_shensuomen.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_shensuomen.jpg', '土建设施', '', '伸缩门');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_shuishan1', 'Item_shuishan1', 'http://134.175.21.43:6066/file/download?fileModel=Item_shuishan1.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_shuishan1.jpg', '植物片树', '', '水杉1');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_shuishan2', 'Item_shuishan2', 'http://134.175.21.43:6066/file/download?fileModel=Item_shuishan2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_shuishan2.jpg', '植物片树', '', '水杉2');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_shuishan3', 'Item_shuishan3', 'http://134.175.21.43:6066/file/download?fileModel=Item_shuishan3.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_shuishan3.jpg', '植物', '', '水杉3');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_sizhaohua', 'Item_sizhaohua', 'http://134.175.21.43:6066/file/download?fileModel=Item_sizhaohua.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_sizhaohua.jpg', '植物片树', '', '四照花');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_songshu', 'Item_songshu', 'http://134.175.21.43:6066/file/download?fileModel=Item_songshu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_songshu.jpg', '植物3D树', '', '松树');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_songshu2', 'Item_songshu2', 'http://134.175.21.43:6066/file/download?fileModel=Item_songshu2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_songshu2.jpg', '植物3D树', '', '松树2');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_songshu3', 'Item_songshu3', 'http://134.175.21.43:6066/file/download?fileModel=Item_songshu3.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_songshu3.jpg', '植物3D树', '', '松树3');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_songshu4', 'Item_songshu4', 'http://134.175.21.43:6066/file/download?fileModel=Item_songshu4.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_songshu4.jpg', '植物3D树', '', '松树4');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_songshu5', 'Item_songshu5', 'http://134.175.21.43:6066/file/download?fileModel=Item_songshu5.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_songshu5.jpg', '植物3D树', '', '松树5');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_taicao', 'Item_taicao', 'http://134.175.21.43:6066/file/download?fileModel=Item_taicao.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_taicao.jpg', '植物', '', '苔草');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_taoshu', 'Item_taoshu', 'http://134.175.21.43:6066/file/download?fileModel=Item_taoshu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_taoshu.jpg', '植物', '', '桃树');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_Tingchechang', 'Item_Tingchechang', 'http://134.175.21.43:6066/file/download?fileModel=Item_Tingchechang.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Tingchechang.jpg', '附属设施', '', '停车场');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_Weiqiang', 'Item_Weiqiang', 'http://134.175.21.43:6066/file/download?fileModel=Item_Weiqiang.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Weiqiang.jpg', '土建设施', '', 'PVC围挡');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_Wupaiyitu', 'Item_Wupaiyitu', 'http://134.175.21.43:6066/file/download?fileModel=Item_Wupaiyitu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Wupaiyitu.jpg', '附属设施', '', '五牌一图');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_xianshu', 'Item_xianshu', 'http://134.175.21.43:6066/file/download?fileModel=Item_xianshu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_xianshu.jpg', '植物', '', '苋属');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_Xiaobianchi', 'Item_Xiaobianchi', 'http://134.175.21.43:6066/file/download?fileModel=Item_Xiaobianchi.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Xiaobianchi.jpg', '土建设施', '', '小便池');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_Xiaofangjia', 'Item_Xiaofangjia', 'http://134.175.21.43:6066/file/download?fileModel=Item_Xiaofangjia.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Xiaofangjia.jpg', '消防及水电设施', '', '消防架');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_Xilianpen', 'Item_Xilianpen', 'http://134.175.21.43:6066/file/download?fileModel=Item_Xilianpen.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Xilianpen.jpg', '土建设施', '', '洗脸盆');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_xisuchi', 'Item_xisuchi', 'http://134.175.21.43:6066/file/download?fileModel=Item_xisuchi.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_xisuchi.jpg', '土建设施', '', '洗漱池');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_xiuxianju', 'Item_xiuxianju', 'http://134.175.21.43:6066/file/download?fileModel=Item_xiuxianju.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_xiuxianju.jpg', '植物', '', '绣线菊');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_xunzhangju', 'Item_xunzhangju', 'http://134.175.21.43:6066/file/download?fileModel=Item_xunzhangju.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_xunzhangju.jpg', '植物花', '', '勋章菊');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yangmei1', 'Item_yangmei1', 'http://134.175.21.43:6066/file/download?fileModel=Item_yangmei1.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yangmei1.jpg', '植物', '', '杨梅1');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yangmei2', 'Item_yangmei2', 'http://134.175.21.43:6066/file/download?fileModel=Item_yangmei2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yangmei2.jpg', '植物', '', '杨梅2');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yangshu', 'Item_yangshu', 'http://134.175.21.43:6066/file/download?fileModel=Item_yangshu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yangshu.jpg', '植物', '', '杨树');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yangshu2', 'Item_yangshu2', 'http://134.175.21.43:6066/file/download?fileModel=Item_yangshu2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yangshu2.jpg', '植物', '', '杨树2');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yaoshukui', 'Item_yaoshukui', 'http://134.175.21.43:6066/file/download?fileModel=Item_yaoshukui.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yaoshukui.jpg', '植物', '', '药蜀葵');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yecaomei', 'Item_yecaomei', 'http://134.175.21.43:6066/file/download?fileModel=Item_yecaomei.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yecaomei.jpg', '植物', '', '野草莓');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yemoli', 'Item_yemoli', 'http://134.175.21.43:6066/file/download?fileModel=Item_yemoli.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yemoli.jpg', '植物', '', '野茉莉');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yewandou', 'Item_yewandou', 'http://134.175.21.43:6066/file/download?fileModel=Item_yewandou.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yewandou.jpg', '植物', '', '野豌豆');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yinghuashu', 'Item_yinghuashu', 'http://134.175.21.43:6066/file/download?fileModel=Item_yinghuashu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yinghuashu.jpg', '植物', '', '樱花树');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yinghuashukaihua', 'Item_yinghuashukaihua', 'http://134.175.21.43:6066/file/download?fileModel=Item_yinghuashukaihua.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yinghuashukaihua.jpg', '植物', '', '樱花树开花');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yinglian', 'Item_yinglian', 'http://134.175.21.43:6066/file/download?fileModel=Item_yinglian.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yinglian.jpg', '植物', '', '银莲花');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yingxing', 'Item_yingxing', 'http://134.175.21.43:6066/file/download?fileModel=Item_yingxing.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yingxing.jpg', '植物', '', '银杏');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yinxing1', 'Item_yinxing1', 'http://134.175.21.43:6066/file/download?fileModel=Item_yinxing1.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yinxing1.jpg', '植物', '', '银杏1');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yinxing2', 'Item_yinxing2', 'http://134.175.21.43:6066/file/download?fileModel=Item_yinxing2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yinxing2.jpg', '植物', '', '银杏2');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yujingxiangfen', 'Item_yujingxiangfen', 'http://134.175.21.43:6066/file/download?fileModel=Item_yujingxiangfen.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yujingxiangfen.jpg', '植物', '', '郁金香粉色');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yujingxianghuangse', 'Item_yujingxianghuangse', 'http://134.175.21.43:6066/file/download?fileModel=Item_yujingxianghuangse.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yujingxianghuangse.jpg', '植物', '', '郁金香黄色');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yumaoqiuchang', 'Item_yumaoqiuchang', 'http://134.175.21.43:6066/file/download?fileModel=Item_yumaoqiuchang.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yumaoqiuchang.jpg', '附属设施', '', '羽毛球场');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yunshan', 'Item_yunshan', 'http://134.175.21.43:6066/file/download?fileModel=Item_yunshan.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yunshan.jpg', '植物', '', '云杉');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yunshan2', 'Item_yunshan2', 'http://134.175.21.43:6066/file/download?fileModel=Item_yunshan2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yunshan2.jpg', '植物', '', '云杉2');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yunshan3', 'Item_yunshan3', 'http://134.175.21.43:6066/file/download?fileModel=Item_yunshan3.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yunshan3.jpg', '植物', '', '云杉3');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yushu', 'Item_yushu', 'http://134.175.21.43:6066/file/download?fileModel=Item_yushu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yushu.jpg', '植物', '', '榆树');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_yuzan', 'Item_yuzan', 'http://134.175.21.43:6066/file/download?fileModel=Item_yuzan.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_yuzan.jpg', '植物', '', '玉簪');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_zhangmu1', 'Item_zhangmu1', 'http://134.175.21.43:6066/file/download?fileModel=Item_zhangmu1.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_zhangmu1.jpg', '植物', '', '樟木1');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_zhangmu2', 'Item_zhangmu2', 'http://134.175.21.43:6066/file/download?fileModel=Item_zhangmu2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_zhangmu2.jpg', '植物', '', '樟木2');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_zhilijiuyezi', 'Item_zhilijiuyezi', 'http://134.175.21.43:6066/file/download?fileModel=Item_zhilijiuyezi.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_zhilijiuyezi.jpg', '植物', '', '智利酒椰子');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_zhouxinwutou', 'Item_zhouxinwutou', 'http://134.175.21.43:6066/file/download?fileModel=Item_zhouxinwutou.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_zhouxinwutou.jpg', '植物', '', '舟形乌头');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_Zhuanqihuachi', 'Item_Zhuanqihuachi', 'http://134.175.21.43:6066/file/download?fileModel=Item_Zhuanqihuachi.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_Zhuanqihuachi.jpg', '附属设施', '', '砖砌花池');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_ZhuanQiWeiqiang', 'Item_ZhuanQiWeiqiang', 'http://134.175.21.43:6066/file/download?fileModel=Item_ZhuanQiWeiqiang.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_ZhuanQiWeiqiang.jpg', '土建设施', '', '砖砌围墙');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_zhuzan', 'Item_zhuzan', 'http://134.175.21.43:6066/file/download?fileModel=Item_zhuzan.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_zhuzan.jpg', '植物花', '', '珠簪');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_zishan', 'Item_zishan', 'http://134.175.21.43:6066/file/download?fileModel=Item_zishan.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_zishan.jpg', '植物片树', '', '紫衫');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_zonglv1', 'Item_zonglv1', 'http://134.175.21.43:6066/file/download?fileModel=Item_zonglv1.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_zonglv1.jpg', '植物', '', '棕榈1');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_zonglv2', 'Item_zonglv2', 'http://134.175.21.43:6066/file/download?fileModel=Item_zonglv2.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_zonglv2.jpg', '植物', '', '棕榈2');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/Item_zonglvshu', 'Item_zonglvshu', 'http://134.175.21.43:6066/file/download?fileModel=Item_zonglvshu.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=Item_zonglvshu.jpg', '植物', '', '棕榈树');
INSERT INTO `pakinfo_copy1` VALUES ('/Game/DPC/Item/shulin', 'shulin', 'http://134.175.21.43:6066/file/download?fileModel=shulin.pak', 'Blueprint', 'http://134.175.21.43:6066/file/download?filepic=shulin.jpg', '植物', '', '数林');

-- ----------------------------
-- Table structure for power
-- ----------------------------
DROP TABLE IF EXISTS `power`;
CREATE TABLE `power` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of power
-- ----------------------------
INSERT INTO `power` VALUES ('1', '0', '系统用户管理', null);
INSERT INTO `power` VALUES ('2', '1', '后台用户管理', null);
INSERT INTO `power` VALUES ('3', '1', '模型商城用户管理', null);
INSERT INTO `power` VALUES ('4', '0', '表单管理', null);
INSERT INTO `power` VALUES ('5', '6', '流程审核管理', null);
INSERT INTO `power` VALUES ('6', '0', '模型商城管理', null);
INSERT INTO `power` VALUES ('7', '6', '模型上传', null);
INSERT INTO `power` VALUES ('8', '6', '模型编辑', null);
INSERT INTO `power` VALUES ('9', '0', '文档管理', null);
INSERT INTO `power` VALUES ('10', '1', '角色管理', null);
INSERT INTO `power` VALUES ('11', '6', '购买记录', null);
INSERT INTO `power` VALUES ('12', '4', '审批申请', null);
INSERT INTO `power` VALUES ('13', '4', '我的申请', null);
INSERT INTO `power` VALUES ('14', '4', '待我审批', null);
INSERT INTO `power` VALUES ('15', '4', '我已审批', null);
INSERT INTO `power` VALUES ('16', '4', '审批通过', null);
INSERT INTO `power` VALUES ('17', '9', '大临文档管理', null);
INSERT INTO `power` VALUES ('18', '20', '资源库管理', null);
INSERT INTO `power` VALUES ('19', '20', '行业分类管理', null);
INSERT INTO `power` VALUES ('20', '0', '分类管理', null);

-- ----------------------------
-- Table structure for resourceinfo
-- ----------------------------
DROP TABLE IF EXISTS `resourceinfo`;
CREATE TABLE `resourceinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) DEFAULT NULL,
  `rname` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resourceinfo
-- ----------------------------
INSERT INTO `resourceinfo` VALUES ('1', '0', '临建构件库');
INSERT INTO `resourceinfo` VALUES ('12', '0', '特种设备库');
INSERT INTO `resourceinfo` VALUES ('13', '12', '公路架桥机');
INSERT INTO `resourceinfo` VALUES ('14', '0', '场景素材库');
INSERT INTO `resourceinfo` VALUES ('16', '14', '植物');
INSERT INTO `resourceinfo` VALUES ('21', '14', '建筑');
INSERT INTO `resourceinfo` VALUES ('27', '12', '汽车起重机');
INSERT INTO `resourceinfo` VALUES ('28', '12', '履带起重机');
INSERT INTO `resourceinfo` VALUES ('29', '12', '门式起重机');
INSERT INTO `resourceinfo` VALUES ('37', '1', '办公生活区');
INSERT INTO `resourceinfo` VALUES ('40', '37', '土建设施');
INSERT INTO `resourceinfo` VALUES ('41', '37', '附属设施');
INSERT INTO `resourceinfo` VALUES ('42', '37', '消防及水电设施');
INSERT INTO `resourceinfo` VALUES ('43', '1', '生产区');
INSERT INTO `resourceinfo` VALUES ('44', '1', '其他重要设施');
INSERT INTO `resourceinfo` VALUES ('45', '43', '钢筋加工厂');
INSERT INTO `resourceinfo` VALUES ('46', '43', '拌合厂');
INSERT INTO `resourceinfo` VALUES ('48', '44', '便道');
INSERT INTO `resourceinfo` VALUES ('49', '44', '钢栈桥');
INSERT INTO `resourceinfo` VALUES ('50', '12', '塔式起重机');
INSERT INTO `resourceinfo` VALUES ('51', '12', '浮吊船');
INSERT INTO `resourceinfo` VALUES ('52', '14', '人物');
INSERT INTO `resourceinfo` VALUES ('53', '14', '交通');
INSERT INTO `resourceinfo` VALUES ('54', '14', '桥梁');
INSERT INTO `resourceinfo` VALUES ('55', '14', '地形');
INSERT INTO `resourceinfo` VALUES ('56', '43', '预制场');
INSERT INTO `resourceinfo` VALUES ('57', '14', '车');
INSERT INTO `resourceinfo` VALUES ('59', '40', '化粪池');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creattime` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '超级管理', '管理所有的人员', '2020-01-14 11:22:11');
INSERT INTO `role` VALUES ('2', '管理员', '管理部分功能', '2020-02-14 11:22:11');
INSERT INTO `role` VALUES ('3', '用户', '管理模型', '2020-03-14 11:22:11');
INSERT INTO `role` VALUES ('31', '模型管理员', '管理模型列表', '2020-04-16 11:43:12');
INSERT INTO `role` VALUES ('32', '部门管理员', '管理制指定内容', '2020-04-26 11:19:30');

-- ----------------------------
-- Table structure for role_power
-- ----------------------------
DROP TABLE IF EXISTS `role_power`;
CREATE TABLE `role_power` (
  `powerid` int(11) DEFAULT NULL,
  `roleid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_power
-- ----------------------------
INSERT INTO `role_power` VALUES ('1', '1');
INSERT INTO `role_power` VALUES ('2', '1');
INSERT INTO `role_power` VALUES ('3', '1');
INSERT INTO `role_power` VALUES ('4', '1');
INSERT INTO `role_power` VALUES ('5', '1');
INSERT INTO `role_power` VALUES ('6', '1');
INSERT INTO `role_power` VALUES ('7', '1');
INSERT INTO `role_power` VALUES ('8', '1');
INSERT INTO `role_power` VALUES ('9', '1');
INSERT INTO `role_power` VALUES ('1', '7');
INSERT INTO `role_power` VALUES ('2', '7');
INSERT INTO `role_power` VALUES ('6', '17');
INSERT INTO `role_power` VALUES ('7', '17');
INSERT INTO `role_power` VALUES ('8', '17');
INSERT INTO `role_power` VALUES ('9', '17');
INSERT INTO `role_power` VALUES ('1', '28');
INSERT INTO `role_power` VALUES ('2', '28');
INSERT INTO `role_power` VALUES ('3', '28');
INSERT INTO `role_power` VALUES ('4', '28');
INSERT INTO `role_power` VALUES ('5', '28');
INSERT INTO `role_power` VALUES ('6', '28');
INSERT INTO `role_power` VALUES ('7', '28');
INSERT INTO `role_power` VALUES ('8', '28');
INSERT INTO `role_power` VALUES ('9', '28');
INSERT INTO `role_power` VALUES ('3', '29');
INSERT INTO `role_power` VALUES ('4', '29');
INSERT INTO `role_power` VALUES ('5', '29');
INSERT INTO `role_power` VALUES ('6', '29');
INSERT INTO `role_power` VALUES ('7', '29');
INSERT INTO `role_power` VALUES ('8', '29');
INSERT INTO `role_power` VALUES ('9', '29');
INSERT INTO `role_power` VALUES ('10', '1');
INSERT INTO `role_power` VALUES ('4', '30');
INSERT INTO `role_power` VALUES ('6', '30');
INSERT INTO `role_power` VALUES ('7', '30');
INSERT INTO `role_power` VALUES ('8', '30');
INSERT INTO `role_power` VALUES ('1', '33');
INSERT INTO `role_power` VALUES ('2', '33');
INSERT INTO `role_power` VALUES ('3', '33');
INSERT INTO `role_power` VALUES ('10', '33');
INSERT INTO `role_power` VALUES ('1', '34');
INSERT INTO `role_power` VALUES ('2', '34');
INSERT INTO `role_power` VALUES ('3', '34');
INSERT INTO `role_power` VALUES ('10', '34');
INSERT INTO `role_power` VALUES ('6', '34');
INSERT INTO `role_power` VALUES ('5', '34');
INSERT INTO `role_power` VALUES ('7', '34');
INSERT INTO `role_power` VALUES ('8', '34');
INSERT INTO `role_power` VALUES ('11', '1');
INSERT INTO `role_power` VALUES ('12', '1');
INSERT INTO `role_power` VALUES ('13', '1');
INSERT INTO `role_power` VALUES ('14', '1');
INSERT INTO `role_power` VALUES ('15', '1');
INSERT INTO `role_power` VALUES ('16', '1');
INSERT INTO `role_power` VALUES ('17', '1');
INSERT INTO `role_power` VALUES ('1', '32');
INSERT INTO `role_power` VALUES ('2', '32');
INSERT INTO `role_power` VALUES ('3', '32');
INSERT INTO `role_power` VALUES ('10', '32');
INSERT INTO `role_power` VALUES ('4', '32');
INSERT INTO `role_power` VALUES ('12', '32');
INSERT INTO `role_power` VALUES ('13', '32');
INSERT INTO `role_power` VALUES ('14', '32');
INSERT INTO `role_power` VALUES ('15', '32');
INSERT INTO `role_power` VALUES ('16', '32');
INSERT INTO `role_power` VALUES ('6', '32');
INSERT INTO `role_power` VALUES ('5', '32');
INSERT INTO `role_power` VALUES ('7', '32');
INSERT INTO `role_power` VALUES ('8', '32');
INSERT INTO `role_power` VALUES ('11', '32');
INSERT INTO `role_power` VALUES ('9', '32');
INSERT INTO `role_power` VALUES ('17', '32');
INSERT INTO `role_power` VALUES ('13', '31');
INSERT INTO `role_power` VALUES ('5', '31');
INSERT INTO `role_power` VALUES ('7', '31');
INSERT INTO `role_power` VALUES ('8', '31');
INSERT INTO `role_power` VALUES ('9', '31');
INSERT INTO `role_power` VALUES ('17', '31');
INSERT INTO `role_power` VALUES ('4', '31');
INSERT INTO `role_power` VALUES ('6', '31');
INSERT INTO `role_power` VALUES ('18', '1');
INSERT INTO `role_power` VALUES ('4', '3');
INSERT INTO `role_power` VALUES ('12', '3');
INSERT INTO `role_power` VALUES ('13', '3');
INSERT INTO `role_power` VALUES ('14', '3');
INSERT INTO `role_power` VALUES ('15', '3');
INSERT INTO `role_power` VALUES ('16', '3');
INSERT INTO `role_power` VALUES ('7', '3');
INSERT INTO `role_power` VALUES ('8', '3');
INSERT INTO `role_power` VALUES ('11', '3');
INSERT INTO `role_power` VALUES ('6', '3');
INSERT INTO `role_power` VALUES ('19', '1');
INSERT INTO `role_power` VALUES ('20', '1');
INSERT INTO `role_power` VALUES ('1', '2');
INSERT INTO `role_power` VALUES ('2', '2');
INSERT INTO `role_power` VALUES ('3', '2');
INSERT INTO `role_power` VALUES ('10', '2');
INSERT INTO `role_power` VALUES ('4', '2');
INSERT INTO `role_power` VALUES ('12', '2');
INSERT INTO `role_power` VALUES ('13', '2');
INSERT INTO `role_power` VALUES ('14', '2');
INSERT INTO `role_power` VALUES ('15', '2');
INSERT INTO `role_power` VALUES ('16', '2');
INSERT INTO `role_power` VALUES ('6', '2');
INSERT INTO `role_power` VALUES ('5', '2');
INSERT INTO `role_power` VALUES ('7', '2');
INSERT INTO `role_power` VALUES ('8', '2');
INSERT INTO `role_power` VALUES ('11', '2');
INSERT INTO `role_power` VALUES ('9', '2');
INSERT INTO `role_power` VALUES ('17', '2');
INSERT INTO `role_power` VALUES ('20', '2');
INSERT INTO `role_power` VALUES ('18', '2');
INSERT INTO `role_power` VALUES ('19', '2');

-- ----------------------------
-- Table structure for shoppingcart
-- ----------------------------
DROP TABLE IF EXISTS `shoppingcart`;
CREATE TABLE `shoppingcart` (
  `sid` varchar(50) NOT NULL,
  `uid` varchar(50) DEFAULT NULL,
  `mid` int(11) DEFAULT NULL,
  `account` varchar(50) DEFAULT NULL,
  `cycle` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT '0',
  `starttime` varchar(50) DEFAULT NULL,
  `endtime` varchar(50) DEFAULT NULL,
  `str1` varchar(50) DEFAULT NULL,
  `str2` varchar(50) DEFAULT NULL,
  `str3` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shoppingcart
-- ----------------------------

-- ----------------------------
-- Table structure for startclass
-- ----------------------------
DROP TABLE IF EXISTS `startclass`;
CREATE TABLE `startclass` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` varchar(50) DEFAULT NULL,
  `mid` int(11) DEFAULT NULL,
  `star` int(11) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of startclass
-- ----------------------------
INSERT INTO `startclass` VALUES ('1', '11d21d9ca1f94984b682e89985006fd4', '2', '4');
INSERT INTO `startclass` VALUES ('2', '4499182d18e54e8f97f75c5c257d9afa', '1', '5');
INSERT INTO `startclass` VALUES ('3', '11d21d9ca1f94984b682e89985006fd4', '2', '4');
INSERT INTO `startclass` VALUES ('4', '11d21d9ca1f94984b682e89985006fd4', '2', '4');
INSERT INTO `startclass` VALUES ('5', '11d21d9ca1f94984b682e89985006fd4', '1', '3');
INSERT INTO `startclass` VALUES ('6', '11d21d9ca1f94984b682e89985006fd4', '3', '3');
INSERT INTO `startclass` VALUES ('7', '11d21d9ca1f94984b682e89985006fd4', '4', '0');
INSERT INTO `startclass` VALUES ('8', '4499182d18e54e8f97f75c5c257d9afa', '3', '5');
INSERT INTO `startclass` VALUES ('9', '4499182d18e54e8f97f75c5c257d9afa', '4', '5');
INSERT INTO `startclass` VALUES ('10', '11d21d9ca1f94984b682e89985006fd4', '5', '4');
INSERT INTO `startclass` VALUES ('11', '4499182d18e54e8f97f75c5c257d9afa', '6', '5');
INSERT INTO `startclass` VALUES ('12', '2af6fe7ea00242fc8739d3bf6a333990', '6', '4');
INSERT INTO `startclass` VALUES ('13', '11d21d9ca1f94984b682e89985006fd4', '6', '4');
INSERT INTO `startclass` VALUES ('14', '11d21d9ca1f94984b682e89985006fd4', '9', '5');
INSERT INTO `startclass` VALUES ('15', '4499182d18e54e8f97f75c5c257d9afa', '20', '5');
INSERT INTO `startclass` VALUES ('16', '4499182d18e54e8f97f75c5c257d9afa', '7', '5');

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `userid` varchar(50) NOT NULL,
  `nickname` varchar(50) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `registertime` varchar(50) DEFAULT NULL,
  `role` int(11) DEFAULT NULL,
  `oldip` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('00da3c04c1b14519862301666987bfcd', '超级管理员', 'admin', 'e10adc3949ba59abbe56e057f20f883e', '1', '13007188506', '2020-01-07 15:54:50', '1', '27.17.222.19');
INSERT INTO `userinfo` VALUES ('01808e87bf1a44ddb1862b100a7dbf7b', 'BWSK1', 'BWSK1', 'e10adc3949ba59abbe56e057f20f883e', '1', null, '2020-07-02 17:15:02', '3', '27.17.222.19');
INSERT INTO `userinfo` VALUES ('11d21d9ca1f94984b682e89985006fd4', '戴庆洋', '13163395287', 'e10adc3949ba59abbe56e057f20f883e', '1', '', '2020-04-26 12:51:21', '3', '27.18.132.44');
INSERT INTO `userinfo` VALUES ('25c6969f34764e0a9e0e357e743d02f5', '13163395280', '13163395280', 'e10adc3949ba59abbe56e057f20f883e', '1', null, '2020-05-21 11:51:22', '3', null);
INSERT INTO `userinfo` VALUES ('28814e2e163e4a2fad4eb78b2fc054c2', 'BWSK', 'BWSK', 'e10adc3949ba59abbe56e057f20f883e', '1', null, '2020-07-02 09:15:16', '3', '27.17.222.19');
INSERT INTO `userinfo` VALUES ('2af6fe7ea00242fc8739d3bf6a333990', '15527844322', '15527844322', '99ae3e5394b801bd47a4fec717d156e9', '1', null, '2020-05-09 17:18:18', '3', '27.17.222.19');
INSERT INTO `userinfo` VALUES ('2b8e871407f54334a6b9e46feaedc765', '13163395289', '13163395289', 'e10adc3949ba59abbe56e057f20f883e', '1', null, '2020-05-21 11:44:50', '3', null);
INSERT INTO `userinfo` VALUES ('2d8debc7f43741ebbcd02656e0bb0ce7', 'lujian', 'lujian', 'e10adc3949ba59abbe56e057f20f883e', '1', null, '2020-07-07 16:30:40', '3', '27.17.222.19');
INSERT INTO `userinfo` VALUES ('456378e2523e4100a3ef9388e08ae709', '13587659003', '13587659003', 'e10adc3949ba59abbe56e057f20f883e', '1', null, '2020-05-11 10:27:25', '3', '127.0.0.1');
INSERT INTO `userinfo` VALUES ('aa7b997e347a4963bcb7062f48ee99c2', '高新很', '高新很', 'e10adc3949ba59abbe56e057f20f883e', '1', null, '2020-05-25 10:00:57', '3', '27.18.106.118');
INSERT INTO `userinfo` VALUES ('ae7f2d6a5614425a9365af5bcf5655e6', 'zhangsan', 'lujian1', 'e10adc3949ba59abbe56e057f20f883e', '1', '13163695287', '2020-01-18 16:11:18', '3', '27.18.132.44');
INSERT INTO `userinfo` VALUES ('ba78098dc8d54d2cadf226aa5e2366e6', '13007188506', '13007188506', 'e10adc3949ba59abbe56e057f20f883e', '1', null, '2020-07-07 16:30:25', '3', '27.17.222.19');
INSERT INTO `userinfo` VALUES ('c73fe9dd948845c58779b7e613a1fc8d', 'WPH', 'WPH', 'e10adc3949ba59abbe56e057f20f883e', '1', null, '2020-07-09 14:59:52', '3', null);
INSERT INTO `userinfo` VALUES ('e28d61482f9547658b948a141f58645c', 'DuliText', 'DuliText', '95413b887985090fa7bea8bffc1f7283', '1', null, '2020-06-30 19:50:20', '3', '27.17.222.19');
INSERT INTO `userinfo` VALUES ('fef85ca364c44fe582a3621b73a77243', '李珊', 'daidai', 'e10adc3949ba59abbe56e057f20f883e', '1', '13163395287', '2020-04-27 16:33:09', '2', '192.168.2.107');

-- ----------------------------
-- Table structure for usermessage
-- ----------------------------
DROP TABLE IF EXISTS `usermessage`;
CREATE TABLE `usermessage` (
  `userid` varchar(50) NOT NULL,
  `nickname` varchar(50) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT '1',
  `registertime` varchar(50) DEFAULT NULL,
  `account` double DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `starttime` varchar(50) DEFAULT NULL,
  `endtime` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usermessage
-- ----------------------------
INSERT INTO `usermessage` VALUES ('01808e87bf1a44ddb1862b100a7dbf7b', 'BWSK1', 'BWSK1', 'e10adc3949ba59abbe56e057f20f883e', '1', '2020-07-02 17:15:02', '0', '1550512453@qq.com', '2020-07-07 16:30:40', '2020-08-07 16:30:40');
INSERT INTO `usermessage` VALUES ('11d21d9ca1f94984b682e89985006fd4', '戴庆洋', '13163395287', 'e10adc3949ba59abbe56e057f20f883e', '1', '2020-04-26 12:51:21', '366', '528758879@qq.com', '2020-07-07 16:30:40', '2020-08-07 16:30:40');
INSERT INTO `usermessage` VALUES ('25c6969f34764e0a9e0e357e743d02f5', '13163395280', '13163395280', 'e10adc3949ba59abbe56e057f20f883e', '1', '2020-05-21 11:51:22', '0', '528758879@qq.com', '2020-07-07 16:30:40', '2020-08-07 16:30:40');
INSERT INTO `usermessage` VALUES ('28814e2e163e4a2fad4eb78b2fc054c2', 'BWSK', 'BWSK', 'e10adc3949ba59abbe56e057f20f883e', '1', '2020-07-02 09:15:16', '0', '1550512453@qq.com', '2020-05-07 16:30:40', '2020-09-01 16:30:40');
INSERT INTO `usermessage` VALUES ('2af6fe7ea00242fc8739d3bf6a333990', '15527844322', '15527844322', '99ae3e5394b801bd47a4fec717d156e9', '1', '2020-05-09 17:18:18', '91990', '627443149@qq.com', '2020-07-07 16:30:40', '2020-08-07 16:30:40');
INSERT INTO `usermessage` VALUES ('2b8e871407f54334a6b9e46feaedc765', '13163395289', '13163395289', 'e10adc3949ba59abbe56e057f20f883e', '1', '2020-05-21 11:44:50', '0', '528758879@qq.com', '2020-07-07 16:30:40', '2020-08-07 16:30:40');
INSERT INTO `usermessage` VALUES ('2d8debc7f43741ebbcd02656e0bb0ce7', 'lujian', 'lujian', 'e10adc3949ba59abbe56e057f20f883e', '1', '2020-07-07 16:30:40', '0', '1972689216@qq.com', '2020-05-07 16:30:40', '2020-06-07 16:30:40');
INSERT INTO `usermessage` VALUES ('456378e2523e4100a3ef9388e08ae709', '13587659003', '13587659003', 'e10adc3949ba59abbe56e057f20f883e', '1', '2020-05-11 10:27:25', '906099', 'gaoxinall@sina.com', '2020-07-07 16:30:40', '2020-08-07 16:30:40');
INSERT INTO `usermessage` VALUES ('aa7b997e347a4963bcb7062f48ee99c2', '高新很', '高新很', 'e10adc3949ba59abbe56e057f20f883e', '1', '2020-05-25 10:00:57', '0', 'gaoxinall@sina.com', '2020-07-07 16:30:40', '2020-08-07 16:30:40');
INSERT INTO `usermessage` VALUES ('ba78098dc8d54d2cadf226aa5e2366e6', '13007188506', '13007188506', 'e10adc3949ba59abbe56e057f20f883e', '1', '2020-07-07 16:30:25', '0', '1972689216@qq.com', '2020-05-07 16:30:25', '2020-06-07 16:30:25');
INSERT INTO `usermessage` VALUES ('c73fe9dd948845c58779b7e613a1fc8d', 'WPH', 'WPH', 'e10adc3949ba59abbe56e057f20f883e', '1', '2020-07-09 14:59:52', '0', '1550512453@qq.com', '2020-07-09 14:59:52', '2020-08-09 14:59:52');
INSERT INTO `usermessage` VALUES ('e28d61482f9547658b948a141f58645c', 'DuliText', 'DuliText', '95413b887985090fa7bea8bffc1f7283', '1', '2020-06-30 19:50:20', '0', '1550512453@qq.com', '2020-07-07 16:30:40', '2020-08-07 16:30:40');

-- ----------------------------
-- Function structure for getChildList
-- ----------------------------
DROP FUNCTION IF EXISTS `getChildList`;
DELIMITER ;;
CREATE DEFINER=`runoob`@`%` FUNCTION `getChildList`(rootId INT) RETURNS varchar(1000) CHARSET utf8
BEGIN
    DECLARE sTemp VARCHAR(1000);
    DECLARE sTempChd VARCHAR(1000);
 
    SET sTemp = '$';
    SET sTempChd =cast(rootId as CHAR);
 
    WHILE sTempChd is not null DO
        SET sTemp = concat(sTemp,',',sTempChd);
        SELECT group_concat(id) INTO sTempChd FROM  alltype where FIND_IN_SET(pid,sTempChd)>0;
    END WHILE;
    RETURN sTemp; 
END
;;
DELIMITER ;

-- ----------------------------
-- Function structure for getParList
-- ----------------------------
DROP FUNCTION IF EXISTS `getParList`;
DELIMITER ;;
CREATE DEFINER=`runoob`@`%` FUNCTION `getParList`(rootId INT) RETURNS varchar(1000) CHARSET utf8
BEGIN
    DECLARE sTemp VARCHAR(1000);
    DECLARE sTempPar VARCHAR(1000); 
    SET sTemp = ''; 
    SET sTempPar =rootId; 
 
    #循环递归
    WHILE sTempPar is not null DO 
        #判断是否是第一个，不加的话第一个会为空
        IF sTemp != '' THEN
            SET sTemp = concat(sTemp,',',sTempPar);
        ELSE
            SET sTemp = sTempPar;
        END IF;
        SET sTemp = concat(sTemp,',',sTempPar); 
        SELECT group_concat(pid) INTO sTempPar FROM alltype where pid<>id and FIND_IN_SET(id,sTempPar)>0; 
    END WHILE; 
 
RETURN sTemp; 
END
;;
DELIMITER ;

-- ----------------------------
-- Function structure for getResourceChildList
-- ----------------------------
DROP FUNCTION IF EXISTS `getResourceChildList`;
DELIMITER ;;
CREATE DEFINER=`runoob`@`%` FUNCTION `getResourceChildList`(rootId INT) RETURNS varchar(1000) CHARSET utf8
BEGIN
		DECLARE sTemp VARCHAR(1000);
    DECLARE sTempChd VARCHAR(1000);
 
    SET sTemp = '$';
    SET sTempChd =cast(rootId as CHAR);
 
    WHILE sTempChd is not null DO
        SET sTemp = concat(sTemp,',',sTempChd);
        SELECT group_concat(id) INTO sTempChd FROM  resourceinfo where FIND_IN_SET(pid,sTempChd)>0;
    END WHILE;
 
RETURN sTemp;
END
;;
DELIMITER ;

-- ----------------------------
-- Function structure for getResourceParentList
-- ----------------------------
DROP FUNCTION IF EXISTS `getResourceParentList`;
DELIMITER ;;
CREATE DEFINER=`runoob`@`%` FUNCTION `getResourceParentList`(rootId INT) RETURNS varchar(1000) CHARSET utf8
BEGIN
		DECLARE sTemp VARCHAR(1000);
    DECLARE sTempPar VARCHAR(1000); 
    SET sTemp = ''; 
    SET sTempPar =rootId; 
 
 #循环递归
    WHILE sTempPar is not null DO 
        #判断是否是第一个，不加的话第一个会为空
        IF sTemp != '' THEN
            SET sTemp = concat(sTemp,',',sTempPar);
        ELSE
            SET sTemp = sTempPar;
        END IF;
        SET sTemp = concat(sTemp,',',sTempPar); 
        SELECT group_concat(pid) INTO sTempPar FROM resourceinfo where pid<>id and FIND_IN_SET(id,sTempPar)>0; 
    END WHILE; 
 
RETURN sTemp;
END
;;
DELIMITER ;
