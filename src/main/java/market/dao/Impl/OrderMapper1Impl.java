package market.dao.Impl;

import market.Utils.MybatisFactory;
import market.dao.BatisMapper;
import market.dao.OrderMapper1;
import market.entity.EasybuyOrder;
import market.entity.OrderDetail;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class OrderMapper1Impl implements OrderMapper1 {
    @Override
    public List<EasybuyOrder> queryAll() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            OrderMapper1 um = sqlSession.getMapper(OrderMapper1.class);
            return um.queryAll();
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public List<EasybuyOrder> queryAll1() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            OrderMapper1 um = sqlSession.getMapper(OrderMapper1.class);
            return um.queryAll1();
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public List<EasybuyOrder> queryAll2() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            OrderMapper1 um = sqlSession.getMapper(OrderMapper1.class);
            return um.queryAll2();
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public List<EasybuyOrder> queryAll3() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            OrderMapper1 um = sqlSession.getMapper(OrderMapper1.class);
            return um.queryAll3();
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public List<Map<String, Object>> queryAll4() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            OrderMapper1 um = sqlSession.getMapper(OrderMapper1.class);
            return um.queryAll4();
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    public static void main(String[] args) {
        OrderMapper1 om = new OrderMapper1Impl();

        //一对多的关系
        List<EasybuyOrder> list = om.queryAll();
        for (EasybuyOrder order : list){
            System.out.println(order);
            List<OrderDetail> details = order.getDetail();
            for (OrderDetail detail : details){
                System.out.println(detail);
            }
        }
        System.out.println("*********************");


        /*List<EasybuyOrder> list = om.queryAll1();
        for (EasybuyOrder order : list){
            System.out.println(order);
            List<OrderDetail> details = order.getDetail();
            for (OrderDetail detail : details){
                System.out.println(detail);
            }
        }*/

        //一对一的关系
        /*List<EasybuyOrder> list = om.queryAll2();*/
        //System.out.println(list);
        /*for (EasybuyOrder order : list){
            System.out.println(order);
        }*/
        /*List<EasybuyOrder> list = om.queryAll3();
        for (EasybuyOrder order : list){
            System.out.println(order);
        }*/

        /*List<Map<String,Object>> result = om.queryAll4();
        System.out.println(result);
        for (Map<String, Object> stringObjectMap : result) {
            System.out.println(stringObjectMap);
        }*/

    }
}
