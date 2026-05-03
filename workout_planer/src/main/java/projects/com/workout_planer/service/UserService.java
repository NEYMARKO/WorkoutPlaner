package projects.com.workout_planer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import projects.com.workout_planer.dto.UserResponseDTO;
import projects.com.workout_planer.entity.User;
import projects.com.workout_planer.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserResponseDTO insertUser(User user)
    {
        User insertResult = userRepository.save(user);
        System.out.println(insertResult);
        return new UserResponseDTO(insertResult.getId(), insertResult.getFirstName(), insertResult.getLastName());
    }
}
