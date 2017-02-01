DROP TABLE IF EXISTS `a_region`;
CREATE TABLE `a_region` (
  region_code VARCHAR(8)  NOT NULL
  COMMENT '区域编码',
  region_name VARCHAR(32) NOT NULL DEFAULT ''
  COMMENT '区域名',
  PRIMARY KEY (region_code)
)
  DEFAULT CHARSET = utf8
  COMMENT '区域表';


DROP TABLE IF EXISTS `a_org_info`;
CREATE TABLE `a_org_info` (
  `org_id`      VARCHAR(64)  NOT NULL
  COMMENT 'org_id',
  `org_name`    VARCHAR(128) NOT NULL DEFAULT ''
  COMMENT '机构名称',
  `region_code` VARCHAR(64)  NOT NULL DEFAULT ''
  COMMENT '区域编码',
  PRIMARY KEY (`org_id`)
)
  DEFAULT CHARSET = utf8
  COMMENT '机构表';

DROP TABLE IF EXISTS `a_user_info`;
CREATE TABLE `a_user_info` (
  `user_id`     VARCHAR(64) NOT NULL
  COMMENT '用户ID',
  `org_id`      VARCHAR(64) NOT NULL
  COMMENT '机构ID',
  `platform_id` INT(1)      NOT NULL
  COMMENT '平台用户',
  `login_name`  VARCHAR(64) NOT NULL
  COMMENT '登录名',
  `password`    VARCHAR(64) NOT NULL
  COMMENT '密码',
  `gender`      VARCHAR(4)  DEFAULT ''
  COMMENT '性别',
  `phone`       VARCHAR(16) DEFAULT ''
  COMMENT '电话',
  `fax`         VARCHAR(16) DEFAULT ''
  COMMENT '传真',
  `mobile`      VARCHAR(16) DEFAULT ''
  COMMENT '手机',
  `job_title`   VARCHAR(16) DEFAULT ''
  COMMENT '职称',
  `real_name`   VARCHAR(64) DEFAULT ''
  COMMENT '真是姓名',
  `leader_name` VARCHAR(64) DEFAULT ''
  COMMENT '主管领导姓名',
  `token_code`  VARCHAR(64) DEFAULT ''
  COMMENT 'token',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY (`login_name`)
)
  DEFAULT CHARSET = utf8
  COMMENT '用户信息表';

DROP TABLE IF EXISTS `a_report_type`;
CREATE TABLE `a_report_type` (
  id        INT(11)     NOT NULL AUTO_INCREMENT
  COMMENT 'id',
  type_name VARCHAR(16) NOT NULL DEFAULT ''
  COMMENT '名称',
  PRIMARY KEY (`id`)
)
  DEFAULT CHARSET = utf8
  COMMENT '报表类型';

DROP TABLE IF EXISTS `a_template`;
CREATE TABLE `a_template` (
  `template_id`      VARCHAR(64) NOT NULL
  COMMENT '模板ID',
  `template_name`    VARCHAR(128) DEFAULT ''
  COMMENT '模板名称',
  `table_name`       VARCHAR(128) DEFAULT ''
  COMMENT '数据库表名',
  `normal_template`  VARCHAR(128) DEFAULT ''
  COMMENT '填报模板',
  `summary_template` VARCHAR(128) DEFAULT ''
  COMMENT '汇总模板',
  `report_cycle`     SMALLINT     DEFAULT 0
  COMMENT '填报周期',
  `report_type`      SMALLINT     DEFAULT 0
  COMMENT '填报类型',
  `sort`             INT(11)      DEFAULT 0
  COMMENT '排序',
  PRIMARY KEY (`template_id`)
)
  DEFAULT CHARSET = utf8
  COMMENT '模板表';

