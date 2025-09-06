
--Let's create a table named employee in your test database with column information id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100).
CREATE TABLE employee(
   id SERIAL PRIMARY KEY,
   name VARCHAR(50) NOT NULL,
   birthday DATE,
   email VARCHAR(100)
);

SELECT * FROM employee

--Let's add 50 pieces of data to the employee table we created using the 'Mockaroo' service.
INSERT INTO employee (id, name, birthday, email) VALUES
(1, 'John Doe', '1985-03-15', 'john.doe@example.com'),
(2, 'Jane Smith', '1990-07-22', 'jane.smith@example.com'),
(3, 'Michael Brown', '1978-11-30', 'michael.brown@example.com'),
(4, 'Emily Davis', '1995-02-10', 'emily.davis@example.com'),
(5, 'William Johnson', '1982-09-05', 'william.johnson@example.com'),
(6, 'Sarah Wilson', '1988-04-18', 'sarah.wilson@example.com'),
(7, 'David Martinez', '1992-12-25', 'david.martinez@example.com'),
(8, 'Laura Taylor', '1980-06-14', 'laura.taylor@example.com'),
(9, 'James Anderson', '1975-08-20', 'james.anderson@example.com'),
(10, 'Lisa Thomas', '1993-01-07', 'lisa.thomas@example.com'),
(11, 'Robert Jackson', '1987-05-12', 'robert.jackson@example.com'),
(12, 'Mary White', '1991-10-03', 'mary.white@example.com'),
(13, 'Thomas Harris', '1983-03-29', 'thomas.harris@example.com'),
(14, 'Patricia Lewis', '1979-07-17', 'patricia.lewis@example.com'),
(15, 'Charles Walker', '1986-11-11', 'charles.walker@example.com'),
(16, 'Jennifer Hall', '1994-04-22', 'jennifer.hall@example.com'),
(17, 'Christopher Allen', '1981-08-09', 'christopher.allen@example.com'),
(18, 'Susan Young', '1990-02-14', 'susan.young@example.com'),
(19, 'Mark King', '1984-06-30', 'mark.king@example.com'),
(20, 'Linda Wright', '1977-12-01', 'linda.wright@example.com'),
(21, 'Steven Scott', '1989-09-15', 'steven.scott@example.com'),
(22, 'Nancy Green', '1995-05-20', 'nancy.green@example.com'),
(23, 'Paul Adams', '1982-03-10', 'paul.adams@example.com'),
(24, 'Karen Nelson', '1988-07-25', 'karen.nelson@example.com'),
(25, 'Daniel Carter', '1976-11-18', 'daniel.carter@example.com'),
(26, 'Betty Mitchell', '1993-04-05', 'betty.mitchell@example.com'),
(27, 'George Perez', '1985-08-12', 'george.perez@example.com'),
(28, 'Maria Roberts', '1991-02-28', 'maria.roberts@example.com'),
(29, 'Edward Turner', '1979-06-15', 'edward.turner@example.com'),
(30, 'Margaret Phillips', '1987-10-20', 'margaret.phillips@example.com'),
(31, 'Joseph Campbell', '1983-01-09', 'joseph.campbell@example.com'),
(32, 'Ruth Parker', '1990-05-14', 'ruth.parker@example.com'),
(33, 'Kenneth Evans', '1986-09-30', 'kenneth.evans@example.com'),
(34, 'Helen Edwards', '1994-03-22', 'helen.edwards@example.com'),
(35, 'Brian Collins', '1981-07-10', 'brian.collins@example.com'),
(36, 'Diane Stewart', '1989-11-05', 'diane.stewart@example.com'),
(37, 'Patrick Sanchez', '1978-04-18', 'patrick.sanchez@example.com'),
(38, 'Martha Morris', '1992-08-25', 'martha.morris@example.com'),
(39, 'Timothy Reed', '1984-12-12', 'timothy.reed@example.com'),
(40, 'Deborah Cook', '1990-06-30', 'deborah.cook@example.com'),
(41, 'Jason Morgan', '1987-02-15', 'jason.morgan@example.com'),
(42, 'Shirley Bell', '1983-10-20', 'shirley.bell@example.com'),
(43, 'Henry Rivera', '1979-05-05', 'henry.rivera@example.com'),
(44, 'Carolyn Brooks', '1991-09-12', 'carolyn.brooks@example.com'),
(45, 'Ronald Ward', '1985-03-28', 'ronald.ward@example.com'),
(46, 'Katherine Cox', '1993-07-17', 'katherine.cox@example.com'),
(47, 'Arthur Bailey', '1980-11-11', 'arthur.bailey@example.com'),
(48, 'Cynthia Howard', '1988-04-22', 'cynthia.howard@example.com'),
(49, 'Dennis Price', '1977-08-09', 'dennis.price@example.com'),
(50, 'Rachel Gray', '1994-12-01', 'rachel.gray@example.com');


--Let's perform 5 UPDATE operations for each column, which will update the other columns.
UPDATE employee
SET name = 'John Updated', birthday = '1985-01-01', email = 'john.updated@example.com'
WHERE id=1;


UPDATE employee
SET id = 51, birthday = '1990-01-01', email = 'jane.updated@example.com'
WHERE name = 'Jane Smith';


UPDATE employee
SET name = 'Michael Updated', email = 'michael.updated@example.com'
WHERE birthday = '1978-11-30';


UPDATE employee
SET name = 'Emily Updated', birthday = '1995-01-01'
WHERE email = 'emily.davis@example.com';


UPDATE employee
SET email = 'william.updated@example.com'
WHERE id = 5;

SELECT * FROM employee;

--Let's perform 5 DELETE operations to delete the relevant row for each column.
DELETE FROM employee
WHERE id = 6;

DELETE FROM employee
WHERE name = 'Charles Walker';

DELETE FROM employee
WHERE birthday = '1977-12-01';


DELETE FROM employee
WHERE email = 'patricia.lewis@example.com';

DELETE FROM employee
WHERE id = 34;

SELECT * FROM employee;