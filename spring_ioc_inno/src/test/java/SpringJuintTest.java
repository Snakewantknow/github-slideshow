import com.symbolknow.config.SpringConfiguration;
import com.symbolknow.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
@ContextConfiguration(classes = {SpringConfiguration.class})
public class SpringJuintTest {
@Autowired
    private UserService userService;
@Autowired
    private DataSource  dataSource;
@Test
    public void test1() throws SQLException {
    userService.save();
    System.out.println(dataSource.getConnection());
}
}
