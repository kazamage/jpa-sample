package jp.pgw.develop.swallow.sample.persistence.repository;

import jp.pgw.develop.swallow.sample.model.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface ParentRepository extends JpaRepository<Parent, Long>, QueryDslPredicateExecutor<Parent> {
}
