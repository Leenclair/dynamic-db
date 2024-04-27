package example.dynamicdb.interfaces.test;

import example.dynamicdb.config.db.CustomerContextHolder;
import example.dynamicdb.constants.CustomerType;
import example.dynamicdb.domain.Test;
import example.dynamicdb.interfaces.dao.TestDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService{

    private final TestDao testDao;

    @Override
    public Test findById(Long id, CustomerType customerType) {

        CustomerContextHolder.setCustomerType(customerType);
        Test test;
        try{
            test = testDao.findById(id);
        }finally {
            CustomerContextHolder.clearCustomerType();
        }

        return test;
    }
}
