SELECT CHAR(65);

# 문자열 연결함수
SELECT CONCAT(ename,'님') name
FROM emp;

#대문자, 소문자 변경함수 
SELECT ename, LOWER(ename) lname, UPPER(LOWER(ename)) uname
FROM emp;

#앞뒤에 문자열을 추가(*,0)하는 함수
SELECT LPAD('hi',10,'*');
SELECT RPAD('hi',10,'*');

SELECT empno, lpad(empno,6,'0'), ename
FROM emp;

SELECT LENGTH('나는 한국 사람입니다.'), CHAR_LENGTH('국어');

SELECT LEFT('abcde',3);
SELECT RIGHT('abcde',3);

SELECT LEFT(ename,3), ename, RPAD(left(ename,3),LENGTH(ename) ,'*' ) 
FROM emp;

#문자열 추출함수- 2-> 시작위치, 3-> 길이
SELECT SUBSTRING('abcde',2,3);

#숫자의 정수자리에 세자리단위로  콤마(,)을 추가하고 특정 소숫점 
#자리수를 제한하는 함수(결과는 문자열로 반환)
SELECT FORMAT(1234566.123523,6);

SELECT empno , sal, format(empno*550,0), format(sal*550,0)
FROM emp;

#ifnull(칼럼명 , 값 ) : 해당 칼럼이 NULL 인경우 정해진 값을 반환한다
SELECT ename, ifnull(comm,0)
FROM emp;

#CEIL(소수점이 있는 수) : 파라미터 값보다 같거나 가장 큰 정수를 반환(올림)
SELECT CEIL(3.1234);

#FLOOR(소수점이 있는 수) : 파라미터 값보다 같거나 가장 작은 정수반환(내림)
SELECT FLOOR(3.1234);

#ROUND(숫자,자리수) : 숫자를 자리수+1 번째 위치에서 반올림한다.
SELECT ROUND(1234567.22645,2);

#MOD(숫자1 , 숫자2) =>숫자1을 숫자2로 나눈 나머지를 리턴한다
SELECT MOD(10,3);

#TRUNCATE() : 숫자를 지정한 소숫점 자리수 만큼만 잘라서 보여줌.
SELECT TRUNCATE(12345.23456,3),  FORMAT(12345.23456,3);

#now() : 마리아디비가  설치된 서버의 년월일시분초를 반환
#insert 할때 주로 사용함
SELECT CURDATE() , CURTIME(), NOW();

#ADDDATE(date, INTERVAL expr TYPE) 
#추가된 날짜를 반환 , insert 할때 주로 사용함
SELECT ADDDATE(NOW(), INTERVAL 2 DAY);

SELECT SUBDATE(NOW(), INTERVAL 2 HOUR);

SELECT DATEDIFF('2021-10-10', '2021-8-15');

SELECT TIMESTAMPDIFF(minute,'2021-03-01','2021-03-15'); 

#DATE_FORMAT(date, format) : 반드시 알아야함. select시 사용
#데이트 타입을 특정 포맷을 이용하여 문자열로 반환

SELECT DATE_FORMAT(NOW(), '%Y. %m. %d. %H:%i');

#문자열로 된 숫자를 number 타입으로 변환 
SELECT CONVERT('1234', UNSIGNED)+1234;

#문자열로 된 날짜를 date 타입으로 변환
SELECT STR_TO_DATE('2021-12-07','%Y-%m-%d');

SELECT *
FROM emp
WHERE empno = CONVERT('7839',UNSIGNED);

INSERT INTO emp 
VALUES(8000,'SUNG','CLERK',7839,
STR_TO_DATE('2021-12-07','%Y-%m-%d'),4000,NULL,10);

# COUNT(칼럼명) =>해당 칼럼이 존재하는 ROW 의 갯수를 반환한다. 
# 단, 저장된 데이터가NULL 인 칼럼은 세지 않는다.
SELECT COUNT(ename) FROM emp;
SELECT COUNT(comm) FROM emp;
SELECT COUNT(*) FROM emp;

#  SUM(칼럼명) => 해당 칼럼의 값을 모두 더한 값을 리턴한다. 

SELECT SUM(sal) FROM emp;

# AVG(칼럼명) => 해당 칼럼의 값을 모든값을 더한후 ROW 의 갯수로 
# 나눈 평균값을 리턴한다. 단 NULL 칼럼은 제외된다. 
SELECT AVG(sal), SUM(sal)/COUNT(*) FROM emp;
SELECT comm FROM emp;
SELECT AVG(comm), SUM(comm)/COUNT(comm), 
AVG(IFNULL(comm,0)), SUM(comm)/COUNT(*) FROM emp;

# MAX(칼럼명) => 최대값을 리턴한다.
SELECT MAX(sal) FROM emp;

# MIN(칼럼명) =>최소값을 리턴한다. 
SELECT MIN(sal) FROM emp;


#emp 테이블에서 부서번호와 부서별 급여의 총합을 출력

SELECT deptno, SUM(sal), COUNT(sal), AVG(sal), MAX(sal), MIN(sal)
FROM emp
GROUP BY deptno
ORDER BY deptno;

#emp 테이블에서 부서번호와 부서별 평균 급여를 출력. 
#단, 평균급여의 소수점이하 절삭
SELECT deptno,  floor(AVG(sal))
FROM emp
GROUP BY deptno;

#emp 테이블에서 부서번호와 부서별 평균 급여를 출력. 
#(반올림해서 소수 첫째 자리 까지만)

