package com.green.growgreen.user;

import com.green.growgreen.common.ResVo;
import com.green.growgreen.user.model.UserInsDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper mapper;
    public ResVo insUser(UserInsDto dto){
        String hashedpw=BCrypt.hashpw(dto.getUpw(),BCrypt.gensalt());
        dto.setUpw(hashedpw);
        mapper.insUser(dto);
        return new ResVo(dto.getIuser());
    }
}
