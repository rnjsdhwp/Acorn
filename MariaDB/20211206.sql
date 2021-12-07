CREATE TABLE member(
num INT PRIMARY KEY,
NAME VARCHAR(50),
addr VARCHAR(50)
);

DESC member;

INSERT INTO member(num, NAME, addr) VALUES(1,'성영한','서울');
INSERT INTO member(num, NAME) VALUES(2,'손정의');
INSERT INTO member VALUES(3,'스티브잡스','미국');

SELECT num, NAME, addr
FROM member;

SELECT num, NAME
FROM member;

SELECT *
FROM member;

DELETE FROM member
WHERE num = 2;

UPDATE member
SET addr = '캐나다'
WHERE num = 3;

DESC dept;

SELECT deptno, dname, loc 
FROM dept;

DESC emp;

SELECT empno, ename, job, mgr, hiredate,sal, comm, deptno
FROM emp;


DESC salgrade;

SELECT grade, losal, hisal
FROM salgrade;

#emp 테이블에서 사원번호, 사원이름, 직업을 출력
SELECT empno, ename, job
FROM emp;

#emp 테이블에서 사원번호,급여,부서번호를 출력하세요. 
#단, 급여가 많은 순서대로 출력
SELECT empno, sal, deptno
FROM emp
ORDER BY sal DESC;

#emp 테이블 에서 사원번호,급여,입사일을 출력. 
#단,급여가 적은 순서대로. 
SELECT empno, sal, hiredate
FROM emp
ORDER BY sal ASC;

#emp 테이블에서 직업,급여를 출력. 
#단,직업명으로 오름차순, 급여로 내림차순 정렬해서
SELECT job, sal
FROM emp
ORDER BY job ASC , sal DESC;

#컬럼의 alias(별칭)  사용하기
SELECT empno AS 사원번호 , deptno AS 부서번호
FROM emp;

#컬럼의 alias(별칭)  사용하기
SELECT empno 사원번호 , deptno 부서번호
FROM emp;

#컬럼의 alias(별칭)  사용하기
SELECT empno '사원 번호', deptno '부서 번호'
FROM emp;

#emp 테이블에서 부서번호가 10 번인 사원들의 급여와 
#10% 인상된 금액 같이 출력
SELECT sal, sal*1.1
FROM emp
WHERE deptno = 10;

#emp 테이블에서 급여가 3000 이상인 사원들의 모든 정보를 출력.
SELECT *
FROM emp
WHERE sal >= 3000;

#emp 테이블에서 부서번호가 30번이 아닌 사람들의 
#이름과 부서번호를 출력.
SELECT ename, deptno
FROM emp
WHERE deptno != 30;

SELECT ename, deptno 
FROM emp
WHERE deptno <> 30;

#emp 테이블에서 부서번호가 10번이고 급여가 3000 이상인 
#사원들의 이름과 급여를 출력.
SELECT ename, sal
FROM emp
WHERE deptno = 10 AND sal >= 3000;


#emp 테이블에서 직업이 SALESMAN 이거나 MANAGER 인 
#사원의 사원번호와 부서번호, 직업을 출력
SELECT empno, deptno, job
FROM emp
WHERE job = 'SALESMAN' OR job = 'MANAGER';

#부서번호가 10번이거나 20번인 사원의 사원번호와 이름, 
#부서번호 출력 단, IN연산자를 이용

SELECT empno, ename, deptno
FROM emp
WHERE deptno IN(10,20);

#급여가 1000 과 2000 사이인 사원들의 
#사원번호,이름,급여를 출력.

SELECT empno, ename, sal
FROM emp
WHERE sal >= 1000 AND sal <= 2000;

SELECT empno, ename, sal
FROM emp
WHERE sal BETWEEN 1000 AND 2000;

#사원이름이 'FORD' 와 'SCOTT' 사이의 사원들의 
#사원번호,이름을 출력. 단, 사원이름으로 오름차순 정렬 

SELECT empno, ename
FROM emp
WHERE ename BETWEEN 'FORD' AND 'SCOTT'
ORDER BY ename ASC;

SELECT empno, ename
FROM emp
WHERE ename >= 'FORD' AND ename <= 'SCOTT'
ORDER BY ename ASC;

#사원이름이 'J' 로 시작하는 사원의 사원이름과 부서번호를 출력
SELECT ename, deptno
FROM emp
WHERE ename LIKE 'J%';

#사원이름이 'J' 를 포함하는 사원의 사원이름과 부서번호를 출력. 
SELECT ename, deptno
FROM emp
WHERE ename LIKE '%J%';

#사원이름의 두번째 글자가 'A' 인 사원의 이름,급여,입사일을 출력
SELECT ename, deptno
FROM emp
WHERE ename LIKE '_A%';

#사원 이름이 'ES' 로 끝나는 사원의 이름,급여,입사일을 출력.
SELECT ename, sal, hiredate
FROM emp
WHERE ename LIKE '%ES';

#입사년도가 1981년 인 사원들의 입사일과 사원번호를 출력.
SELECT empno, hiredate
FROM emp
WHERE hiredate LIKE '1981%';

#커미션이 NULL 인 사원의 사원이름과 커미션을 출력. 
SELECT ename, comm
FROM emp
WHERE comm IS NULL;


#커미션이 NULL 이 아닌 사원의 사원이름과 커미션을 출력.
SELECT ename, comm
FROM emp
WHERE comm IS NOT NULL;









