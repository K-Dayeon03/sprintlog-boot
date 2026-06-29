package com.sprintlog.sprintlogboot.repository;

import com.sprintlog.sprintlogboot.domain.LearningActivity;
import org.springframework.data.jpa.repository.JpaRepository;
//직접 인메모리(ArrayList)에 저장하던 방식을 버리고, spring data jpa로 교체
public interface ActivityRepository extends JpaRepository<LearningActivity, Long> {

}
