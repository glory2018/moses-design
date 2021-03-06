DROP TABLE school;
CREATE TABLE school
(
    id         bigint NOT NULL AUTO_INCREMENT,
    name       varchar(64),
    address    varchar(256),
    createTime datetime,
    updateTime datetime,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into school (id, name, address, createTime, updateTime)
values (1, '北京大学', '北京市海淀区颐和园路5号', '2019-10-18 13:35:57', '2019-10-18 13:35:57');
insert into school (id, name, address, createTime, updateTime)
values (2, '南开大学', '中国天津市南开区卫津路94号', '2019-10-18 13:35:57', '2019-10-18 13:35:57');
insert into school (id, name, address, createTime, updateTime)
values (3, '同济大学', '上海市彰武路1号同济大厦A楼7楼7区', '2019-10-18 13:35:57', '2019-10-18 13:35:57');
DROP TABLE user;
CREATE TABLE user
(
    id         bigint(11) NOT NULL AUTO_INCREMENT,
    name       varchar(32),
    age        int(4),
    address    varchar(128),
    entryTime  datetime,
    remark     varchar(64),
    createTime datetime,
    updateTime datetime,
    status     int(4) DEFAULT '0',
    dateTime   varchar(64),
    PRIMARY KEY (id),
    INDEX      idx_name ( name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into user (id, name, age, address, entryTime, remark, createTime, updateTime, status, dateTime)
values (1, '水水', 18, '吉林省榆树市黑林镇尹家村5组', '2019-12-22 00:00:00', '无', '2019-12-22 00:00:00', '2019-12-22 00:00:00', 0,
        '20200309');
insert into user (id, name, age, address, entryTime, remark, createTime, updateTime, status, dateTime)
values (2, '豆豆', 18, '辽宁省大连市清河湾司马道407路', '2019-12-22 00:00:00', '无', '2019-12-22 00:00:00', '2019-12-22 00:00:00', 1,
        null);
insert into user (id, name, age, address, entryTime, remark, createTime, updateTime, status, dateTime)
values (3, '花花', 19, '辽宁省大连市清河湾司马道407路', '2019-12-22 00:00:00', '无', '2019-12-22 00:00:00', '2019-12-22 00:00:00', 0,
        '20200310');
