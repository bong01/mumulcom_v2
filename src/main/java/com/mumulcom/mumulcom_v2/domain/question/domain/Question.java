package com.mumulcom.mumulcom_v2.domain.question.domain;

import com.mumulcom.mumulcom_v2.domain.answer.domain.Answer;
import com.mumulcom.mumulcom_v2.domain.common.BaseEntity;
import com.mumulcom.mumulcom_v2.domain.like.domain.QuestionLike;
import com.mumulcom.mumulcom_v2.domain.question.model.QuestionCategory;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Question extends BaseEntity {

    @Column(nullable = false)
    private String title;

    @Embedded
    @Column(nullable = false)
    private QuestionCategory questionCategory;

    @OneToMany
    @JoinColumn(name = "comment_id")
    private List<Answer> comment;

    @OneToMany
    @JoinColumn(name = "like_id")
    private List<QuestionLike> like;

}
