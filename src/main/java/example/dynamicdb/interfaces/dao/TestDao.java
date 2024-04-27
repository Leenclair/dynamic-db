package example.dynamicdb.interfaces.dao;

import example.dynamicdb.constants.CustomerType;
import example.dynamicdb.domain.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {

    Test findById(Long id);

}