DROP TABLE IF EXISTS `a_report`;
CREATE TABLE `a_report` (
  `report_id`      VARCHAR(64) NOT NULL
  COMMENT '报表ID',
  `template_id`    VARCHAR(64) NOT NULL
  COMMENT '模板ID',
  `report_type`    INT(11)               DEFAULT 0
  COMMENT '报表类型',
  `report_user_id` VARCHAR(64) NOT NULL
  COMMENT '报表用户ID',
  `report_time`    TIMESTAMP   NULL      DEFAULT NULL
  COMMENT '上报时间',
  `status`         TINYINT               DEFAULT 0
  COMMENT '填报状态 0：未填写 1：起草中 2：已上报',
  `begin_time`     TIMESTAMP   NULL      DEFAULT NULL
  COMMENT '开始时间',
  `end_time`       TIMESTAMP   NULL      DEFAULT NULL
  COMMENT '结束时间',
  PRIMARY KEY (`report_id`),
  UNIQUE KEY type_time(`begin_time`, `template_id`, `report_user_id`),
  KEY k_user(`report_user_id`),
  KEY k_template(`template_id`),
  KEY k_b_time(`begin_time`),
  KEY k_e_time(`end_time`)
)
  DEFAULT CHARSET = utf8
  COMMENT '报表';

DROP TABLE IF EXISTS `a_re_report`;
CREATE TABLE `a_re_report` (
  `id`          VARCHAR(64) NOT NULL
  COMMENT '补填报ID',
  `org_id`      VARCHAR(64) NOT NULL
  COMMENT '组织ID',
  `begin_time`  TIMESTAMP   NULL DEFAULT NULL
  COMMENT '开始时间',
  `template_id` VARCHAR(64)      DEFAULT ''
  COMMENT '模板ID',
  `report_type` SMALLINT         DEFAULT 0
  COMMENT '填报类型',
  `re_is_open`  TINYINT          DEFAULT 0
  COMMENT '是否开放 0：关闭 1：开放',
  PRIMARY KEY (`id`)
)
  DEFAULT CHARSET = utf8
  COMMENT '补填报';

