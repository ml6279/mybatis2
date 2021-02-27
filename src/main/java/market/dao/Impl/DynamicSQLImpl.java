package market.dao.Impl;

import market.Utils.MybatisFactory;
import market.dao.DynamicSQL;
import market.entity.Batis;
import market.entity.EasybuyOrder;
import market.entity.NewsUser;
import org.apache.ibatis.session.SqlSession;
import java.util.*;

public class DynamicSQLImpl implements DynamicSQL {
    @Override
    public List<EasybuyOrder> queryOrder1(Map<String, Object> where) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            return ds.queryOrder1(where);
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public List<EasybuyOrder> queryOrder2(Map<String, Object> where) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            return ds.queryOrder2(where);
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public void updateOrder(EasybuyOrder order) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            ds.updateOrder(order);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public List<EasybuyOrder> queryOrder3(Map<String, Object> where) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            return ds.queryOrder3(where);
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public void updateOrder1(EasybuyOrder order) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            ds.updateOrder1(order);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public List<EasybuyOrder> queryOrder4(Map<String, Object> where) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            return ds.queryOrder4(where);
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public List<EasybuyOrder> queryOrder5(Object[] where) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            return ds.queryOrder5(where);
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public List<EasybuyOrder> queryOrder6(List<Object> list) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            return ds.queryOrder6(list);
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public List<EasybuyOrder> queryOrder7(Map<String, Object> where) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            return ds.queryOrder7(where);
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public void addRecordBatch(List<NewsUser> list) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            ds.addRecordBatch(list);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public void addRecordBatch1(List<Batis> list) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            DynamicSQL ds = sqlSession.getMapper(DynamicSQL.class);
            ds.addRecordBatch1(list);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }


    public static void main(String[] args) {
        DynamicSQL ds = new DynamicSQLImpl();
        //if
        /*Map<String,Object> map = new HashMap<>();
        map.put("loginName","凤姐");
        map.put("serialNumber","111111111");
        System.out.println(ds.queryOrder1(map));*/

        //if where
        /*Map<String,Object> map = new HashMap<>();
        map.put("loginName","凤姐");
        map.put("serialNumber","111111111");
        System.out.println(ds.queryOrder2(map));*/

        //set if
        /*EasybuyOrder easybuyOrder = new EasybuyOrder();
        easybuyOrder.setLoginName("王婆");
        easybuyOrder.setId(1);
        ds.updateOrder(easybuyOrder);*/

        //trim 替代 where 和 if 连用
        /*Map<String,Object> map = new HashMap<>();
        map.put("loginName","李伟");
        map.put("serialNumber","111111111");
        map.put("from",0);
        map.put("pageSize",5);
        System.out.println(ds.queryOrder3(map));*/

        //trim 替代 set 和 if 连用
        /*EasybuyOrder easybuyOrder = new EasybuyOrder();
        easybuyOrder.setLoginName("李伟");
        easybuyOrder.setId(1);
        ds.updateOrder1(easybuyOrder);*/

        //choose
        /*Map<String,Object> map = new HashMap<>();
        map.put("loginName","李伟");
        map.put("serialNumber","111111111");
        System.out.println(ds.queryOrder4(map));*/

        ////foreach 常用数组去传递条件值
        /*String[] where = new String[1];
        where[0] = "李伟";
        System.out.println(ds.queryOrder5(where));*/

        //foreach 用list去传递条件值
        /*List<Object> list = new ArrayList<>();
        list.add("李伟");
        ds.queryOrder6(list);
        System.out.println(list);*/

        //foreach map 使用list去传递条件值
        /*Map<String,Object> where = new HashMap<>();
        where.put("ctime","2020-04-01");
        List<String> list = new ArrayList<>();
        list.add("凤姐");
        list.add("王婆");
        where.put("list",list);
        List<EasybuyOrder> list1 = ds.queryOrder7(where);
        System.out.println(list1);*/

        //批量插入
        /*List<NewsUser> list = new ArrayList<>();
        list.add(new NewsUser("张三","1111"));
        list.add(new NewsUser("王五","2222"));
        ds.addRecordBatch(list);*/

        //批量插入
        /*List<Batis> list = new ArrayList<>();
        list.add(new Batis(10,"王五",new Date(),"周一"));
        list.add(new Batis(11,"王五",new Date(),"周二"));
        ds.addRecordBatch1(list);*/



    }
}
