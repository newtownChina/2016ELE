prompt PL/SQL Developer import file
prompt Created on 2016年5月28日 by NXY
set feedback off
set define off
prompt Creating T_CUSTOMER...
create table T_CUSTOMER
(
  c_id        VARCHAR2(100) not null,
  c_name      VARCHAR2(100) not null,
  c_pwd       VARCHAR2(100) not null,
  c_welfare   INTEGER,
  c_remain    INTEGER,
  c_score     INTEGER,
  c_tel       VARCHAR2(50),
  c_email     VARCHAR2(100),
  c_photo     VARCHAR2(200),
  c_city_code VARCHAR2(50) not null,
  c_city      VARCHAR2(100),
  c_reg_date  VARCHAR2(100) default to_char(sysdate,'yyyy-MM-dd hh24:mi:ss')
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 64K
    minextents 1
    maxextents unlimited
  );
comment on table T_CUSTOMER
  is '顾客表';
comment on column T_CUSTOMER.c_id
  is '顾客ID
';
comment on column T_CUSTOMER.c_name
  is '用户名
';
comment on column T_CUSTOMER.c_pwd
  is '密码
';
comment on column T_CUSTOMER.c_welfare
  is '红包
';
comment on column T_CUSTOMER.c_remain
  is '余额
';
comment on column T_CUSTOMER.c_score
  is '积分
';
comment on column T_CUSTOMER.c_tel
  is '手机号
';
comment on column T_CUSTOMER.c_email
  is '邮箱
';
comment on column T_CUSTOMER.c_photo
  is '头像
';
comment on column T_CUSTOMER.c_city_code
  is '常在市区代号
';
comment on column T_CUSTOMER.c_city
  is '市区名称
