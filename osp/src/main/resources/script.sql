create table tbl_dpr
(
    id            int auto_increment
        primary key,
    date          date         null,
    mc_name       varchar(10)  null,
    item_name     varchar(100) null,
    deno          varchar(10)  null,
    total_printed int          null,
    mc_status     varchar(100) null,
    fo            varchar(20)  null
);

create table tbl_wpr
(
    id             int         null,
    machine_name   varchar(20) null,
    start_date     date        null,
    end_date       date        null,
    total_printing int         null
);

create definer = root@localhost view view_name as
select uuid()                   AS `id`,
       `d`.`mc_name`            AS `mc_name`,
       `d`.`item_name`          AS `item_name`,
       `d`.`deno`               AS `deno`,
       `d`.`fo`                 AS `fo`,
       `d`.`date`               AS `date`,
       sum(`d`.`total_printed`) AS `dprinting`,
       `w`.`total_printing`     AS `total_printing`,
       `d`.`mc_status`          AS `mc_status`
from `spcbl_osp`.`tbl_dpr` `d`
         join `spcbl_osp`.`tbl_wpr` `w`
where ((`d`.`mc_name` = `w`.`machine_name`) and (`d`.`date` between `w`.`start_date` and `w`.`end_date`))
group by `d`.`mc_name`, `d`.`date`;


