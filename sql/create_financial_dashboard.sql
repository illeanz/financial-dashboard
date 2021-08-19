DROP DATABASE IF EXISTS conygre;
CREATE DATABASE IF NOT EXISTS conygre;
use conygre;

CREATE TABLE `instruments` (
  `symbol` varchar(45) NOT NULL,
  `instr_name` varchar(150) NOT NULL,
  `instr_type` varchar(45) NOT NULL,
  `market_price` double NOT NULL,
  PRIMARY KEY (`symbol`)
);

CREATE TABLE `users` (
  `uid` int NOT NULL AUTO_INCREMENT,
  `password` varchar(256) NOT NULL,
  PRIMARY KEY (`uid`)
);

CREATE TABLE `accounts` (
  `aid` int NOT NULL AUTO_INCREMENT,
  `uid` int NOT NULL,
  `acc_name` varchar(150) NOT NULL,
  `acc_type` varchar(45) NOT NULL,
  `value` double NOT NULL,
  PRIMARY KEY (`aid`),
  KEY `uid_idx` (`uid`),
  FOREIGN KEY (`uid`) REFERENCES `users` (`uid`) ON UPDATE CASCADE
);


CREATE TABLE `banking_acc_info` (
  `aid` int NOT NULL,
  `banking_acc_type` varchar(45) NOT NULL,
  `interest_rate` double NOT NULL,
  PRIMARY KEY (`aid`),
  FOREIGN KEY (`aid`) REFERENCES `accounts` (`aid`) ON DELETE RESTRICT ON UPDATE CASCADE
);

CREATE TABLE `investment_acc_info` (
  `aid` int NOT NULL,
  `investment_acc_type` varchar(45) NOT NULL,
  `cash` double NOT NULL,
  PRIMARY KEY (`aid`),
  FOREIGN KEY (`aid`) REFERENCES `accounts` (`aid`) ON DELETE RESTRICT ON UPDATE CASCADE
);

CREATE TABLE `investments` (
  `aid` int NOT NULL,
  `symbol` varchar(45) NOT NULL,
  `position` int NOT NULL,
  `avg_price` double NOT NULL,
  PRIMARY KEY (`aid`,`symbol`),
  FOREIGN KEY (`aid`) REFERENCES `accounts` (`aid`) ON DELETE RESTRICT ON UPDATE CASCADE,
  FOREIGN KEY (`symbol`) REFERENCES `instruments` (`symbol`) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE `account_history` (
  `aid` int NOT NULL,
  `date` date NOT NULL,
  `value` double NOT NULL,
  PRIMARY KEY (`aid`,`date`),
  FOREIGN KEY (`aid`) REFERENCES `accounts` (`aid`) ON DELETE RESTRICT ON UPDATE CASCADE
);

CREATE TABLE `account_transactions` (
  `trans_id` int NOT NULL AUTO_INCREMENT,
  `aid` int NOT NULL,
  `date` date NOT NULL,
  `trans_type` varchar(45) NOT NULL,
  `trans_desc` varchar(300),
  `value` double NOT NULL,
  PRIMARY KEY (`trans_id`),
  FOREIGN KEY (`aid`) REFERENCES `accounts` (`aid`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE VIEW investment_accounts AS (
	SELECT *
    FROM accounts
		INNER JOIN investment_acc_info using(aid)
);

CREATE VIEW banking_accounts AS (
	SELECT *
    FROM accounts 
		INNER JOIN banking_acc_info using(aid)
);

CREATE VIEW investment_instruments AS (
	SELECT inva.uid, inva.aid, inva.acc_name, inva.investment_acc_type, inv.symbol, inv.position, inv.avg_price, ins.instr_name, ins.instr_type, ins.market_price
    FROM investments inv
		INNER JOIN instruments ins ON inv.symbol = ins.symbol
        INNER JOIN investment_accounts inva ON inv.aid = inva.aid
);

insert into users values(1001, "password1");
insert into users values(1002, "password2");

insert into accounts values(12345, 1001, "A's investment acc", "Investment", 30000.00);
insert into accounts values(67890, 1001, "A's banking acc", "Banking", 5000.45);
insert into accounts values(13579, 1001, "A's banking acc 2", "Banking", 75.90);

insert into instruments values("GME", "GameStop", "stock", 150.00);
insert into instruments values("TSLA", "Tesla", "stock", 150.00);
insert into instruments values("VSP.TO", "VANGUARD SP 500 INDEX ETF CAD H", "ETF", 74.85);
insert into instruments values("^MID", "S&P MID CAP 400 INDEX", "Index", 2734.01);
insert into instruments values("JLGMX", "JPMorgan Large Cap Growth Fund", "Mutual Fund", 71.20);

insert into banking_acc_info values(67890, "Checkings", 0.05);
insert into banking_acc_info values(13579, "Savings", 0.07);

insert into investment_acc_info values(12345, "RRSP", 1000);

insert into investments values(12345, "GME", 100, 140.00);
insert into instruments values(12345, "VSP.TO", 200, 75.00);

insert into account_history values(12345, '2021-08-31', 1000.00);
insert into account_history values(12345, '2021-08-30', 900.00);
insert into account_history values(12345, '2021-08-29', 800.00);
insert into account_history values(12345, '2021-08-28', 700.00);
insert into account_history values(12345, '2021-08-27', 600.00);
insert into account_history values(12345, '2021-05-31', 100.00);
insert into account_history values(12345, '2021-02-28', 300.00);
insert into account_history values(12345, '2020-08-31', 900.00);

insert into account_transactions values(13579, 67890, '2021-08-31', "shopping", "for my kid's bday", -200.00);
insert into account_transactions values(24680, 67890, '2021-08-30', "deposit", "pay check from citi", 800.00);