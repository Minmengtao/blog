# 项目开发文档
这是第一个SpringBoot项目练习，是按照[模版](https://github.com/ZHENFENG13/My-Blog)来写的

运行效果(http://13blog.site/)

该项目主要分成前端和后端，项目有两个角色（游客和管理员），所以浏览器输入url地址后直接出现个人博客，而后端只需要设计管理员角色即可

下面分成几个部分来设计系统

## 1.数据库设计

|  表头   | 表头  |
|  ----  | ----  |
| 单元格  | 单元格 |
| 单元格  | 单元格 |

|  表头   | 表头  |
|  ----  | ----  |
| 单元格  | 单元格 |
| 单元格  | 单元格 |

...

## 2.具体设计
现在需要重数据库中查询博客列表Blog，我并不需要直接知道所有的信息（`即PO，PO是相当于数据库中的一张表`），所以运用VO来进行业务层之间的数据传递(`VO则是抽取部分PO信息组成新的类，根据业务的需求，可以跟数据库表对应`)
 
## 3.额外拓展
在VO设计中出现了类实现了Serializable接口

**Question:** java实体对象为什么一定要实现Serializable接口(也就是序列化)

**Answer:** 这样做有两个原因

`1.将对象的状态通过ObjectOutputStream转换为字节流，以后想要在用则通过ObjectInputStream解析为对象即可，实现深拷贝
`

`2.按值将对象从一个应用程序域发送至另一个应用程序域
`

所以在分布式应用中及设计数据持久化的场景中，你就得实现序列化。

**每个实体Bean并不需要都实现序列化，只要bean是否需要持久化存储媒体中以及是否需要传输给另一个应用** 


# 延伸阅读

### 1.个人论文研读
- 图论方向
1. [ExactSim](https://github.com/Minmengtao/ApproximateSimRank)
- machine learning

- 

### 2.日常刷题代码
- [oj](https://github.com/Minmengtao/postgraduateEntrance)
