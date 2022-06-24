package com.mumulcom.mumulcom_v2.domain.comment.domain;

import com.mumulcom.mumulcom_v2.domain.common.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Comment extends BaseEntity {

    @Column(nullable = false)
    private String content;

}
