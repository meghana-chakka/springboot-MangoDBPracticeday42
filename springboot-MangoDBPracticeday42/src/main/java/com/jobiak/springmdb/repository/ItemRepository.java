package com.jobiak.springmdb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.jobiak.springmdb.model.GroceryItems;

@Repository
public interface ItemRepository extends MongoRepository<GroceryItems,Long>{
	
}
