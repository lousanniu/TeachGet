import com.springCloud.provider.controller.UserController;
import com.springCloud.provider.pojo.vo.UserVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;


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
    public void testht123() {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");

        operate(a,b);
        System.out.println(a+","+b);

    }

    private void operate(StringBuffer a, StringBuffer b) {
        a.append(b);
        b = a;
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