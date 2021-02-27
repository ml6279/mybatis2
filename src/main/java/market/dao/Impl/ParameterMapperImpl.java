package market.dao.Impl;

import market.Utils.MybatisFactory;

import market.dao.ParameterMapper;
import market.entity.NewsUser;
import org.apache.ibatis.session.SqlSession;


import java.util.List;
import java.util.Map;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class ParameterMapperImpl implements ParameterMapper {
    @Override
    public List<NewsUser> query2(Map<String, Object> where) {
        SqlSession sqlSession = null;
        List<NewsUser> list = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();//通过sqlSession创建openSession
            ParameterMapper pm = sqlSession.getMapper(ParameterMapper.class);//通过动态代理技术自动产生实现类
            list = pm.query2(where);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return list;
    }

    @Override
    public List<NewsUser> query3(Map<String, Object> where) {
        SqlSession sqlSession = null;
        List<NewsUser> list = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();//通过sqlSession创建openSession
            ParameterMapper pm = sqlSession.getMapper(ParameterMapper.class);//通过动态代理技术自动产生实现类
            list = pm.query3(where);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return list;
    }

    @Override
    public List<NewsUser> query4(String name, String password) {
        SqlSession sqlSession = null;
        List<NewsUser> list = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();//通过sqlSession创建openSession
            ParameterMapper pm = sqlSession.getMapper(ParameterMapper.class);//通过动态代理技术自动产生实现类
            list = pm.query4(name,password);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return list;
    }

    @Override
    public List<NewsUser> query5(String name, String password) {
        SqlSession sqlSession = null;
        List<NewsUser> list = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();//通过sqlSession创建openSession
            ParameterMapper pm = sqlSession.getMapper(ParameterMapper.class);//通过动态代理技术自动产生实现类
            list = pm.query5(name,password);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return list;
    }

    public static PageInfo<NewsUser> query6(String name,String password){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            ParameterMapper um = sqlSession.getMapper(ParameterMapper.class);
            //这行一定要写在sql开始执行之前 查询页码,每页行数
            PageHelper.startPage(1,1);
            List<NewsUser> result = um.query5(name,password);
            PageInfo<NewsUser> pageInfo = new PageInfo<>(result);
            return pageInfo;
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    public static void main(String[] args) {
        ParameterMapper pm = new ParameterMapperImpl();

        /*Map<String,Object> where = new HashMap<>();
        where.put("name","张");
        System.out.println(pm.query2(where));*/


        /*Map<String,Object> where = new HashMap<>();
        where.put("name","李");
        System.out.println(pm.query3(where));*/



        /*Map<String,Object> where1 = new HashMap<>();
        where1.put("name","李");*/

        /*String name = "李伟";
        String password = "1234";
        System.out.println(pm.query5(name,password));*/

        //分页
        String name = "李伟";
        String password = "1234";
        System.out.println(query6(name,password));


    }
}
