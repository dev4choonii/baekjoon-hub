SELECT
    ANIMAL_TYPE,
    COUNT(*) AS COUNT
FROM ANIMAL_INS
GROUP BY ANIMAL_TYPE
ORDER BY DECODE(ANIMAL_TYPE, 'Cat', 1);