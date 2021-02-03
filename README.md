# 简单工厂

![simple](screenshot/simple.png)

# 抽象工厂

![abstract](screenshot/abstract.png)
ICacheAdapter ，定义了适配接⼝，分别包装两个集群中差异化的接⼝名称。 EGMCacheAdapter 、 IIRCacheAdapter

JDKProxy 、 JDKInvocationHandler ，是代理类的定义和实现，这部分也就是抽象⼯⼚的另外⼀种实现⽅式。通过这样的⽅式可以很好的把原有操作Redis的⽅法进⾏代理操作，通过控制不同的⼊参对象，控制缓存的使⽤。

# 建造者模型结构

![builder](screenshot/builder.png)
Builder ，建造者类具体的各种组装由此类实现。

DecorationPackageMenu ，是IMenu 接⼝的实现类，主要是承载建造过程中的填充器。相当于这是⼀套承载物料和创建者中间衔接的内容。

# 适配器模型结构

![adapter](screenshot/adapter.png)

# 桥接模式模型结构

![bridge.png](screenshot/bridge.png)

# 组合模式模型结构

![combination](screenshot/combination.png)

# 装饰器模式模型结构

![decorator](screenshot/decorator.png)

# ⻔⾯模式模型结构

![facade](screenshot/facade.png)