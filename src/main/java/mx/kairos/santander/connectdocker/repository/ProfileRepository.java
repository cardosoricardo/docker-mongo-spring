package mx.kairos.santander.connectdocker.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import mx.kairos.santander.connectdocker.model.Profile;

public interface ProfileRepository extends MongoRepository<Profile, String> {
    
}