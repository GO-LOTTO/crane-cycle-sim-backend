package com.cranecyclesim.backend.dto;

import com.cranecyclesim.backend.jpa.entity.User;
import com.sun.istack.Nullable;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor(access= AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
@Getter
@ToString
public class UserDto {

    private String userId;
    private String password;
    private String userName;
    private String groupCd;
    private String langCd;
    private LocalDateTime createdAt;
    private String createdUserId;

}
