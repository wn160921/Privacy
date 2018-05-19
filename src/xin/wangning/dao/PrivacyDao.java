package xin.wangning.dao;

import cn.itcast.jdbc.TxQueryRunner;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import xin.wangning.domain.Privacy;

import java.sql.SQLException;
import java.util.List;

public class PrivacyDao {
    //简化的数据库工具
    private QueryRunner qr = new TxQueryRunner();
    public List<Privacy> findAll(){
        try{
            String sql = "select * from privacy";
            List<Privacy> privacies = qr.query(sql,new BeanListHandler<Privacy>(Privacy.class));
            System.out.println("find:"+privacies.size());
            return privacies;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void add(Privacy privacy){
        try{
            String sql = "insert into privacy values (?,?,?,?,?)";
            Object[] params = {privacy.getUuid(),privacy.getName_range(),privacy.getAge_range(),
                    privacy.getSex_range(),privacy.getPull_range()};
            qr.update(sql,params);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

}