CREATE TABLE `a_week_config` (
  `id`   VARCHAR(64) NOT NULL,
  `year` INT(11) DEFAULT 0
  COMMENT '年份',
  `type` INT(11) DEFAULT 0
  COMMENT '类别 0：春防 1：秋防',
  `time` TEXT COMMENT '日期字符',
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

DROP TABLE IF EXISTS `b_livestockinout`;
CREATE TABLE `b_livestockinout` (
  `LivestockId`             VARCHAR(64) NOT NULL,
  `ReportId`                VARCHAR(64)          DEFAULT NULL,
  `Liv_regionCode`          VARCHAR(64)          DEFAULT NULL,
  `Liv_regionName`          VARCHAR(64)          DEFAULT NULL,
  `LivestockDate`           TIMESTAMP   NULL     DEFAULT NULL,
  `HerdsPig`                DECIMAL(18, 2)       DEFAULT NULL,
  `HerdsNiu`                DECIMAL(18, 2)       DEFAULT NULL,
  `HerdsSheep`              DECIMAL(18, 2)       DEFAULT NULL,
  `HerdsOther`              DECIMAL(18, 2)       DEFAULT NULL,
  `HerdsChicken`            DECIMAL(18, 2)       DEFAULT NULL,
  `HerdsDuck`               DECIMAL(18, 2)       DEFAULT NULL,
  `HerdsGoose`              DECIMAL(18, 2)       DEFAULT NULL,
  `HerdsOtherQ`             DECIMAL(18, 2)       DEFAULT NULL,
  `ImmuneBirdFluChecken`    DECIMAL(18, 2)       DEFAULT NULL,
  `ImmuneBirdFluDuck`       DECIMAL(18, 2)       DEFAULT NULL,
  `ImmuneBirdFluGoose`      DECIMAL(18, 2)       DEFAULT NULL,
  `ImmuneBirdFluOther`      DECIMAL(18, 2)       DEFAULT NULL,
  `ImmuneAFMDNiu`           DECIMAL(18, 2)       DEFAULT NULL,
  `ImmuneAFMDSheep`         DECIMAL(18, 2)       DEFAULT NULL,
  `ImmuneBlueEar`           DECIMAL(18, 2)       DEFAULT NULL,
  `ImmuneSwine`             DECIMAL(18, 2)       DEFAULT NULL,
  `ImmuneNewcastle`         DECIMAL(18, 2)       DEFAULT NULL,
  `ImmuneFMDPig`            DECIMAL(18, 2)       DEFAULT NULL,
  `ImmuneFMDNiu`            DECIMAL(18, 2)       DEFAULT NULL,
  `ImmuneFMDSheep`          DECIMAL(18, 2)       DEFAULT NULL,
  `ImmuneFMDOther`          DECIMAL(18, 2)       DEFAULT NULL,
  `PesteDesPetitsRuminants` DECIMAL(18, 2)       DEFAULT NULL,
  PRIMARY KEY (`LivestockId`),
  KEY k_report(`ReportId`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT '畜禽存栏和应免数量月报表';


DROP TABLE IF EXISTS `a_news`;
CREATE TABLE `a_news` (
  `new_id`         CHAR(64)     NOT NULL,
  `new_title`      VARCHAR(255) NOT NULL DEFAULT '',
  `new_body`       LONGTEXT,
  `new_date`       TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `new_count`      INT(11)               DEFAULT 0,
  `new_deleteflag` INT(11)               DEFAULT 0,
  PRIMARY KEY (`new_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT '新闻表';

DROP TABLE IF EXISTS `b_disinfectiondrugs`;
CREATE TABLE `b_disinfectiondrugs` (
  `df_id`          VARCHAR(64) NOT NULL,
  `df_reportId`    VARCHAR(64)      DEFAULT NULL,
  `df_date`        TIMESTAMP   NULL DEFAULT NULL,
  `df_regionCode`  VARCHAR(64)      DEFAULT NULL,
  `df_drugs`       DECIMAL(18, 2)   DEFAULT NULL,
  `df_pharmacy`    DECIMAL(18, 2)   DEFAULT NULL,
  `df_other`       DECIMAL(18, 2)   DEFAULT NULL,
  `df_regionName`  VARCHAR(64)      DEFAULT NULL,
  `df_Alldrugs`    DECIMAL(18, 2)   DEFAULT NULL,
  `df_Allpharmacy` DECIMAL(18, 2)   DEFAULT NULL,
  `df_Allother`    DECIMAL(18, 2)   DEFAULT NULL,
  PRIMARY KEY (`df_id`),
  KEY k_report(`df_reportId`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `b_wfootandmouthdisease` (
  `fmd_id`                           VARCHAR(64) NOT NULL,
  `fmd_reportId`                     VARCHAR(64)      DEFAULT NULL,
  `fmd_date`                         TIMESTAMP   NULL DEFAULT NULL,
  `fmd_regionCode`                   VARCHAR(64)      DEFAULT NULL,
  `fmd_regionName`                   VARCHAR(64)      DEFAULT NULL,
  `fmd_inactivatedVaccine`           DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_inactivatedImmuneAmountPig`   DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_inactivatedImmuneAmountNiu`   DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_inactivatedImmuneAmountSheep` DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_inactivatedImmuneAmountOther` DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_inactivatedShouldAmountPig`   DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_inactivatedShouldAmountNiu`   DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_inactivatedShouldAmountSheep` DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_inactivatedShouldAmountOther` DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_syntheticVaccine`             DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_syntheticImmuneAmountPig`     DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_syntheticImmuneAmountNiu`     DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_syntheticImmuneAmountSheep`   DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_syntheticImmuneAmountOther`   DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_O2Vaccine`                    DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_O2ImmuneAmountPig`            DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_O2ImmuneAmountNiu`            DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_O2ImmuneAmountSheep`          DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_O2ImmuneAmountOther`          DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_OAVaccine`                    DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_OAImmuneAmountNiu`            DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_OAImmuneAmountSheep`          DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_OAAShudeImmuneAmountNiu`      DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_OAAShudeImmuneAmountSheep`    DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_AVaccine`                     DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_AImmuneAmountNiu`             DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_AImmuneAmountSheep`           DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_O3Vaccine`                    DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_O3ImmuneAmountPig`            DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_O3ImmuneAmountNiu`            DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_O3ImmuneAmountSheep`          DECIMAL(18, 2)   DEFAULT NULL,
  `fmd_O3ImmuneAmountOther`          DECIMAL(18, 2)   DEFAULT NULL,
  PRIMARY KEY (`fmd_id`),
  KEY k_report(`fmd_reportId`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

