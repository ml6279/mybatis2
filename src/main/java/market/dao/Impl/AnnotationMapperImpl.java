package market.dao.Impl;

import market.Utils.MybatisFactory;
import market.dao.AnnotationMapper;
import market.dao.DynamicSQL;
import market.entity.EasybuyOrder;
import market.entity.NewsUser;
import market.entity.OrderDesc;
import market.entity.OrderDetail;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnnotationMapperImpl implements AnnotationMapper {
    @Override
    public void addUser(NewsUser user) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            AnnotationMapper ds = sqlSession.getMapper(AnnotationMapper.class);
             ds.addUser(user);
             sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public void modifyUser(NewsUser user) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            AnnotationMapper ds = sqlSession.getMapper(AnnotationMapper.class);
            ds.modifyUser(user);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public void removeUser(int id) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            AnnotationMapper ds = sqlSession.getMapper(AnnotationMapper.class);
            ds.removeUser(id);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public int addUser1(NewsUser user) {
        SqlSession sqlSession = null;
        int row = -1;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            AnnotationMapper ds = sqlSession.getMapper(AnnotationMapper.class);
           row = ds.addUser1(user);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return row;
    }

    @Override
    public NewsUser getUser(Map<String, Object> where) {
        SqlSession sqlSession = null;
        NewsUser user = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            AnnotationMapper ds = sqlSession.getMapper(AnnotationMapper.class);
            user = ds.getUser(where);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return user;
    }

    @Override
    public NewsUser getUser1(String name, String password) {
        SqlSession sqlSession = null;
        NewsUser user = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            AnnotationMapper ds = sqlSession.getMapper(AnnotationMapper.class);
            user = ds.getUser1(name,password);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return user;
    }

    @Override
    public List<Map<String, Object>> queryOrderDetail() {
        SqlSession sqlSession = null;
        List<Map<String,Object>> where = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            AnnotationMapper ds = sqlSession.getMapper(AnnotationMapper.class);
            where = ds.queryOrderDetail();
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return where;
    }

    @Override
    public OrderDesc findDescById(int id) {
        SqlSession sqlSession = null;
        OrderDesc orderDesc = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            AnnotationMapper ds = sqlSession.getMapper(AnnotationMapper.class);
            orderDesc = ds.findDescById(id);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return orderDesc;
    }

    @Override
    public List<EasybuyOrder> queryOrderDetail1() {
        SqlSession sqlSession = null;
        List<EasybuyOrder> where = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            AnnotationMapper ds = sqlSession.getMapper(AnnotationMapper.class);
            where = ds.queryOrderDetail1();
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return where;
    }

    @Override
    public List<OrderDetail> findDetailById(int id) {
        SqlSession sqlSession = null;
        List<OrderDetail> where = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            AnnotationMapper ds = sqlSession.getMapper(AnnotationMapper.class);
            where = ds.findDetailById(id);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return where;
    }

    @Override
    public List<EasybuyOrder> queryOrderDetail2() {
        SqlSession sqlSession = null;
        List<EasybuyOrder> where = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            AnnotationMapper ds = sqlSession.getMapper(AnnotationMapper.class);
            where = ds.queryOrderDetail2();
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return where;
    }

    @Override
    public NewsUser getUser2(String name, String password) {
        SqlSession sqlSession = null;
        NewsUser user = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            AnnotationMapper ds = sqlSession.getMapper(AnnotationMapper.class);
            user = ds.getUser2(name,password);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return user;
    }


    public static void main(String[] args) {
        AnnotationMapper am = new AnnotationMapperImpl();
        NewsUser user = new NewsUser();
        /*user.setName("成老师");
        user.setPassword("555");
        am.addUser(user);*/

        /*user.setName("顾老师");
        user.setPassword("111");
        user.setId(7);
        am.modifyUser(user);*/

        /*am.removeUser(7);*/

        //获取自增长的id值
        /*user.setName("li");
        user.setPassword("666");
        System.out.println(am.addUser1(user));*/

        /*Map<String,Object> where = new HashMap<>();
        where.put("name","li");
        where.put("password","666");
        System.out.println(am.getUser(where));*/

        /*String name = "li";
        String password = "666";
        System.out.println(am.getUser1(name,password));*/

        /*List<Map<String,Object>> list = am.queryOrderDetail();
        System.out.println(list);*/


       /* List<EasybuyOrder> where = am.queryOrderDetail1();
        System.out.println(where);*/

        /*List<OrderDetail> where = am.findDetailById(1);*/

       /*List<EasybuyOrder> where = am.queryOrderDetail2();
       System.out.println(where);
*/
        /*String name = "张三";
        String password = "1111";
        System.out.println(am.getUser2(name,password));
*/




    }
}
