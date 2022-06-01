package psn.nkcat.mapotofu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import psn.nkcat.mapotofu.model.BaseUser;
import psn.nkcat.mapotofu.service.IBaseUserService;
import psn.nkcat.mapotofu.util.JsonResponse;

/**
 * @Classname BaseUserController
 * @Description 用户的Controller
 * @Date 2022/6/1 0:28
 * @Created by gaoqi
 */

@RestController
@RequestMapping(value = "/user")
public class BaseUserController {
    final
    IBaseUserService baseUserService;

    public BaseUserController(IBaseUserService baseUserService) {
        this.baseUserService = baseUserService;
    }

    @GetMapping(value = "/create")
    public JsonResponse create(@RequestParam String name) {
        BaseUser user = baseUserService.createUser(name);
        return new JsonResponse<BaseUser>(user);
    }
}
