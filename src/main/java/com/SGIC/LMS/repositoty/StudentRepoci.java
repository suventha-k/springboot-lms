package com.SGIC.LMS.repositoty;

import com.SGIC.LMS.entity.Studententity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepoci extends JpaRepository<Studententity, Long > {
}
