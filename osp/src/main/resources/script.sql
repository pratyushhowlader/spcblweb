select d.mc_name,d.date,sum(d.total_printed) from tbl_dpr d, tbl_wpr w
where d.mc_name = w.machine_name
  and d.date between '2022-08-13' and '2022-08-20'
group by d.mc_name, d.date;


select date,mc_name,sum(total_printed) from tbl_dpr
where date between '2022-08-13' and '2022-08-20'
  and mc_name='MR-2' group by date;

select date,mc_name,total_printed from tbl_dpr where date between '2022-08-13' and '2022-08-20';

/*View generate query*/
create view printingstatus as select UUID() as id, d.mc_name,d.item_name,d.deno,d.fo, d.date,sum(d.total_printed) as dprinting,w.total_printing,(w.total_printing - sum(d.total_printed)) as pending,d.mc_status
                              from tbl_dpr d, tbl_wpr w
                              where d.mc_name = w.machine_name
                                and d.date between (w.start_date) and (w.end_date)
                              group by d.mc_name, d.date;

delete from tbl_dpr;

CREATE TABLE `tbl_users` (
                             `user_id` int(11) NOT NULL AUTO_INCREMENT,
                             `username` varchar(45) NOT NULL,
                             `email` varchar(45) NOT NULL,
                             `full_name` varchar(45) NOT NULL,
                             `password` varchar(64) NOT NULL,
                             `enabled` tinyint(4) DEFAULT NULL,
                             PRIMARY KEY (`user_id`),
                             UNIQUE KEY `email_UNIQUE` (`email`)
);

CREATE TABLE `tbl_roles` (
                             `role_id` int(11) NOT NULL AUTO_INCREMENT,
                             `name` varchar(45) NOT NULL,
                             PRIMARY KEY (`role_id`)
);

CREATE TABLE `tbl_users_roles` (
                                   `user_id` int(11) NOT NULL,
                                   `role_id` int(11) NOT NULL,
                                   KEY `user_fk_idx` (`user_id`),
                                   KEY `role_fk_idx` (`role_id`),
                                   CONSTRAINT `role_fk` FOREIGN KEY (`role_id`) REFERENCES `tbl_roles` (`role_id`),
                                   CONSTRAINT `user_fk` FOREIGN KEY (`user_id`) REFERENCES `tbl_users` (`user_id`)
);
INSERT INTO `tbl_roles` (`name`) VALUES ('USER');
INSERT INTO `tbl_roles` (`name`) VALUES ('CREATOR');
INSERT INTO `tbl_roles` (`name`) VALUES ('EDITOR');
INSERT INTO `tbl_roles` (`name`) VALUES ('ADMIN');


INSERT INTO `tbl_users` (`username`, `email`,`password`, `enabled`,`full_name`) VALUES ('admin','prasunhowlader@yahoo.com', '$2a$10$IqTJTjn39IU5.7sSCDQxzu3xug6z/LPU6IF0azE/8CkHCwYEnwBX.', '1','Prasun Kanti Howlader');
INSERT INTO `tbl_users_roles` (`user_id`, `role_id`) VALUES (1, 4);

create database parkingcontroldb;