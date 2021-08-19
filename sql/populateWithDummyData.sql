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