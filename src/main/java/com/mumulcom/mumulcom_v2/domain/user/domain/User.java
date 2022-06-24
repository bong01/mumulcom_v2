package com.mumulcom.mumulcom_v2.domain.user.domain;

import com.mumulcom.mumulcom_v2.domain.common.BaseEntity;
import com.mumulcom.mumulcom_v2.domain.user.model.Nickname;
import com.mumulcom.mumulcom_v2.domain.user.model.UserGroup;
import com.mumulcom.mumulcom_v2.domain.user.model.UserRole;
import com.mumulcom.mumulcom_v2.domain.user.model.UserType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class User extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Embedded
    private Nickname nickname;

    @Lob
    @Column(nullable = false)
    private String profileImageUrl;

    private String password;

    @Column(nullable = false)
    private String fcmToken;

    @Column(nullable = false)
    private String refreshToken;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserType userType;

    @Column(nullable = false)
    private UserRole userRole;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserGroup userGroup;

}
