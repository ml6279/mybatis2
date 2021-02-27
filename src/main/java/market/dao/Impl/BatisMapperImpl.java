package market.dao.Impl;

import market.Utils.MybatisFactory;
import market.dao.BatisMapper;
import market.dao.UserMapper1;
import market.entity.Batis;
import market.entity.Batis1;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

public class BatisMapperImpl implements BatisMapper {
    @Override
    public void addBatis(Batis batis) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();//通过sqlSession创建openSession
            BatisMapper um = sqlSession.getMapper(BatisMapper.class);//通过动态代理技术自动产生实现类
            um.addBatis(batis);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public Batis getBatis(int id) {
        SqlSession sqlSession = null;
        Batis batis = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();//通过sqlSession创建openSession
            BatisMapper um = sqlSession.getMapper(BatisMapper.class);//通过动态代理技术自动产生实现类
            batis = um.getBatis(id);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return batis;
    }

    @Override
    public List<Batis1> getBatises() {
        SqlSession sqlSession = null;
        List<Batis1> list = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();//通过sqlSession创建openSession
            BatisMapper um = sqlSession.getMapper(BatisMapper.class);//通过动态代理技术自动产生实现类
            list = um.getBatises();
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return list;
    }

    @Override
    public int modifyBatis(Batis batis) {
        SqlSession sqlSession = null;
        int row = -1;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();//通过sqlSession创建openSession
            BatisMapper um = sqlSession.getMapper(BatisMapper.class);//通过动态代理技术自动产生实现类
            row = um.modifyBatis(batis);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return row;
    }

    @Override
    public int addBatis1(Batis batis) {
        SqlSession sqlSession = null;
        int row = -1;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();//通过sqlSession创建openSession
            BatisMapper um = sqlSession.getMapper(BatisMapper.class);//通过动态代理技术自动产生实现类
            row = um.addBatis1(batis);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return row;
    }

    public static void main(String[] args) {
        BatisMapperImpl bm = new BatisMapperImpl();
        /*bm.addBatis(new Batis("张三",new Date(),"周六"));
        bm.getBatis(1);
        System.out.println(bm.getBatis(1).toString()+"AAA");*/
       /* bm.getBatises();
        System.out.println(bm.getBatises().toString()+"BBB");*/
        //System.out.println(bm.modifyBatis(new Batis(1,"李四",new Date(),"周末")));
        Batis b = new Batis();
        b.setDesc("desc1");
        b.setName("name1");
        b.setDate(new Date());
        //bm.addBatis1(b);
        System.out.println(bm.addBatis1(b));
        System.out.println(b.getId());
    }
}
