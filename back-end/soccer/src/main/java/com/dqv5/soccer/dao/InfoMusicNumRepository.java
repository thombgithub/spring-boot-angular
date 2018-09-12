package com.dqv5.soccer.dao;

import com.dqv5.soccer.entity.InfoMusicNum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author admin
 * @date 2018/9/12
 */
@Repository
public interface InfoMusicNumRepository extends JpaRepository<InfoMusicNum, Integer> {

}
