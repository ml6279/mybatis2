package market.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisFactory {
    /*单列模式*/
    private static volatile SqlSessionFactory instance;
    private MybatisFactory(){
    }

    //对获取实例的方法进行同步
    //获取工厂,file是配置文件名称
    //SqlSessionFactory 负责创建 SqlSession
    //SqlSessionFactoryBuilder 负责创建 SqlSessionFactory

    public static SqlSessionFactory getInstance (String file){
        if(instance == null){
            synchronized (MybatisFactory.class){
                if(instance == null){
                    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
                    //负责读取核心配置文件:mybatis-config.xml
                    InputStream is;
                    try {
                        is = Resources.getResourceAsStream(file);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    instance = builder.build(is);
                }
            }
        }
        return instance;
    }

    public static SqlSessionFactory getInstance(){
        String file = "mybatis-config.xml";
        return getInstance(file);
    }

    //SqlSession 和connection 关联
    //SqlSession 负责执行我门写的sql

    public static void close(SqlSession sqlSession){
        if(sqlSession !=null){
            sqlSession.close();
        }
    }


}
