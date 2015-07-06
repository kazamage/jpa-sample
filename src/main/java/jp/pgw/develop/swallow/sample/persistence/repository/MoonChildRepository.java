package jp.pgw.develop.swallow.sample.persistence.repository;

import jp.pgw.develop.swallow.sample.model.MoonChild;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface MoonChildRepository extends JpaRepository<MoonChild, Long>, QueryDslPredicateExecutor<MoonChild> {
}
