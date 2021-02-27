package market.dao;

import market.entity.EasybuyOrder;

import java.util.List;
import java.util.Map;

public interface OrderMapper1 {
    //一对多的关系
    public List<EasybuyOrder> queryAll();

    public List<EasybuyOrder> queryAll1();

    //多对多的关系
    public List<EasybuyOrder> queryAll2();

    public List<EasybuyOrder> queryAll3();

    public List<Map<String,Object>> queryAll4();
}
