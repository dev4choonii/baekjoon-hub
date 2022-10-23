SELECT
    TO_CHAR(OS.SALES_DATE, 'YYYY') AS YEAR,
    TO_NUMBER(TO_CHAR(OS.SALES_DATE, 'MM')) AS MONTH,
    UI.GENDER,
    COUNT(DISTINCT UI.USER_ID) AS USERS
FROM USER_INFO UI
    INNER JOIN ONLINE_SALE OS
    ON UI.USER_ID = OS.USER_ID
WHERE UI.GENDER IS NOT NULL
GROUP BY
    TO_CHAR(OS.SALES_DATE, 'YYYY'),
    TO_CHAR(OS.SALES_DATE, 'MM'),
    UI.GENDER
ORDER BY YEAR, MONTH, GENDER;