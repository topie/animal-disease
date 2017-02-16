DROP TABLE IF EXISTS `d_user_info`;
CREATE TABLE `d_user_info` (
  `user_id`   INT(11) NOT NULL
  COMMENT '用户ID',
  `gender`    TINYINT     DEFAULT 0
  COMMENT '性别 1：男 2：女',
  `real_name` VARCHAR(64) DEFAULT ''
  COMMENT '真是姓名',
  `job_title` VARCHAR(16) DEFAULT ''
  COMMENT '职称',
  `leader`    VARCHAR(64) DEFAULT ''
  COMMENT '主管领导',
  PRIMARY KEY (`user_id`)
)
  DEFAULT CHARSET = utf8
  COMMENT '用户信息表';

DROP TABLE IF EXISTS `d_org_info`;
CREATE TABLE `d_org_info` (
  `org_id`     INT(11)      NOT NULL AUTO_INCREMENT
  COMMENT 'ID',
  `org_name`   VARCHAR(128) NOT NULL DEFAULT ''
  COMMENT '机构名称',
  `org_code`   VARCHAR(64)  NOT NULL DEFAULT ''
  COMMENT '区划编码',
  `token_code` VARCHAR(64)           DEFAULT ''
  COMMENT '机构标识',
  PRIMARY KEY (`org_id`)
)
  DEFAULT CHARSET = utf8
  COMMENT '机构表';

DROP TABLE IF EXISTS `d_report`;
CREATE TABLE `d_report` (
  `report_id`             INT(11) NOT NULL AUTO_INCREMENT
  COMMENT 'ID',
  `report_name`           VARCHAR(128)     DEFAULT ''
  COMMENT '报表名称',
  `table_name`            VARCHAR(128)     DEFAULT ''
  COMMENT '数据库表名',
  `reprot_template_name`  VARCHAR(128)     DEFAULT ''
  COMMENT '填报模板名称',
  `summary_template_name` VARCHAR(128)     DEFAULT ''
  COMMENT '汇总模板名称',
  `report_type`           SMALLINT         DEFAULT 0
  COMMENT '报表类型：1：月报 2：周报 3：统计 4：其他',
  `report_categery`       SMALLINT         DEFAULT 0
  COMMENT '栏目 1：月度免疫 2：春秋防周报 3：春秋防数据汇总 4：物资储备',
  `report_period`         SMALLINT         DEFAULT 0
  COMMENT '填报频率 1：月度 2：周报 3：半年 4：季度 5：实时',
  PRIMARY KEY (`report_id`)
)
  DEFAULT CHARSET = utf8
  COMMENT '报表模板';

DROP TABLE IF EXISTS `d_livestock_in_out`;
CREATE TABLE `d_livestock_in_out` (
  `livestock_id`            INT(11)     NOT NULL  AUTO_INCREMENT
  COMMENT 'ID',
  `report_id`               INT(11)     NOT NULL  DEFAULT 0
  COMMENT '报表ID',
  `liv_region_code`         VARCHAR(64) NOT NULL  DEFAULT ''
  COMMENT '省行政编码',
  `liv_region_name`         VARCHAR(128)          DEFAULT ''
  COMMENT '省名',
  `livestock_date`          TIMESTAMP   NULL      DEFAULT NULL
  COMMENT '上报时间',
  `herds_pig`               DECIMAL(8, 4)         DEFAULT 0
  COMMENT '当月存栏数量(万头/只/羽)-猪',
  `herds_niu`               DECIMAL(8, 4)         DEFAULT 0
  COMMENT '当月存栏数量(万头/只/羽)-牛',
  `herds_sheep`             DECIMAL(8, 4)         DEFAULT 0
  COMMENT '当月存栏数量(万头/只/羽)-羊',
  `herds_other`             DECIMAL(8, 4)         DEFAULT 0
  COMMENT '当月存栏数量(万头/只/羽)-其他',
  `herds_chicken`           DECIMAL(8, 4)         DEFAULT 0
  COMMENT '当月存栏数量(万头/只/羽)-鸡',
  `herds_duck`              DECIMAL(8, 4)         DEFAULT 0
  COMMENT '当月存栏数量(万头/只/羽)-鸭',
  `herds_goose`             DECIMAL(8, 4)         DEFAULT 0
  COMMENT '当月存栏数量(万头/只/羽)-鹅',
  `herds_other_q`           DECIMAL(8, 4)         DEFAULT 0
  COMMENT '当月存栏数量(万头/只/羽)-其他禽',
  `immune_bird_flu_checken` DECIMAL(8, 4)         DEFAULT 0
  COMMENT '禽流感当月应免数量(万羽)-鸡',
  `immune_bird_flu_duck`    DECIMAL(8, 4)         DEFAULT 0
  COMMENT '禽流感当月应免数量(万羽)-鸭',
  `immune_bird_flu_goose`   DECIMAL(8, 4)         DEFAULT 0
  COMMENT '禽流感当月应免数量(万羽)-鹅',
  `immune_bird_flu_other`   DECIMAL(8, 4)         DEFAULT 0
  COMMENT '禽流感当月应免数量(万羽)-其他禽',
  `immune_afmd_niu`         DECIMAL(8, 4)         DEFAULT 0
  COMMENT 'A型口蹄疫当月应免数量(万头/只)-牛',
  `immune_afmd_sheep`       DECIMAL(8, 4)         DEFAULT 0
  COMMENT 'A型口蹄疫当月应免数量(万头/只)-羊',
  `immune_blue_ear`         DECIMAL(8, 4)         DEFAULT 0
  COMMENT '高致病性猪蓝耳病当月应免数量(万头)-猪',
  `immune_swine`            DECIMAL(8, 4)         DEFAULT 0
  COMMENT '猪瘟当月应免数量(万头)',
  `immune_new_castle`       DECIMAL(8, 4)         DEFAULT 0
  COMMENT '新城疫当月应免数量(万羽)',
  `immune_fmd_pig`          DECIMAL(8, 4)         DEFAULT 0
  COMMENT '牲畜口蹄疫当月应免数量(万头/只)-猪',
  `immune_fmd_niu`          DECIMAL(8, 4)         DEFAULT 0
  COMMENT '牲畜口蹄疫当月应免数量(万头/只)-牛',
  `immune_fmd_sheep`        DECIMAL(8, 4)         DEFAULT 0
  COMMENT '牲畜口蹄疫当月应免数量(万头/只)-羊',
  `immune_fmd_other`        DECIMAL(8, 4)         DEFAULT 0
  COMMENT '牲畜口蹄疫当月应免数量(万头/只)-其他',
  PRIMARY KEY (`livestock_id`),
  UNIQUE KEY (`report_id`)
)
  DEFAULT CHARSET = utf8
  COMMENT '畜禽存栏和应免数量月报表';
