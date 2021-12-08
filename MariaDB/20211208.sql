#'SMITH' 가 근무하는 부서명을 서브쿼리를 이용해서 출력.

SELECT dname
FROM emp e, dept d
WHERE ename = 'SMITH' AND d.deptno = e.deptno;

SELECT dname
FROM dept
WHERE deptno = (SELECT deptno FROM emp WHERE ename = 'SMITH');

#'ALLEN' 과 같은 부서에서 근무하는 사원의 이름과 부서의 번호를 출력. 

SELECT deptno
FROM emp
WHERE ename = 'ALLEN';

SELECT ename, deptno
FROM emp
WHERE deptno = 30;

SELECT ename, deptno
FROM emp
WHERE deptno = (SELECT deptno FROM emp  WHERE ename = 'ALLEN');

#'ALLEN' 과 동일한 직책(job) 을 가진 사원의 사번과 이름, 직책을 출력. 

SELECT job
FROM emp
WHERE ename = 'ALLEN';

SELECT empno, ename, job
FROM emp
WHERE job = 'SALESMAN';

SELECT empno, ename, job
FROM emp
WHERE job = (SELECT job FROM emp WHERE ename='ALLEN');

#'ALLEN' 의 급여와 동일하거나 더 많이 받는 사원의 이름과 급여를 출력

SELECT ename, sal
FROM emp
WHERE sal >= (SELECT sal FROM emp WHERE ename='ALLEN');

#'DALLAS' 에서 근무하는 사원의 이름, 부서번호를 출력

SELECT ename, deptno
FROM emp
WHERE deptno = (SELECT deptno FROM dept WHERE loc='DALLAS');

#'SALES' 부서에서 근무하는 모든 사원의 이름과 급여를 출력.

SELECT ename, sal
FROM emp
WHERE deptno = (SELECT deptno FROM dept WHERE dname='SALES');

# 자신의 직속 상관이 'KING' 인 사원의 이름과 급여를 출력해 보세요.

SELECT empno
FROM emp
WHERE ename = 'KING';

SELECT ename, sal
FROM emp
WHERE mgr = '7839';

SELECT ename, sal
FROM emp
WHERE mgr = (SELECT empno FROM emp WHERE ename='KING');

# 급여를 3000 이상받는 사원이 소속된 부서와 동일한 부서에서 근무하는 
# 사원들의이름과 급여, 부서번호를 출력

SELECT deptno
FROM emp
WHERE sal >= 3000;

SELECT ename, sal, deptno
FROM emp
WHERE deptno IN ( 10,20 ) ;

SELECT ename, sal , deptno
FROM emp
WHERE deptno IN (SELECT deptno FROM emp where sal >= 3000);

# IN 연산자를 이용하여 부서별로 가장 급여를 많이 받는 사원의 
# 사원번호, 급여, 부서번호를 출력

SELECT MAX(sal)
FROM emp
GROUP BY deptno;

SELECT empno, sal, deptno
FROM emp
WHERE sal IN (4000,5000,3000,2850);

SELECT empno, sal, deptno
FROM emp
WHERE sal IN (SELECT MAX(sal) FROM emp GROUP BY deptno);

#직업이 MANAGER 인 사원이 속한 부서의 부서번호와 부서명과 부서의 위치를 출력

SELECT deptno
FROM emp
WHERE job = 'MANAGER';

SELECT deptno, dname, loc
FROM dept
WHERE deptno IN (10,20,30);

SELECT deptno, dname, loc
FROM dept
WHERE deptno IN (SELECT deptno FROM emp WHERE job = 'MANAGER');

# 직업이 'SALESMAN' 보다 급여를 많이 받는 사원들의 이름과 급여를 출력 
# (ANY 연산자 이용)

SELECT sal
FROM emp
WHERE job = 'SALESMAN';

SELECT ename, sal
FROM emp
WHERE sal > (SELECT MIN(sal) FROM emp WHERE job = 'SALESMAN');

# any() : 서브쿼리에서 리턴되는 어떠한 값이라도 만족하면 조건이 성립된다. 
SELECT ename, sal
FROM emp
WHERE sal > ANY(SELECT sal FROM emp WHERE job = 'SALESMAN');

# all() :  서브쿼리에서 리턴되는 모든 값을 만족하면 조건이 성립된다.
# job이 analyst인 모든 사원보다 급여를 많이 받는 타 업무의 
# 사원번호, 사원이름, 직업, 급여를 출력

SELECT empno, ename, job, sal
FROM emp
WHERE sal > ALL(SELECT sal FROM emp where job='ANALYST');

#EMPNO : 8001 , ENAME : CHOI , JOB : SALESMAN, MGR : 7900
#HIREDATE : 오늘 , SAL : 2000, COMM : 100 , DEPTNO : 40 

INSERT INTO emp(empno,ename,job,mgr,hiredate,sal,comm,deptno)
VALUES(8001,'CHOI','SALESMAN',7900,NOW(), 2000, 100,40);

