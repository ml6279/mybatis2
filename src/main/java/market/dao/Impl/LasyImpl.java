package market.dao.Impl;

import market.Utils.MybatisFactory;
import market.dao.Lasy;
import market.entity.Teacher;
import org.apache.ibatis.session.SqlSession;

public class LasyImpl implements Lasy {
    @Override
    public Teacher queryTeacher(int tid) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            Teacher t = sqlSession.getMapper(Lasy.class).queryTeacher(tid);
            System.out.println(t.getTname());
            //System.out.println(t.getSlist());
            return t;
        } finally {
            MybatisFactory.close(sqlSession);
        }
    }

    //测试步骤 我们在核心配置文件开启懒加载
    //1 注释掉 System.out.println(t.getSlist());
    //2 不注释掉 System.out.println(t.getSlist());
    public static void main(String[] args) {
        LasyImpl lazy = new LasyImpl();
        Teacher t = lazy.queryTeacher(1);
    }

}
