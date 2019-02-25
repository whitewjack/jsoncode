
## 为什么要做jsoncode

在json的处理世界中我们常见的使用包有几个，其中大家用的fastjson号称性能最高的一款。但是我们在拿到一个json字符串后，
发现如果使用fastjson进行解析会需要定义若干的class进行匹配，在json中如果仅需要获取其中一个字段，或若干层后的某个字段的时候
需要做的工作就会更多。这个时候我们的需求就是简单的获取其中的一个值咋办，我们可以看看下面的例子。


## 我们的例子

json字符串：
```
{"ss":{"sss":"vvvvv","city":{"name":"上海","list":["1","eeee","33vsvg"]}}}
```
如果我们在实际使用中仅使用这个字符串中的城市名字的字段，其他都不需要，我们应该怎么处理。
我们的方式是这样的：
```
String code = JsonCode.getValue(json,"$.ss.city.name");
```
这个时候code的值就是上海。我们仅通过一条语句就可以实现我们要获取的内容。


## 包的使用（MAVEN）
```
<dependency>
  <groupId>cn.miludeer</groupId>
  <artifactId>jsoncode</artifactId>
  <version>1.1</version>
</dependency>
```
