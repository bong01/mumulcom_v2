package com.mumulcom.mumulcom_v2.domain.question.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class QuestionCategory {

    private Category1 category1;

    private Category2 category2;

}
