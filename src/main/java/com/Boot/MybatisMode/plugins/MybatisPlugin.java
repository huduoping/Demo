package com.Boot.MybatisMode.plugins;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.util.Properties;

/**
 * @author 24649
 * mybatis分页插件
 */

@Intercepts({@Signature(type= StatementHandler.class,method="parameterize",args=java.sql.Statement.class)})
public class MybatisPlugin implements Interceptor {
    /**
     * 拦截目标方法
     * @param invocation
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("MybatisPlugin...intercept"+invocation.getMethod());
        //拿到target的元数据
        MetaObject forObject = SystemMetaObject.forObject(invocation.getTarget());

        int offset = (int)forObject.getValue("parameterHandler.parameterObject.offset");
        int limit = (int)forObject.getValue("parameterHandler.parameterObject.limit");

        System.out.println("offset======"+offset);
        System.out.println("limit======"+limit);

        offset=limit*offset-limit;
        //设置修改后的sql语句
        forObject.setValue("delegate.rowBounds.offset",offset);
        forObject.setValue("delegate.rowBounds.limit",limit);

        //执行目标方法
        Object proceed = invocation.proceed();
        //返回执行后的返回值
        return proceed;

    }

    /**
     * 为目标对象创建代理对象
     * @param target
     * @return
     */
    @Override
    public Object plugin(Object target) {
        System.out.println("MybatisPlugin...plugin"+target.toString());

        //我们可以使用Plugin.wrap方法来使用Interceptor包装我们目标对象
        Object wrap = Plugin.wrap(target, this);
        //返回为当前target创建的动态代理对象
        return wrap;

    }

    @Override
    public void setProperties(Properties properties) {

    }
}
