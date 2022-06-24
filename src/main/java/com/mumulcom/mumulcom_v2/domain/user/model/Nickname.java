package com.mumulcom.mumulcom_v2.domain.user.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Nickname {

    @Column(nullable = false)
    private String nickname;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime nicknameUpdatedAt;

}
