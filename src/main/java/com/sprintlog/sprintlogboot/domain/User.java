package com.sprintlog.sprintlogboot.domain;

import jakarta.persistence.*;

@Entity //이 클래스는 JPA가 관리, 이 클래스는 데이터베이스의 한 행 (인스턴스)에 정확하게 대응
@Table(name = "users")
public class User extends BaseEntity {

    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //숫자 자동 증가 전략 사용
    private Integer userNo;

    @Column(nullable = false, length = 50)
    private String nickname;

    @Column(nullable = false, unique = true, length = 100)
    private String email;
}
