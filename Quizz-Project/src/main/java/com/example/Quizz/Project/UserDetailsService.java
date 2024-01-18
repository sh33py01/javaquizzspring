package com.example.Quizz.Project;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), new ArrayList<>());
    }

    // Additional methods for user registration, etc.
}
