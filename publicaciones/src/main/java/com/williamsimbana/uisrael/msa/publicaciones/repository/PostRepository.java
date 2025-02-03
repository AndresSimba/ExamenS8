package com.williamsimbana.uisrael.msa.publicaciones.repository;

import com.williamsimbana.uisrael.msa.publicaciones.entity.PostEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<PostEntity, String> {
}
