import com.lqt.data.SpringbootDataApplication;
import com.lqt.data.domain.User;
import com.lqt.data.repository.User01Repository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= SpringbootDataApplication.class)
@Slf4j
public class User01RepositoryTest {
    @Resource
    User01Repository user01Repository;

    @Test
    public void testInsert(){
        User user = new User();
        user.setDeleted(0);
        user.setUsername("张三");
        user.setCreateTime(new Date());
        user.setPassword("123456");
        user01Repository.save(user);
    }


}
