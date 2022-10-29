# JavaWeb_Demo


These are some simple demos for java_web learning


## [SSM](https://github.com/kokono9201/JavaWeb_Demo/tree/master/SSM)<br>
A simple order system as Hello, and get familiar with git and using IDEA.<br>
A simple project managed by Maveon.
Frame: Spring + SpringMVC + Mybatis
Simple CURD and page function
DB: mySQL 5.8
<details><summary>Screenshot</summary><pre>
<img src="https://github.com/kokono9201/JavaWeb_Demo/blob/master/IMG/img.png?raw=true"/>
</pre></details>
<details><summary>DB Structure</summary><pre>
CREATE TABLE `t_emp` (
  `emp_id` int unsigned NOT NULL AUTO_INCREMENT,
  `emp_name` char(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `age` int DEFAULT NULL,
  `gender` varchar(1) DEFAULT NULL,
  `email` char(50) DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
</pre></details>

