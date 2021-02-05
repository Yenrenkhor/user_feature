package com.example.mlasessment.repository;
import com.example.mlasessment.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<Users, Integer>
{
    Users findByFeatureNameAndEmail(@Param("featureName") String featureName, @Param("email") String email);
    boolean existsByFeatureNameAndEmail(String featureName, String email);
}