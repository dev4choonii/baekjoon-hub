SELECT
    FO.PRODUCT_ID,
    FP.PRODUCT_NAME,
    SUM(FO.AMOUNT * FP.PRICE) AS TOTAL_SALES
FROM FOOD_ORDER FO
    INNER JOIN FOOD_PRODUCT FP
    ON FO.PRODUCT_ID = FP.PRODUCT_ID
WHERE TO_CHAR(FO.PRODUCE_DATE, 'YYYYMM') = '202205'
GROUP BY FO.PRODUCT_ID, FP.PRODUCT_NAME
ORDER BY TOTAL_SALES DESC, FO.PRODUCT_ID;