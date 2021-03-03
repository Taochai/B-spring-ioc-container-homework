@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

因为@bean是自己返回一个对象作为被ioc管理的bean。可以根据逻辑来自己定义对象的参数。
并且想对第三方类进行ioc管理的时候，没有源代码就没法使用@Component。