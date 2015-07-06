package jp.pgw.develop.swallow.sample.persistence.repository;

import jp.pgw.develop.swallow.sample.model.SuperParent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface SuperParentRepository extends JpaRepository<SuperParent, Long>, QueryDslPredicateExecutor<SuperParent> {
}
