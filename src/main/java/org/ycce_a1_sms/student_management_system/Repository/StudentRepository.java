package org.ycce_a1_sms.student_management_system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.ycce_a1_sms.student_management_system.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{
}
