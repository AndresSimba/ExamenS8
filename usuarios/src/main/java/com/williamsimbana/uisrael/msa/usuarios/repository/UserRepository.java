package com.williamsimbana.uisrael.msa.usuarios.repository;


import com.williamsimbana.uisrael.msa.usuarios.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