';
alter table T_CUSTOMER
  add constraint PK_C_ID primary key (C_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating T_SHOP...
create table T_SHOP
(
  s_id             VARCHAR2(100) not null,
  s_name           VARCHAR2(150),
  s_sales          INTEGER,
  s_rank           INTEGER,
  s_lowest         INTEGER,
  "S_TRANS COST"   INTEGER,
  s_avg_time       VARCHAR2(100),
  s_logo           VARCHAR2(200),
  s_reserve        VARCHAR2(3),
  s_full_cut       VARCHAR2(3),
  s_first_cut      VARCHAR2(3),
  s_cut_spt        VARCHAR2(3),
  s_cut_special    VARCHAR2(3),
  s_pay_online     VARCHAR2(3),
  s_invoice_spt    VARCHAR2(3),
  s_assure_spt     VARCHAR2(3),
  s_welfare_spt    VARCHAR2(3),
  s_gift_spt       VARCHAR2(3),
  s_door_spt       VARCHAR2(3),
  s_compensate_spt VARCHAR2(3),
  s_new            VARCHAR2(3),
  s_label_1        VARCHAR2(50),
  s_label_2        VARCHAR2(50),
  s_label_3        VARCHAR2(50),
  admin_name       VARCHAR2(100),
  admin_id_card    VARCHAR2(100),
  admin_bank       VARCHAR2(100),
  s_city_code      VARCHAR2(50),
  s_addr           VARCHAR2(150),
  admin__tel       VARCHAR2(50),
  admin_addr       VARCHAR2(150),
  s_introduce      VARCHAR2(150),
  s_work_time      VARCHAR2(100),
  s_announce       VARCHAR2(300),
  s_inter_photo    VARCHAR2(200),
  s_classify       VARCHAR2(50),
  s_atti           INTEGER,
  s_cmt            VARCHAR2(200),
  s_send_partner   VARCHAR2(100),
  s_status         VARCHAR2(3),
  s_settled_date   VARCHAR2(100)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 8K
    minextents 1
    maxextents unlimited
  );
comment on table T_SHOP
  is '店铺表';
alter table T_SHOP
  add constraint PK_S_ID primary key (S_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating T_FOOD...
create table T_FOOD
(
  f_id       VARCHAR2(100) not null,
  f_name     VARCHAR2(100),
  f_cmt      VARCHAR2(150),
  f_rank     INTEGER,
  f_sales    INTEGER,
  f_price    INTEGER,
  s_id       VARCHAR2(100),
  f_pic      VARCHAR2(200),
  f_classify VARCHAR2(50)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 8K
    minextents 1
    maxextents unlimited
  );
comment on table T_FOOD
  is '菜品表';
alter table T_FOOD
  add constraint PK_F_ID primary key (F_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table T_FOOD
  add constraint FK_T_FOOD_S_ID foreign key (S_ID)
  references T_SHOP (S_ID) on delete cascade;

prompt Creating T_FOOD_CMT...
create table T_FOOD_CMT
(
  c_id       VARCHAR2(100) not null,
  f_id       VARCHAR2(100) not null,
  f_name     VARCHAR2(100),
  f_cmt_time VARCHAR2(100),
  f_cmt      VARCHAR2(150),
  f_rank     INTEGER
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 8K
    minextents 1
    maxextents unlimited
  );
comment on table T_FOOD_CMT
  is '菜品评价表';
alter table T_FOOD_CMT
  add constraint FK_T_FOOD_CMT_C_ID foreign key (C_ID)
  references T_CUSTOMER (C_ID) on delete cascade;
alter table T_FOOD_CMT
  add constraint FK_T_FOOD_CMT_F_ID foreign key (F_ID)
  references T_FOOD (F_ID) on delete cascade;

prompt Creating T_ORDER...
create table T_ORDER
(
  o_id          VARCHAR2(150) not null,
  s_name        VARCHAR2(150),
  s_id          VARCHAR2(100) not null,
  s_tel         VARCHAR2(50),
  f_id          VARCHAR2(100) not null,
  f_name        VARCHAR2(150),
  o_fee         INTEGER,
  o_pay         INTEGER,
  o_send_way    VARCHAR2(50),
  o_send_time   VARCHAR2(100),
  f_spend_time  INTEGER,
  o_contact     VARCHAR2(50),
  o_contact_tel VARCHAR2(50),
  o_addr        VARCHAR2(150),
  o_invoice     VARCHAR2(150),
  c_id          VARCHAR2(100) not null,
  o_order_time  VARCHAR2(100),
  o_note        VARCHAR2(300) default to_char(sysdate,'yyyy-MM-dd hh24:mi:ss')
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 8K
    minextents 1
    maxextents unlimited
  );
comment on table T_ORDER
  is '订单表';
comment on column T_ORDER.o_id
  is '订单号
';
comment on column T_ORDER.s_name
  is '店铺名称
';
comment on column T_ORDER.s_id
  is '店铺ID
';
comment on column T_ORDER.s_tel
  is '店铺电话
';
comment on column T_ORDER.f_id
  is '菜品ID
';
comment on column T_ORDER.f_name
  is '菜品名
';
comment on column T_ORDER.o_fee
  is '订单费用
';
comment on column T_ORDER.o_pay
  is '实际支付
';
comment on column T_ORDER.o_send_way
  is '配送方式
';
comment on column T_ORDER.o_send_time
  is '开始配送时间
';
comment on column T_ORDER.f_spend_time
  is '配送花费时间
';
comment on column T_ORDER.o_contact
  is '联系人
';
comment on column T_ORDER.o_contact_tel
  is '联系电话
';
comment on column T_ORDER.o_addr
  is '收货地址

';
comment on column T_ORDER.o_invoice
  is '发票信息
';
comment on column T_ORDER.c_id
  is '顾客ID
';
comment on column T_ORDER.o_order_time
  is '下单时间
';
comment on column T_ORDER.o_note
  is '备注
';
alter table T_ORDER
  add constraint PK_O_ID primary key (O_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table T_ORDER
  add constraint FK_F_ID foreign key (F_ID)
  references T_FOOD (F_ID) on delete cascade;
alter table T_ORDER
  add constraint FK_S_ID foreign key (S_ID)
  references T_SHOP (S_ID) on delete cascade;

prompt Disabling triggers for T_CUSTOMER...
alter table T_CUSTOMER disable all triggers;
prompt Disabling triggers for T_SHOP...
alter table T_SHOP disable all triggers;
prompt Disabling triggers for T_FOOD...
alter table T_FOOD disable all triggers;
prompt Disabling triggers for T_FOOD_CMT...
alter table T_FOOD_CMT disable all triggers;
prompt Disabling triggers for T_ORDER...
alter table T_ORDER disable all triggers;
prompt Deleting T_ORDER...
delete from T_ORDER;
commit;
prompt Deleting T_FOOD_CMT...
delete from T_FOOD_CMT;
commit;
prompt Deleting T_FOOD...
delete from T_FOOD;
commit;
prompt Deleting T_SHOP...
delete from T_SHOP;
commit;
prompt Deleting T_CUSTOMER...
delete from T_CUSTOMER;
commit;
prompt Loading T_CUSTOMER...
prompt Table is empty
prompt Loading T_SHOP...
prompt Table is empty
prompt Loading T_FOOD...
prompt Table is empty
prompt Loading T_FOOD_CMT...
prompt Table is empty
prompt Loading T_ORDER...
prompt Table is empty
prompt Enabling triggers for T_CUSTOMER...
alter table T_CUSTOMER enable all triggers;
prompt Enabling triggers for T_SHOP...
alter table T_SHOP enable all triggers;
prompt Enabling triggers for T_FOOD...
alter table T_FOOD enable all triggers;
prompt Enabling triggers for T_FOOD_CMT...
alter table T_FOOD_CMT enable all triggers;
prompt Enabling triggers for T_ORDER...
alter table T_ORDER enable all triggers;
set feedback on
set define on
prompt Done.
