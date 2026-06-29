package com.sprintlog.sprintlogboot.repository;

import com.sprintlog.sprintlogboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

//Spring-Date-JPA는 인터페이스만 선언해두면 구현체는 자동으로 만들어줌
//JapRepository 인터페이스를 상속만 받으시면 구현체가 자동으로 생성됨니다.
//제네릭에는 <엔터티타입,PK타입>
public interface UserRepository extends JpaRepository<User, Long> {

}
