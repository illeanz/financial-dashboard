# investment instrument repo
SELECT *
FROM investment_instruments ii
WHERE ii.uid = 1001
ORDER BY ii.investment_acc_type, symbol;

SELECT *
FROM investment_instruments ii
WHERE ii.aid = 12345 AND ii.instr_type = "stock";

SELECT *
FROM investment_instruments ii
WHERE ii.aid = 12345 
ORDER BY ii.avg_price - ii.market_price DESC 
LIMIT 5;


# account history repo
SELECT *
FROM account_history ah
WHERE ah.aid = 987654
AND ah.date >= 2020-01-01 AND ah.date <= 2021-01-01;


insert into banking_accounts(uid, aid, acc_name, acc_type, value) values(1001, 987654, "acc name", "acc type", 410.01);

