package example.dynamicdb.interfaces.test;

import example.dynamicdb.constants.CustomerType;
import example.dynamicdb.domain.Test;

public interface TestService {

    Test findById(Long id, CustomerType customerType);

}
