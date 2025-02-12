-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springbootav3a6ik0
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `springbootav3a6ik0`
--

/*!40000 DROP DATABASE IF EXISTS `springbootav3a6ik0`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `springbootav3a6ik0` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `springbootav3a6ik0`;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `address` varchar(200) NOT NULL COMMENT '地址',
  `name` varchar(200) NOT NULL COMMENT '收货人',
  `phone` varchar(200) NOT NULL COMMENT '电话',
  `isdefault` varchar(200) NOT NULL COMMENT '是否默认地址[是/否]',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='地址';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'2025-01-31 14:14:38',11,'宇宙银河系金星1号','金某','13823888881','是'),(2,'2025-01-31 14:14:38',12,'宇宙银河系木星1号','木某','13823888882','是'),(3,'2025-01-31 14:14:38',13,'宇宙银河系水星1号','水某','13823888883','是'),(4,'2025-01-31 14:14:38',14,'宇宙银河系火星1号','火某','13823888884','是'),(5,'2025-01-31 14:14:38',15,'宇宙银河系土星1号','土某','13823888885','是'),(6,'2025-01-31 14:14:38',16,'宇宙银河系月球1号','月某','13823888886','是'),(7,'2025-01-31 14:14:38',17,'宇宙银河系黑洞1号','黑某','13823888887','是'),(8,'2025-01-31 14:14:38',18,'宇宙银河系地球1号','地某','13823888888','是'),(9,'2025-01-31 14:24:04',1709043817793,'长沙市开福区秀峰路1号','11','15111111111','是');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cart` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tablename` varchar(200) DEFAULT 'chayexinxi' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `picture` longtext COMMENT '图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` double DEFAULT NULL COMMENT '单价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='购物车表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chadaozhishiku`
--

DROP TABLE IF EXISTS `chadaozhishiku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chadaozhishiku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `zhishifenlei` varchar(200) NOT NULL COMMENT '知识分类',
  `shipin` longtext COMMENT '视频',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `fengmian` longtext COMMENT '封面',
  `neirong` longtext COMMENT '内容',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  `discussnum` int(11) DEFAULT '0' COMMENT '评论数',
  `storeupnum` int(11) DEFAULT '0' COMMENT '收藏数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8 COMMENT='茶道知识库';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chadaozhishiku`
--

LOCK TABLES `chadaozhishiku` WRITE;
/*!40000 ALTER TABLE `chadaozhishiku` DISABLE KEYS */;
INSERT INTO `chadaozhishiku` VALUES (51,'2025-01-31 14:14:37','标题1','知识分类1','','2025-01-31','upload/chadaozhishiku_fengmian1.jpg,upload/chadaozhishiku_fengmian2.jpg,upload/chadaozhishiku_fengmian3.jpg','内容1','2025-01-31 22:14:37',1,0,1),(52,'2025-01-31 14:14:37','标题2','知识分类2','','2025-01-31','upload/chadaozhishiku_fengmian2.jpg,upload/chadaozhishiku_fengmian3.jpg,upload/chadaozhishiku_fengmian4.jpg','内容2','2025-01-31 22:14:37',2,0,2),(53,'2025-01-31 14:14:37','标题3','知识分类3','','2025-01-31','upload/chadaozhishiku_fengmian3.jpg,upload/chadaozhishiku_fengmian4.jpg,upload/chadaozhishiku_fengmian5.jpg','内容3','2025-01-31 22:29:52',4,0,3),(54,'2025-01-31 14:14:37','标题4','知识分类4','','2025-01-31','upload/chadaozhishiku_fengmian4.jpg,upload/chadaozhishiku_fengmian5.jpg,upload/chadaozhishiku_fengmian6.jpg','内容4','2025-01-31 22:14:37',4,0,4),(55,'2025-01-31 14:14:37','标题5','知识分类5','','2025-01-31','upload/chadaozhishiku_fengmian5.jpg,upload/chadaozhishiku_fengmian6.jpg,upload/chadaozhishiku_fengmian7.jpg','内容5','2025-01-31 22:14:37',5,0,5),(56,'2025-01-31 14:14:37','标题6','知识分类6','','2025-01-31','upload/chadaozhishiku_fengmian6.jpg,upload/chadaozhishiku_fengmian7.jpg,upload/chadaozhishiku_fengmian8.jpg','内容6','2025-01-31 22:14:37',6,0,6),(57,'2025-01-31 14:14:37','标题7','知识分类7','','2025-01-31','upload/chadaozhishiku_fengmian7.jpg,upload/chadaozhishiku_fengmian8.jpg,upload/chadaozhishiku_fengmian9.jpg','内容7','2025-01-31 22:14:37',7,0,7),(58,'2025-01-31 14:14:37','标题8','知识分类8','','2025-01-31','upload/chadaozhishiku_fengmian8.jpg,upload/chadaozhishiku_fengmian9.jpg,upload/chadaozhishiku_fengmian10.jpg','内容8','2025-01-31 22:14:37',8,0,8),(59,'2025-01-31 14:28:10','标题AAAAAAA','知识','upload/1709044083222.mp4','2025-01-31','upload/1709044088410.jpg','<p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p><br></p>','2025-01-31 22:30:16',2,1,0);
/*!40000 ALTER TABLE `chadaozhishiku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chat`
--

DROP TABLE IF EXISTS `chat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `adminid` bigint(20) DEFAULT NULL COMMENT '管理员id',
  `ask` longtext COMMENT '提问',
  `reply` longtext COMMENT '回复',
  `isreply` int(11) DEFAULT NULL COMMENT '是否回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8 COMMENT='在线客服';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chat`
--

LOCK TABLES `chat` WRITE;
/*!40000 ALTER TABLE `chat` DISABLE KEYS */;
INSERT INTO `chat` VALUES (71,'2025-01-31 14:14:37',1,1,'提问1','回复1',1),(72,'2025-01-31 14:14:37',2,2,'提问2','回复2',2),(73,'2025-01-31 14:14:37',3,3,'提问3','回复3',3),(74,'2025-01-31 14:14:37',4,4,'提问4','回复4',4),(75,'2025-01-31 14:14:37',5,5,'提问5','回复5',5),(76,'2025-01-31 14:14:37',6,6,'提问6','回复6',6),(77,'2025-01-31 14:14:37',7,7,'提问7','回复7',7),(78,'2025-01-31 14:14:37',8,8,'提问8','回复8',8),(79,'2025-01-31 14:29:37',1709043817793,NULL,'11122',NULL,0),(80,'2025-01-31 14:32:15',1709043817793,1,NULL,'回复回复AA',NULL);
/*!40000 ALTER TABLE `chat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chayefenlei`
--

DROP TABLE IF EXISTS `chayefenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chayefenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chayefenlei` varchar(200) DEFAULT NULL COMMENT '茶叶分类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8 COMMENT='茶叶分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chayefenlei`
--

LOCK TABLES `chayefenlei` WRITE;
/*!40000 ALTER TABLE `chayefenlei` DISABLE KEYS */;
INSERT INTO `chayefenlei` VALUES (31,'2025-01-31 14:14:37','茶叶分类1'),(32,'2025-01-31 14:14:37','茶叶分类2'),(33,'2025-01-31 14:14:37','茶叶分类3'),(34,'2025-01-31 14:14:37','茶叶分类4'),(35,'2025-01-31 14:14:37','茶叶分类5'),(36,'2025-01-31 14:14:37','茶叶分类6'),(37,'2025-01-31 14:14:37','茶叶分类7'),(38,'2025-01-31 14:14:37','黑茶'),(39,'2025-01-31 14:27:11','红茶');
/*!40000 ALTER TABLE `chayefenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chayexinxi`
--

DROP TABLE IF EXISTS `chayexinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chayexinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chayemingcheng` varchar(200) NOT NULL COMMENT '茶叶名称',
  `chayefenlei` varchar(200) NOT NULL COMMENT '茶叶分类',
  `pinpai` varchar(200) DEFAULT NULL COMMENT '品牌',
  `tupian` longtext COMMENT '图片',
  `chandi` varchar(200) DEFAULT NULL COMMENT '产地',
  `nianfen` varchar(200) DEFAULT NULL COMMENT '年份',
  `shengchanriqi` date NOT NULL COMMENT '生产日期',
  `chayexiangqing` longtext COMMENT '茶叶详情',
  `onelimittimes` int(11) DEFAULT NULL COMMENT '单限',
  `alllimittimes` int(11) DEFAULT NULL COMMENT '库存',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  `discussnum` int(11) DEFAULT '0' COMMENT '评论数',
  `price` double NOT NULL COMMENT '价格',
  `storeupnum` int(11) DEFAULT '0' COMMENT '收藏数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COMMENT='茶叶信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chayexinxi`
--

LOCK TABLES `chayexinxi` WRITE;
/*!40000 ALTER TABLE `chayexinxi` DISABLE KEYS */;
INSERT INTO `chayexinxi` VALUES (21,'2025-01-31 14:14:37','茶叶名称1','茶叶分类1','品牌1','upload/chayexinxi_tupian1.jpg,upload/chayexinxi_tupian2.jpg,upload/chayexinxi_tupian3.jpg','产地1','年份1','2025-01-31','茶叶详情1',1,99,'2025-01-31 22:14:37',1,0,99.9,1),(22,'2025-01-31 14:14:37','茶叶名称2','茶叶分类2','品牌2','upload/chayexinxi_tupian2.jpg,upload/chayexinxi_tupian3.jpg,upload/chayexinxi_tupian4.jpg','产地2','年份2','2025-01-31','茶叶详情2',2,99,'2025-01-31 22:14:37',2,0,99.9,2),(23,'2025-01-31 14:14:37','茶叶名称3','茶叶分类3','品牌3','upload/chayexinxi_tupian3.jpg,upload/chayexinxi_tupian4.jpg,upload/chayexinxi_tupian5.jpg','产地3','年份3','2025-01-31','茶叶详情3',3,99,'2025-01-31 22:14:37',4,0,99.9,3),(24,'2025-01-31 14:14:37','茶叶名称4','茶叶分类4','品牌4','upload/chayexinxi_tupian4.jpg,upload/chayexinxi_tupian5.jpg,upload/chayexinxi_tupian6.jpg','产地4','年份4','2025-01-31','茶叶详情4',4,99,'2025-01-31 22:14:37',4,0,99.9,4),(25,'2025-01-31 14:14:37','茶叶名称5','茶叶分类5','品牌5','upload/chayexinxi_tupian5.jpg,upload/chayexinxi_tupian6.jpg,upload/chayexinxi_tupian7.jpg','产地5','年份5','2025-01-31','茶叶详情5',5,95,'2025-01-31 22:14:37',16,0,99.9,5),(26,'2025-01-31 14:14:37','茶叶名称6','茶叶分类6','品牌6','upload/chayexinxi_tupian6.jpg,upload/chayexinxi_tupian7.jpg,upload/chayexinxi_tupian8.jpg','产地6','年份6','2025-01-31','茶叶详情6',6,99,'2025-01-31 22:14:37',12,1,99.9,6),(27,'2025-01-31 14:14:37','茶叶名称7','茶叶分类7','品牌7','upload/chayexinxi_tupian7.jpg,upload/chayexinxi_tupian8.jpg,upload/chayexinxi_tupian9.jpg','产地7','年份7','2025-01-31','茶叶详情7',7,99,'2025-01-31 22:14:37',7,0,99.9,7),(28,'2025-01-31 14:14:37','茶叶名称8','茶叶分类8','品牌8','upload/chayexinxi_tupian8.jpg,upload/chayexinxi_tupian9.jpg,upload/chayexinxi_tupian10.jpg','产地8','年份8','2025-01-31','茶叶详情8',8,321,'2025-01-31 22:14:37',9,0,99.9,8),(29,'2025-01-31 14:27:42','第一茶叶','黑茶','红山茶','upload/1709044049243.jpg','北京','2015','2025-01-31','<p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p><br></p>',2,222,NULL,2,0,22,0);
/*!40000 ALTER TABLE `chayexinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  `url` varchar(500) DEFAULT NULL COMMENT 'url',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg',NULL),(2,'picture2','upload/picture2.jpg',NULL),(3,'picture3','upload/picture3.jpg',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `daohuoruku`
--

DROP TABLE IF EXISTS `daohuoruku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `daohuoruku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `rukubianhao` varchar(200) DEFAULT NULL COMMENT '入库编号',
  `chayemingcheng` varchar(200) DEFAULT NULL COMMENT '茶叶名称',
  `chayefenlei` varchar(200) DEFAULT NULL COMMENT '茶叶分类',
  `alllimittimes` int(11) NOT NULL COMMENT '数量',
  `rukuriqi` date DEFAULT NULL COMMENT '入库日期',
  `gongyingshang` varchar(200) NOT NULL COMMENT '供应商',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `rukubianhao` (`rukubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8 COMMENT='到货入库';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `daohuoruku`
--

LOCK TABLES `daohuoruku` WRITE;
/*!40000 ALTER TABLE `daohuoruku` DISABLE KEYS */;
INSERT INTO `daohuoruku` VALUES (61,'2025-01-31 14:14:37','1111111111','茶叶名称1','茶叶分类1',99,'2025-01-31','供应商1','备注1'),(62,'2025-01-31 14:14:37','2222222222','茶叶名称2','茶叶分类2',99,'2025-01-31','供应商2','备注2'),(63,'2025-01-31 14:14:37','3333333333','茶叶名称3','茶叶分类3',99,'2025-01-31','供应商3','备注3'),(64,'2025-01-31 14:14:37','4444444444','茶叶名称4','茶叶分类4',99,'2025-01-31','供应商4','备注4'),(65,'2025-01-31 14:14:37','5555555555','茶叶名称5','茶叶分类5',99,'2025-01-31','供应商5','备注5'),(66,'2025-01-31 14:14:37','6666666666','茶叶名称6','茶叶分类6',99,'2025-01-31','供应商6','备注6'),(67,'2025-01-31 14:14:37','7777777777','茶叶名称7','茶叶分类7',99,'2025-01-31','供应商7','备注7'),(68,'2025-01-31 14:14:37','8888888888','茶叶名称8','茶叶分类8',99,'2025-01-31','供应商8','备注8'),(69,'2025-01-31 14:26:54','1709044160901','茶叶名称8','茶叶分类8',222,'2025-01-31','22','22');
/*!40000 ALTER TABLE `daohuoruku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusschadaozhishiku`
--

DROP TABLE IF EXISTS `discusschadaozhishiku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusschadaozhishiku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext COMMENT '头像',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='茶道知识库评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusschadaozhishiku`
--

LOCK TABLES `discusschadaozhishiku` WRITE;
/*!40000 ALTER TABLE `discusschadaozhishiku` DISABLE KEYS */;
INSERT INTO `discusschadaozhishiku` VALUES (1,'2025-01-31 14:29:31',59,1709043817793,'upload/1709043817058.jpg','11','<p>11122</p>',NULL);
/*!40000 ALTER TABLE `discusschadaozhishiku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusschayexinxi`
--

DROP TABLE IF EXISTS `discusschayexinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusschayexinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext COMMENT '头像',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='茶叶信息评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusschayexinxi`
--

LOCK TABLES `discusschayexinxi` WRITE;
/*!40000 ALTER TABLE `discusschayexinxi` DISABLE KEYS */;
INSERT INTO `discusschayexinxi` VALUES (1,'2025-01-31 14:30:10',26,1709043817793,'upload/1709043817058.jpg','11','<p>1122</p>','<p>回复回复AA</p>');
/*!40000 ALTER TABLE `discusschayexinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forum`
--

DROP TABLE IF EXISTS `forum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `forum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) DEFAULT NULL COMMENT '帖子标题',
  `content` longtext NOT NULL COMMENT '帖子内容',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父节点id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `avatarurl` longtext COMMENT '头像',
  `isdone` varchar(200) DEFAULT NULL COMMENT '状态',
  `istop` int(11) DEFAULT '0' COMMENT '是否置顶',
  `toptime` datetime DEFAULT NULL COMMENT '置顶时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=91 DEFAULT CHARSET=utf8 COMMENT='茶艺社区';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forum`
--

LOCK TABLES `forum` WRITE;
/*!40000 ALTER TABLE `forum` DISABLE KEYS */;
INSERT INTO `forum` VALUES (81,'2025-01-31 14:14:37','帖子标题1','帖子内容1',0,1,'用户名1','upload/forum_avatarurl1.jpg,upload/forum_avatarurl2.jpg,upload/forum_avatarurl3.jpg','开放',0,'2025-01-31 22:14:37'),(82,'2025-01-31 14:14:37','帖子标题2','帖子内容2',0,2,'用户名2','upload/forum_avatarurl2.jpg,upload/forum_avatarurl3.jpg,upload/forum_avatarurl4.jpg','开放',0,'2025-01-31 22:14:37'),(83,'2025-01-31 14:14:37','帖子标题3','帖子内容3',0,3,'用户名3','upload/forum_avatarurl3.jpg,upload/forum_avatarurl4.jpg,upload/forum_avatarurl5.jpg','开放',0,'2025-01-31 22:14:37'),(84,'2025-01-31 14:14:37','帖子标题4','帖子内容4',0,4,'用户名4','upload/forum_avatarurl4.jpg,upload/forum_avatarurl5.jpg,upload/forum_avatarurl6.jpg','开放',0,'2025-01-31 22:14:37'),(85,'2025-01-31 14:14:37','帖子标题5','帖子内容5',0,5,'用户名5','upload/forum_avatarurl5.jpg,upload/forum_avatarurl6.jpg,upload/forum_avatarurl7.jpg','开放',0,'2025-01-31 22:14:37'),(86,'2025-01-31 14:14:37','帖子标题6','帖子内容6',0,6,'用户名6','upload/forum_avatarurl6.jpg,upload/forum_avatarurl7.jpg,upload/forum_avatarurl8.jpg','开放',0,'2025-01-31 22:14:37'),(87,'2025-01-31 14:14:37','帖子标题7','帖子内容7',0,7,'用户名7','upload/forum_avatarurl7.jpg,upload/forum_avatarurl8.jpg,upload/forum_avatarurl9.jpg','开放',0,'2025-01-31 22:14:37'),(88,'2025-01-31 14:14:37','帖子标题8','帖子内容8',0,8,'用户名8','upload/forum_avatarurl8.jpg,upload/forum_avatarurl9.jpg,upload/forum_avatarurl10.jpg','开放',0,'2025-01-31 22:14:37'),(89,'2025-01-31 14:24:38','我的发布帖子信息33','<p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p>操作者可以在输入框输入&nbsp;&nbsp;详情信息&nbsp;&nbsp;等内容。</p><p><br></p>',0,1709043817793,'11',NULL,'开放',1,'2025-01-31 22:31:03'),(90,'2025-01-31 14:25:12',NULL,'<p>112</p>',89,1709043817793,'11','upload/1709043817058.jpg',NULL,0,NULL);
/*!40000 ALTER TABLE `forum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `orderid` varchar(200) NOT NULL COMMENT '订单编号',
  `tablename` varchar(200) DEFAULT 'chayexinxi' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `picture` longtext COMMENT '商品图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` double NOT NULL DEFAULT '0' COMMENT '价格',
  `total` double NOT NULL DEFAULT '0' COMMENT '总价格',
  `type` int(11) DEFAULT '1' COMMENT '支付类型',
  `status` varchar(200) DEFAULT NULL COMMENT '状态',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  `tel` varchar(200) DEFAULT NULL COMMENT '电话',
  `consignee` varchar(200) DEFAULT NULL COMMENT '收货人',
  `logistics` longtext COMMENT '物流',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `sfsh` varchar(200) DEFAULT '' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `role` varchar(200) DEFAULT NULL COMMENT '用户角色',
  PRIMARY KEY (`id`),
  UNIQUE KEY `orderid` (`orderid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,'2025-01-31 14:24:08','2024227222638692','chayexinxi',1709043817793,25,'茶叶名称5','upload/chayexinxi_tupian5.jpg',1,99.9,99.9,1,'已取消','订单','15111111111','11',NULL,'1122','',NULL,'yonghu'),(3,'2025-01-31 14:25:49','2024227222819699','chayexinxi',1709043817793,26,'茶叶名称6','upload/chayexinxi_tupian6.jpg',1,99.9,99.9,1,'已退款','长沙市开福区秀峰路1号','15111111111','11','<p>这里输入物流信息</p>','1122','是','1122','yonghu');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '名称',
  `picture` longtext COMMENT '图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
INSERT INTO `storeup` VALUES (1,'2025-01-31 14:29:16',1709043817793,89,'forum','我的发布帖子信息33','1','21',NULL,NULL);
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1709043817793,'11','yonghu','用户','3e63qjurs6onf9fjt03cek9br8zhzqev','2025-01-31 14:23:40','2025-01-31 15:29:12'),(2,11,'账号1','yonghu','用户','ats5r7auxlgu820acj7ufr0ren5u98b3','2025-01-31 14:25:59','2025-01-31 15:25:59'),(3,1,'admin','users','管理员','p6z18gf2dofug5fne9pxlu6mltus2pah','2025-01-31 14:26:26','2025-01-31 15:30:26');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `image` varchar(200) DEFAULT NULL COMMENT '头像',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','upload/image1.jpg','管理员','2025-01-31 14:14:38');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) NOT NULL COMMENT '手机',
  `touxiang` longtext COMMENT '头像',
  `money` double DEFAULT '0' COMMENT '余额',
  `status` int(11) DEFAULT '0' COMMENT '状态',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1709043817794 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2025-01-31 14:14:37','账号1','123456','姓名1','男','13823888881','upload/yonghu_touxiang1.jpg',100.1,0),(12,'2025-01-31 14:14:37','账号2','123456','姓名2','男','13823888882','upload/yonghu_touxiang2.jpg',200,0),(13,'2025-01-31 14:14:37','账号3','123456','姓名3','男','13823888883','upload/yonghu_touxiang3.jpg',200,0),(14,'2025-01-31 14:14:37','账号4','123456','姓名4','男','13823888884','upload/yonghu_touxiang4.jpg',200,0),(15,'2025-01-31 14:14:37','账号5','123456','姓名5','男','13823888885','upload/yonghu_touxiang5.jpg',200,0),(16,'2025-01-31 14:14:37','账号6','123456','姓名6','男','13823888886','upload/yonghu_touxiang6.jpg',200,0),(17,'2025-01-31 14:14:37','账号7','123456','姓名7','男','13823888887','upload/yonghu_touxiang7.jpg',200,0),(18,'2025-01-31 14:14:37','账号8','123456','姓名8','男','13823888888','upload/yonghu_touxiang8.jpg',200,0),(1709043817793,'2025-01-31 14:23:37','11','11','张三','女','15111111111','upload/1709043817058.jpg',10921.2,0);
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhishifenlei`
--

DROP TABLE IF EXISTS `zhishifenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhishifenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhishifenlei` varchar(200) DEFAULT NULL COMMENT '知识分类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 COMMENT='知识分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhishifenlei`
--

LOCK TABLES `zhishifenlei` WRITE;
/*!40000 ALTER TABLE `zhishifenlei` DISABLE KEYS */;
INSERT INTO `zhishifenlei` VALUES (41,'2025-01-31 14:14:37','知识分类1'),(42,'2025-01-31 14:14:37','知识分类2'),(43,'2025-01-31 14:14:37','知识分类3'),(44,'2025-01-31 14:14:37','知识分类4'),(45,'2025-01-31 14:14:37','知识分类5'),(46,'2025-01-31 14:14:37','知识分类6'),(47,'2025-01-31 14:14:37','知识分类7'),(48,'2025-01-31 14:14:37','知识');
/*!40000 ALTER TABLE `zhishifenlei` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-01 21:46:33
