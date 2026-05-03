package projects.com.workout_planer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import projects.com.workout_planer.dto.UserResponseDTO;
import projects.com.workout_planer.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // Spring auto-implements all basic operations
    // you don't write any code here for basic stuff
}
