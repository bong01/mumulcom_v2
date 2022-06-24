package com.mumulcom.mumulcom_v2.domain.user.domain;

import com.mumulcom.mumulcom_v2.domain.common.BaseEntity;
import com.mumulcom.mumulcom_v2.domain.user.model.InterestCategory;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class UserInterest extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private InterestCategory interestCategory;

}
