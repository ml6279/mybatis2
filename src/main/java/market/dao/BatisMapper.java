package market.dao;

import market.entity.Batis;
import market.entity.Batis1;

import java.util.List;

public interface BatisMapper {
    public void addBatis(Batis batis);
    public Batis getBatis(int id);  //根据id查询
    public List<Batis1> getBatises();//查询总数
    public int modifyBatis(Batis batis);    //返回受影响的行数
    public int addBatis1(Batis batis); //获取自增长插入时得自增长的id值(mysql)
}
