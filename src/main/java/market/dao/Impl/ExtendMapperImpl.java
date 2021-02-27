package market.dao.Impl;

import market.Utils.MybatisFactory;
import market.dao.AnnotationMapper;
import market.dao.ExtendMapper;
import market.entity.EasybuyOrder;
import market.entity.NewsUser;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ExtendMapperImpl implements ExtendMapper {
    @Override
    public List<NewsUser> queryAll() {
        SqlSession sqlSession = null;
        List<NewsUser> list = null;
        try {
            sqlSession = MybatisFactory.getInstance().openSession();
            ExtendMapper em = sqlSession.getMapper(ExtendMapper.class);
            list = em.queryAll();
        } finally {
            MybatisFactory.close(sqlSession);
        }
        return list;
    }


    public static void main(String[] args) {
        ExtendMapper em = new ExtendMapperImpl();
        em.queryAll();
    }
}
