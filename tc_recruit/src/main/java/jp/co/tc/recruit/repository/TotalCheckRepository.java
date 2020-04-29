package jp.co.tc.recruit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.tc.recruit.entity.TotalCheckView;

public interface TotalCheckRepository extends JpaRepository<TotalCheckView, Integer>{
	public TotalCheckView findByMessageId(Integer messageId);

}