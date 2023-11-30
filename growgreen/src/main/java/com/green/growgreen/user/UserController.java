package com.green.growgreen.user;

import com.green.growgreen.common.ResVo;
import com.green.growgreen.user.model.UserInsDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @PostMapping("/signup")
    public ResVo insUser(@RequestBody UserInsDto dto){
        return service.insUser(dto);
    }

}
