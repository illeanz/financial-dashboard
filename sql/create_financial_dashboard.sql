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