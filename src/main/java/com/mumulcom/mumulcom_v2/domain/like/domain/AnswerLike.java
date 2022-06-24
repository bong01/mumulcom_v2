package com.mumulcom.mumulcom_v2.domain.like.domain;

import com.mumulcom.mumulcom_v2.domain.answer.domain.Answer;
import com.mumulcom.mumulcom_v2.domain.common.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class AnswerLike extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_id")
    private Answer answer;

}
