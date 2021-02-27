package market.dao.Impl;

import market.Utils.MybatisFactory;
import market.dao.UserMapper1;
import market.entity.NewsUser;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserMappler1Impl implements UserMapper1 {

    /**
     * SqlSessionFactory.openSession()和SqlSessionFactory.openSession(false)开启事务，不自动提交，要手工写commit ;
     * SqlSessionFactory.openSession(true)自动提交,不开启事务，不用手工写commit。
     * @param user
     */

    @Override
    public void addUser(NewsUser user) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();//通过sqlSession创建openSession
            UserMapper1 um = sqlSession.getMapper(UserMapper1.class);//通过动态代理技术自动产生实现类
            um.addUser(user);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public void ModifyUser(NewsUser user) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();//通过sqlSession创建openSession
            UserMapper1 um = sqlSession.getMapper(UserMapper1.class);//通过动态代理技术自动产生实现类
            um.ModifyUser(user);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public void deleteUser(int id) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();//通过sqlSession创建openSession
            UserMapper1 um = sqlSession.getMapper(UserMapper1.class);//通过动态代理技术自动产生实现类
            um.deleteUser(id);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    @Override
    public int totalUsers() {
        SqlSession sqlSession = null;
        int row = -1;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();//通过sqlSession创建openSession
            UserMapper1 um = sqlSession.getMapper(UserMapper1.class);//通过动态代理技术自动产生实现类
            row = um.totalUsers();
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return row;
    }

    @Override
    public NewsUser getUser(int id) {
        SqlSession sqlSession = null;
        NewsUser newsUser = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();//通过sqlSession创建openSession
            UserMapper1 um = sqlSession.getMapper(UserMapper1.class);//通过动态代理技术自动产生实现类
            newsUser = um.getUser(id);
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return newsUser;
    }

    @Override
    public List<NewsUser> getAllUser() {
        SqlSession sqlSession = null;
        List<NewsUser> list = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();//通过sqlSession创建openSession
            UserMapper1 um = sqlSession.getMapper(UserMapper1.class);//通过动态代理技术自动产生实现类
            list = um.getAllUser();
            sqlSession.commit();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return list;
    }

    //在第一次 sqlSession1 里面我们执行同样的查询方法,看第二次执行的sql语句是否打印出来,缓存开启
    //在第一次 sqlSession1 里面我们执行同样的查询方法,看第二次执行的sql语句是否打印出来,缓存不开启
    //不同的sqlSession执行同样的方法
    @Override
    public void getAllUser1() {
        SqlSession sqlSession1 = null;
        SqlSession sqlSession2 = null;
        try {
            sqlSession1 = MybatisFactory.getInstance().openSession();
            sqlSession2 = MybatisFactory.getInstance().openSession();
            UserMapper1 um1 = sqlSession1.getMapper(UserMapper1.class);
            UserMapper1 um2 = sqlSession2.getMapper(UserMapper1.class);
            List<NewsUser> list1 = um1.getAllUser();//这次查询回到数据库,会看到sql
         //   List<NewsUser> list2 = um1.getAllUser();//这次查询不会看到sql
            MybatisFactory.close(sqlSession1);
            List<NewsUser> list3 = um2.getAllUser();//一定在sqlSession关闭后才会刷新二级缓存
            System.out.println("---------------------------------");
            //List<NewsUser> list2 = um2.getAllUser();

        } finally {
            //MybatisFactory.close(sqlSession1);
            MybatisFactory.close(sqlSession2);
        }
    }


    public static void main(String[] args) {
        UserMappler1Impl um = new UserMappler1Impl();
        //um.addUser(new NewsUser("李伟","1234"));
        //um.ModifyUser(new NewsUser(1,"李四","1234"));
        //um.deleteUser(1);
        /*um.totalUsers();
        System.out.println(um.totalUsers()+"AAA");
        um.getUser(1);
        System.out.println(um.getUser(1).toString()+"BBB");
        um.getAllUser();
        System.out.println(um.getAllUser().toString()+"CCC");*/

        um.getAllUser1();

    }
}
