import com.springCloud.provider.controller.UserController;
import com.springCloud.provider.pojo.vo.UserVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试多线程下状况〉
 *
 * @author 娜苏苏
 * @create 2019/7/28
 */
public class TestThread {

    @Autowired
    private UserController userController;

    public void testUserController(){
    }


    @Test
    public void testTh(){
        UserVo userVo0 = userVobuilderNull0();
        UserVo userVo1 = userVobuilder1();
        UserVo userVo2 = userVobuilder2();

        List<UserVo> userVos = new ArrayList<>();
        userVos.add(userVo0);
        userVos.add(userVo1);
        userVos.add(userVo2);

        Optional.ofNullable(userVos).get();
    }

    @Test
    public void testht12() {

    }


    @Test
    public void testOptional1() {

        UserVo userVo0 = userVobuilderNull0();
        UserVo userVo1 = userVobuilder1();
        UserVo userVo2 = userVobuilder2();

        List<UserVo> userVos = new ArrayList<>();
        userVos.add(userVo0);
        userVos.add(userVo1);
        userVos.add(userVo2);

        AtomicReference<Integer> age = null;

        Optional.ofNullable(userVo0).ifPresent( e -> age.set(e.getAge()));


        System.out.println(userVo2);

    }

    public UserVo userVobuilderNull0() {
        return null;
    }

    public UserVo userVobuilder1() {
        return UserVo.builder().id(123).age(12).name("zhangFei").sex("男").build();
    }

    public UserVo userVobuilder2() {
        return UserVo.builder().id(232).age(1222).name("lisi").sex("男").build();
    }


}