DROP TABLE IF EXISTS `d_attachment`;
CREATE TABLE `d_attachment` (
  `attachment_id`     INT(11) NOT NULL AUTO_INCREMENT
  COMMENT '附件id',
  `attachment_name`   VARCHAR(128)     DEFAULT ''
  COMMENT '附件名称',
  `attachment_type`   TINYINT(1)       DEFAULT 0
  COMMENT '附件类型:0:图片 1:文档 2:其他',
  `attachment_suffix` VARCHAR(32)      DEFAULT ''
  COMMENT '附件后缀',
  `attachment_path`   VARCHAR(255)     DEFAULT ''
  COMMENT '附件文件路径',
  `attachment_url`    VARCHAR(255)     DEFAULT ''
  COMMENT '附件文件路径',
  `attachment_size`   BIGINT(22)       DEFAULT 0
  COMMENT '附件文件大小',
  `upload_login_name` VARCHAR(64)      DEFAULT ''
  COMMENT '上传附件用户',
  PRIMARY KEY (`attachment_id`),
  KEY k_user(`upload_login_name`)
)
  DEFAULT CHARSET = utf8
  COMMENT '附件表';

DROP TABLE IF EXISTS `d_log`;
CREATE TABLE `d_log` (
  id         INT(11)      NOT NULL         AUTO_INCREMENT
  COMMENT 'id',
  user_name  VARCHAR(64)  NOT NULL         DEFAULT ''
  COMMENT '用户',
  login_name VARCHAR(64)  NOT NULL         DEFAULT ''
  COMMENT '登录名',
  log_info   VARCHAR(128) NOT NULL         DEFAULT ''
  COMMENT '日志信息',
  log_time   TIMESTAMP    NOT NULL         DEFAULT CURRENT_TIMESTAMP()
  COMMENT '日志时间',
  PRIMARY KEY (`id`),
  KEY k_time(`log_time`)
)
  DEFAULT CHARSET = utf8
  COMMENT '操作日志';
