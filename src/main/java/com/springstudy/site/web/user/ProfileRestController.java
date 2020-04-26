package com.springstudy.site.web.user;

import com.springstudy.site.model.User;
import org.springframework.stereotype.Controller;

import static com.springstudy.site.web.SecurityUtil.authUserId;

@Controller
public class ProfileRestController extends AbstractUserController{
    public User get() {
        return super.get(authUserId());
    }

    public void delete() {
        super.delete(authUserId());
    }

    public void update(User user) {
        super.update(user, authUserId());
    }
}
