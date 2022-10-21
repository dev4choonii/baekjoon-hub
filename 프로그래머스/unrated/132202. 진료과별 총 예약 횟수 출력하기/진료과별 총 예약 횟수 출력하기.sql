SELECT T.*
FROM (
    SELECT
        MCDP_CD AS 진료과코드,
        COUNT(*) AS "5월예약건수"
    FROM APPOINTMENT
    WHERE TO_CHAR(APNT_YMD, 'YYYYMM') = '202205'
    GROUP BY MCDP_CD) T
ORDER BY T."5월예약건수", T.진료과코드;