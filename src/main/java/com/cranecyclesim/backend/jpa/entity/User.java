package com.cranecyclesim.backend.jpa.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class User {

    @Id
    @Column(name="user_id")
    private String userId;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="user_nm")
    private String userName;

    @Column(name="lang_cd")
    private String langCd;

    @Column(name="groupCd", nullable = false)
    private String groupCd;

    @Column(name="created_user_id", nullable = false)
    private String createdUserId;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    @Column(name="updated_user_id", nullable = false)
    private String updatedUserId;

    @Column(name="updated_at")
    private LocalDateTime updatedAt;


}
