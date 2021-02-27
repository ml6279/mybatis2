package market.dao;

import market.entity.Batis;
import market.entity.EasybuyOrder;
import market.entity.NewsUser;

import java.util.List;
import java.util.Map;

public interface DynamicSQL {
    //if
    public List<EasybuyOrder> queryOrder1(Map<String,Object> where);
    //if where
    public List<EasybuyOrder> queryOrder2(Map<String,Object> where);
    //set if
    public void updateOrder(EasybuyOrder order);
    //trim 替代 where 和 if 连用
    public List<EasybuyOrder> queryOrder3(Map<String,Object> where);
    //trim 替代 set 和 if 连用
    public void updateOrder1(EasybuyOrder order);
    //choose  不常用
    public List<EasybuyOrder> queryOrder4(Map<String,Object> where);
    //foreach 常用数组去传递条件值
    public List<EasybuyOrder> queryOrder5(Object[] where);
    //foreach 使用list去传递值
    public List<EasybuyOrder> queryOrder6(List<Object> list);
    //foreach map 使用list去传递条件值
    public List<EasybuyOrder> queryOrder7(Map<String,Object> where);
    //批量插入
    public void addRecordBatch(List<NewsUser> list);
    //批量插入
    public void addRecordBatch1(List<Batis> list);
}
