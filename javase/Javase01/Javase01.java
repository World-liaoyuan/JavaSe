
// 本文主要是讲Java的注释

// 单行注释
/*
    多行注释
    多行注释
    多行注释
 */

/**
 文档注释,通过应用场合：对整个类、整个方法的注释
 生成帮助文档：javadoc -d abc 【-author -version】 源文件名.java
 */

// 常量

//概念：在程序执行的过程中，其值不可以发生改变的量
//        分类：
//        自定义常量：final关键字的时候，在讲
//        字面值常量(数据类型)：
//        整数(整数常量)： 1 2 3 12 45 100 102  ....
//        小数(浮点常量):  1.5   1.4   234.567   ....
//        字符(字符常量)： 'a' '1' '*' '尚' ' ' ....  单引号中有且只有一个字符(没有不行，有多个也不行)
//        字符串(字符串常量):  "任意内容"  "10"  "12.5"  ""空串  "       "   "091"  null ...
//        布尔(布尔常量)： 判断题的答案  对、成立、真 --> true    错、不成立、假  -->  false
//        空常量：  null -> 空      "" -> 空串   " " -> 空格   "null" -> 字符串
//        空格要么在字符中，要么在字符串中
//        使用：
//        通过输出语句使用


// 标识符,最好是具体含义,实在不行百度翻译
//	在程序开发过程中，需要自己创建大量的标识符
//            标识符的命名规则：(必须遵守)
//            a. 字母、数字、符号组成
//            b. 符号只有两个$和_
//            c. 数字不能作为开头
//            d. 不能使用java中的关键字和保留字
//            e. 不能有空格、区分大小写   Hello 和 hello 是不一样的


// 标识符的命名规范
//标识符的命名规范：(建议遵守)
//        a. 见名知意
//        a.1 类名和接口名
//        每个单词的首字母都大写，形式：XxxYyyZzz   驼峰式命名法
//        a.2 变量名和方法名
//        a.3 包名
//        a.4 常量名