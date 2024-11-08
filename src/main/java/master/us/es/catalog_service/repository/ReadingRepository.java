package master.us.es.catalog_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import master.us.es.catalog_service.entity.ReadingEntity;

public interface ReadingRepository extends MongoRepository<ReadingEntity, String> {

}
