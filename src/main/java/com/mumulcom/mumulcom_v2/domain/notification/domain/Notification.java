package com.mumulcom.mumulcom_v2.domain.notification.domain;

import com.mumulcom.mumulcom_v2.domain.common.BaseEntity;
import com.mumulcom.mumulcom_v2.domain.notification.model.NotificationType;
import com.mumulcom.mumulcom_v2.domain.user.domain.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Notification extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private NotificationType notificationType;

    @Column(nullable = false)
    private String content;

}
