package dev.footballClubManager.FootballClubManager.Repositories;

import dev.footballClubManager.FootballClubManager.Models.Match;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MatchRepository extends MongoRepository<Match, String> {

    Optional<Match> findByMatchId(String matchId);
    void deleteByMatchId(String matchId);
}
