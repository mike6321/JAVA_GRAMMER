package me.choi.inflearnthejavatest.study;


import me.choi.inflearnthejavatest.domain.Study;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudyRepository extends JpaRepository<Study, Long> {

}
