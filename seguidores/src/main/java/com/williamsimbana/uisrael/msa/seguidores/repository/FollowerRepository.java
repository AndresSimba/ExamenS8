package com.williamsimbana.uisrael.msa.seguidores.repository;

import com.williamsimbana.uisrael.msa.seguidores.entity.FollowerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FollowerRepository extends MongoRepository<FollowerEntity, String> {
}
