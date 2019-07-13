package com.solfugasoft.videoapp.dao;

import com.solfugasoft.videoapp.dao.entity.VideoCassette;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VideoCassetteRepo extends CrudRepository<VideoCassette,Long> {

}
