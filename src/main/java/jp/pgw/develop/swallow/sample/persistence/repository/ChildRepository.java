package jp.pgw.develop.swallow.sample.persistence.repository;

import jp.pgw.develop.swallow.sample.model.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface ChildRepository extends JpaRepository<Child, Long>, QueryDslPredicateExecutor<Child> {
}
