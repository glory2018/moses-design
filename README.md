# 模型结构

## 抽象工厂

![abstract](screenshot/abstract.png)
ICacheAdapter ，定义了适配接⼝，分别包装两个集群中差异化的接⼝名称。 EGMCacheAdapter 、 IIRCacheAdapter

JDKProxy 、 JDKInvocationHandler ，是代理类的定义和实现，这部分也就是抽象⼯⼚的另外⼀种实现⽅式。通过这样的⽅式可以很好的把原有操作Redis的⽅法进⾏代理操作，通过控制不同的⼊参对象，控制缓存的使⽤。

## 适配器

![adapter](screenshot/adapter.png)

## 桥接模式

![bridge.png](screenshot/bridge.png)

## 组合模式

![combination](screenshot/combination.png)

## 装饰器模式

![decorator](screenshot/decorator.png)

## ⻔⾯模式

![facade](screenshot/facade.png)

## 享元模式

![flyweight.png](screenshot/flyweight.png)

## 代理模式中间件

![proxy.png](screenshot/proxy.png)

## 责任链模式

![responsibility.png](screenshot/responsibility.png)

## 命令模式

![command.png](screenshot/command.png)

## 迭代器模式

![iterator.png](screenshot/iterator.png)

## 中介者模式

![mediator.png](screenshot/mediator.png)
##备忘录模式
![memento.png](screenshot/memento.png)
##观察者模式
![observer.png](screenshot/observer.png)
##状态模式
![state.png](screenshot/state.png)
##策略模式
![strategy.png](screenshot/strategy.png)
