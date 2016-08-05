-- 删除数据库
DROP DATABASE IF EXISTS eleme;
-- 创建数据库
CREATE DATABASE eleme CHARACTER SET UTF8 ;
-- 使用数据库
USE eleme ;
-- 删除数据表
DROP TABLE IF EXISTS shopcar ;
DROP TABLE IF EXISTS details ;
DROP TABLE IF EXISTS comments ;
DROP TABLE IF EXISTS orders ;
DROP TABLE IF EXISTS customer ;
DROP TABLE IF EXISTS goods ;
DROP TABLE IF EXISTS shop ;
-- 创建店铺表
CREATE TABLE shop (
   sid                int   AUTO_INCREMENT ,
   name               varchar(50),
   sales              int,
   rank               int,
   lowest             float,
   transcost          float,
   logo               varchar(200),
   reserve            varchar(3),
   fullcut            varchar(3),
   firstcut           varchar(3),
   cutspecial         varchar(3),
   payonline          varchar(3),
   invoicespt         varchar(3),
   welfarespt         varchar(3),
   giftspt            varchar(3),
   compensate         varchar(3),
   news                varchar(3),
   label_1            varchar(50),
   label_2            varchar(50),
   label_3            varchar(50),
   adminname          varchar(50),
   cardid             varchar(100),
   begintime          datetime,
   count              int,
   adminbank          varchar(100),
   citycode           varchar(50),
   address            varchar(150),
   adminphone         varchar(50),
   adminaddr          varchar(150),
   introduce          varchar(150),
   wordtime           datetime,
   announce           varchar(300),
   classify           varchar(50),
   attitude           int,
   comment            varchar(150),
   sendpartner        varchar(100),
   settledate         datetime,
   status             varchar(3),
   CONSTRAINT pk_sid PRIMARY KEY (sid) 
)type=innodb ;
-- 创建菜品表
CREATE TABLE goods(
	gid			int AUTO_INCREMENT ,
	sid			int ,
	name 		varchar(50) ,
	price 		float ,
	comment 	varchar(200) ,
	rank		int ,
	amount		int ,
	picture		varchar(100) ,
	classify	varchar(50),
	CONSTRAINT pk_ggid PRIMARY KEY (gid) ,
	CONSTRAINT fk_gsid FOREIGN KEY (sid) REFERENCES shop(sid) ON DELETE CASCADE 
)type=innodb ;
-- 创建顾客表
CREATE TABLE customer (
	cid			int AUTO_INCREMENT ,
	password 	varchar(32) NOT NULL ,
	name 		varchar(50) ,
	phone 		varchar(50) ,
	address		varchar(150) , 
	welfare		float ,
	remain		float ,
	score 		int ,
	email		varchar(100) ,
	photo		varchar(100) ,
	citycode	varchar(50) ,
	city		varchar(50)	,
	regdate		datetime ,
	CONSTRAINT pk_cid PRIMARY KEY (cid)
)type=innodb ;
-- 创建评价表
CREATE TABLE comments (
	cid 		int ,
	gid 		int ,
	name 		varchar(50) ,
	comtime		datetime ,
	rank		int ,
	comment		text,		
	CONSTRAINT fk_ccid FOREIGN KEY (cid) REFERENCES customer(cid) ON DELETE SET NULL ,
	CONSTRAINT fk_cgid FOREIGN KEY (gid) REFERENCES goods(gid) ON DELETE CASCADE 
)type=innodb ;
-- 创建购物车表
CREATE TABLE shopcar (
	cid 		int ,
	gid 		int ,
	amount 		int ,
	CONSTRAINT fk_scid FOREIGN KEY(cid) REFERENCES customer(cid) ON DELETE SET NULL ,
	CONSTRAINT fk_sgid FOREIGN KEY(gid) REFERENCES goods(gid) ON DELETE CASCADE 
)type=innodb ;
-- 创建订单表
CREATE TABLE orders (
	oid 		int AUTO_INCREMENT ,
	cid			int ,
	sid         int ,
	name 		varchar(100) ,
	phone 		varchar(50) ,
	pay			float ,
	total 		float ,
	sendway		varchar(50) ,
	sendtime 	varchar(100) ,
	spendtime 	float ,
	contact		varchar(50) ,
	contacttel	varchar(50) ,
	address 	varchar(150) ,
	invoice		varchar(150) ,
	ordertime	varchar(100) ,
	note 		text ,
	CONSTRAINT pk_ooid PRIMARY KEY (oid) ,
	CONSTRAINT fk_ocid FOREIGN KEY (cid) REFERENCES customer(cid) ON DELETE CASCADE ,
	CONSTRAINT fk_osid FOREIGN KEY (sid) REFERENCES shop(sid) ON DELETE CASCADE  
)type=innodb ;
-- 创建订单详情表
CREATE TABLE details (
	odid 		int AUTO_INCREMENT ,
	oid 		int ,
	gid			int ,
	title 		varchar(50) not null ,
	price 		float ,
	amount 		int ,
	CONSTRAINT pk_odid  PRIMARY KEY(odid) ,
	CONSTRAINT fk_doid  FOREIGN KEY(oid) REFERENCES orders(oid) ON DELETE CASCADE ,
	CONSTRAINT fk_dgid  FOREIGN KEY(gid) REFERENCES goods(gid)  ON DELETE SET NULL 
)type=innodb ;


