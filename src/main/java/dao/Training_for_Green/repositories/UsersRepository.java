package dao.Training_for_Green.repositories;

import dao.Training_for_Green.dto.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<users, Integer> {
    @Query(value = "SELECT id_1 FROM users WHERE mail = :mail AND motDePasse = :motDePasse", nativeQuery = true)
    int checkPassword(@Param("mail") String mail, @Param("motDePasse") String motDePasse);
}
