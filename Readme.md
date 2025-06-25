这是一个小博客项目，支持增加，删除和获取信息。

html文件在html文件夹内

实现了前后端分离，使用了数据库连接池，可实现高并发

html文件需要跟据自己的部署环境进行一定的修改

本项目内的html文件的运行情况是在本机上测试的，

如果要部署到服务器，需要对nginx进行反向代理设置或对html文件进行绝对url访问

由于该项目没有对访问频率和大小进行限制，这只是一个临时项目（我只花了几个小时而已，没有进一步完善的打算）
因此该项目易受到DDos攻击

后续在暑假的时候有空的话可能会继续完善项目

因此本项目不会开放demo，需要的请自行部署到自己的服务器上

本项目的后端运行在8080端口， 若更改请移至src/main/resources/application.yml进行更改

数据库blog内的info表结构：

CREATE TABLE `info` (
`id` int NOT NULL AUTO_INCREMENT,
`info` text,
PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 6 DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci


This is a small blog project that supports adding, deleting, and retrieving information.

The HTML file is located in the HTML folder

Implemented front-end and back-end separation, utilized database connection pool, and achieved high concurrency

The HTML file needs to be modified according to its own deployment environment

The running status of the HTML files in this project was tested on the local machine,

If you want to deploy to a server, you need to perform reverse proxy settings on nginx or absolute URL access on HTML files

Due to the lack of restrictions on access frequency and size in this project, it is only a temporary project (I only spent a few hours and have no plans to further improve it)
Therefore, this project is vulnerable to DDoS attacks

Therefore, this project will not open a demo, please deploy it to your own server if needed

The backend of this project runs on port 8080. If there are any changes, please move to src/main/resources/application.yml for modification

The info table structure within the database blog:

CREATE TABLE `info` (
`id` int NOT NULL AUTO_INCREMENT,
`info` text,
PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 6 DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci
