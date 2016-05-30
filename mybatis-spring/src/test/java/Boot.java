import com.hello.model.User;
import com.hello.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by peker on 16/5/30.
 */
public final class Boot {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        User user = userService.getUser(1);
        System.out.println(user.getUsername());
    }
}
