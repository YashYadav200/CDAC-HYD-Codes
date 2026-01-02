CREATE TABLE students (
  student_id INT PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  email VARCHAR(100) UNIQUE,
  marks DECIMAL(5,2),
  age INT CHECK (age >= 0),
  city VARCHAR(50) DEFAULT 'Pune',
  admission_date DATE
);

INSERT INTO students VALUES
(1, 'Yash', 'yash@gmail.com', 85.66, 21, 'Mumbai', '2024-10-10'),
(2, 'Riya', 'riya@gmail.com', 65.25, 20, 'Pune', '2024-09-25'),
(3, 'Amit', 'amit@gmail.com', 90.50, 22, 'Delhi', '2024-11-01'),
(4, 'Sneha', 'sneha@gmail.com', 45.00, 19, 'Pune', '2024-10-15'),
(5, 'Raj', 'raj@gmail.com', 72.80, 23, 'Chennai', '2024-08-30');
drop table students;


INSERT INTO employees VALUES
(1, 'Yash', '2021-06-15', 40000.00),
(2, 'Riya', '2022-02-10', 35000.00),
(3, 'Amit', '2020-12-01', 50000.00);

Select name, UPPER(name) As UpperName from students;
Select name, length(name) As NameLength from students;
Select email, length(email) As emailLength from students;
Select name , substring(name,2,4)  as new , upper( concat(name, ' - ', city)),upper(substring(name,2,4)) as UPNAME from students; 
Select name, city, concat(name, ' - ', city) As Joined  from students;

truncate table students;
select name, marks , round(marks) as RoundedMarks from students;
select name, marks , ceil(marks) as FinalMarks from students;
select name, marks,abs(marks - 88) as Difff from students;
select marks,floor(marks) as Floor_Marks from students;
SELECT CURDATE();
CREATE TABLE employees (
  emp_id INT,
  name VARCHAR(50),
  join_date DATE,
  salary DECIMAL(10,2)
);
select name, join_date, curdate() as Present from employees;
select now();
