DROP TABLE IF EXISTS `d_livestock_in_out`;
CREATE TABLE `d_livestock_in_out` (
  `livestock_id`            DECIMAL(8, 4) NOT NULL  AUTO_INCREMENT
  COMMENT 'ID',
  `report_id`               DECIMAL(8, 4) NOT NULL  DEFAULT 0
  COMMENT '报表ID',
  `liv_region_code`         VARCHAR(64)   NOT NULL  DEFAULT ''
  COMMENT '省行政编码',
  `liv_region_name`         VARCHAR(128)            DEFAULT ''
  COMMENT '省名',
  `livestock_date`          TIMESTAMP     NULL      DEFAULT NULL
  COMMENT '上报时间',
  `herds_pig`               DECIMAL(8, 4)           DEFAULT 0
  COMMENT '当月存栏数量(万头/只/羽)-猪',
  `herds_niu`               DECIMAL(8, 4)           DEFAULT 0
  COMMENT '当月存栏数量(万头/只/羽)-牛',
  `herds_sheep`             DECIMAL(8, 4)           DEFAULT 0
  COMMENT '当月存栏数量(万头/只/羽)-羊',
  `herds_other`             DECIMAL(8, 4)           DEFAULT 0
  COMMENT '当月存栏数量(万头/只/羽)-其他',
  `herds_chicken`           DECIMAL(8, 4)           DEFAULT 0
  COMMENT '当月存栏数量(万头/只/羽)-鸡',
  `herds_duck`              DECIMAL(8, 4)           DEFAULT 0
  COMMENT '当月存栏数量(万头/只/羽)-鸭',
  `herds_goose`             DECIMAL(8, 4)           DEFAULT 0
  COMMENT '当月存栏数量(万头/只/羽)-鹅',
  `herds_other_q`           DECIMAL(8, 4)           DEFAULT 0
  COMMENT '当月存栏数量(万头/只/羽)-其他禽',
  `immune_bird_flu_checken` DECIMAL(8, 4)           DEFAULT 0
  COMMENT '禽流感当月应免数量(万羽)-鸡',
  `immune_bird_flu_duck`    DECIMAL(8, 4)           DEFAULT 0
  COMMENT '禽流感当月应免数量(万羽)-鸭',
  `immune_bird_flu_goose`   DECIMAL(8, 4)           DEFAULT 0
  COMMENT '禽流感当月应免数量(万羽)-鹅',
  `immune_bird_flu_other`   DECIMAL(8, 4)           DEFAULT 0
  COMMENT '禽流感当月应免数量(万羽)-其他禽',
  `immune_afmd_niu`         DECIMAL(8, 4)           DEFAULT 0
  COMMENT 'A型口蹄疫当月应免数量(万头/只)-牛',
  `immune_afmd_sheep`       DECIMAL(8, 4)           DEFAULT 0
  COMMENT 'A型口蹄疫当月应免数量(万头/只)-羊',
  `immune_blue_ear`         DECIMAL(8, 4)           DEFAULT 0
  COMMENT '高致病性猪蓝耳病当月应免数量(万头)-猪',
  `immune_swine`            DECIMAL(8, 4)           DEFAULT 0
  COMMENT '猪瘟当月应免数量(万头)',
  `immune_newcastle`        DECIMAL(8, 4)           DEFAULT 0
  COMMENT '新城疫当月应免数量(万羽)',
  `immune_fmd_pig`          DECIMAL(8, 4)           DEFAULT 0
  COMMENT '牲畜口蹄疫当月应免数量(万头/只)-猪',
  `immune_fmd_niu`          DECIMAL(8, 4)           DEFAULT 0
  COMMENT '牲畜口蹄疫当月应免数量(万头/只)-牛',
  `immune_fmd_sheep`        DECIMAL(8, 4)           DEFAULT 0
  COMMENT '牲畜口蹄疫当月应免数量(万头/只)-羊',
  `immune_fmd_other`        DECIMAL(8, 4)           DEFAULT 0
  COMMENT '牲畜口蹄疫当月应免数量(万头/只)-其他',
  PRIMARY KEY (`livestock_id`),
  UNIQUE KEY (`report_id`)

)
  DEFAULT CHARSET = utf8
  COMMENT '畜禽存栏和应免数量月报表';
