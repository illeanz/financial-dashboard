# investment instrument repo
SELECT *
FROM investment_instruments i
WHERE i.uid = 1001
ORDER BY i.investment_acc_type, symbol