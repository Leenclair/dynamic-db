package example.dynamicdb.interfaces.test;

import example.dynamicdb.domain.Test;
import example.dynamicdb.interfaces.dao.TestDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService{

    private final TestDao testDao;


    @Override
    public Test findById(Long id) {
        return testDao.findById(id);
    }
}
