package com.mumulcom.mumulcom_v2.domain.scrap.domain;

import com.mumulcom.mumulcom_v2.domain.common.BaseEntity;
import com.mumulcom.mumulcom_v2.domain.question.domain.Question;
import com.mumulcom.mumulcom_v2.domain.user.domain.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Scrap extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

}
