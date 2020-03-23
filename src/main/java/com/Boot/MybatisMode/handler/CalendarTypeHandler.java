package com.Boot.MybatisMode.handler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.*;
import java.util.Calendar;

/**
 * mybatis 自定义类型转换器,Mybatis默认不支持Calendar
 */

public class CalendarTypeHandler implements TypeHandler<Calendar> {

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, Calendar calendar, JdbcType jdbcType) throws SQLException {
        preparedStatement.setTimestamp(i,new Timestamp(calendar.getTimeInMillis()));
    }

    @Override
    public Calendar getResult(ResultSet resultSet, String s) throws SQLException {
        resultSet.getTimestamp(s);
        return null;
    }

    @Override
    public Calendar getResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public Calendar getResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
