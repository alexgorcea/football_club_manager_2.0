package dev.footballClubManager.FootballClubManager.Players;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayersRepository extends MongoRepository<TeamPlayers, ObjectId> {

    Optional<TeamPlayers> findByTeamId(String teamId);
}