SELECT * FROM emp;

# 테이블 삭제
DROP TABLE member;

CREATE TABLE member(
num INT PRIMARY KEY,
NAME VARCHAR(30),
address VARCHAR(50)
);

DESC member;

INSERT INTO member(num, NAME, address) VALUES(1,'성영한','서울');
INSERT INTO member VALUES(2,'손정의','일본');
INSERT INTO member VALUES(3, '잡스','미국');

SELECT num, NAME, address
FROM member;

#member 테이블의 내용중 num 칼럼이 3 인 회원의 주소를 
#한국 으로 수정. 
UPDATE member
SET address = '한국'
WHERE num = 3;

SELECT num, NAME, address
FROM member;

#member 테이블 내용중 num 칼럼이 2인 회원의 이름과 주소를 
#'son' , 'jp' 으로 바꾸기

UPDATE member
SET NAME='son', address='jp'
WHERE num = 2;

SELECT num, NAME, address
FROM member;

# member 테이블에서 주소가 '서울' 인 회원의 정보를 삭제
DELETE FROM member
WHERE address = '서울';

SELECT num, NAME, address
FROM member;

START TRANSACTION;
INSERT INTO member VALUES(4,'이름4','주소4');
INSERT INTO member VALUES(5,'이름5','주소5');
INSERT INTO member VALUES(6,'이름6','주소6');
COMMIT;


SELECT num, NAME, address
FROM member;

START TRANSACTION;
INSERT INTO member VALUES(10,'이름10','주소10');
INSERT INTO member VALUES(11,'이름11','주소11');
INSERT INTO member VALUES(12,'이름12','주소12');
COMMIT;


SELECT * FROM member;

CREATE TABLE dept2(
deptno INT PRIMARY KEY,
dname VARCHAR(15) UNIQUE DEFAULT '영업부',
loc CHAR(1) NOT NULL CHECK(loc IN('1','2'))
);

INSERT INTO dept2(deptno, dname,loc) VALUES(1,'총무부','1');
INSERT INTO dept2(deptno, dname,loc) VALUES(2,'개발부','1');
INSERT INTO dept2(deptno, dname,loc) VALUES(3,NULL,'2');
INSERT INTO dept2(deptno, dname,loc) VALUES(4,'기획부','3');
INSERT INTO dept2(deptno, dname,loc) VALUES(5,'인사부','1');
INSERT INTO dept2(deptno, dname,loc) VALUES('6','마케팅부','1');
INSERT INTO dept2(deptno,loc) VALUES(7,'1');
SELECT * FROM dept2;

SELECT * FROM emp;

DESC dept2;

#부모키/외래키 만들어보기
CREATE TABLE dept3(
deptno INT PRIMARY KEY,
dname VARCHAR(15) NOT null
);

CREATE TABLE emp3(
empno INT PRIMARY KEY,
ename VARCHAR(15) NOT NULL,
deptno INT,
FOREIGN KEY(deptno) REFERENCES dept3(deptno)
);

INSERT INTO dept3(deptno,dname) VALUES(10,'부서1');
INSERT INTO dept3(deptno,dname) VALUES(20,'부서2');
INSERT INTO dept3(deptno,dname) VALUES(30,'부서3');
SELECT * FROM dept3;

INSERT INTO emp3(empno,ename,deptno) VALUES(1,'이름1',10);
INSERT INTO emp3(empno,ename,deptno) VALUES(2,'이름2',20);
INSERT INTO emp3(empno,ename,deptno) VALUES(3,'이름3',30);
INSERT INTO emp3(empno,ename,deptno) VALUES(4,'이름3',40);
SELECT * FROM emp3;

#칼럼  추가, 수정,이름 바꾸기, 삭제
CREATE TABLE test(
num INT
);

#칼럼 추가
ALTER TABLE test ADD(NAME VARCHAR(10));

#칼럼 수정
ALTER TABLE test MODIFY NAME VARCHAR(50);

#칼럼 이름 바꾸기
ALTER TABLE test CHANGE NAME myname VARCHAR(50);

#칼럼 삭제
ALTER TABLE test DROP myname;

DESC test;

DESC dept;
#테이블 복사하기1
CREATE TABLE dept4(
deptno TINYINT,
dname VARCHAR(14),
loc VARCHAR(13)
);

INSERT INTO dept4 SELECT * FROM dept;

SELECT * FROM dept4;

#테이블 복사하기2 - 테이블생성(O) , 데이터복사(O) 
#제약조건은 복사가 안됨
CREATE TABLE dept5 AS SELECT * FROM dept;

SELECT * FROM dept5;

DESC dept;
DESC dept5;

#테이블 복사하기3 - 테이블생성(O) , 데이터복사(X)
CREATE TABLE dept6 AS SELECT * FROM dept WHERE 1=2;
SELECT * FROM dept6;