SELECT deptno, ROUND(AVG(sal), 1) 
FROM emp
GROUP BY deptno;

#emp 테이블에서 직업과 직업별 최대 급여를 출력.
SELECT job, MAX(sal)
FROM emp
GROUP BY job;

#emp 테이블에서 부서번호와 급여가 1000 이상인 사원들의 부서별 
#평균 급여의 반올림 값을 부서번호로 내림차순 정렬해서 출력. 
SELECT deptno, ROUND(AVG(sal))
FROM emp
WHERE sal >= 1000
GROUP BY deptno
ORDER BY deptno DESC;

#emp 테이블에서 부서번호와 급여가 2000 이상인 사원들의 부서별 
#평균 급여의 반올림 값을 평균 급여의 반올림 값으로 오름차순 
#정렬해서 출력

SELECT deptno, ROUND(AVG(sal)) avgsal
FROM emp
WHERE sal >= 2000
GROUP BY deptno
ORDER BY avgsal ASC;

#emp 테이블에서 각 부서별 같은 업무(job)를 하는 사람의 인원수를 
#구해서 부서번호, 업무(job), 인원수를 부서번호에 대해서 
#오름차순 정렬해서 출력

SELECT deptno, job, COUNT(*)
FROM emp
GROUP BY deptno, job
ORDER BY deptno ASC;

#emp 테이블에서 부서번호와 급여가 1000 이상인 사원들의 부서별 
#평균 급여를 출력. 
#단, 부서별 평균 급여가 2000 이상인 부서만 출력하세요. 

SELECT deptno, AVG(sal) avgsal
FROM emp
WHERE sal >= 1000
GROUP BY deptno
HAVING avgsal >= 2000;

#limt 시작위치(0부터 시작), 길이
SELECT empno, ename
FROM emp
ORDER BY empno ASC
LIMIT 0,20;


SELECT * FROM emp;
SELECT * FROM dept;


SELECT * FROM emp, dept;

SELECT empno, ename, dname , loc, emp.deptno
FROM emp, dept
WHERE dept.DEPTNO = emp.deptno;

#emp 테이블의 모든 사원들의 이름, 부서번호, 부서명을 출력
SELECT ename, dept.deptno, dname
FROM emp, dept
WHERE dept.deptno = emp.deptno;

#테이블에 별칭(alias) 를 붙인다면
SELECT ename, d.deptno, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno;

#join ~ on 표현식을 사용한다면

SELECT ename, d.deptno, dname
FROM emp e JOIN dept d
ON d.deptno = e.deptno;

#ANSI JOIN 표현식을 사용한다면
SELECT ename, d.deptno, dname
FROM emp e JOIN dept d
USING(deptno);


#급여가 3000 에서 5000 사이의 사원이름,급여, 부서명을 출력.
SELECT ename, sal, dname
FROM emp e, dept d
WHERE sal BETWEEN 3000 AND 5000 AND d.deptno = e.deptno;

#부서명이 'ACCOUNTING' 인 사원의 이름, 입사일, 부서번호, 
#부서명을 출력.
SELECT ename, date_format(hiredate,'%Y/%m/%d') hdate, 
d.deptno, dname
FROM emp e, dept d
WHERE dname='ACCOUNTING' AND d.deptno = e.deptno;

#커미션이 null 이 아닌 사원의 이름, 커미션, 입사일, 부서명을 출력. 
SELECT ename, comm, hiredate, dname
FROM emp e, dept d
WHERE comm IS NOT NULL AND d.deptno = e.deptno;

SELECT *
FROM emp
WHERE empno = 8000;

UPDATE emp
SET deptno = NULL
WHERE empno = 8000;

#사원번호, 이름, 부서번호,부서명을 출력하세요 
#단, 사원이 근무하지 않는 부서명도 같이 출력해보세요.

SELECT empno, ename, d.deptno, dname
FROM emp e LEFT join dept d
on d.deptno = e.deptno;

# 1. emp 테이블과 dept 테이블을 조인하여 
# 부서번호, 부서명, 이름, 급여를 출력
SELECT d.deptno , dname, ename, sal
FROM emp e , dept d
WHERE d.deptno = e.deptno;

# 2.사원의 이름이 'ALLEN' 인 사원의 이름과 부서명을 출력
SELECT ename, dname
FROM emp e, dept d
WHERE ename = 'ALLEN' AND d.deptno = e.deptno;

# 3.모든 사원의 이름, 부서번호, 부서명, 급여를 출력하세요. 
# 단, emp 테이블에 없는 부서도 출력 

SELECT ename, d.deptno, dname, sal
FROM emp e LEFT join dept d
ON d.deptno = e.deptno;

# 4.사원의 이름과 급여, 급여의 등급을 출력해 보세요
SELECT ename, sal, grade
FROM emp e, salgrade s
WHERE sal BETWEEN losal AND hisal;

# 5. 사원의 이름과, 부서명, 급여, 급여의 등급을 출력해 보세요
SELECT ename, dname, sal, grade
FROM emp e , dept d , salgrade s 
where d.deptno = e.deptno and sal BETWEEN losal AND hisal;


# 6. 사원의 이름과, 부서명, 급여, 급여의 등급을 출력해 보세요
# 단, emp 테이블에 없는 부서도 출력 
SELECT ename, dname, sal, grade
FROM emp e LEFT join dept d on d.deptno = e.deptno , salgrade s 
where sal BETWEEN losal AND hisal;
