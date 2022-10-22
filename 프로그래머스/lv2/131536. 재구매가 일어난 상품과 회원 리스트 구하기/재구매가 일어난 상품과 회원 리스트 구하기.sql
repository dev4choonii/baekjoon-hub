SELECT USER_ID, PRODUCT_ID
FROM (
    SELECT
        USER_ID,
        PRODUCT_ID,
        COUNT(*) AS COUNT
    FROM ONLINE_SALE
    GROUP BY USER_ID, PRODUCT_ID) T
WHERE COUNT > 1
ORDER BY USER_ID, PRODUCT_ID DESC;